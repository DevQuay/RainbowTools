package verseau.rainbowtools;

import cpw.mods.fml.common.Loader;
import verseau.rainbowtools.blocks.ModBlocks;
import verseau.rainbowtools.item.ModRecipes;

public class Modchecker {
	public static boolean isNaturaLoaded;
	public static boolean isCheeseLoaded;
	public static boolean isTekLoaded;
	public Modchecker() {
		this.isNaturaLoaded = Loader.isModLoaded("Natura");
		this.isCheeseLoaded = Loader.isModLoaded("Cheese Mod");
		this.isTekLoaded = Loader.isModLoaded("doctorwolfy_truetek");
	}

	public static void Success() {
		if (isNaturaLoaded) {
			RainbowTools.logger.info("Natura Has Been Found!");
			ModBlocks.AddNatura();
			ModRecipes.loadNaturaRecipes();
	
		}
		if(isCheeseLoaded){
			RainbowTools.logger.info("Cheese Located!");
			ModBlocks.AddCheese();
			ModRecipes.loadCheeseRecipes();
		}
		if(isTekLoaded){
			RainbowTools.logger.info("TrueTek Located!");
			ModBlocks.AddTek();
			ModRecipes.loadTekRecipes();
		}
	}
}
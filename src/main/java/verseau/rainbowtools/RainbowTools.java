package verseau.rainbowtools;

import org.apache.logging.log4j.LogManager;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import verseau.rainbowtools.blocks.ModBlocks;
import verseau.rainbowtools.item.ModItems;
import verseau.rainbowtools.item.ModRecipes;
import codechicken.nei.api.API;
@Mod(modid = "rnbwtls", name = "Rainbow Tools", version = "3.6")
public class RainbowTools {
	
	public static final org.apache.logging.log4j.Logger logger = LogManager.getFormatterLogger("rnbwtls");
	public static CreativeTabs tabRainbowTools = new CreativeTabs("tabRainbowTools") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(ModItems.itemSolidRainbow).getItem();
		}
	};
	public Modchecker modChecker;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Item/Block Init and registering
		// Config handling
		ModBlocks.loadBlocks();
		ModItems.loaditems();
		modChecker = new Modchecker();
		modChecker.Success();
		ModRecipes.loadRecipes();
		API.hideItem(new ItemStack(ModItems.itemBrokenStick));
		API.hideItem(new ItemStack(ModItems.itemPortalWand));
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		// Proxy Tile Entity, Entity, GUI and packet registering
		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	};
};
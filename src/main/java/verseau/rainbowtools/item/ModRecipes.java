package verseau.rainbowtools.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.RecipeSorter;
import verseau.rainbowtools.blocks.ModBlocks;

public class ModRecipes {
	public static void loadNaturaRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockredwoodsecretdoor, 4), Blocks.cobblestone,
				Blocks.cobblestone, ModItems.itemSoftRainbow);
	}

	public static void loadCheeseRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockcheesesecretdoor, 4), Blocks.cobblestone,
				Blocks.cobblestone, Blocks.cobblestone, ModItems.itemSoftRainbow);
	}
	public static void loadTekRecipes() {
		// TODO Auto-generated method stub
		
	}
	public static void loadRecipes() {
		RecipeSorter.register("rnbwtls:hiddenshaped", HiddenShapedRecipe.class, RecipeSorter.Category.SHAPED,
				"after:minecraft:shaped");
		GameRegistry.addRecipe(new ItemStack(ModItems.itemUnbrokenStick),
				new Object[] { "  A", " C ", "A  ", 'A', ModItems.itemSolidRainbow, 'C', ModItems.itemEnhancedStick });

		GameRegistry.addRecipe(new HiddenShapedRecipe(new ItemStack(ModItems.itemPortalWand),
				new Object[] { "  A", " C ", "C  ", 'A', ModItems.itemRainbowUpgrader, 'C', ModItems.itemMetalStick}));
		
		GameRegistry.addRecipe(new ItemStack(ModItems.itemMetalStick),
				new Object[] { " AA", "ACA", "AA ", 'A', ModItems.itemSolidRainbow, 'C',Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.itemMetalStick),
				new Object[] { " AA", "ACA", "AA ", 'A', ModItems.itemSolidRainbow, 'C',Items.stick});		
		GameRegistry.addRecipe(new ItemStack(ModItems.itemRainbowPlate),
				new Object[] { "A A", "AAA", "AAA", 'A', ModItems.itemSolidRainbow});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.itemRainbowHelm),
				new Object[] { "AAA", "A A", "   ", 'A', ModItems.itemSolidRainbow});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.itemRainbowLegs),
				new Object[] { "AAA", "A A", "A A", 'A', ModItems.itemSolidRainbow});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.itemRainbowShoes),
				new Object[] { "   ", "A A", "A A", 'A', ModItems.itemSolidRainbow});
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemRainbowPlateUp),
				new ItemStack(ModItems.itemRainbowPlate, 1, OreDictionary.WILDCARD_VALUE), ModItems.itemRainbowUpgrader,
				new ItemStack(ModItems.itemLimeHammer, 1, OreDictionary.WILDCARD_VALUE));

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemRainbowLegsUp),
				new ItemStack(ModItems.itemRainbowLegs, 1, OreDictionary.WILDCARD_VALUE), ModItems.itemRainbowUpgrader,
				new ItemStack(ModItems.itemLimeHammer, 1, OreDictionary.WILDCARD_VALUE));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemRainbowShoesUp),
				new ItemStack(ModItems.itemRainbowShoes, 1, OreDictionary.WILDCARD_VALUE), ModItems.itemRainbowUpgrader,
				new ItemStack(ModItems.itemLimeHammer, 1, OreDictionary.WILDCARD_VALUE));	
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemRainbowHelmUp),
				new ItemStack(ModItems.itemRainbowHelm, 1, OreDictionary.WILDCARD_VALUE), ModItems.itemRainbowUpgrader,
				new ItemStack(ModItems.itemLimeHammer, 1, OreDictionary.WILDCARD_VALUE));
		
		
		
		
		GameRegistry.addRecipe(new ItemStack(ModItems.itemBegoneThot),
				new Object[] { " A ", " B ", " A ", 'A', ModItems.itemB, 'B', ModItems.itemEnhancedStick });

		GameRegistry.addRecipe(new HiddenShapedRecipe(new ItemStack(ModItems.itemBrokenStick),
				new Object[] { "  A", " C ", "B  ", 'B', ModItems.itemSolidRainbow, 'A', ModItems.itemCondensedUpgrader,
						'C', ModItems.itemEnhancedStick }));

		GameRegistry.addRecipe(new ItemStack(ModItems.itemRainbowPick),
				new Object[] { "AAA", " B ", " B ", 'A', ModItems.itemSolidRainbow, 'B', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.itemRainbowAxe),
				new Object[] { "AA ", "AB ", " B ", 'A', ModItems.itemSolidRainbow, 'B', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.itemRainbowHoe),
				new Object[] { "AA ", " B ", " B ", 'A', ModItems.itemSolidRainbow, 'B', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.itemRainbowSword),
				new Object[] { " A ", " A ", " B ", 'A', ModItems.itemSolidRainbow, 'B', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.itemRainbowShovel),
				new Object[] { " A ", " B ", " B ", 'A', ModItems.itemSolidRainbow, 'B', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockRainbowBlock),
				new Object[] { "AAA", "AAA", "AAA", 'A', ModItems.itemSolidRainbow });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockRainbowBlockInd),
				new Object[] { "AAA", "AAA", "AAA", 'A', ModBlocks.blockRainbowBlock });

		GameRegistry.addRecipe(new ItemStack(ModItems.itemRainbowUpgrader),
				new Object[] { " A ", "ABA", " A ", 'A', Items.nether_star, 'B', ModItems.itemSoftRainbow });

		GameRegistry.addRecipe(new ItemStack(ModItems.itemCondensedUpgrader), new Object[] { "CAC", "ABA", "CAC", 'B',
				Items.nether_star, 'A', ModItems.itemRainbowUpgrader, 'C', ModItems.itemSoftRainbow });

		GameRegistry.addRecipe(new ItemStack(ModItems.itemLimeHammer),
				new Object[] { " A ", "ABA", "B  ", 'A', ModItems.itemLimeIngot, 'B', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.itemEnhancedStick),
				new Object[] { "  A", " B ", "A  ", 'A', ModItems.itemRainbowUpgrader, 'B', Items.stick });
		GameRegistry.addSmelting(ModItems.itemSoftRainbowDamp, new ItemStack(ModItems.itemSoftRainbow), 0.8F);
		GameRegistry.addSmelting(ModItems.itemSoftRainbow, new ItemStack(ModItems.itemSolidRainbow), 0.8F);
		GameRegistry.addSmelting(ModItems.itemSoftRainbowDamp, new ItemStack(ModItems.itemSoftRainbow), 0.8F);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemSolidRainbow, 9), ModBlocks.blockRainbowBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemSoftRainbow), ModItems.itemSolidRainbow);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemB), ModItems.itemSoftRainbow, ModItems.itemCheese);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemRainbowPickUp),
				new ItemStack(ModItems.itemRainbowPick, 1, OreDictionary.WILDCARD_VALUE), ModItems.itemRainbowUpgrader,
				new ItemStack(ModItems.itemLimeHammer, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemRainbowHoeUp),
				new ItemStack(ModItems.itemRainbowHoe, 1, OreDictionary.WILDCARD_VALUE), ModItems.itemRainbowUpgrader,
				new ItemStack(ModItems.itemLimeHammer, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemRainbowSwordUp),
				new ItemStack(ModItems.itemRainbowSword, 1, OreDictionary.WILDCARD_VALUE), ModItems.itemRainbowUpgrader,
				new ItemStack(ModItems.itemLimeHammer, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemRainbowShovelUp),
				new ItemStack(ModItems.itemRainbowShovel, 1, OreDictionary.WILDCARD_VALUE),
				ModItems.itemRainbowUpgrader, new ItemStack(ModItems.itemLimeHammer, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemRainbowAxeUp),
				new ItemStack(ModItems.itemRainbowAxe, 1, OreDictionary.WILDCARD_VALUE), ModItems.itemRainbowUpgrader,
				new ItemStack(ModItems.itemLimeHammer, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemLimeIngot), new ItemStack(Items.dye, 1, 10),
				Items.iron_ingot);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockRainbowBlockGlw, 9), ModBlocks.blockRainbowBlock,
				Items.glowstone_dust);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemSoftRainbowDamp, 4), new ItemStack(Items.dye, 2, 14),
				new ItemStack(Items.dye, 2, 5), new ItemStack(Items.dye, 2, 1), new ItemStack(Items.dye, 2, 6),
				Items.water_bucket, new ItemStack(Blocks.sand));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockstonesecretdoor, 4), Blocks.stone, Blocks.stone,
				Blocks.stone, ModItems.itemSoftRainbow);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockdirtsecretdoor, 4), Blocks.dirt, Blocks.dirt,
				Blocks.dirt, ModItems.itemSoftRainbow);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockRainbowBlock, 9), ModBlocks.blockRainbowBlockInd);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemCheese), Items.poisonous_potato, ModItems.itemSoftRainbow);
	}


	
}
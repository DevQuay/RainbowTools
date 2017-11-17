package verseau.rainbowtools.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import verseau.rainbowtools.RainbowTools;

public class ModBlocks {
	public static Block blockRainbowBlock;
	public static Block blockRainbowBlockInd;
	public static Block blockRainbowBlockGlw;
	public static Block blockdirtsecretdoor;
	public static Block blockstonesecretdoor;
	public static Block blockredwoodsecretdoor;
	public static Block blockcheesesecretdoor;

	public static void loadBlocks() {
		blockRainbowBlock = new blockRainbowBlock(Material.iron).setBlockName("BlockRainbowBlock")
				.setBlockTextureName("rnbwtls:rainbow_block").setCreativeTab(RainbowTools.tabRainbowTools);
		blockRainbowBlockInd = new blockRainbowBlockInd(Material.iron).setBlockName("BlockRainbowBlockInd")
				.setBlockTextureName("rnbwtls:rainbow_block_indes").setCreativeTab(RainbowTools.tabRainbowTools);
		blockRainbowBlockGlw = new blockRainbowBlockGlw(Material.iron).setBlockName("BlockRainbowBlockGlw")
				.setBlockTextureName("rnbwtls:rainbow_block_glow").setCreativeTab(RainbowTools.tabRainbowTools);
		blockdirtsecretdoor = new blockdirtsecretdoor(Material.iron).setBlockName("blockdirtsecretdoor")
				.setBlockTextureName("minecraft:dirt").setCreativeTab(RainbowTools.tabRainbowTools);
		blockstonesecretdoor = new blockstonesecretdoor(Material.iron).setBlockName("blockstonesecretdoor")
				.setBlockTextureName("minecraft:stone").setCreativeTab(RainbowTools.tabRainbowTools);
		blockredwoodsecretdoor = new blockredwoodsecretdoor(Material.iron).setBlockName("blockredwoodsecretdoor")
				.setBlockTextureName("natura:redwood_bark").setCreativeTab(RainbowTools.tabRainbowTools);
		blockcheesesecretdoor = new blockcheesesecretdoor(Material.iron).setBlockName("blockcheesesecretdoor")
				.setBlockTextureName("cm:blockcheese").setCreativeTab(RainbowTools.tabRainbowTools);
		GameRegistry.registerBlock(blockRainbowBlock, blockRainbowBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockRainbowBlockInd, blockRainbowBlockInd.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockRainbowBlockGlw, blockRainbowBlockGlw.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockdirtsecretdoor, blockdirtsecretdoor.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockstonesecretdoor, blockstonesecretdoor.getUnlocalizedName().substring(5));

	}

	public static void AddNatura() {
		GameRegistry.registerBlock(blockredwoodsecretdoor, blockredwoodsecretdoor.getUnlocalizedName().substring(5));
	}
	public static void AddCheese(){
		GameRegistry.registerBlock(blockcheesesecretdoor, blockcheesesecretdoor.getUnlocalizedName().substring(5));
	}

	public static void AddTek() {
		// TODO Auto-generated method stub
		
	}
}
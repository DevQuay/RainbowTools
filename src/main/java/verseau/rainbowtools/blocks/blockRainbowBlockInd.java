package verseau.rainbowtools.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockRainbowBlockInd extends Block {
	public blockRainbowBlockInd(Material material) {
		super(material);
		this.setHardness(50.0F);
		this.setHarvestLevel("pickaxe", 5);
		this.setResistance(400000.0F);
		
	}
}

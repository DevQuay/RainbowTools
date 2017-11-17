package verseau.rainbowtools.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockRainbowBlock extends Block {

	public blockRainbowBlock(Material material) {
		super(material);
		this.setHardness(50.0F);
		this.setHarvestLevel("pickaxe", 5);

	}

}

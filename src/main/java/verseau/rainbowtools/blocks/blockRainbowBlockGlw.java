package verseau.rainbowtools.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockRainbowBlockGlw extends Block {

	public blockRainbowBlockGlw(Material material) {
		super(material);
		this.setHardness(50.0F);
		this.setHarvestLevel("pickaxe", 5);
		this.setLightLevel(1.0F);

	}
}

package verseau.rainbowtools.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class blockdirtsecretdoor extends Block {
	public blockdirtsecretdoor(Material material) {
		super(material);
		this.setHardness(50.0F);
		this.setHarvestLevel("pickaxe", 5);
		this.setLightOpacity(16);
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k) {
		return null;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}
}

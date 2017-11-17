package verseau.rainbowtools.item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;
import verseau.rainbowtools.RainbowTools;

public class itemUnbrokenStick extends ItemSword {

	public itemUnbrokenStick(ToolMaterial material) {
		super(material);
	}

	public boolean hasEffect(ItemStack par1ItemStack) {
		return false;
	}
}

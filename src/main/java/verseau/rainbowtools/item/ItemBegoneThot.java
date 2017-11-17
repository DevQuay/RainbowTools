package verseau.rainbowtools.item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemBegoneThot extends ItemSword {
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		par1ItemStack.addEnchantment(Enchantment.knockback, 350);
	}
	public ItemBegoneThot(ToolMaterial material) {
		super(material);
	}
}

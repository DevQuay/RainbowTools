package verseau.rainbowtools.item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import verseau.rainbowtools.RainbowTools;
import com.sun.media.jfxmedia.logging.Logger;
import codechicken.nei.api.API;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;

public class itemBrokenStick extends ItemSword {

	public itemBrokenStick(ToolMaterial material) {
		super(material);
	}

	public boolean hasEffect(ItemStack par1ItemStack) {
		return false;
	}

	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		par1ItemStack.addEnchantment(Enchantment.knockback, 350);
		par1ItemStack.addEnchantment(Enchantment.unbreaking, 800);
		par1ItemStack.addEnchantment(Enchantment.sharpness, 800);
	}

}
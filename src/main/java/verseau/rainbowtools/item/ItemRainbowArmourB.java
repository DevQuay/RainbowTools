package verseau.rainbowtools.item;

import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemRainbowArmourB extends ItemArmor {
	public ItemRainbowArmourB(ArmorMaterial armourMaterialB, int renderIndexB, int armourTypeB) {
		super(armourMaterialB, renderIndexB, armourTypeB);
	}


	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
		if (armor.getItem() == ModItems.itemRainbowHelmUp) {
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 500, 4));
		}
		if (armor.getItem() == ModItems.itemRainbowPlateUp) {
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 500, 50));
		}
		if (armor.getItem() == ModItems.itemRainbowLegsUp) {
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 500, 50));}
		if(player.isSprinting() && (armor.getItem() == ModItems.itemRainbowShoesUp)) {
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id,5,50));
			player.addPotionEffect(new PotionEffect(Potion.jump.id,5,20));
		}
		if(player.isSneaking()) {
			//stuff here
			if (armor.getItem() == ModItems.itemRainbowShoesUp) {
				player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 4));}
			}
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		{

			if (this.armorType == 2) {
				return "rnbwtls:textures/models/armor/rainbow_layer_2.png";
			}
			return "rnbwtls:textures/models/armor/Uprainbow_layer_1.png";
		}
	}
}
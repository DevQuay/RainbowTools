package verseau.rainbowtools.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemRainbowArmour extends ItemArmor {
	public ItemRainbowArmour(ArmorMaterial armourMaterial, int renderIndex, int armourType) {
		super(armourMaterial, renderIndex, armourType);
	}
	@Override

	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
		if(armor.getItem() == ModItems.itemRainbowHelm) {
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 500, 4));
		}
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity,int slot,String type){
	{
		
	if(this.armorType == 2)
	{
	return "rnbwtls:textures/models/armor/rainbow_layer_2.png";	
	}
	return "rnbwtls:textures/models/armor/rainbow_layer_1.png";
	}
	}
}

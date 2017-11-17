package verseau.rainbowtools.item;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemRainbowPickUp extends ItemPickaxe {
    @Override
    public boolean hasEffect(ItemStack par1ItemStack)
    {
	    return true;
    }
	public ItemRainbowPickUp(ToolMaterial material) {
		super(material);

	}
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {

    	if(repair.getItem().equals(ModItems.itemSolidRainbow))
    		return true;
    	else
    		return false;
    }
}

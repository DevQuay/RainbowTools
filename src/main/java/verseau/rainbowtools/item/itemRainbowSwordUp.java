package verseau.rainbowtools.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class itemRainbowSwordUp extends ItemSword {
    @Override
    public boolean hasEffect(ItemStack par1ItemStack)
    {
	    return true;
    }
	public itemRainbowSwordUp(ToolMaterial material) {
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

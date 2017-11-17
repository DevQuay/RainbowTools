package verseau.rainbowtools.item;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class itemRainbowHoeUp extends ItemHoe {
    @Override
    public boolean hasEffect(ItemStack par1ItemStack)
    {
	    return true;
    }
	public itemRainbowHoeUp(ToolMaterial material) {
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

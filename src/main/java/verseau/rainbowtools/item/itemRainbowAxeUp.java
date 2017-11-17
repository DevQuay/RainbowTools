package verseau.rainbowtools.item;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class itemRainbowAxeUp extends ItemAxe {
    @Override
    public boolean hasEffect(ItemStack par1ItemStack)
    {
	    return true;
    }
	public itemRainbowAxeUp(ToolMaterial material) {
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

package verseau.rainbowtools.item;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class itemRainbowSpadeUp extends ItemSpade {
    @Override
    public boolean hasEffect(ItemStack par1ItemStack)
    {
	    return true;
    }
	public itemRainbowSpadeUp(ToolMaterial material) {
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

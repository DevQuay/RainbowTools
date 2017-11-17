package verseau.rainbowtools.item;

import net.minecraft.item.ItemSword;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class itemLimeHammer extends ItemSword {

	public itemLimeHammer(ToolMaterial material) {
		super(material);
	}
	//Makes it so the item stays in the crafting grid
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack) {
        return false;
    }
    
    //Tells the game your item has a container item
    public boolean hasContainerItem() {
    	return true;
    }
    
    //Sets the container item
    public ItemStack getContainerItem(ItemStack itemStack) {
    	itemStack.attemptDamageItem(1, itemRand);
    	
    	return itemStack;
    }
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {

    	if(repair.getItem().equals(ModItems.itemLimeIngot))
    		return true;
    	else
    		return false;
    }
}

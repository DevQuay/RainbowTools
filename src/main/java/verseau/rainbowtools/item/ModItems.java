package verseau.rainbowtools.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
import verseau.rainbowtools.RainbowTools;

public class ModItems {
	public static Item itemRainbowPick;
	public static Item itemRainbowShovel;
	public static Item itemRainbowSword;
	public static Item itemRainbowHoe;
	public static Item itemRainbowAxe;
	public static Item itemRainbowPickUp;
	public static Item itemRainbowShovelUp;
	public static Item itemRainbowSwordUp;
	public static Item itemRainbowHoeUp;
	public static Item itemRainbowAxeUp;
	public static Item itemSolidRainbow;
	public static Item itemSoftRainbow;
	public static Item itemSoftRainbowDamp;
	public static Item itemRainbowCapacitor;
	public static Item itemRainbowUpgrader;
	public static Item itemLimeIngot;
	public static Item itemLimeHammer;
	public static Item itemBrokenStick;
	public static Item itemUnbrokenStick;
	public static Item itemEnhancedStick;
	public static Item itemCondensedUpgrader;
	public static Item itemCheese;
	public static Item itemBegoneThot;
	public static Item itemB;
	public static Item itemPortalWand;
	public static Item itemRainbowArmour;
	public static Item itemRainbowArmourB;
	public static Item itemRainbowHelm;
	public static Item itemRainbowPlate;
	public static Item itemRainbowLegs;
	public static Item itemRainbowShoes;
	public static Item itemRainbowHelmUp;
	public static Item itemRainbowPlateUp;
	public static Item itemRainbowLegsUp;
	public static Item itemRainbowShoesUp;
	public static Item itemMetalStick;
	
	public static final Item.ToolMaterial rainbowToolMaterial = EnumHelper.addToolMaterial("rainbowToolMaterial", 5,
			400, 2.0F, 3.0F, 15);
	public static final Item.ToolMaterial rainbowToolMaterialUp = EnumHelper.addToolMaterial("rainbowToolMaterialUp", 5,
			400000, 900.0F, 8000.0F, 15);
	public static final Item.ToolMaterial HammerMat = EnumHelper.addToolMaterial("HammerMat", 5, 10, 2.0F, 3.0F, 7);
	public static final Item.ToolMaterial StickMat = EnumHelper.addToolMaterial("StickMat", 5, 30, 8000.0F, 96.0F, 16);
	public static final Item.ToolMaterial BrokenStickMat = EnumHelper.addToolMaterial("BrokenStickMat", 5, 8000000,
			8000.0F, 7999996.0F, 16);
	public static final Item.ToolMaterial BegoneThot = EnumHelper.addToolMaterial("BegoneThot", 5, 10, 2.0F, 1.0F, 7);
	public static ItemArmor.ArmorMaterial RainbowMat = EnumHelper.addArmorMaterial("RainbowMat", 8000,
			new int[] { 3, 8, 6, 3 }, 10);
	public static ItemArmor.ArmorMaterial RainbowMatB = EnumHelper.addArmorMaterial("RainbowMatB", 8000000,
			new int[] { 30, 30, 30, 30 }, 30);

	public static void loaditems() {
		RainbowTools.logger.info("Loading Items!");
		// armour
		itemRainbowHelm = new ItemRainbowArmour(RainbowMat, 0, 0).setUnlocalizedName("itemRainbowHelm").setTextureName("rnbwtls:rainbow_helm")
				.setCreativeTab(RainbowTools.tabRainbowTools);
		itemRainbowPlate = new ItemRainbowArmour(RainbowMat, 0, 1).setUnlocalizedName("itemRainbowPlate").setTextureName("rnbwtls:rainbow_plate")
				.setCreativeTab(RainbowTools.tabRainbowTools);
		itemRainbowLegs = new ItemRainbowArmour(RainbowMat, 0, 2).setUnlocalizedName("itemRainbowLegs").setTextureName("rnbwtls:rainbow_legs")
				.setCreativeTab(RainbowTools.tabRainbowTools);
		itemRainbowShoes = new ItemRainbowArmour(RainbowMat, 0, 3).setUnlocalizedName("itemRainbowShoes").setTextureName("rnbwtls:rainbow_shoes")
				.setCreativeTab(RainbowTools.tabRainbowTools);

		itemRainbowHelmUp = new ItemRainbowArmourB(RainbowMatB, 0, 0).setUnlocalizedName("itemRainbowHelmUp").setTextureName("rnbwtls:rainbow_helm")
				.setCreativeTab(RainbowTools.tabRainbowTools);
		itemRainbowPlateUp = new ItemRainbowArmourB(RainbowMatB, 0, 1).setUnlocalizedName("itemRainbowPlateUp").setTextureName("rnbwtls:rainbow_plateUp")
				.setCreativeTab(RainbowTools.tabRainbowTools);
		itemRainbowLegsUp = new ItemRainbowArmourB(RainbowMatB, 0, 2).setUnlocalizedName("itemRainbowLegsUp").setTextureName("rnbwtls:rainbow_legs")
				.setCreativeTab(RainbowTools.tabRainbowTools);
		itemRainbowShoesUp = new ItemRainbowArmourB(RainbowMatB, 0, 3).setUnlocalizedName("itemRainbowShoesUp").setTextureName("rnbwtls:rainbow_shoes")
				.setCreativeTab(RainbowTools.tabRainbowTools);

		//portal wand
		itemPortalWand = new verseau.rainbowtools.item.itemPortalWand(BrokenStickMat).setUnlocalizedName("itemPortalWand").setTextureName("rnbwtls:portal_wand")
				.setCreativeTab(RainbowTools.tabRainbowTools);
		GameRegistry.registerItem(itemPortalWand, itemPortalWand.getUnlocalizedName().substring(5));
		// items
		itemRainbowPick = new ItemRainbowPick(rainbowToolMaterial).setUnlocalizedName("ItemRainbowPick")
				.setTextureName("rnbwtls:rainbow_pickaxe").setCreativeTab(RainbowTools.tabRainbowTools);

		itemBegoneThot = new verseau.rainbowtools.item.ItemBegoneThot(BegoneThot).setUnlocalizedName("ItemBegoneThot")
				.setTextureName("rnbwtls:begone").setCreativeTab(RainbowTools.tabRainbowTools);

		itemB = new verseau.rainbowtools.item.ItemB().setUnlocalizedName("ItemB").setTextureName("rnbwtls:B")
				.setCreativeTab(RainbowTools.tabRainbowTools);
		
		itemMetalStick = new verseau.rainbowtools.item.itemMetalStick()
				.setUnlocalizedName("itemMetalStick").setTextureName("rnbwtls:metal_stick")
				.setCreativeTab(RainbowTools.tabRainbowTools);

		itemRainbowAxe = new verseau.rainbowtools.item.itemRainbowAxe(rainbowToolMaterial)
				.setUnlocalizedName("ItemRainbowAxe").setTextureName("rnbwtls:rainbow_axe")
				.setCreativeTab(RainbowTools.tabRainbowTools);
		itemRainbowSword = new verseau.rainbowtools.item.itemRainbowSword(rainbowToolMaterial)
				.setUnlocalizedName("ItemRainbowSword").setTextureName("rnbwtls:rainbow_sword")
				.setCreativeTab(RainbowTools.tabRainbowTools);
		itemRainbowShovel = new itemRainbowSpade(rainbowToolMaterial).setUnlocalizedName("itemRainbowSpade")
				.setTextureName("rnbwtls:rainbow_shovel").setCreativeTab(RainbowTools.tabRainbowTools);
		itemRainbowHoe = new itemRainbowHoe(rainbowToolMaterial).setUnlocalizedName("itemRainbowHoe")
				.setTextureName("rnbwtls:rainbow_hoe").setCreativeTab(RainbowTools.tabRainbowTools);
		itemSolidRainbow = new itemSolidRainbow().setUnlocalizedName("ItemRainbowSolid");
		itemRainbowPickUp = new ItemRainbowPickUp(rainbowToolMaterialUp).setUnlocalizedName("itemRainbowPickUp")
				.setTextureName("rnbwtls:rainbow_pickaxe").setCreativeTab(RainbowTools.tabRainbowTools);
		itemRainbowAxeUp = new itemRainbowAxeUp(rainbowToolMaterialUp).setUnlocalizedName("itemRainbowAxeUp")
				.setTextureName("rnbwtls:rainbow_axe").setCreativeTab(RainbowTools.tabRainbowTools);
		itemRainbowSwordUp = new itemRainbowSwordUp(rainbowToolMaterialUp).setUnlocalizedName("itemRainbowSwordUp")
				.setTextureName("rnbwtls:rainbow_sword").setCreativeTab(RainbowTools.tabRainbowTools);
		itemRainbowShovelUp = new itemRainbowSpadeUp(rainbowToolMaterialUp).setUnlocalizedName("itemRainbowSpadeUp")
				.setTextureName("rnbwtls:rainbow_shovel").setCreativeTab(RainbowTools.tabRainbowTools);
		itemRainbowHoeUp = new itemRainbowHoeUp(rainbowToolMaterialUp).setUnlocalizedName("itemRainbowHoeUp")
				.setTextureName("rnbwtls:rainbow_hoe").setCreativeTab(RainbowTools.tabRainbowTools);
		itemCheese = new ItemFood(20, 1F, false).setUnlocalizedName("ItemCheese").setTextureName("rnbwtls:the_cheese")
				.setCreativeTab(RainbowTools.tabRainbowTools);
		itemSolidRainbow = new itemSolidRainbow().setUnlocalizedName("ItemRainbowSolid")
				.setTextureName("rnbwtls:rainbow_solid").setCreativeTab(RainbowTools.tabRainbowTools);
		itemSoftRainbow = new itemSoftRainbow().setUnlocalizedName("ItemRainbowSoft")
				.setTextureName("rnbwtls:rainbow_soft").setCreativeTab(RainbowTools.tabRainbowTools);
		itemSoftRainbowDamp = new itemSoftRainbowDamp().setUnlocalizedName("ItemRainbowSoftDamp")
				.setTextureName("rnbwtls:rainbow_soft_damp").setCreativeTab(RainbowTools.tabRainbowTools);
		itemRainbowUpgrader = new itemRainbowUpgrader().setUnlocalizedName("itemRainbowUpgrader")
				.setTextureName("rnbwtls:rainbow_upgrader").setCreativeTab(RainbowTools.tabRainbowTools);
		itemLimeIngot = new itemLimeIngot().setUnlocalizedName("itemLimeIngot").setTextureName("rnbwtls:lime_ingot")
				.setCreativeTab(RainbowTools.tabRainbowTools);
		itemLimeHammer = new itemLimeHammer(HammerMat).setUnlocalizedName("itemLimeHammer")
				.setTextureName("rnbwtls:lime_hammer").setCreativeTab(RainbowTools.tabRainbowTools);
		itemEnhancedStick = new itemEnhancedStick().setUnlocalizedName("itemEnhancedStick")
				.setTextureName("rnbwtls:enhanced_stick").setCreativeTab(RainbowTools.tabRainbowTools);
		itemBrokenStick = new itemBrokenStick(BrokenStickMat).setUnlocalizedName("ItemBrokenStick")
				.setTextureName("rnbwtls:broken_stick").setCreativeTab(RainbowTools.tabRainbowTools);
		itemUnbrokenStick = new itemUnbrokenStick(StickMat).setUnlocalizedName("itemUnbrokenStick")
				.setTextureName("rnbwtls:broken_stick").setCreativeTab(RainbowTools.tabRainbowTools);
		itemCondensedUpgrader = new itemCondensedUpgrader().setUnlocalizedName("itemCondensedUpgrader")
				.setTextureName("rnbwtls:condensed_upgrader").setCreativeTab(RainbowTools.tabRainbowTools);
		GameRegistry.registerItem(itemRainbowPick, itemRainbowPick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowAxe, itemRainbowAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowSword, itemRainbowSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowShovel, itemRainbowShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowHoe, itemRainbowHoe.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(itemRainbowPickUp, itemRainbowPickUp.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowAxeUp, itemRainbowAxeUp.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowSwordUp, itemRainbowSwordUp.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowShovelUp, itemRainbowShovelUp.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowHoeUp, itemRainbowHoeUp.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(itemSolidRainbow, itemSolidRainbow.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemSoftRainbowDamp, itemSoftRainbowDamp.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemSoftRainbow, itemSoftRainbow.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowUpgrader, itemRainbowUpgrader.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemLimeIngot, itemLimeIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemLimeHammer, itemLimeHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemBrokenStick, itemBrokenStick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemUnbrokenStick, itemUnbrokenStick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemEnhancedStick, itemEnhancedStick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemCondensedUpgrader, itemCondensedUpgrader.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemBegoneThot, itemBegoneThot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemB, itemB.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemCheese, itemCheese.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowHelm, itemRainbowHelm.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowPlate, itemRainbowPlate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowLegs, itemRainbowLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowShoes, itemRainbowShoes.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(itemRainbowHelmUp, itemRainbowHelmUp.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowPlateUp, itemRainbowPlateUp.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowLegsUp, itemRainbowLegsUp.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRainbowShoesUp, itemRainbowShoesUp.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemMetalStick, itemMetalStick.getUnlocalizedName().substring(5));
	}
};
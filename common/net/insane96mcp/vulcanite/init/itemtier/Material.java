package net.insane96mcp.vulcanite.init.itemtier;

import net.insane96mcp.vulcanite.init.ModItems;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;

public class Material {
	public static IItemTier TOOL_VULCANITE = new IItemTier() {
		
		@Override
		public Ingredient getRepairMaterial() {
			Ingredient repairMaterial = Ingredient.fromItems(ModItems.vulcaniteIngot);
			return repairMaterial;
		}
		
		@Override
		public int getMaxUses() {
			return 406;
		}
		
		@Override
		public int getHarvestLevel() {
			return 3;
		}
		
		@Override
		public int getEnchantability() {
			return 18;
		}
		
		@Override
		public float getEfficiency() {
			return 5f;
		}
		
		@Override
		public float getAttackDamage() {
			return 2.5f;
		}
	};
	
	public static IArmorMaterial ARMOR_VULCANITE = new IArmorMaterial() {
		
		@Override
		public float getToughness() {
			return 0;
		}
		
		@Override
		public SoundEvent getSoundEvent() {
			return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
		}
		
		@Override
		public Ingredient getRepairMaterial() {
			Ingredient repairMaterial = Ingredient.fromItems(ModItems.vulcaniteIngot);
			return repairMaterial;
		}
		
		@Override
		public String getName() {
			return "vulcanite";
		}
		
		@Override
		public int getEnchantability() {
			return 10;
		}
		
		@Override
		public int getDurability(EntityEquipmentSlot arg0) {
			switch (arg0) {
			case HEAD:
				return 242;
				
			case CHEST:
				return 352;
				
			case LEGS:
				return 330;
				
			case FEET:
				return 286;

			default:
				break;
			}
			return 0;
		}
		
		@Override
		public int getDamageReductionAmount(EntityEquipmentSlot arg0) {

			switch (arg0) {
			case HEAD:
				return 2;
				
			case CHEST:
				return 5;
				
			case LEGS:
				return 4;
				
			case FEET:
				return 2;

			default:
				break;
			}
			return 0;
		}
	};
}

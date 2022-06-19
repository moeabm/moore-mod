
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mooremod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.mooremod.MooreModMod;

public class MooreModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MooreModMod.MODID);
	public static final RegistryObject<Item> POGO_STICK = REGISTRY.register("pogo_stick_spawn_egg",
			() -> new ForgeSpawnEggItem(MooreModModEntities.POGO_STICK, -3407872, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}

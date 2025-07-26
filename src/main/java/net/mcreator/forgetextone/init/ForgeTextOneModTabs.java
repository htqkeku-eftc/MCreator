/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgetextone.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.forgetextone.ForgeTextOneMod;

public class ForgeTextOneModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ForgeTextOneMod.MODID);
	public static final RegistryObject<CreativeModeTab> SIMPLE_ECOLOGY_ADD = REGISTRY.register("simple_ecology_add",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.forge_text_one.simple_ecology_add")).icon(() -> new ItemStack(ForgeTextOneModBlocks.AMBERMINE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ForgeTextOneModBlocks.AMBERMINE.get().asItem());
				tabData.accept(ForgeTextOneModItems.AMBER.get());
			}).withSearchBar().build());
}
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgetextone.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.forgetextone.block.AmbermineBlock;
import net.mcreator.forgetextone.ForgeTextOneMod;

public class ForgeTextOneModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ForgeTextOneMod.MODID);
	public static final RegistryObject<Block> AMBERMINE = REGISTRY.register("ambermine", () -> new AmbermineBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
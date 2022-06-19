package net.mcreator.mooremod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mooremod.entity.PogoStickEntity;

public class PogoJumpOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getVehicle()) instanceof PogoStickEntity == true) {
			(entity.getVehicle()).getPersistentData().putDouble("Jump", 1);
		}
	}
}

package net.mcreator.mooremod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mooremod.entity.PogoStickEntity;

public class PogoJumpOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getVehicle()) instanceof PogoStickEntity == true) {
			entity.getPersistentData().putBoolean("jumpPressed", (true));
		}
	}
}

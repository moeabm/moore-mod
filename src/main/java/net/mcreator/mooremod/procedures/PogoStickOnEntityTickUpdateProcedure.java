package net.mcreator.mooremod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class PogoStickOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("jumpPressed")) {
			entity.getPersistentData().putDouble("jumpCharge", (entity.getPersistentData().getDouble("jumpCharge") + 0.1));
		} else if (entity.getPersistentData().getDouble("jumpCharge") > 0) {
			if (entity.isOnGround()) {
				entity.setDeltaMovement(new Vec3(0, (entity.getPersistentData().getDouble("jumpCharge")), 0));
			}
			entity.getPersistentData().putDouble("jumpCharge", 0);
		}
	}
}

package net.mcreator.mooremod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class PogoStickOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("Jump") == 1) {
			if (entity.isOnGround()) {
				entity.setDeltaMovement(new Vec3(0, 1, 0));
			}
		}
		if (entity.isOnGround()) {
			entity.getPersistentData().putDouble("TimeOnGround", (entity.getPersistentData().getDouble("TimeOnGround") + 0.1));
		} else {
			entity.getPersistentData().putDouble("TimeOnGround", 0);
			entity.getPersistentData().putDouble("Jump", 0);
		}
	}
}

package net.mcreator.mooremod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class PogoStickOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
			
		// space bar is pressed
		if (entity.getPersistentData().getBoolean("jumpPressed") == true) {
			// add to jump charge
			entity.getPersistentData().putDouble("jumpCharge",  (entity.getPersistentData().getDouble("jumpCharge") + 0.1));
		}
		// space bar is not pressed
		else if (entity.getPersistentData().getDouble("jumpCharge") > 0) {
			// jump if on the ground
			if (entity.isOnGround()) {
				entity.setDeltaMovement(new Vec3(0, 1, 0));
			}
			// reset jump charge
			entity.getPersistentData().putDouble("jumpCharge",  0);
		}
	}
}

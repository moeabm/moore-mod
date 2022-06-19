
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mooremod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.mooremod.network.PogoJumpMessage;
import net.mcreator.mooremod.MooreModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MooreModModKeyMappings {
	public static final KeyMapping POGO_JUMP = new KeyMapping("key.moore_mod.pogo_jump", GLFW.GLFW_KEY_SPACE, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(POGO_JUMP);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == POGO_JUMP.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MooreModMod.PACKET_HANDLER.sendToServer(new PogoJumpMessage(0, 0));
						PogoJumpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}

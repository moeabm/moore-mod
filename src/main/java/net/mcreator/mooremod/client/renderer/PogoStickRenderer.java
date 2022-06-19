
package net.mcreator.mooremod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.mooremod.entity.PogoStickEntity;

public class PogoStickRenderer extends MobRenderer<PogoStickEntity, PigModel<PogoStickEntity>> {
	public PogoStickRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PogoStickEntity entity) {
		return new ResourceLocation("moore_mod:textures/test.png");
	}
}

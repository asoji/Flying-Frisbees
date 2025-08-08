package io.github.jvuong4.flyingfrisbees.Entity;

import io.github.jvuong4.flyingfrisbees.FlyingFrisbees;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.state.ProjectileEntityRenderState;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class FrisbeeEntityRenderer<R extends ProjectileEntityRenderState & GeoRenderState> extends GeoEntityRenderer<FrisbeeEntity,R> {
	public FrisbeeEntityRenderer(EntityRendererFactory.Context context) {
		//super(context, new FrisbeeEntityModel());
		//super(context, new FrisbeeEntityModel(FlyingFrisbees.id("frisbeeEntity")));
		super(context, new FrisbeeEntityModel(Identifier.of(FlyingFrisbees.MOD_ID, "geckolib")));
	}
}

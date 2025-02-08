package org.jade.nodeathanimationsplus.mixin;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import static org.jade.nodeathanimationsplus.ModClient.config;

@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererMixin<T extends LivingEntity> extends EntityRenderer<T> {
	protected LivingEntityRendererMixin(EntityRendererProvider.Context context) {
		super(context);
	}
	
	@Inject(method = "getFlipDegrees", at = @At("HEAD"), cancellable = true)
	void customFlipDegrees(T livingEntity, CallbackInfoReturnable<Float> cir) {
		cir.setReturnValue((float) config.deathFlipDegrees);
	}
}

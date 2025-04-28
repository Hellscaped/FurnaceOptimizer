package dev.hellscaped.furnaceoptimizer.mixin;

import net.minecraft.server.ReloadableServerResources;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import dev.hellscaped.furnaceoptimizer.Hooks;

@Mixin(ReloadableServerResources.class)
class ServerResourceManagerMixin {
	@Inject(method = "updateRegistryTags(Lnet/minecraft/core/RegistryAccess;)V",at = @At("RETURN"))
	private void rebuildFuelMap(CallbackInfo ci){
		Hooks.rebuildFuelMap();
	}
}

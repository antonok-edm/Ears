package com.unascribed.ears.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import com.unascribed.ears.legacy.LegacyHelper;

@Mixin(targets = "net/minecraft/class_130$1")
public class MixinClass130Thread {
	@ModifyArg(method = "run()V", at = @At(value = "INVOKE", target = "Ljava/net/URL;<init>(Ljava/lang/String;)V"), remap = false)
	private String amendSkinUrl(String url) {
		if (url.startsWith("http://s3.amazonaws.com/MinecraftSkins/") && url.endsWith(".png")) {
			String username = url.substring(39, url.length() - 4);
			return LegacyHelper.getSkinUrl(username);
		}
		return url;
	}
}

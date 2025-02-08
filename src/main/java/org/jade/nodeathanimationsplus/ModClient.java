package org.jade.nodeathanimationsplus;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import org.jetbrains.annotations.Nullable;

public class ModClient implements ClientModInitializer {
	@Nullable
	public static ModConfig config;
	
	@Override
	public void onInitializeClient() {
		AutoConfig.register(ModConfig.class, Toml4jConfigSerializer::new);
		config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
	}
}
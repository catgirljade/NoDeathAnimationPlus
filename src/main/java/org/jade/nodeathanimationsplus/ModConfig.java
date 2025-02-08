package org.jade.nodeathanimationsplus;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "nodeathanimationsplus")
public class ModConfig implements ConfigData {
	public boolean poofParticles = false;
	public boolean deathAnimation = false;
	public int deathFlipDegrees = 90;
}

package net.runelite.client.plugins.joehunter;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("JoeHunterConfig")

public interface JoeHunterConfig extends Config
{
	@ConfigItem(
			keyName = "hunter",
			name = "Hunter Active",
			description = "Drop and pickup traps.",
			position = 0
	)
	default boolean getHunterActive()
	{
		return false;
	}

	@ConfigItem(
			keyName = "trap_amount",
			name = "Trap Amount",
			description = "The amount of traps being used.",
			position = 1
	)
	default int getTrapCount()
	{
		return 4;
	}

	@ConfigItem(
			keyName = "hunter_target",
			name = "Hunter Target",
			description = "What are you hunting?",
			position = 2
	)
	default HunterTarget getHunterTarget()
	{
		return HunterTarget.RED_CHINS;
	}

	enum HunterTarget
	{
		RED_CHINS
	}
//
//	enum Food
//	{
//		MONKFISH
//	}
}
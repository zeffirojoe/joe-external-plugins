package net.runelite.client.plugins.joemining;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("JoeMiningConfig")

public interface JoeMiningConfig extends Config
{
	@ConfigItem(
			keyName = "mining",
			name = "Mining Active",
			description = "Mine selected ore",
			position = 0
	)
	default boolean getMiningActive()
	{
		return false;
	}

	@ConfigItem(
			keyName = "bank",
			name = "Bank Ore (NOT WORKING)",
			description = "Bank the ore you're mining if close enough",
			position = 1
	)
	default boolean getBankOre()
	{
		return false;
	}

	@ConfigItem(
			keyName = "ore",
			name = "Ore",
			description = "Select the ore you want to mine.",
			position = 2
	)
	default ORE getSelectedOre()
	{
		return ORE.AMETHYST;
	}



//	enum PickPocketTarget
//	{
//		KNIGHT,
//		FARMER
//	}
//
	enum ORE
	{
		AMETHYST
	}

}
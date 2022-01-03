package net.runelite.client.plugins.joethieving;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("JoeThievingConfig")

public interface JoeThievingConfig extends Config
{
	@ConfigItem(
			keyName = "pickpocket",
			name = "Pickpocket active",
			description = "Pickpocket and open coin purse.",
			position = 0
	)
	default boolean getPickpocketActive()
	{
		return false;
	}

	@ConfigItem(
			keyName = "pickpocket_target",
			name = "Target",
			description = "The NPC that's the pickpocket target.",
			position = 1
	)
	default PickPocketTarget getPickpocketTarget()
	{
		return PickPocketTarget.KNIGHT;
	}

	@ConfigItem(
			keyName = "hitpoints",
			name = "Eat at Threshold",
			description = "Eat food when at or below health threshold.",
			position = 2
	)
	default boolean getHitpointsChecker()
	{
		return false;
	}

	@ConfigItem(
			keyName = "hitpoints_thresh",
			name = "Hitpoints Threshold",
			description = "The amount of hitpoints which would cause you to eat",
			position = 3
	)
	default int getHitpointsThreshold()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "food_choice",
			name = "Food",
			description = "The Food you'll be eating when below threshold",
			position = 4
	)
	default Food getFoodChoice()
	{
		return Food.MONKFISH;
	}

	@ConfigItem(
			keyName = "dodgy",
			name = "Using Dodgy Necklaces?",
			description = "Check if using Dodgy Necklaces",
			position = 5
	)
	default boolean getDodgyNecklace()
	{
		return false;
	}

	enum PickPocketTarget
	{
		KNIGHT,
		FARMER
	}

	enum Food
	{
		MONKFISH
	}

}
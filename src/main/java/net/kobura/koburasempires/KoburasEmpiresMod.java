package net.kobura.koburasempires;

import net.fabricmc.api.ModInitializer;

import net.kobura.koburasempires.block.ModBlocks;
import net.kobura.koburasempires.entity.ModEntities;
import net.kobura.koburasempires.item.ModItemGroups;
import net.kobura.koburasempires.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KoburasEmpiresMod implements ModInitializer {
	public static final String MOD_ID = "koburasempires";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlocks();
        ModEntities.registerModEntities();

		LOGGER.info("Hello Fabric world!");
	}
}
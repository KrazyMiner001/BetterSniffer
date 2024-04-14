package krazyminer001.bettersniffer;

import krazyminer001.bettersniffer.blocks.ModBlocks;
import krazyminer001.bettersniffer.entities.ModEntities;
import krazyminer001.bettersniffer.entities.custom.BetterSnifferEntity;
import krazyminer001.bettersniffer.items.ModItemGroups;
import krazyminer001.bettersniffer.items.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterSniffer implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("bettersniffer");
	public static final String MODID = "bettersniffer";

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.BETTER_SNIFFER, BetterSnifferEntity.createSnifferAttributes());
	}
}
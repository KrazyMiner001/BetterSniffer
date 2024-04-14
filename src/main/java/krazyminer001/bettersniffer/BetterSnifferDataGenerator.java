package krazyminer001.bettersniffer;

import krazyminer001.bettersniffer.datagen.ModGiftLootTableProvider;
import krazyminer001.bettersniffer.datagen.ModModelProvider;
import krazyminer001.bettersniffer.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BetterSnifferDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModGiftLootTableProvider::new);
	}
}

package krazyminer001.bettersniffer.datagen;

import krazyminer001.bettersniffer.blocks.ModBlocks;
import krazyminer001.bettersniffer.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class ModGiftLootTableProvider extends SimpleFabricLootTableProvider {
    public ModGiftLootTableProvider(FabricDataOutput output) {
        super(output, LootContextTypes.GIFT);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> exporter) {
        exporter.accept(new Identifier("gameplay/sniffer_digging"), LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(Items.PITCHER_POD))
                        .with(ItemEntry.builder(Items.TORCHFLOWER_SEEDS))
                        .with(ItemEntry.builder(ModBlocks.CYAN_ROSE))
                        .with(ItemEntry.builder(ModBlocks.ROSE))
                        .with(ItemEntry.builder(ModBlocks.PIGSFACE))
                        .with(ItemEntry.builder(ModItems.ENVY_ZINNIA_SEEDS))
                        .with(ItemEntry.builder(ModItems.HYACINTH_SEEDS))
                        .with(ItemEntry.builder(ModItems.BLUEBELL_SEEDS))
                        .with(ItemEntry.builder(ModBlocks.LAVENDER))
                ));
    }
}

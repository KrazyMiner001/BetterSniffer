package krazyminer001.bettersniffer.items;

import krazyminer001.bettersniffer.BetterSniffer;
import krazyminer001.bettersniffer.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    private static final ItemGroup BETTER_SNIFFER_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.SNIFFER_EGG))
            .entries(((displayContext, entries) -> {
                entries.add(ModBlocks.CYAN_ROSE);
                entries.add(ModBlocks.ROSE);
                entries.add(ModBlocks.PIGSFACE);
                entries.add(ModBlocks.SHEARED_PIGSFACE);

                entries.add(ModItems.PIGSFACE_PETAL);

                entries.add(ModItems.ROSE_COLORED_DYE);
                entries.add(ModItems.ROSE_DYE);
                entries.add(ModItems.CHARTREUSE_DYE);

                entries.add(ModItems.ENVY_ZINNIA_SEEDS);
                entries.add(ModItems.HYACINTH_SEEDS);
                entries.add(ModItems.BLUEBELL_SEEDS);
            }))
            .displayName(Text.translatable("itemgroup.better_sniffer_group"))
            .build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(BetterSniffer.MODID, "better_sniffer_group"), BETTER_SNIFFER_GROUP);
        BetterSniffer.LOGGER.info("Registering Item Groups for " + BetterSniffer.MODID);
    }
}

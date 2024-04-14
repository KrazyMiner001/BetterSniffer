package krazyminer001.bettersniffer.items;

import krazyminer001.bettersniffer.BetterSniffer;
import krazyminer001.bettersniffer.blocks.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PIGSFACE_PETAL = registerItem("pigsface_petal",
            new Item(new FabricItemSettings()));
    public static final Item ROSE_COLORED_DYE = registerItem("rose_colored_dye",
            new Item(new FabricItemSettings()));
    public static final Item ROSE_DYE = registerItem("rose_dye",
            new Item(new FabricItemSettings()));
    public static final Item CHARTREUSE_DYE = registerItem("chartreuse_dye",
            new Item(new FabricItemSettings()));
    public static final Item SPRING_GREEN_DYE = registerItem("spring_green_dye",
            new Item(new FabricItemSettings()));
    public static final Item CAPRI_DYE = registerItem("capri_dye",
            new Item(new FabricItemSettings()));
    public static final Item ULTRAMARINE_DYE = registerItem("ultramarine_dye",
            new Item(new FabricItemSettings()));
    public static final Item VIOLET_DYE = registerItem("violet_dye",
            new Item(new FabricItemSettings()));
    public static final Item ENVY_ZINNIA_SEEDS = registerItem("envy_zinnia_seeds",
            new BlockItem(ModBlocks.ENVY_ZINNIA_CROP, new FabricItemSettings()));
    public static final Item HYACINTH_SEEDS = registerItem("hyacinth_seeds",
            new BlockItem(ModBlocks.HYACINTH_CROP, new FabricItemSettings()));
    public static final Item BLUEBELL_SEEDS = registerItem("bluebell_seeds",
            new BlockItem(ModBlocks.BLUEBELL_CROP, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterSniffer.MODID, name), item);
    }

    public static void registerModItems() {
        BetterSniffer.LOGGER.info("Registering Items for " + BetterSniffer.MODID);
    }
}

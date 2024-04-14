package krazyminer001.bettersniffer.blocks;

import krazyminer001.bettersniffer.BetterSniffer;
import krazyminer001.bettersniffer.blocks.custom.PigsfacePlant;
import krazyminer001.bettersniffer.blocks.custom.ShearedPigsfacePlant;
import krazyminer001.bettersniffer.blocks.custom.TallCropBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CYAN_ROSE = registerBlockAndItem("cyan_rose",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block POTTED_CYAN_ROSE = registerJustBlock("potted_cyan_rose",
            Blocks.createFlowerPotBlock(CYAN_ROSE));
    public static final Block ROSE = registerBlockAndItem("rose",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block POTTED_ROSE = registerJustBlock("potted_rose",
            Blocks.createFlowerPotBlock(ROSE));
    public static final Block PIGSFACE = registerBlockAndItem("pigsface",
            new PigsfacePlant());
    public static final Block POTTED_PIGSFACE = registerJustBlock("potted_pigsface",
            Blocks.createFlowerPotBlock(PIGSFACE));
    public static final Block SHEARED_PIGSFACE = registerBlockAndItem("sheared_pigsface",
            new ShearedPigsfacePlant());
    public static final Block POTTED_SHEARED_PIGSFACE = registerJustBlock("potted_sheared_pigsface",
            Blocks.createFlowerPotBlock(SHEARED_PIGSFACE));
    public static final Block ENVY_ZINNIA = registerBlockAndItem("envy_zinnia",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block POTTED_ENVY_ZINNIA = registerJustBlock("potted_envy_zinnia",
            Blocks.createFlowerPotBlock(ENVY_ZINNIA));
    public static final Block ENVY_ZINNIA_CROP = registerJustBlock("envy_zinnia_crop",
            new CropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block HYACINTH = registerBlockAndItem("hyacinth",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block POTTED_HYACINTH = registerJustBlock("potted_hyacinth",
            Blocks.createFlowerPotBlock(HYACINTH));
    public static final Block HYACINTH_CROP = registerJustBlock("hyacinth_crop",
            new CropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block BLUEBELL = registerBlockAndItem("bluebell",
            new TallPlantBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH)));
    public static final Block POTTED_BLUEBELL = registerJustBlock("potted_bluebell",
            Blocks.createFlowerPotBlock(HYACINTH));
    public static final Block BLUEBELL_CROP = registerJustBlock("bluebell_crop",
            new TallCropBlock(FabricBlockSettings.copyOf(Blocks.PITCHER_CROP), 3));
    public static final Block LAVENDER = registerBlockAndItem("lavender",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block POTTED_LAVENDER = registerJustBlock("potted_lavender",
            Blocks.createFlowerPotBlock(LAVENDER));


    private static Block registerBlockAndItem(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BetterSniffer.MODID, name), block);
    }

    private static Block registerJustBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(BetterSniffer.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BetterSniffer.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BetterSniffer.LOGGER.info("Registering Blocks for " + BetterSniffer.MODID);
    }
}

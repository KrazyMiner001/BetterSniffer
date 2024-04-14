package krazyminer001.bettersniffer.datagen;

import krazyminer001.bettersniffer.blocks.ModBlocks;
import krazyminer001.bettersniffer.blocks.custom.TallCropBlock;
import krazyminer001.bettersniffer.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.block.PitcherCropBlock;
import net.minecraft.data.client.*;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CYAN_ROSE, ModBlocks.POTTED_CYAN_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ROSE, ModBlocks.POTTED_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PIGSFACE, ModBlocks.POTTED_PIGSFACE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SHEARED_PIGSFACE, ModBlocks.POTTED_SHEARED_PIGSFACE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ENVY_ZINNIA, ModBlocks.POTTED_ENVY_ZINNIA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.HYACINTH, ModBlocks.POTTED_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUEBELL, ModBlocks.POTTED_BLUEBELL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LAVENDER, ModBlocks.POTTED_LAVENDER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerCrop(ModBlocks.ENVY_ZINNIA_CROP, Properties.AGE_7, 0, 1, 2, 3, 4, 5, 6 ,7);
        blockStateModelGenerator.registerCrop(ModBlocks.HYACINTH_CROP, Properties.AGE_7, 0, 1, 2, 3, 4, 5, 6, 7);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ROSE_COLORED_DYE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_DYE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIGSFACE_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHARTREUSE_DYE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUEBELL_SEEDS, Models.GENERATED);
    }
}

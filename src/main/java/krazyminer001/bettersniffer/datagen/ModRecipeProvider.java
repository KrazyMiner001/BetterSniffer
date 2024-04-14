package krazyminer001.bettersniffer.datagen;

import krazyminer001.bettersniffer.blocks.ModBlocks;
import krazyminer001.bettersniffer.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        dyeRecipe(exporter, ModBlocks.CYAN_ROSE.asItem(), Items.CYAN_DYE);
        dyeRecipe(exporter, ModBlocks.ROSE.asItem(), ModItems.ROSE_COLORED_DYE);
        dyeRecipe(exporter, ModItems.ROSE_COLORED_DYE, ModItems.ROSE_DYE);
        dyeRecipe(exporter, ModBlocks.PIGSFACE.asItem(), ModItems.CHARTREUSE_DYE);
        dyeRecipe(exporter, ModItems.PIGSFACE_PETAL, Items.MAGENTA_DYE);

    }

    private static void dyeRecipe(Consumer<RecipeJsonProvider> exporter, Item item, Item dye) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, dye)
                .input(item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter);
    }
}

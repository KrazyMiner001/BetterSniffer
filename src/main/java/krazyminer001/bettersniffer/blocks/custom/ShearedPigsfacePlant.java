package krazyminer001.bettersniffer.blocks.custom;

import krazyminer001.bettersniffer.blocks.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PlantBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class ShearedPigsfacePlant extends PlantBlock {
    public ShearedPigsfacePlant() {
        super(FabricBlockSettings.copyOf(Blocks.POPPY));
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextDouble() < 0.2) {
            world.setBlockState(pos, ModBlocks.PIGSFACE.getDefaultState());
        }
    }
}

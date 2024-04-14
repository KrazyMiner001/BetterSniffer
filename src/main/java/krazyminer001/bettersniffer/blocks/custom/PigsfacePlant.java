package krazyminer001.bettersniffer.blocks.custom;

import krazyminer001.bettersniffer.blocks.ModBlocks;
import krazyminer001.bettersniffer.items.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PlantBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PigsfacePlant extends PlantBlock {
    public PigsfacePlant() {
        super(FabricBlockSettings.copyOf(Blocks.POPPY));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getStackInHand(hand).getItem() == Items.SHEARS) {
            world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), ModItems.PIGSFACE_PETAL.getDefaultStack()));
            world.setBlockState(pos, ModBlocks.SHEARED_PIGSFACE.getDefaultState());
            if (!player.isCreative())
                player.getStackInHand(hand).damage(1, player, (e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
            return ActionResult.CONSUME_PARTIAL;
        }
        return ActionResult.FAIL;
    }
}

package net.kobura.koburasempires.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SmithingAnvil extends Block {

    public SmithingAnvil(Settings settings) {
        super(settings);
    }


    // Play sound on right click
    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {

        if (world.isDay()){
            world.playSound(player, pos, SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.BLOCKS, 10.0F, 1.0F);
        }
        else {
            world.playSound(player, pos, SoundEvents.ENTITY_CAT_PURR, SoundCategory.NEUTRAL, 10.0F, 1.0F);
        }


        return ActionResult.SUCCESS;
    }
}

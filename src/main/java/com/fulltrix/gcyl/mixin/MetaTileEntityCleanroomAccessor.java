package com.fulltrix.gcyl.mixin;

import gregtech.common.metatileentities.multi.electric.MetaTileEntityCleanroom;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(MetaTileEntityCleanroom.class)
public interface MetaTileEntityCleanroomAccessor {

    @Accessor("cleanAmount")
    int getCleanAmount();
}

package com.example.quimera.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public class ChimeraEntity extends Mob {
    protected ChimeraEntity(EntityType<? extends Mob> entityType, Level level) {
        super(entityType, level);
    }
}
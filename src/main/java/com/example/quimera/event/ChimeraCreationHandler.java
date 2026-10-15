package com.example.quimera.event;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "quimera")
public class ChimeraCreationHandler {
    @SubscribeEvent
    public static void onItemToss(ItemTossEvent event) {
        Level level = event.getEntity().level;
        if (!level.isClientSide) {
            ItemEntity itemEntity = event.getEntity();
            // Logic to check for ritual table and create chimera
        }
    }
}
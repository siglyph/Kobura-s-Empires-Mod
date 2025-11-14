package net.kobura.koburasempires.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.kobura.koburasempires.KoburasEmpiresMod;
import net.kobura.koburasempires.entity.custom.BanditEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<BanditEntity> BANDIT = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(KoburasEmpiresMod.MOD_ID, "bandit"),
            EntityType.Builder.create(BanditEntity::new, SpawnGroup.CREATURE).dimensions(1f, 2.5f).build());

    public static void registerModEntities() {
        KoburasEmpiresMod.LOGGER.info("Registering Mod Entities for " + KoburasEmpiresMod.MOD_ID);
        FabricDefaultAttributeRegistry.register(BANDIT, BanditEntity.createBanditAttributes());
    }
}

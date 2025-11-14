package net.kobura.koburasempires.entity.client;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.kobura.koburasempires.KoburasEmpiresMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModEntityModelLayers {
    public static final EntityModelLayer BANDIT =
            new EntityModelLayer(Identifier.of(KoburasEmpiresMod.MOD_ID, "bandit"), "main");

    public static void registerModelLayers(){
        EntityModelLayerRegistry.registerModelLayer(BANDIT, BanditModel::getTexturedModelData);
    }

}

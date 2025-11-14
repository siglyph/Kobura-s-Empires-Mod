package net.kobura.koburasempires;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.kobura.koburasempires.entity.ModEntities;
import net.kobura.koburasempires.entity.client.BanditModel;
import net.kobura.koburasempires.entity.client.BanditRenderer;
import net.kobura.koburasempires.entity.client.ModEntityModelLayers;
import net.kobura.koburasempires.entity.custom.BanditEntity;

public class KoburasEmpiresModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityModelLayerRegistry.registerModelLayer(ModEntityModelLayers.BANDIT, BanditModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.BANDIT, BanditRenderer::new);

    }
}

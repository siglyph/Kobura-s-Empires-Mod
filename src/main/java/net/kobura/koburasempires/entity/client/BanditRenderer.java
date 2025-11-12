package net.kobura.koburasempires.entity.client;

import net.kobura.koburasempires.KoburasEmpiresMod;
import net.kobura.koburasempires.entity.custom.BanditEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BanditRenderer extends MobEntityRenderer<BanditEntity, BanditModel> {
    public BanditRenderer(EntityRendererFactory.Context context) {
        super(context, new BanditModel(context.getPart(ModEntityModelLayers.BANDIT)), 0.5f);
    }

    @Override
    public Identifier getTexture(BanditEntity entity) {
        return Identifier.of(KoburasEmpiresMod.MOD_ID, "textures/entity/bandit/bandit.png");
    }


}

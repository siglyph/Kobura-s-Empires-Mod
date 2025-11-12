package net.kobura.koburasempires.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kobura.koburasempires.KoburasEmpiresMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup STEEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KoburasEmpiresMod.MOD_ID, "steel_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.steel"))
                    .icon(() -> new ItemStack(ModItems.STEEL_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.STEEL_INGOT);
                    }).build());

    public static void registerItemGroups() {
        KoburasEmpiresMod.LOGGER.info("Registering Item Groups for " + KoburasEmpiresMod.MOD_ID);
    }

}

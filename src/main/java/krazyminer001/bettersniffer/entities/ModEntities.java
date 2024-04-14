package krazyminer001.bettersniffer.entities;

import krazyminer001.bettersniffer.BetterSniffer;
import krazyminer001.bettersniffer.entities.custom.BetterSnifferEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<BetterSnifferEntity> BETTER_SNIFFER = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(BetterSniffer.MODID, "better_sniffer"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BetterSnifferEntity::new)
                    .dimensions(EntityDimensions.fixed(2, 2)).build());

    public static void registerModEntities() {
        BetterSniffer.LOGGER.info("Registering Entities For " + BetterSniffer.MODID);
    }
}

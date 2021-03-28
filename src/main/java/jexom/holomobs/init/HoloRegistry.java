package jexom.holomobs.init;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import jexom.holomobs.HoloAnimals;
import jexom.holomobs.client.renderer.*;
import jexom.holomobs.entity.*;
import net.minecraft.entity.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@EventBusSubscriber(modid = HoloAnimals.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class HoloRegistry {
    private static final Map<EntityType<? extends MobEntity>, EntitySpawnPlacementRegistry.IPlacementPredicate> SPAWN_PREDICATES = new HashMap<>();
    public static final Map<EntityType<?>, IRenderFactory> RENDER_FACTORY_MAP = new HashMap<>();
    public static final Map<EntityType<? extends LivingEntity>, IHoloAttributes> ATTRIBUTE_MODIFIER_MAP = new HashMap<>();
    private static final List<Item> SPAWN_EGGS = Lists.newArrayList();

    public static final EntityType<PekoraEntity> PEKORA = createEntity(
            "pekora_rabbit",
            PekoraEntity::new,
            PekoraEntity::canSpawnNaturally,
            PekoraRenderer::new,
            PekoraEntity::createAttributes,
            0.4F,
            0.95F,
            0xEEEEEE,
            0x32DFFF
    );
    public static final EntityType<WatameEntity> WATAME = createEntity(
            "watame_sheep",
            WatameEntity::new,
            WatameEntity::canSpawnNaturally,
            WatameRenderer::new,
            WatameEntity::createAttributes,
            0.9F,
            1.7F,
            0xEEEEEE,
            0xffef9e
    );
    public static final EntityType<OkayuEntity> OKAYU = createEntity(
            "okayu_cat",
            OkayuEntity::new,
            OkayuEntity::canSpawnNaturally,
            OkayuRenderer::new,
            OkayuEntity::createAttributes,
            0.6F,
            0.7F,
            0x999999,
            0xeed2f3
    );
    public static final EntityType<SubaruEntity> SUBARU = createEntity(
            "subaru_duck",
            SubaruEntity::new,
            SubaruEntity::canSpawnNaturally,
            SubaruRenderer::new,
            SubaruEntity::createAttributes,
            0.6F,
            0.7F,
            0xFFFFFF,
            0xffec2b
    );
    public static final EntityType<KoroneEntity> KORONE = createEntity(
            "korone_dog",
            KoroneEntity::new,
            KoroneEntity::canSpawnNaturally,
            KoroneRenderer::new,
            KoroneEntity::createAttributes,
            0.6F,
            0.7F,
            0xFFFFFF,
            0xffec2b
    );

    private static <T extends MobEntity> EntityType<T> createEntity(
            String name,
            EntityType.IFactory<T> factory,
            EntitySpawnPlacementRegistry.IPlacementPredicate canSpawn,
            IRenderFactory renderFactory,
            IHoloAttributes attributes,
            float width,
            float height,
            int eggPrimary,
            int eggSecondary
    ) {
        ResourceLocation location = new ResourceLocation(HoloAnimals.MOD_ID, name);
        EntityType<T> entity = EntityType.Builder.of(factory, EntityClassification.CREATURE).sized(width, height).setTrackingRange(64).setUpdateInterval(1).build(location.toString());
        entity.setRegistryName(location);
        SPAWN_PREDICATES.put(entity, canSpawn);
        RENDER_FACTORY_MAP.put(entity, renderFactory);
        ATTRIBUTE_MODIFIER_MAP.put(entity, attributes);

        Item spawnEgg = new SpawnEggItem(entity, eggPrimary, eggSecondary, (new Item.Properties()).tab(ItemGroup.TAB_MISC));
        spawnEgg.setRegistryName(new ResourceLocation(HoloAnimals.MOD_ID, name + "_spawn_egg"));
        SPAWN_EGGS.add(spawnEgg);
        return entity;
    }

    @SubscribeEvent
    public static void registerHolos(RegistryEvent.Register<EntityType<?>> event) {
        SPAWN_PREDICATES.forEach((entityType, canSpawn) -> {
            Preconditions.checkNotNull(entityType.getRegistryName(), "registryName");
            event.getRegistry().register(entityType);
            EntitySpawnPlacementRegistry.register(entityType, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, canSpawn);
        });
    }

    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        ATTRIBUTE_MODIFIER_MAP.forEach((entity, attributes) -> event.put(entity, attributes.createAttributes().build()));
    }

    @SubscribeEvent
    public static void registerSpawnEggs(RegistryEvent.Register<Item> event) {
        SPAWN_EGGS.forEach(spawnEgg -> {
            Preconditions.checkNotNull(spawnEgg.getRegistryName(), "registryName");
            event.getRegistry().register(spawnEgg);
        });
    }
}

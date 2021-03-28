package jexom.holomobs.init;

import jexom.holomobs.HoloAnimals;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

@EventBusSubscriber(modid = HoloAnimals.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
@ObjectHolder(HoloAnimals.MOD_ID)
public class HoloSounds {
    private static List<SoundEvent> sounds = new ArrayList<>();
    public static final SoundEvent PEKO_AMBIENT1 = createSound("peko.ambient1");
    public static final SoundEvent PEKO_AMBIENT2 = createSound("peko.ambient2");
    public static final SoundEvent PEKO_HURT = createSound("peko.hurt");
    public static final SoundEvent PEKO_DEATH = createSound("peko.death");

    private static SoundEvent createSound(String name) {
        ResourceLocation resourceLocation = new ResourceLocation(HoloAnimals.MOD_ID, name);
        SoundEvent sound = new SoundEvent(resourceLocation);
        sound.setRegistryName(resourceLocation);
        sounds.add(sound);
        return sound;
    }

    @SubscribeEvent
    public static void registerSound(RegistryEvent.Register<SoundEvent> event) {
        for (SoundEvent sound : sounds) {
            event.getRegistry().register(sound);
        }
    }

}
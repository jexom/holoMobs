package jexom.holomobs.entity;

import net.minecraft.entity.ai.attributes.AttributeModifierMap;

@FunctionalInterface
public interface IHoloAttributes {
    AttributeModifierMap.MutableAttribute createAttributes();
}

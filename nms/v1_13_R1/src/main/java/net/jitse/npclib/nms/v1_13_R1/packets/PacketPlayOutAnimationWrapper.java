package net.jitse.npclib.nms.v1_13_R1.packets;

import net.jitse.npclib.api.state.NPCAnimation;
import net.jitse.npclib.tinyprotocol.Reflection;
import net.minecraft.server.v1_13_R1.PacketPlayOutAnimation;

public class PacketPlayOutAnimationWrapper {

    public PacketPlayOutAnimation create(NPCAnimation npcAnimation, int entityId) {
        PacketPlayOutAnimation packetPlayOutAnimation = new PacketPlayOutAnimation();

        Reflection.getField(packetPlayOutAnimation.getClass(), "a", int.class)
                .set(packetPlayOutAnimation, entityId);
        Reflection.getField(packetPlayOutAnimation.getClass(), "b", int.class)
                .set(packetPlayOutAnimation, npcAnimation.getId());

        return packetPlayOutAnimation;
    }

}
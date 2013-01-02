package com.codisimus.plugins.classsets;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 *
 * @author Cody
 */
public class ChangeArmorSetEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private Player player;
    private String set;

    public ChangeArmorSetEvent(Player player, String set) {
        this.player = player;
        this.set = set;
        if (set == null) {
            player.sendMessage("§4You are no longer wearing a full set of armor");
        } else {
            player.sendMessage("§5You are now wearing a full §6" + set + "§5 set!");
        }
    }

    public Player getPlayer() {
        return player;
    }

    public String getSet() {
        return set;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}

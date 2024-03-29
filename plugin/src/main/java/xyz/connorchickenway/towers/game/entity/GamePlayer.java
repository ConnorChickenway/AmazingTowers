package xyz.connorchickenway.towers.game.entity;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import xyz.connorchickenway.towers.game.Game;
import xyz.connorchickenway.towers.game.entity.inventory.InventorySession;
import xyz.connorchickenway.towers.utilities.GameMode;

import java.util.UUID;

public class GamePlayer {

    private final Player player;
    private InventorySession inventorySession;
    private Game game;
    private int kills;

    private GamePlayer(Player player) {
        this.player = player;
        if (GameMode.isMultiArena())
            this.inventorySession = new InventorySession(this);
        this.kills = 0;
    }

    public Location getLocation() {
        return player.getLocation();
    }

    public void sendMessage(String text) {
        player.sendMessage(text);
    }

    public void sendMessage(String... text) {
        player.sendMessage(text);
    }

    public UUID getUniqueId() {
        return player.getUniqueId();
    }

    public Player toBukkitPlayer() {
        return player;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public boolean isInGame() {
        return this.game != null;
    }

    public Game getGame() {
        return game;
    }

    public boolean isInGame(Game game) {
        return game == this.game;
    }

    public int getKills() {
        return kills;
    }

    public void addKill() {
        this.kills += 1;
    }

    public InventorySession getInventorySession() {
        return inventorySession;
    }

    public static GamePlayer create(Player player) {
        return new GamePlayer(player);
    }

}

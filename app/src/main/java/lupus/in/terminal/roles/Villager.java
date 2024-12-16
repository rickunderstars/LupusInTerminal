package lupus.in.terminal.roles;

import lupus.in.terminal.Player;

import java.util.List;

public enum Villager implements Role {
    INSTANCE;

    @Override
    public void add(Player player) {

    }

    @Override
    public void remove(Player player) {

    }

    @Override
    public List<Player> getPlayers() {
        return List.of();
    }

    @Override
    public List<Player> getAlive() {
        return List.of();
    }

    @Override
    public List<Player> getDead() {
        return List.of();
    }
}

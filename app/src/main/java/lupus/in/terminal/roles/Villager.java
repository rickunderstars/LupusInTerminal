package lupus.in.terminal.roles;

import lupus.in.terminal.Player;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public enum Villager implements Role {

    INSTANCE;

    private final Set<Player> villagers = new HashSet<>();

    @Override
    public void add(Player player) {
        villagers.add(player);
        player.setRole(this);
    }

    @Override
    public void remove(Player player) {
        villagers.remove(player);
        player.setRole(Role.NULL);
    }

    @Override
    public Set<Player> getPlayers() {
        return Set.copyOf(villagers);
    }

    @Override
    public Set<Player> getAlive() {
        return Set.of();
    }

    @Override
    public Set<Player> getDead() {
        return Set.of();
    }
}

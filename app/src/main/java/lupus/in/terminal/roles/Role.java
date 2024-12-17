package lupus.in.terminal.roles;

import lupus.in.terminal.Player;

import java.util.HashSet;
import java.util.Set;

public abstract class Role {

    private final Set<Player> players = new HashSet<>();

    public void add(Player player) {
        players.add(player);
        player.setRole(this);
    }

    public void remove(Player player) {
        players.remove(player);
        player.setRole(Role.NULL);
    }

    public Set<Player> getPlayers() {
        return Set.copyOf(players);
    }

    public Set<Player> getAlive() {
        Set<Player> alive = new HashSet<>();
        for (Player p : players) {
            if (p.isAlive()) {
                alive.add(p);
            }
        }
        return Set.copyOf(alive);
    }

    public Set<Player> getDead() {
        Set<Player> dead = new HashSet<>();
        for (Player p : players) {
            if (!p.isAlive()) {
                dead.add(p);
            }
        }
        return Set.copyOf(dead);
    }

    public static Role NULL = new Role() {

        @Override
        public void add(Player player) {}

        @Override
        public void remove(Player player) {}

        @Override
        public Set<Player> getPlayers() {
            return Set.of();
        }

        @Override
        public Set<Player> getAlive() {
            return Set.of();
        }

        @Override
        public Set<Player> getDead() {
            return Set.of();
        }
    };
}

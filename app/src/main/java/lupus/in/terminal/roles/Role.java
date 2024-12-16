package lupus.in.terminal.roles;

import lupus.in.terminal.Player;

import java.util.Set;

public interface Role {

    void add(Player player);

    void remove(Player player);

    Set<Player> getPlayers();

    Set<Player> getAlive();

    Set<Player> getDead();

    public static Role NULL = new Role() {

        @Override
        public void add(Player player) {

        }

        @Override
        public void remove(Player player) {

        }

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

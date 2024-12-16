package lupus.in.terminal.roles;

import lupus.in.terminal.Player;


import java.util.Set;

public interface Role {

    void add(Player player);

    void remove(Player player);

    Set<Player> getPlayers();

    Set<Player> getAlive();

    Set<Player> getDead();
}

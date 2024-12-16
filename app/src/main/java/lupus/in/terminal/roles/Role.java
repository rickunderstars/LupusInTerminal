package lupus.in.terminal.roles;

import lupus.in.terminal.Player;

import java.util.List;

public interface Role {

    void add(Player player);

    void remove(Player player);

    List<Player> getPlayers();

    List<Player> getAlive();

    List<Player> getDead();
}

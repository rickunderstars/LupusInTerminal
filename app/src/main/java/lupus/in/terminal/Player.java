package lupus.in.terminal;

import lupus.in.terminal.roles.Role;

public class Player {

    private final String name;
    private boolean alive = true;

    public Player(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void die() {
        this.alive = false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return name.equals(player.name);
    }

    public Role getRole() {
        return null;
    }
}

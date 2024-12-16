package lupus.in.terminal;

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
}

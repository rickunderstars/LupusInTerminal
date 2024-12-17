package lupus.in.terminal;

import lupus.in.terminal.roles.Role;
import lupus.in.terminal.roles.Villager;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class MixedTests {

    @Test
    public void testPlayerDeath() {
        Player gianni = new Player("Gianni");

        assertThat(gianni.isAlive()).isTrue();
        gianni.die();
        assertThat(gianni.isAlive()).isFalse();
    }

    @Test
    public void testRoleAssignment() {
        Role villagers = new Villager();
        Player p1 = new Player("gianni");
        Player p2 = new Player("giovanni");
        Player p3 = new Player("jeremy");

        villagers.add(p1);
        villagers.add(p2);
        villagers.add(p3);

        assertThat(villagers.getPlayers()).containsExactlyInAnyOrderElementsOf(Set.of(p1,p2,p3));

        villagers.remove(p2);

        assertThat(villagers.getPlayers()).containsExactlyInAnyOrderElementsOf(Set.of(p1,p3));
    }

    @Test
    public void testPlayerGetRole() {
        Role villagers = new Villager();
        Player p1 = new Player("gianni");

        assertThat(p1.getRole()).isEqualTo(Role.NULL);

        villagers.add(p1);

        assertThat(p1.getRole()).isEqualTo(villagers);
    }

    @Test
    public void testRoleGetAliveAndDead() {
        Role villagers = new Villager();
        Player p1 = new Player("gianni");
        Player p2 = new Player("giovanni");
        Player p3 = new Player("jeremy");

        villagers.add(p1);
        villagers.add(p2);
        villagers.add(p3);

        p2.die();

        assertThat(villagers.getAlive()).containsExactlyInAnyOrderElementsOf(Set.of(p1,p3));
        assertThat(villagers.getDead()).containsExactlyInAnyOrderElementsOf(Set.of(p2));
    }

}

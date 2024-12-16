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
        Player p1 = new Player("gianni");
        Player p2 = new Player("giovanni");
        Player p3 = new Player("jeremy");

        Villager.INSTANCE.add(p1);
        Villager.INSTANCE.add(p2);
        Villager.INSTANCE.add(p3);

        assertThat(Villager.INSTANCE.getPlayers()).containsExactlyInAnyOrderElementsOf(Set.of(p1,p2,p3));

        Villager.INSTANCE.remove(p2);

        assertThat(Villager.INSTANCE.getPlayers()).containsExactlyInAnyOrderElementsOf(Set.of(p1,p3));
    }

    @Test
    public void testPlayerGetRole() {
        Player p1 = new Player("gianni");

        assertThat(p1.getRole()).isEqualTo(Role.NULL);

        Villager.INSTANCE.add(p1);

        assertThat(p1.getRole()).isEqualTo(Villager.INSTANCE);
    }

}

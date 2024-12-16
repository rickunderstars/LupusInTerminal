package lupus.in.terminal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MixedTests {

    @Test
    public void testPlayerDeath() {
        Player gianni = new Player("Gianni");

        assertThat(gianni.isAlive()).isTrue();
        gianni.die();
        assertThat(gianni.isAlive()).isFalse();
    }
}

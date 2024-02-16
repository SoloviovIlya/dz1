import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
public class PlayTest {
    static List<Door> doors;
    @BeforeEach
    void initDoors () {
        doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
    }
    @Test
    void WinNoRisk () {
        Gamer gamer = new Gamer("Игрок", false);
        Game game = new Game(gamer, doors);
        Door door = game.round(0);
        Assertions.assertTrue(door.Winner());
    }
    @Test
    void LoseNoRisk() {
        Gamer gamer = new Gamer("Игрок", false);
        Game game = new Game(gamer, doors);
        Door door = game.round(1);
        Assertions.assertFalse(door.Winner());
    }
    @Test
    void WinRisk () {
        Gamer gamer = new Gamer("Игрок", true);
        Game game = new Game(gamer, doors);
        Door door = game.round(1);
        Assertions.assertTrue(door.Winner());
    }
    @Test
    void LoseRisk () {
        Gamer gamer = new Gamer("Игрок", true);
        Game game = new Game(gamer, doors);
        Door door = game.round(0);
        Assertions.assertFalse(door.Winner());
    }
}

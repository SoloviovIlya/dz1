import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StartGame {
    public static void main(String[] args) {
        Gamer gamer = new Gamer("Игрок", true);
        int w = 0;
        int k;

        for (k = 0; k<1000; k++) {
            Game game = new Game(gamer, getDoors());
            if (game.round(0).Winner()) w++;
        }
        System.out.println("Среди " + k + " попыток, выигрышные - " + w);
    }
    private static List<Door> getDoors() {
        List<Door> doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
        Collections.shuffle(doors);
        return doors;
    }
}

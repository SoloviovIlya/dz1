import java.util.ArrayList;
import java.util.List;
public class Game {
    private Gamer gamer;
    private List<Door> doors = new ArrayList<>();
    public Game(Gamer gamer, List<Door> doors) {
        this.gamer = gamer;
        this.doors = doors;
    }
    public Door round (int door) {
        if (!gamer.getRisk()) return doors.get(door);
        else {
            doors.remove(doors.get(door));
            return doors.get(0).Winner() ? doors.get(0) : doors.get(1);
        }
    }


}

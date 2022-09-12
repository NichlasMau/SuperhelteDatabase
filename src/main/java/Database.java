import java.util.ArrayList;

public class Database {
    ArrayList<Superhelt> superheros = new ArrayList<>();

    public void create(Superhelt superhelt) {
       superheros.add(superhelt);
    }
}

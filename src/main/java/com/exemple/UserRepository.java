import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<Integer, String> db = new HashMap<>();
    private int nextId = 1;

    public String save(String name) {
        db.put(nextId++, name);
        return name;
    }

    public String findById(int id) {
        return db.get(id);
    }
}
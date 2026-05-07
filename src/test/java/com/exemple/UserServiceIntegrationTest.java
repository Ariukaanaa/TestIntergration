import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

public class UserServiceIntegrationTest {

    private UserService userService;
    private UserRepository userRepository;

    @Before
    public void setUp() {
        // бодит Repository холбож байна — mock биш
        userRepository = new UserRepository();
        userService = new UserService(userRepository);
    }

    @Test
    public void testCreateAndGetUser() {
        userService.createUser("Бат");

        String found = userService.getUserById(1);
        assertEquals("Дорж", found); // "Бат" байхад "Дорж" гэж буруу бичлээ
    }

    @Test
    public void testGetUser_notFound_returnsNull() {
        String found = userService.getUserById(999);
        assertNull(found);
    }
}
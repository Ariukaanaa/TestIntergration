import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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
        // Arrange + Act
        userService.createUser("Бат");

        // Assert
        String found = userService.getUserById(1);
        assertEquals("Бат", found);
    }

    @Test
    public void testGetUser_notFound_returnsNull() {
        String found = userService.getUserById(999);
        assertNull(found);
    }
}
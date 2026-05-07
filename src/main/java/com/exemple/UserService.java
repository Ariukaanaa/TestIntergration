public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserById(int id) {
        return userRepository.findById(id);
    }

    public String createUser(String name) {
        return userRepository.save(name);
    }
}
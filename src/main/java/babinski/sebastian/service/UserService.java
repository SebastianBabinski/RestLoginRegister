package babinski.sebastian.service;

import babinski.sebastian.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    UserDto createUser(UserDto user);
    UserDto getUser(String email);
    UserDto getUserByUserId(String id);
    UserDto updateUser(String id, UserDto user);
    void deleteUser(String id);
    List<UserDto> getUsers(int page, int limit);

}

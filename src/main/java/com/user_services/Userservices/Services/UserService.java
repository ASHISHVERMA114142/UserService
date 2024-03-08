package com.user_services.Userservices.Services;
import com.user_services.Userservices.Entity.User;
import java.util.List;
public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();
    User getUser(String userId);
}

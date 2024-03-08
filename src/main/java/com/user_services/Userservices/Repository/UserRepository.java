package com.user_services.Userservices.Repository;

import com.user_services.Userservices.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}

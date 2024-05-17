// Create a new file: src/main/java/com/example/eventmanagement/repository/UserRepository.java
package main.java.com.example.eventmanagement.repository;

import main.java.com.example.eventmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
  
}

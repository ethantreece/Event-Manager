package main.java.com.example.eventmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.example.eventmanagement.model.User;
import main.java.com.example.eventmanagement.repository.UserRepository;

@SpringBootApplication
public class EventManagementApplication {
  public static void main(String[] args) {
    SpringApplication.run(EventManagementApplication.class, args);
  }
}

@RestController
class TestController {
  private final UserRepository userRepository;

  public TestController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  
  @GetMapping("/test")
  public String testEndpoint() {
    User user = new User();
    user.setName("Test User");
    user.setId(1);
    userRepository.save(user);
    return "Backend is working!";
  }
}

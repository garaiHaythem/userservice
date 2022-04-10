package io.getarrays.userservice;

import io.getarrays.userservice.domain.Role;
import io.getarrays.userservice.domain.User;
import io.getarrays.userservice.service.UserService;
import java.util.ArrayList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@EnableSwagger2
@SpringBootApplication
public class UserserviceApplication {

  public static void main(String[] args) {
    SpringApplication.run(UserserviceApplication.class, args);
  }


  @Bean
  PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  CommandLineRunner run(UserService userService) {
    return args -> {

//      userService.saveRole(new Role(null, "ROLE_USER"));
//      userService.saveRole(new Role(null, "ROLE_MANAGER"));
//      userService.saveRole(new Role(null, "ROLE_ADMIN"));
//      userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//
//      userService.saveUser(new User(null, "garai haythem", "hgarai", "1234", new ArrayList<>()));
//
/*        userService.addRoleToUser("hgarai", "ROLE_USER");*/
    };
  }
}

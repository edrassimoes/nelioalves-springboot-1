package br.com.edras.spring_boot_course.resource;

import br.com.edras.spring_boot_course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> getAllUsers() {
        User user = new User(1L, "Maria", "maria@gmail.com", "12345678", "maria123");
        return ResponseEntity.ok().body(user);
    }


}

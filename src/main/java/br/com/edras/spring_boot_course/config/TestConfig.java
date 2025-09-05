package br.com.edras.spring_boot_course.config;

import br.com.edras.spring_boot_course.entities.User;
import br.com.edras.spring_boot_course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("teste")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria", "maria@gmail.com", "12345678", "maria123");
        User u2 = new User(null, "Alex", "alex@gmail.com", "91011121", "alex456");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }

}

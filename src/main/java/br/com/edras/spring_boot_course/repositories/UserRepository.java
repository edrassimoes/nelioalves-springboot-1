package br.com.edras.spring_boot_course.repositories;

import br.com.edras.spring_boot_course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}

package com.educandoweb.course.adapters.ports.output;

import com.educandoweb.course.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

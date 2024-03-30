package org.sid.ebankingbackend.repository;

////import com.bezkoder.springjwt.models.User;

import org.sid.ebankingbackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String emailAddress);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}

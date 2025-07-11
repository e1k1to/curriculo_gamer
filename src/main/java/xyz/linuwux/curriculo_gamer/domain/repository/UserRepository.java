package xyz.linuwux.curriculo_gamer.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.linuwux.curriculo_gamer.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

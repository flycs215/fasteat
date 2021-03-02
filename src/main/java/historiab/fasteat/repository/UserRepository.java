package historiab.fasteat.repository;

import historiab.fasteat.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicReference;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByPhoneNumber(String phoneNumber);


}

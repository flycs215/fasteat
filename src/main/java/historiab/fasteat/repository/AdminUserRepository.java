package historiab.fasteat.repository;

import historiab.fasteat.model.entity.AdmimUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserRepository extends JpaRepository<AdmimUser, Long> {
}

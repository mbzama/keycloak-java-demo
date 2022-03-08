package zama.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zama.learning.entity.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {

}

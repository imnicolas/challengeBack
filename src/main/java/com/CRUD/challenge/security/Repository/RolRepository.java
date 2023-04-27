
package com.CRUD.challenge.security.Repository;


import java.util.Optional;

import com.CRUD.challenge.security.Entity.Rol;
import com.CRUD.challenge.security.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}

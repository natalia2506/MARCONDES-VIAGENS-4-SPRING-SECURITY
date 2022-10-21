package com.marcondes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.marcondes.model.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
	
	Usuario findByEmail(String email);
	
	@Query("SELECT u FROM Usuario u JOIN FETCH u.acessos WHERE u.email = :email")
	Usuario findByUsernameFetchRoles(@Param("email") String email);

}

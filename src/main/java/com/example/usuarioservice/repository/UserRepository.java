package com.example.usuarioservice.repository;
import com.example.usuarioservice.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
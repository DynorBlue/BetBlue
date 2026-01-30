package org.db.jc.betblue.demo.repositorio;

import org.db.jc.betblue.demo.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
    //buscar usuario por nombre
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    //buscar usuario por email
    Optional<Usuario> findByEmail(String email);
    //saber si un nombre de usuario ya existe
    boolean existsByNombreUsuario(String nombreUsuario);
    //saber si un email ya esta registrado
    boolean existsByEmail(String email);
    //buscar por nombre de usuario o email
    Optional<Usuario> findByNombreUsuarioOrEmail(String nombreUsuario, String email);

}

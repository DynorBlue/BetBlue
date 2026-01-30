package org.db.jc.betblue.demo.repositorio;

import org.db.jc.betblue.demo.modelo.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ApuestaRepositorio extends JpaRepository<Apuesta, Integer> {
    //buscar apuestas por registro
    List<Apuesta> findByRegistroDiarioUsuarioOrderByIdApuestaDesc(Usuario usuario);
    //buscar apuesta por nombreApuesta y usuario
    Optional<Apuesta> findByRegistroDiarioUsuarioAndNombreApuesta(Usuario usuario, String nombreApuesta);
    //mostrar apuestas por usuario y ordenar dineroApuesta desc
    List<Apuesta> findByRegistroDiarioUsuarioOrderByDineroApuestaDesc(Usuario usuario);
    //mostrar apuestas por estado y usuario
    List<Apuesta> findByRegistroDiarioUsuarioAndEstado(Usuario usuario, Estado estado);
    //mostrar apuestas por tipo y usuario
    List<Apuesta> findByRegistroDiarioUsuarioAndTipo(Usuario usuario, Tipo tipo);

}

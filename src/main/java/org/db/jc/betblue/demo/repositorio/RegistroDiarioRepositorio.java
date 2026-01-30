package org.db.jc.betblue.demo.repositorio;

import org.db.jc.betblue.demo.modelo.RegistroDiario;
import org.db.jc.betblue.demo.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface RegistroDiarioRepositorio extends JpaRepository<RegistroDiario, Integer> {
    //buscar registros por Usuario
    List<RegistroDiario> findByUsuarioOrderByFechaDesc(Usuario usuario);
    //buscar registros por usuario y fecha
    List<RegistroDiario> findByUsuarioAndFecha(Usuario usuario, Date fecha);
}

package org.db.jc.betblue.demo.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario",
uniqueConstraints = {
@UniqueConstraint(name = "uk_usuario_nombre", columnNames = "nombre_usuario"),
@UniqueConstraint(name = "uk_usuario_email", columnNames = "email")
        })
public class Usuario {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idUsuario", nullable = false)
    private int idUsuario;
    @Column(name = "nombreUsuario", nullable = false)
    private String nombreUsuario;
    @Column(name = "tipoUsuario", nullable = false)
    private TipoUsuario tipoUsuario;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "contrasena", nullable = false)
    private String contrasena;

    public Usuario(String contrasena, String email, int idUsuario, String nombreUsuario, TipoUsuario tipoUsuario) {
        this.contrasena = contrasena;
        this.email = email;
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario() {
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}

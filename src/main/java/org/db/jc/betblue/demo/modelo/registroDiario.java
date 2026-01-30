package org.db.jc.betblue.demo.modelo;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "registroDiario")
public class registroDiario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRegistro")
    private int idRegistro;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario idUsuario;

    @Column(name = "fecha")
    private Date fecha;

    public registroDiario() {
    }

    public registroDiario(Date fecha, int idRegistro, Usuario idUsuario) {
        this.fecha = fecha;
        this.idRegistro = idRegistro;
        this.idUsuario = idUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }
}

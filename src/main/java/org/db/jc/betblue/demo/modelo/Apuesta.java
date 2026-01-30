package org.db.jc.betblue.demo.modelo;

import jakarta.persistence.*;
import org.w3c.dom.Text;

@Entity
@Table(name = "apuesta")
public class Apuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idApuesta")
    private int idApuesta;
    @ManyToOne
    @JoinColumn(name = "idRegistro", nullable = false)
    private int idRegistro;
    @Column(name = "nombreApuesta")
    private int nombreApuesta;
    @Column(name = "descripcion")
    private Text descripcion;
    @Column(name = "dineroApuesta")
    private double dineroApuesta;
    @Column(name = "momio")
    private double momio;
    @Column(name = "estado")
    private Estado estado;
    @Column(name = "tipo")
    private Tipo tipo;

    public Apuesta() {
    }

    public Apuesta(Text descripcion, double dineroApuesta, Estado estado, int idApuesta, int idRegistro, double momio, int nombreApuesta, Tipo tipo) {
        this.descripcion = descripcion;
        this.dineroApuesta = dineroApuesta;
        this.estado = estado;
        this.idApuesta = idApuesta;
        this.idRegistro = idRegistro;
        this.momio = momio;
        this.nombreApuesta = nombreApuesta;
        this.tipo = tipo;
    }

    public Text getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Text descripcion) {
        this.descripcion = descripcion;
    }

    public double getDineroApuesta() {
        return dineroApuesta;
    }

    public void setDineroApuesta(double dineroApuesta) {
        this.dineroApuesta = dineroApuesta;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getIdApuesta() {
        return idApuesta;
    }

    public void setIdApuesta(int idApuesta) {
        this.idApuesta = idApuesta;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public double getMomio() {
        return momio;
    }

    public void setMomio(double momio) {
        this.momio = momio;
    }

    public int getNombreApuesta() {
        return nombreApuesta;
    }

    public void setNombreApuesta(int nombreApuesta) {
        this.nombreApuesta = nombreApuesta;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}

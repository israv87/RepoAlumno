package com.alumno.api.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="alumno")

public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="Universidad")
    private String Universidad;

    @Column(name="Curso")
    private String Curso;

    @Column(name="Alumno")
    private String Alumno;

    @Column(name="Periodo")
    private String Periodo;
    
    @Column(name="Lenguaje")
    private String Lenguaje;
    
    @Column(name="Aspiracion")
    private String Aspiracion;

    public User() {
    }

    public User(int id, String Universidad, String Curso, String Alumno, String Periodo, String Lenguaje, String Aspiracion) {
        this.id = id;
        this.Universidad = Universidad;
        this.Curso = Curso;
        this.Alumno = Alumno;
        this.Periodo = Periodo;
        this.Lenguaje = Lenguaje;
        this.Aspiracion = Aspiracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getAlumno() {
        return Alumno;
    }

    public void setAlumno(String Alumno) {
        this.Alumno = Alumno;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }

    public String getLenguaje() {
        return Lenguaje;
    }

    public void setLenguaje(String Lenguaje) {
        this.Lenguaje = Lenguaje;
    }

    public String getAspiracion() {
        return Aspiracion;
    }

    public void setAspiracion(String Aspiracion) {
        this.Aspiracion = Aspiracion;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", Universidad=" + Universidad + ", Curso=" + Curso + ", Alumno=" + Alumno + ", Periodo=" + Periodo + ", Lenguaje=" + Lenguaje + ", Aspiracion=" + Aspiracion + '}';
    }
    
    


    
  

}

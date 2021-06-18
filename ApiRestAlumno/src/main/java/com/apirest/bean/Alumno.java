/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.bean;

/**
 *
 * @author Isra
 */
public class Alumno {
    private String universidad;
    private String curso;
    private String alumno;
    private String periodo;
    private String lenguaje;
    private String aspiracion;

    public Alumno() {
    }

   
    public Alumno(String universidad, String curso, String alumno, String periodo, String lenguaje, String aspiracion) {
        this.universidad = universidad;
        this.curso = curso;
        this.alumno = alumno;
        this.periodo = periodo;
        this.lenguaje = lenguaje;
        this.aspiracion = aspiracion;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getAspiracion() {
        return aspiracion;
    }

    public void setAspiracion(String aspiracion) {
        this.aspiracion = aspiracion;
    }

    @Override
    public String toString() {
        return "Alumno{" + "universidad=" + universidad + ", curso=" + curso + ", alumno=" + alumno + ", periodo=" + periodo + ", lenguaje=" + lenguaje + ", aspiracion=" + aspiracion + '}';
    }

    


}


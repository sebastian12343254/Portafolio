package com.perfil.dominio;

public class Perfil {

    private String nombre;
    private String carrera;
    private String lenguajesProgra;
    private String foto; 
    private String baseDatos;
    private String proyectosRealizados;
    private String promedio;

    public Perfil(String tipos_de_investigación, String esta_investigación_explicas_dos_de_las_di, String referencias, String investigacionjpg) {
    }

    public Perfil(String nombre, String carrera, String lenguajesProgra, String foto, String baseDatos, String proyectosRealizados, String promedio) {
        
        this.nombre = nombre;
        this.carrera = carrera;
        this.lenguajesProgra = lenguajesProgra;
        this.foto = foto;
        this.baseDatos = baseDatos;
        this.proyectosRealizados = proyectosRealizados;
        this.promedio = promedio;
        
    }

    public String getLenguajesProgra() {
        return lenguajesProgra;
    }

    public void setLenguajesProgra(String lenguajesProgra) {
        this.lenguajesProgra = lenguajesProgra;
    }

    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }

    public void setProyectosRealizados(String proyectosRealizados) {
        this.proyectosRealizados = proyectosRealizados;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public String getProyectosRealizados() {
        return proyectosRealizados;
    }

    public String getPromedio() {
        return promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getlenguajesProgra() {
        return lenguajesProgra;
    }

    public void setlenguajesProgra(String lenguajesProgra) {
        this.lenguajesProgra = lenguajesProgra;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "perfil{" +
               "nombre='" + nombre + '\'' +
               ", carrera='" + carrera + '\'' +
               ", lenguajesProgra='" + lenguajesProgra + '\'' +
               ", foto='" + foto + '\'' +
                ", baseDatos='" + baseDatos + '\'' +
               ", proyectosRealizados='" + proyectosRealizados + '\'' +
               ", promedio='" + promedio + '\'' +
               '}';
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra.objetos;

/**
 *
 * @author lucia
 */
public class Pelicula {
    private String titulo;
    private Integer edadMIn;
    private String director;
    private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, Integer edadMIn, String director, Integer duracion) {
        this.titulo = titulo;
        this.edadMIn = edadMIn;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getEdadMIn() {
        return edadMIn;
    }

    public String getDirector() {
        return director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEdadMIn(Integer edadMIn) {
        this.edadMIn = edadMIn;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", edadMIn=" + edadMIn + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
}

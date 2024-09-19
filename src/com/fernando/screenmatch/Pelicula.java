package com.fernando.screenmatch;

public class Pelicula {

    // Se definen las variables de tipo privado

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasPuntuaciones;
    private int totalDeLasEvaluaciones;

    // Se declaran los metodos publicos de entrada de las variables de tipo privado

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    // Se declara el metodo para conseguir las variables de tipo privado

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean getIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    // Se declara el metodo de salida de las variables de tipo privado
    public void muestraFichaTecnica() {

        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("La fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("La duracion de la pelicula es: " + duracionEnMinutos);
        System.out.println("Se incluye en el plan: " + incluidoEnElPlan);

    };

    public void evalua(double puntuacion) {
        sumaDeLasPuntuaciones += puntuacion;
        totalDeLasEvaluaciones++;
    };

    public double calculaMedia() {
        return sumaDeLasPuntuaciones / totalDeLasEvaluaciones;
    };
}

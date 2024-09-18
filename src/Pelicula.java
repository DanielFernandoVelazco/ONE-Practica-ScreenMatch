public class Pelicula {

    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;

    double sumaDeLasPuntuaciones;
    int tatalDeLasEvaluaciones;

    void muestraFichaTecnica() {

        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("La fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("La duracion de la pelicula es: " + duracionEnMinutos);
        System.out.println("Se incluye en el plan: " + incluidoEnElPlan);

    };

    void evalua(double puntuacion) {
        sumaDeLasPuntuaciones += puntuacion;
        tatalDeLasEvaluaciones++;
    };

    double calculaMedia() {
        return sumaDeLasPuntuaciones / tatalDeLasEvaluaciones;
    };
}

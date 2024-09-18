public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();

        miPelicula.nombre = "Matrix";
        miPelicula.fechaDeLanzamiento = 1999;
        miPelicula.duracionEnMinutos = 120;
        miPelicula.incluidoEnElPlan = true;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8.8);
        miPelicula.evalua(4);

        System.out.println("La suma de las evaluaciones es: " + miPelicula.sumaDeLasPuntuaciones);
        System.out.println("El total de las evaluaciones es: " + miPelicula.tatalDeLasEvaluaciones);
        System.out.println("La media de las evaluaciones es: " + miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();

        otraPelicula.nombre = "Matrix 2";
        otraPelicula.fechaDeLanzamiento = 2000;
        otraPelicula.duracionEnMinutos = 120;
        otraPelicula.incluidoEnElPlan = true;

        // otraPelicula.muestraFichaTecnica();

    }
}

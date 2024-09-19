import com.fernando.screenmatch.Pelicula;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();

        miPelicula.setNombre("Matrix");
        miPelicula.setFechaDeLanzamiento(1999);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8.8);
        miPelicula.evalua(4);

        System.out.println("El total de las evaluaciones es: " + miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("La media de las evaluaciones es: " + miPelicula.calculaMedia());

        /*
         * 
         * Pelicula otraPelicula = new Pelicula();
         * 
         * otraPelicula.nombre = "Matrix 2";
         * otraPelicula.fechaDeLanzamiento = 2000;
         * otraPelicula.duracionEnMinutos = 120;
         * otraPelicula.incluidoEnElPlan = true;
         * 
         * otraPelicula.muestraFichaTecnica();
         * 
         */

    }
}

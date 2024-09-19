import com.fernando.screenmatch.calculos.CalculadoraDeTiempo;
import com.fernando.screenmatch.modelos.Pelicula;
import com.fernando.screenmatch.modelos.Serie;

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

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La Casa Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodioPorTemporada(10);
        casaDragon.setMinutoPorEpisodio(50);
        casaDragon.muestraFichaTecnica();

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1999);
        otraPelicula.setDuracionEnMinutos(90);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo total de reproducción: " + calculadora.getTiempoTotal());
    }
}

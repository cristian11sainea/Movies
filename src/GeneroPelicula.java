import java.util.ArrayList;

public class GeneroPelicula implements Suscrito{
    private String nameGenero;
    private ArrayList<Pelicula> peliculas;


    @Override
    public void update(String param) {
        System.out.println("nueva pelicula: " + param + "al genero " + nameGenero );
    }

    public GeneroPelicula(String nameGenero) {
        this.nameGenero = nameGenero;
    }

    public void addPelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }

    public String getNameGenero() {
        return nameGenero;
    }

    public void setNameGenero(String nameGenero) {
        this.nameGenero = nameGenero;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "GeneroPelicula{" +
                "nameGenero='" + nameGenero + '\'' +
                '}';
    }
}

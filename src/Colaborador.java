import java.util.ArrayList;
import java.util.function.Predicate;

public class Colaborador extends Persona{
    private ArrayList<Pelicula> peliculas;
    private ArrayList<Cliente> clientes;
    private ArrayList<GeneroPelicula> generoPeliculas;
    //private String name;

    public Colaborador() {
        this.peliculas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.generoPeliculas = new ArrayList<>();
    }

    public void addPelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
        System.out.println("nueva pelicula agregada " + pelicula.getNamePelicula());
        notifiy(pelicula.getNamePelicula());
    }
    public void removepelicula(Pelicula pelicula){
        this.peliculas.remove(pelicula);
        System.out.println("Pelicula eliminada " + pelicula.getNamePelicula());
        notifiy(pelicula.getNamePelicula());
    }

    public void addGenero(GeneroPelicula generoPelicula){
        this.generoPeliculas.add(generoPelicula);
        System.out.println("nuevo genero de pelicula agregada: " + generoPelicula.getNameGenero());

    }
    public void removeGenero(GeneroPelicula generoPelicula){
        this.generoPeliculas.add(generoPelicula);
        System.out.println("genro eliminado " + generoPelicula.getNameGenero());

    }

    public Pelicula findPeliculaByname(String namePelicula){
        return this.peliculas.stream().filter(pelicula -> pelicula.getNamePelicula().
                equals(namePelicula)).findFirst().get();
    }


    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
        System.out.println("nuevo cliente agregado: " + cliente.getName());
    }

    public void removeCliente(Cliente cliente){

        System.out.println("Cliente removido " + cliente.getName());
    }


    @Override
    public void notifiy(String namepelicula) {
        Pelicula pelicula = this.findPeliculaByname(namepelicula);
       this.clientes.stream().filter(cliente -> cliente.getGeneroPeliculas().
               equals(pelicula.getGeneroPelicula())).forEach(cliente -> cliente.update(namepelicula));
    }

    public void removeByName(String name){
        this.removeSuscrito(suscritos.stream()
                .filter(suscrito -> suscrito instanceof Colaborador && ((Colaborador) suscrito)
                        .getName().equals(name))
                .findFirst().get());

    }

    public GeneroPelicula getGeneroByName(String nameGeneroPelicula){

        return  this.getGeneroPeliculas()
                .stream().filter(generoPelicula1 -> generoPelicula1.getNameGenero()
                        .equals(nameGeneroPelicula)).findFirst().get();
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<GeneroPelicula> getGeneroPeliculas() {
        return generoPeliculas;
    }

    public void setGeneroPeliculas(ArrayList<GeneroPelicula> generoPeliculas) {
        this.generoPeliculas = generoPeliculas;
    }
}

import java.util.ArrayList;

public class Cliente extends Persona implements Suscrito{
    private GeneroPelicula generoPeliculas;

    public Cliente(String name, GeneroPelicula generoPelicula){
        this.generoPeliculas = generoPelicula;
        this.name = name;
    }

   // public void addGeneroPelicula(GeneroPelicula generoPelicula){
   //     this.generoPeliculas.add(generoPelicula);
    //}

    @Override
    public void notifiy(String name) {

    }

    public void removeByName(String name){
        this.removeSuscrito(suscritos.stream()
                .filter(suscrito -> suscrito instanceof Cliente && ((Cliente) suscrito)
                        .getName().equals(name))
                .findFirst().get());

    }

    public GeneroPelicula getGeneroPeliculas() {
        return generoPeliculas;
    }

    public void setGeneroPeliculas(GeneroPelicula generoPeliculas) {
        this.generoPeliculas = generoPeliculas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "generoPeliculas=" + generoPeliculas +
                '}';
    }

    @Override
    public void update(String param) {

        System.out.println(this.name + " nueva pelicula: " + param +
                "agregada al genero " + this.generoPeliculas  );
    }
}

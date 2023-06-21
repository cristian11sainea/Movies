public class Pelicula {
    private GeneroPelicula generoPelicula;
    private String namePelicula;

    public Pelicula (GeneroPelicula generoPelicula, String pelicula){
        this.generoPelicula = generoPelicula;
        this.namePelicula = pelicula;
    }

    public GeneroPelicula getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(GeneroPelicula generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public String getNamePelicula() {
        return namePelicula;
    }

    public void setNamePelicula(String namePelicula) {
        this.namePelicula = namePelicula;
    }


}

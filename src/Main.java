import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Colaborador colaborador = new Colaborador();
        movies(colaborador);
    }
    private static void movies(Colaborador colaborador) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("" +
                "1- agregar genero\n" +
                "2- suscribir cliente \n" +
                "3- agregar pelicula\n" +
                "8- Salir");
        int menuOption = sc.nextInt();
        switch (menuOption){
            case 1:
                System.out.println("nombre genero");
                String nameGenero = sc2.nextLine();

                GeneroPelicula generoPelicula = new GeneroPelicula(nameGenero);
                colaborador.addGenero(generoPelicula);
                System.out.println("genero suscrito");
                movies(colaborador);
                break;
            case 2:
                System.out.println("nombre cliente");
                String nameCliente = sc2.nextLine();
                colaborador.getGeneroPeliculas()
                        .forEach(System.out::println);
                System.out.println("digite genero de pelicula para el cliente");
                String nameGeneroPelicula = sc2.nextLine();

                GeneroPelicula generoPelicula2 = colaborador.getGeneroByName(nameGeneroPelicula);
                Cliente cliente = new Cliente(nameCliente, generoPelicula2);
                colaborador.addCliente(cliente);
                movies(colaborador);
                break;
            case 3:
                System.out.println("digite nomber de pelicula");
                String namePelicula = sc2.nextLine();
                colaborador.getGeneroPeliculas()
                        .forEach(System.out::println);
                System.out.println("digite genero de la pelicula");
                nameGeneroPelicula = sc2.nextLine();
                generoPelicula2 = colaborador.getGeneroByName(nameGeneroPelicula);
                Pelicula pelicula = new Pelicula(generoPelicula2, namePelicula);
                colaborador.addPelicula(pelicula);
                movies(colaborador);
                break;
            case 8:
                System.out.println("Gracias por utilizar nuestro sistema!");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        sc.close();
        sc2.close();
    }

}

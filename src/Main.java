public class Main{
    public static void main (String[] args){

        // Ejercicio1.

        int TiempoCancion = 0;
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion();

        cancion1.setArtista("Juice WRLD");
        cancion2.setArtista("Juice WRLD") ;
        cancion1.setTitulo("Maze");
        cancion2.setTitulo("Cigarettes");
        cancion1.setDuracionSegundos(2);
        cancion2.setDuracionSegundos(4);

        System.out.println("El titulo de la primera canción es: " + cancion1.getTitulo());
        System.out.println("El titulo de la segunda canción es: " + cancion2.getTitulo());
        System.out.println("El artista que hizo las dos canciones es: " + cancion1.getArtista());
        System.out.println("La duración de la primera canción es: " + cancion1.getDuracionSegundos() + " min");
        System.out.println("La duración de la primera canción es: " + cancion2.getDuracionSegundos() + " min");

        cancion1.setTitulo("ZEZE");
        cancion1.setArtista("Kodak Black");

        System.out.println("\n------------------------------");

        //Ejercicio 2.

        Pelicula pelicula1 = new Pelicula();

        pelicula1.setTitulo("The Walking Dead");
        pelicula1.setDirector("Greg Nicotero");
        pelicula1.setAñoEstreno(2010);
        pelicula1.setDuracionMinutos(45);

        System.out.println("Esta pelicula tiene como título: " + pelicula1.getTitulo() + " tiene varios directores pero el más conocido es " + pelicula1.getDirector() + " , fue estrenada en " + pelicula1.getAñoEstreno() + " y dura " + pelicula1.getDuracionMinutos() + " por espisodio. ");

        pelicula1.setDirector(pelicula1.getDirector().toUpperCase());

        // Ejercicio 3.


    }
}
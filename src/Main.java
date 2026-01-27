import Objetos1.*;
import Objetos2.BateriaMovil;
import Objetos2.CancionStats;
import Objetos2.Marcador;
import Objetos2.Personaje;

import java.text.spi.BreakIteratorProvider;

public class Main {
    public static void main(String[] args) {

        // Ejercicio1.

        int tiempoCancionMasLarga = 0;
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion();

        cancion1.setArtista("Juice WRLD");
        cancion2.setArtista("Juice WRLD");
        cancion1.setTitulo("Maze");
        cancion2.setTitulo("Cigarettes");
        cancion1.setDuracionSegundos(144);
        cancion2.setDuracionSegundos(227);

        System.out.println("El titulo de la primera canción es: " + cancion1.getTitulo());
        System.out.println("El titulo de la segunda canción es: " + cancion2.getTitulo());
        System.out.println("El artista que hizo las dos canciones es: " + cancion1.getArtista());
        System.out.println("La duración de la primera canción es: " + cancion1.getDuracionSegundos() + " segundos");
        System.out.println("La duración de la primera canción es: " + cancion2.getDuracionSegundos() + " segundos");

        cancion1.setTitulo("ZEZE");
        cancion1.setArtista("Kodak Black");

        Cancion[] cancionesEscuchadas = new Cancion[2];

        cancionesEscuchadas[0] = cancion1;
        cancionesEscuchadas[1] = cancion2;

        tiempoCancionMasLarga = cancion1.getDuracionSegundos();
        int posicionMasLarga = 0;

        for (int i = 0; i < cancionesEscuchadas.length; i++) {
            if (tiempoCancionMasLarga < cancionesEscuchadas[i].getDuracionSegundos()) {
                tiempoCancionMasLarga = cancionesEscuchadas[i].getDuracionSegundos();
                posicionMasLarga = i;
            }
        }
        System.out.println("\nLa canción más larga es: " + cancionesEscuchadas[posicionMasLarga].getTitulo());

        System.out.println("\n------------------------------");

        //Ejercicio 2.

        Pelicula pelicula1 = new Pelicula();

        pelicula1.setTitulo("The Walking Dead");
        pelicula1.setDirector("Greg Nicotero");
        pelicula1.setAñoEstreno(2010);
        pelicula1.setDuracionMinutos(45);

        System.out.println("Esta pelicula tiene como título: " + pelicula1.getTitulo() + " tiene varios directores pero el más conocido es " + pelicula1.getDirector() + " , fue estrenada en " + pelicula1.getAñoEstreno() + " y dura " + pelicula1.getDuracionMinutos() + " por espisodio. ");

        pelicula1.setDirector(pelicula1.getDirector().toUpperCase());

        System.out.println("\n------------------------------");

        // Ejercicio 3.

        Youtuber youtuber1 = new Youtuber();
        Youtuber youtuber2 = new Youtuber();
        Youtuber youtuber3 = new Youtuber();

        youtuber1.setNombreCanal("ReudigRuediguer");
        youtuber1.setNumeroSuscriptores(500000);

        youtuber2.setNombreCanal("MenosTrece");
        youtuber2.setNumeroSuscriptores(13000000);

        youtuber3.setNombreCanal("Illojuan");
        youtuber3.setNumeroSuscriptores(20000000);

        System.out.println("El nombre del primer youtuber es: " + youtuber1.getNombreCanal() + " y tiene " + youtuber1.getNumeroSuscriptores() + " suscriptores");
        System.out.println("el nombre del segundo youtuber es: " + youtuber2.getNombreCanal() + " y tiene " + youtuber2.getNumeroSuscriptores() + " suscriptores");
        System.out.println("el nombre del segundo youtuber es: " + youtuber3.getNombreCanal() + " y tiene " + youtuber3.getNumeroSuscriptores() + " suscriptores");

        youtuber1.setNumeroSuscriptores(535000);
        youtuber2.setNumeroSuscriptores(13131313);
        youtuber3.setNumeroSuscriptores(25000067);

        // Ejercicio 4.

        JugadorFutbol futbolista1 = new JugadorFutbol();

        futbolista1.setNombre("Cristiano Ronaldo");
        futbolista1.setEquipo("Sporting Clube de Portugal");
        futbolista1.setDorsal(7);
        futbolista1.setPosicion("Delantero");

        System.out.println("\nEl futbolista se llama " + futbolista1.getNombre() + " jugó en varios equipos, pero empezó en el " + futbolista1.getEquipo() + ". Su dorsal es muy famoso, llegando al punto de ser legendario y es el número " + futbolista1.getDorsal() + ", juega de " + futbolista1.getPosicion() + ".");

        futbolista1.setDorsal(999);
        futbolista1.setEquipo("Al-Nssr");

        System.out.println("\nEl futbolista se llama " + futbolista1.getNombre() + " jugó en varios equipos, pero empezó en el " + futbolista1.getEquipo() + ". Su dorsal es muy famoso, llegando al punto de ser legendario y es el número " + futbolista1.getDorsal() + ", juega de " + futbolista1.getPosicion() + ".");

        // Ejercicio 5.

        Skin skin1 = new Skin();
        Skin skin2 = new Skin();

        skin1.setNombreSkin("Vandal Primordium");
        skin1.setVideojuego("Valorant");
        skin1.setPrecio(2175);
        skin1.setRareza("Exclusivo");

        skin2.setNombreSkin("Vandal EX.0");
        skin2.setVideojuego("Valorant");
        skin2.setPrecio(2375);
        skin2.setRareza("Exclusivo");

        skin1.setPrecio(2975);
        skin1.setRareza("Exótico");

        // Ejercicio 6.

        Pokemon pokemon1 = new Pokemon();

        pokemon1.setNombre("Charizard");
        pokemon1.setNivel(36);
        pokemon1.setVida(120);
        pokemon1.setTipo("Fuego");

        // Ejercicio 7.

        Manga manga1 = new Manga();

        manga1.setTitulo("One Piece");
        manga1.setAutor("Eiichiro Oda");
        manga1.setNumero(105);
        manga1.estaLeido(false);

        System.out.println("El manga se llama " + manga1.getTitulo() + ", es el volumen " + manga1.getNumero() + " y fue escrito por " + manga1.getAutor());

        manga1.estaLeido(true);

        System.out.println("\n-----------------------------");

        // Ejercicio 8.

        EquipoEsports equipo1 = new EquipoEsports();

        equipo1.setRanking(19);

        // Objetos 2.

        // Ejercicio 9.

        CancionStats cancionStat1 = new CancionStats("Already");
        cancionStat1.reproducir();

        System.out.println("La canción se llama " + cancionStat1.getTitulo());

        // Ejercicio 10.

        Marcador marcadorPartido = new Marcador();

        marcadorPartido.setequipoLocal("Real Madrid");
        marcadorPartido.setequipoVisitante("Barcelona");

        System.out.println("Comienza el partido entre el " + marcadorPartido.getequipoLocal() + " y " + "el " + marcadorPartido.getequipoVisitante());

        marcadorPartido.gollocal();

        System.out.println("\nPrimeros minutos del partido y el Madrid marca su primer gol, " + marcadorPartido.resultado());

        marcadorPartido.golvisitante();

        System.out.println("\nEl barcelona ha marcado un golazo por la escuadra por parte de Lamine");

        marcadorPartido.golvisitante();

        System.out.println("\nHa habido un penalti que ha venido con un golazo de Lewandoski");

        marcadorPartido.gollocal();

        System.out.println("\nMbappe se acaba de llevar a tres y ha marcado un gol con una rasa interesante");

        marcadorPartido.gollocal();

        System.out.println("\nOtro gol de Arda Güler en el minuto 80 desde medio campo");

        marcadorPartido.gollocal();

        System.out.println("\n Se cierra este partido con un gol de Vinicius al límite de la portería!");

        System.out.println("\nEl partido ha acabado, " + marcadorPartido.resultado());

        // Ejercicio 11.

        BateriaMovil porcentajeBateria = new BateriaMovil();

        porcentajeBateria.setPorcentaje(85);

        porcentajeBateria.usar(15);

        System.out.println("\nLa batería se está agotando " + porcentajeBateria.getPorcentaje());

        // Ejercicio 12.

        Personaje personajePrincipal = new Personaje();

        personajePrincipal.setNombre("Rocky");
        personajePrincipal.setVida(100);
        personajePrincipal.setAtaque(25);

        personajePrincipal.recibirDanho(100);

        System.out.println("Tu personaje: " + personajePrincipal.getNombre() + " ha recibido " +  );


    }
}
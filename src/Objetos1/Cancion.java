public class Cancion {

    private String titulo;
    private String artista;
    private int duracionSegundos;

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String tituloCancion){
        titulo = tituloCancion;
    }
    public String getArtista(){
        return artista;
    }
    public void setArtista(String nameArtista){
        artista = nameArtista;
    }
    public int getDuracionSegundos(){
        return duracionSegundos;
    }
    public void setDuracionSegundos(int duracionSegundosCancion){
        duracionSegundos = duracionSegundosCancion;
    }
}

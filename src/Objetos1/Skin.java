public class Skin {

    private String nombre;
    private String videojuego;
    private String rareza;
    private int precio;

    public String getNombreSkin(){
        return nombre;
    }
    public void setNombreSkin(String nombreSkinJuego){
        nombre = nombreSkinJuego;
    }
    public String getVideojuego(){
        return videojuego;
    }
    public void setVideojuego(String videojuegoDeSkin){
        videojuego = videojuegoDeSkin;
    }
    public String getRareza(){
        return rareza;
    }
    public void setRareza(String rarezaSkin){
        rareza = rarezaSkin;
    }
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precioSkin){
        precio = precioSkin;
    }
}

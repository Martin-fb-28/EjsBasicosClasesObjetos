public class JugadorFutbol {
    private String nombre;
    private String equipo;
    private int dorsal;
    private String posicion;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String NombreJugador){
        nombre = NombreJugador;
    }
    public String getEquipo(){
        return equipo;
    }
    public void setEquipo(String equipoJugador){
        equipo = equipoJugador;
    }
    public int getDorsal(){
        return dorsal;
    }
    public void setDorsal(int DorsalJugador){
        dorsal = DorsalJugador;
    }
    public String getPosicion(){
        return posicion;
    }
    public void setPosicion(String PosicionJugador){
        posicion = PosicionJugador;
    }
}

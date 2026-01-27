package Objetos1;

public class EquipoEsports {
    private String nombre;
    private String juego;
    private String pais;
    private int ranking;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombreEquipo){
        nombre = nombreEquipo;
    }
    public String getJuego(){
        return juego;
    }
    public void setJuego(String nombreEquipo){
        juego = nombreEquipo;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(String paisEquipo){
        pais = paisEquipo;
    }
    public int getRanking(){
        return ranking;
    }
    public void setRanking(int rankingEquipo){
        ranking = rankingEquipo;
    }
}

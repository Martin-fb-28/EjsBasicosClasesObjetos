package Objetos2;

public class CancionStats {

    private String titulo;
    private int reproducciones;

    public CancionStats(String titulo){
        this.titulo = titulo;
        reproducciones = 0;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getReproducciones(){
        return reproducciones;
    }
    public void reproducir(){
        reproducciones++;
    }
}

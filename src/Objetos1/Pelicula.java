public class Pelicula {
    private String titulo;
    private String director;
    private int añoEstreno;
    private int duracionMinutos;

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String TituloPelicula){
        titulo = TituloPelicula;
    }
    public String getDirector(){
        return director;
    }
    public void setDirector(String DirectorPelicula){
        director = DirectorPelicula;
    }
    public int getAñoEstreno(){
        return añoEstreno;
    }
    public void setAñoEstreno(int AñoEstrenoPelicula){
        añoEstreno = AñoEstrenoPelicula;
    }
    public int getDuracionMinutos(){
        return duracionMinutos;
    }
    public void setDuracionMinutos(int DuracionMinutosPelicula){
        duracionMinutos = DuracionMinutosPelicula;
    }
}

public class Youtuber {
    private String nombreCanal;
    private String categoria;
    private int numeroSuscriptores;

    public String getNombreCanal(){
        return nombreCanal;
    }
    public void setNombreCanal(String NombreCanalYt){
        nombreCanal = NombreCanalYt;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String CategoriaCanal){
        categoria = CategoriaCanal;
    }
    public int getNumeroSuscriptores(){
        return numeroSuscriptores;
    }
    public void setNumeroSuscriptores(int NumeroSuscriptoresCanal){
        numeroSuscriptores = NumeroSuscriptoresCanal;
    }
}

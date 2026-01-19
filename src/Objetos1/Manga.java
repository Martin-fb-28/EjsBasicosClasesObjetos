public class Manga {

    private String titulo;
    private String autor;
    private int numero;
    private boolean leido;

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String tituloManga){
        titulo = tituloManga;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autorManga){
        autor = autorManga;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numeroVolumen){
        numero = numeroVolumen;
    }
    public boolean estaLeido(){
        return leido;
    }
    public void estaLeido(boolean estaLeidoManga){
        leido = estaLeidoManga;
    }
}

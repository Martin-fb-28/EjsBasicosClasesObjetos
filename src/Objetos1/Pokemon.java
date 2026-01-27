package Objetos1;

public class Pokemon {

    private String nombre;
    private String tipo;
    private int nivel;
    private int vida;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombrePokemon){
        nombre = nombrePokemon;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipoPokemon){
        tipo = tipoPokemon;
    }
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivelPokemon){
        nivel = nivelPokemon;
    }
    public int getVida(){
        return vida;
    }
    public void setVida(int vidaPokemon){
        vida = vidaPokemon;
    }
}

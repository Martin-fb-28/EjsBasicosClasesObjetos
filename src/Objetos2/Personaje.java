package Objetos2;

public class Personaje {

    private String nombre;
    private int vida;
    private int ataque;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if(vida <= 0){
            vida = 0;
        }else if(vida > 100){
            vida = 100;
        }else{
            this.vida = vida;
        }
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int recibirDanho(int danhoRecibido){
        vida -= danhoRecibido;
        if(vida <= 0){
            vida = 0;
            System.out.println("Tu personaje ha muerto, reaparece para continuar. ");
        }
        return vida;
    }
    public int curarse(int curaRecibida){
        vida += curaRecibida;
        if (vida > 100){
            vida = 100;
        }
        return vida;
    }

    public boolean comprobar(boolean Siguevivo){
        if (vida <= 0){
            Siguevivo = false;
            vida = 0;
        }else{
            Siguevivo = true;
            vida = 0;
        }
        return Siguevivo;
    }
}

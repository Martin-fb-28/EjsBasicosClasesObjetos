package Objetos2;

public class Marcador {

    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public String getequipoLocal() {
        return equipoLocal;
    }

    public void setequipoLocal(String local) {
        this.equipoLocal = local;
    }

    public String getequipoVisitante() {
        return equipoVisitante;
    }

    public void setequipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getgolesLocal() {
        return golesLocal;
    }
    public int getgolesVisitante() {
        return golesVisitante;
    }
    public void gollocal(){
        golesLocal++;
    }
    public void golvisitante(){
        golesVisitante++;
    }
    public String resultado(){
        return "la puntuación es:  " + equipoLocal + " / " + golesLocal + " - " + golesVisitante + " / " + equipoVisitante;
    }
}

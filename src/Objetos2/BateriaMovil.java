package Objetos2;

public class BateriaMovil {

    private int porcentaje;

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentajeMovil) {
        porcentaje = porcentajeMovil;
    }

    public int usar(int minutosReducir) {

        if (minutosReducir >= 5 && minutosReducir < 20) {
            porcentaje -= 10;
        } else if (minutosReducir >= 20 && minutosReducir < 50) {
            porcentaje -= 30;
        } else if (minutosReducir >= 50 && minutosReducir < 70) {
            porcentaje -= 50;
        } else if (minutosReducir >= 70 && minutosReducir <= 100) {
            porcentaje -= 80;
        } else {
            porcentaje = 0;
        }

        if (porcentaje <= 0) {
            porcentaje = 0;
            System.out.println("No hay batería en el teléfono");
        }
        return porcentaje;
    }

    public int cargar(int minutosCargar) {
        if (minutosCargar >= 0 && minutosCargar < 20) {
            porcentaje += minutosCargar;
        } else if (minutosCargar >= 20 && minutosCargar < 50) {
            porcentaje += minutosCargar;
        } else if (minutosCargar >= 50 && minutosCargar < 80) {
            porcentaje += minutosCargar;
        } else if (minutosCargar >= 80 && minutosCargar < 100) {
            porcentaje += minutosCargar;
        } else {
            porcentaje = 100;
        }

        if (porcentaje > 100) {
            porcentaje = 100;
            System.out.println("La batería está totalmente cargada");
        }
        return porcentaje;
    }
}

/*
 * Nombre: Starlyn Eduardo Escalante
 * Matrícula: 2025-1089
 * Tarea 2.1: Clases y Métodos
 */

public class Tv {
    
    // Atributos de la TV
    public String marca;
    public int pulgadas;
    public boolean encendido;
    public int volumen;

    // Métodos para controlar la TV
    
    public void encender() {
        this.encendido = true;
        System.out.println("La TV se esta encendiendo...");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("La TV se esta apagando...");
    }

    public void subirVolumen() {
        // Solo sube si está encendida
        if (this.encendido == true) {
            this.volumen = this.volumen + 1;
            System.out.println("Subiendo el volumen a: " + this.volumen);
        } else {
            System.out.println("No se puede subir volumen, la TV esta apagada.");
        }
    }

    public void bajarVolumen() {
        // Solo baja si está encendida y tiene volumen
        if (this.encendido == true && this.volumen > 0) {
            this.volumen = this.volumen - 1;
            System.out.println("Bajando el volumen a: " + this.volumen);
        } else {
            System.out.println("No se puede bajar volumen.");
        }
    }
}
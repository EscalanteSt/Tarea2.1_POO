/*
 * Nombre: Starlyn Eduardo Escalante
 * Matrícula: 2025-1089
 * Tarea 2.1: Clases y Métodos
 */

public class Prueba {

    public static void main(String[] args) {
        
        // --- TV NUMERO 1 ---
        System.out.println("=== DATOS TV 1 ===");
        Tv tv1 = new Tv();
        
        //valores 
        tv1.marca = "Samsung";
        tv1.pulgadas = 55;
        tv1.volumen = 10;
        tv1.encendido = false;
        
        // info
        System.out.println("Marca: " + tv1.marca);
        System.out.println("Pulgadas: " + tv1.pulgadas);
        
        //métodos
        tv1.encender();
        tv1.subirVolumen();
        tv1.subirVolumen(); // Lo subo dos veces para probar
        tv1.apagar();
        
        System.out.println("--------------------------");

        // --- TV NUMERO 2 ---
        System.out.println("=== DATOS TV 2 ===");
        Tv tv2 = new Tv();
        
        tv2.marca = "LG";
        tv2.pulgadas = 43;
        tv2.volumen = 25;
        tv2.encendido = false;
        
        System.out.println("Marca: " + tv2.marca);
        System.out.println("Pulgadas: " + tv2.pulgadas);
        
        tv2.encender();
        tv2.bajarVolumen();
        tv2.apagar();
        
        System.out.println("--------------------------");

        // --- TV NUMERO 3 ---
        System.out.println("=== DATOS TV 3 ===");
        Tv tv3 = new Tv();
        
        tv3.marca = "Sony";
        tv3.pulgadas = 65;
        tv3.volumen = 0; // Empieza sin volumen
        tv3.encendido = false;
        
        System.out.println("Marca: " + tv3.marca);
        System.out.println("Pulgadas: " + tv3.pulgadas);
        
        tv3.encender();
        tv3.subirVolumen();
        tv3.apagar();
    }
}
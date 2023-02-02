
package Biblioteca;


public class TestLibro {
    
    public static void main(String[] args) {
        // Crear un nuevo libro
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 10, 5);
        System.out.println(libro1);

        // Realizar prestamo de libro
        boolean prestamoExitoso = libro1.prestamo();
        if (prestamoExitoso) {
            System.out.println("Préstamo exitoso");
        } else {
            System.out.println("No hay más ejemplares disponibles para prestar");
        }
        System.out.println(libro1);

        // Realizar devolucion de libro
        boolean devolucionExitosa = libro1.devolucion();
        if (devolucionExitosa) {
            System.out.println("Devolucion exitosa");
        } else {
            System.out.println("No se ha prestado ningun ejemplar");
        }
        System.out.println(libro1);
    }
}

    


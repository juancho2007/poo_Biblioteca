public class Principal {
    public static void main(String[] args) {
        Libro l1 = new Libro("Pinocho","Carlo Collodi","Cuento",1881, 3);
        Libro l2 = new Libro();

        System.out.println("Libro 1: " + l1.mostrarInformacion());
        System.out.println("Prestando libro...");
        if (l1.prestar() < 0) {
            System.out.println("No hay ejemplares");
        } else {
            System.out.println("Ejemplar prestado");
        }
        System.out.println("Prestando libro...");
        if (l1.prestar() < 0) {
            System.out.println("No hay ejemplares");
        } else {
            System.out.println("Ejemplar prestado");
        }
        System.out.println("Libro 1: " + l1.mostrarInformacion());
        System.out.println("Libro 2: " + l2.mostrarInformacion());
        l1.setTitulo("Nuevo Titulo");
        System.out.println("Libro 1: " + l1.mostrarInformacion());

        l1.setTitulo("Siempre Blessd");


        l1.setAutor("Andres Flores");


        l1.setCategoria("Terror");


        l1.setAnio(2025);


        l1.setCantidadEjemplares(10);

        System.out.println("Libro 1: " + l1.mostrarInformacion());

        System.out.println("Devolviendo libro...");
        l1.devolver();
        System.out.println("Libro 1: " + l1.mostrarInformacion());



    }
}

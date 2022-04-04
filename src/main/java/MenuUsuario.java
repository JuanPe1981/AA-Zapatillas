import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuUsuario {

        private Scanner teclado;
        private List<Zapatilla> catalogoZapatillas;

        public MenuUsuario() {
            teclado = new Scanner(System.in);
            catalogoZapatillas = new ArrayList<>();
        }

        public void mostrarMenu(){
            poblarZapatillas();
            String opcion = null;

            do {
                System.out.println("Catalogo de Zapatillas");
                System.out.println("1. Ver catalogo");
                System.out.println("2. Buscar Zapatilla");
                System.out.println("3. Salir");
                System.out.println("Opción: ");
                opcion = teclado.nextLine();

                switch (opcion) {
                    case "1":
                        verCatalogo();
                        break;
                    case "2":
                        buscarZapatilla();
                }
            } while (!opcion.equals("3"));
        }

        public void verCatalogo(){
            for (Zapatilla zapatilla : catalogoZapatillas) {
                System.out.println("Modelo: " + zapatilla.getNombre());
                System.out.println("Color:  " + zapatilla.getColor());
                System.out.println("Número: " + zapatilla.getNumero());
                System.out.println("Precio: " + zapatilla.getPrecio());
                System.out.println();
            }
        }

        public void buscarZapatilla(){
            boolean encontrado = false;
            System.out.println("Búsqueda por nombre: ");
            String nombre = teclado.nextLine();
            for (Zapatilla zapatilla : catalogoZapatillas) {
                if (zapatilla.getNombre().contains(nombre)) {
                    System.out.println("Zapatilla encontrada");
                    System.out.println(zapatilla.getNombre());
                    System.out.println(zapatilla.getColor());
                    System.out.println(zapatilla.getNumero());
                    System.out.println(zapatilla.getPrecio());
                    System.out.println();
                    encontrado = true;
                }
            }
            if (!encontrado)
                System.out.println("No se encuentra ese modelo de zapatilla.");
                System.out.println();
        }

        public void poblarZapatillas(){
            catalogoZapatillas.add(new Zapatilla("Adidas clasic","blanco", 42, 49.90));
            catalogoZapatillas.add(new Zapatilla("Nike fire","rojo", 37, 35.90));
            catalogoZapatillas.add(new Zapatilla("Convers alta","blanco, azul y rojo", 44, 79.90));
            catalogoZapatillas.add(new Zapatilla("Air Jordan","negro y rojo", 46, 112.00));
            catalogoZapatillas.add(new Zapatilla("New Balance Running","amarillo", 39, 59.90));
        }
}

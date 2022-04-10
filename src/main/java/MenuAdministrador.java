import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MenuAdministrador {

    private Scanner teclado;
    private List<Zapatilla> catalogoZapatillas;
    private List<Usuario> usuarios;

    public MenuAdministrador() {
        teclado = new Scanner(System.in);
        catalogoZapatillas = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void mostrarMenu() {
        poblarZapatillas();
        String opcion = null;

        do {
            System.out.println("Catálogo de Zapatillas");
            System.out.println("1. Añadir Zapatilla");
            System.out.println("2. Eliminar Zapatilla");
            System.out.println("3. Buscar Zapatilla");
            System.out.println("4. Modificar Zapatilla");
            System.out.println("5. Ver catalogo");
            System.out.println("6. Añadir usuario");
            System.out.println("7. Salir");
            System.out.println("Opción: ");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    anadirZapatilla();
                    break;
                case "2":
                    eliminarZapatilla();
                    break;
                case "3":
                    buscarZapatilla();
                    break;
                case "4":
                    modificarZapatilla();
                    break;
                case "5":
                    verCatalogo();
                    break;
                case "6":
                    añadirUsuario();
            }
        } while (!opcion.equals("7"));
    }

    public void anadirZapatilla() {
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Color: ");
        String color = teclado.nextLine();
        System.out.print("Número: ");
        int numero = Integer.parseInt(teclado.nextLine());
        System.out.print("Precio: ");
        double precio = Double.parseDouble(teclado.nextLine());
        Zapatilla zapatilla = new Zapatilla(nombre.trim(), color.trim(), numero, precio);
        catalogoZapatillas.add(zapatilla);
    }

    public void eliminarZapatilla() {
        System.out.println("Nombre de Zapatilla a eliminar: ");
        String nombre = teclado.nextLine();
        boolean eliminado = catalogoZapatillas.removeIf(zapatilla -> zapatilla.getNombre().equals(nombre));
        if (eliminado)
            System.out.println("Zapatilla eliminada correctamente");
        else
            System.out.println("No se pudo eliminar. El modelo de zapatilla no existe");
    }

    public void buscarZapatilla() {
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

    public void modificarZapatilla() {
        boolean modificado = false;
        System.out.println("Nombre de zapatilla a modificar el precio: ");
        String nombre = teclado.nextLine();
        for (Zapatilla zapatilla : catalogoZapatillas) {
            if (zapatilla.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Nuevo nombre: ");
                String nuevoNombre = teclado.nextLine();
                System.out.println("Nuevo color: ");
                String nuevoColor = teclado.nextLine();
                System.out.println("Nuevo número: ");
                int nuevoNumero = Integer.parseInt(teclado.nextLine());
                System.out.println("Nuevo precio: ");
                double nuevoPrecio = Double.parseDouble(teclado.nextLine());
                zapatilla.setNombre(nuevoNombre);
                zapatilla.setColor(nuevoColor);
                zapatilla.setNumero(nuevoNumero);
                zapatilla.setPrecio(nuevoPrecio);
                System.out.println("Zapatilla modificada correctamente.");
                modificado = true;
            }
        }
        if (!modificado)
            System.out.println("No se pudo modificar la zapatilla.");
    }

    public void verCatalogo() {
        for (Zapatilla zapatilla : catalogoZapatillas) {
            System.out.println("Modelo: " + zapatilla.getNombre());
            System.out.println("Color:  " + zapatilla.getColor());
            System.out.println("Número: " + zapatilla.getNumero());
            System.out.println("Precio: " + zapatilla.getPrecio());
            System.out.println();
        }
    }

    public void añadirUsuario() {
        System.out.print("Nombre de usuario: ");
        String nombreUsuario = teclado.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = teclado.nextLine();
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = teclado.nextLine();
        System.out.print("DNI: ");
        String dni = teclado.nextLine();
        System.out.print("Teléfono: ");
        int telefono = Integer.parseInt(teclado.nextLine());
        Usuario usuario = new Usuario(nombreUsuario.trim(), contraseña.trim(), nombre.trim(), apellidos.trim(), dni.trim(), telefono);
        usuarios.add(usuario);
    }

    public void poblarZapatillas(){
        catalogoZapatillas.add(new Zapatilla("Adidas clasic","blanco", 42, 49.90));
        catalogoZapatillas.add(new Zapatilla("Nike fire","rojo", 37, 35.90));
        catalogoZapatillas.add(new Zapatilla("Convers alta","blanco, azul y rojo", 44, 79.90));
        catalogoZapatillas.add(new Zapatilla("Air Jordan","negro y rojo", 46, 112.00));
        catalogoZapatillas.add(new Zapatilla("New Balance Running","amarillo", 39, 59.90));
    }


}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {
    private Scanner teclado;
    private List<Usuario> usuarioList;
    private List<UsuarioAdministrador> usuariosAdministradorList;
    public List<Zapatilla> catalogoZapatillas;

    public MenuPrincipal() {
        teclado = new Scanner(System.in);
        usuarioList = new ArrayList<>();
        usuariosAdministradorList = new ArrayList<>();
        catalogoZapatillas = new ArrayList<>();
    }

    public void mostrarMenu() {
        poblarUsuarios();
        poblarUsuariosAdministradores();
        poblarZapatillas();
        String opcion = null;

        do {
            System.out.println("Menu principal Zapatilla");
            System.out.println("1. Menu Usuario");
            System.out.println("2. Menu administrador");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion =teclado.nextLine();

            switch (opcion) {
                case "1":
                    menuUsuario();
                    break;
                case "2":
                    menuAdministrador();
            }
        } while (!opcion.equals("3"));
    }

    public void menuUsuario() {
        MenuUsuario menuUsuario = new MenuUsuario();
        menuUsuario.mostrarMenu();
    }

    public void menuAdministrador() {
        MenuAdministrador menuAdministrador = new MenuAdministrador();
        menuAdministrador.mostrarMenu();
    }

    public void poblarUsuarios() {
        usuarioList.add(new Usuario("Pepe99","1234", "Pepe", "Perez", "12456789H", 976123123));
        usuarioList.add(new Usuario("Pepe98","1234", "Pepe", "Sanchez", "12456701H", 976123124));
        usuarioList.add(new Usuario("Pepe90","1234", "Pepe", "Lopez", "12456702H", 976123125));
    }

    public void poblarUsuariosAdministradores() {
        usuariosAdministradorList.add(new UsuarioAdministrador("Admin","Admin", "Bruce", "Springsteen", "00000001B", 976252100, 1, true));
    }

    public void poblarZapatillas() {
        catalogoZapatillas.add(new Zapatilla("Adidas clasic","blanco", 42, 49.90));
        catalogoZapatillas.add(new Zapatilla("Nike fire","rojo", 37, 35.90));
        catalogoZapatillas.add(new Zapatilla("Convers alta","blanco, azul y rojo", 44, 79.90));
        catalogoZapatillas.add(new Zapatilla("Air Jordan","negro y rojo", 46, 112.00));
        catalogoZapatillas.add(new Zapatilla("New Balance Running","amarillo", 39, 59.90));
    }
}



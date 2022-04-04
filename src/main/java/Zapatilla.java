import java.util.List;
import java.util.Scanner;

public class Zapatilla {

    private String nombre;
    private String color;
    private int numero;
    private double precio;

    private Scanner teclado;
    private List<Zapatilla> catalogoZapatillas;


    public Zapatilla(String nombre, String color, int numero, double precio){
        if (precio > 0 && numero > 0){
            this.nombre = nombre;
            this.color = color;
            this.numero = numero;
            this.precio = precio;
        } else
        System.out.println("El precio y el numero de calzado no puede ser 0");
    }

    public Zapatilla() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}

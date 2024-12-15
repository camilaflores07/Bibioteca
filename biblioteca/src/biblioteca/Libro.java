/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author 50494
 */
public class Libro {
    String nombre;
    String autor;
    double precio;
    int cantidad;
    
    public Libro(String nombre, String autor, double precio, int cantidad){
        this.nombre=nombre;
        this.autor=autor;
        this.cantidad = cantidad;
        this.precio=precio;
    }
    public double calculartotao(){
        return precio * cantidad;
    }
    public void mostrardettalles(){
        JOptionPane.showMessageDialog(null, "El nombre del libro es: "+nombre+ 
                "\nbEl nombre del autor es: "+autor+ "\nEL precio del libro es de: "+precio+ 
                "\nY el precio uniario de compra fue de: "+cantidad+ "\nel costo total es de: "+calculartotao());
    }

    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del libro");
        String autor = JOptionPane.showInputDialog("Ingrese el nombre del autor");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del libro"));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea comprar"));
        
        Libro lib = new Libro(nombre, autor, precio, cantidad);
    
    lib.mostrardettalles();
      
                
    }
    
    
}


package com.mycompany.parcial2;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
    // Vista (Interfaz )
    public class BodegaSimulador {
        public static void main(String[] args) {
        BodegaDatabase database = new BodegaDatabase();
        BodegaViewModel viewModel = new BodegaViewModel(database);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. Verificar los productos en bodega");
            System.out.println("2. Agregar un nuevo producto");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Productos en bodega:");
                    viewModel.mostrarProductos();
                    break;
                case 2:
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();  // Consumir el salto de línea
                    viewModel.agregarProducto(nombre, cantidad);
                    System.out.println("Producto agregado con éxito.");
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static class BodegaDatabase {

        public BodegaDatabase() {
        }
    }

    private static class BodegaViewModel {

        public BodegaViewModel() {
        }

        private BodegaViewModel(BodegaDatabase database) {
            throw new UnsupportedOperationException("No."); 
        }

        private void mostrarProductos() {
            throw new UnsupportedOperationException("No."); 
        }

        private void agregarProducto(String nombre, int cantidad) {
            throw new UnsupportedOperationException("No."); 
        }
    }
}



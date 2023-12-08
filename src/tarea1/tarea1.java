
package tarea1;

import java.util.Scanner;

/**
 *
 * @author Mayra
 */
public class tarea1 {

   
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Bienvenido, selecione una opción.");
            System.out.println("1. Adicionar Tatuador");
            System.out.println("2. Adicionar Cliente");
            System.out.println("3. Adicionar Estilo de Tatuaje");
            System.out.println("4. Finalizar");

            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Nombre del Tatuador:");
                    String usuario = scanner.nextLine();
                    System.out.println("Tatuador '" + usuario + "' ha sido añadido correctamente.\n");
                    break;
                case 2:
                    System.out.println("Nombre del Cliente:");
                    String correo = scanner.nextLine();
                    System.out.println("El cliente '" + correo + "' ha sido añadido correctamente.\n");
                    break;
                case 3:
                    System.out.println("Introduce el estilo de tatuaje que deseas:");
                    String contrasena = scanner.nextLine();
                    System.out.println("Estilo añadido.\n");
                    break;
                case 4:
                    System.out.println("Gracias por escogernos, Finalizar...");
                    return;
                default:
                    System.out.println("Opción no válida. Solo puede escoger una opción del 1 al 4.");
            }
        }
    }
}

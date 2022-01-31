
import java.util.Scanner;

public class Controlador {

    private QueueCero cola;

    public Controlador() {

    }

    public void inicializarPilar() {
        Scanner reader = new Scanner(System.in);
        int cantidad;
        try {
            do {
                System.out.println("Inserte el tamaño de la cola");
                cantidad = reader.nextInt();
            } while (cantidad < 1);

            this.cola = new QueueCero(cantidad);

        } catch (Exception e)  {
            reader.close();
        }

    }

    public void eleccion() {
        int opcion;
        long valorPila; 
        Scanner reader = new Scanner(System.in);
        Scanner readerFunciones = new Scanner(System.in);

        System.out.println(
                "1)Agregar, 2)Eliminar 3)Consultar Top 4)Consultar Vacio 5)Consultar lleno 6)Salir del programa");
        try {
            do {
                System.out.println("Inserte la opcion");
                opcion = reader.nextInt();

                switch (opcion) {
                    case 1:
                        if (cola.isFull()) {
                            System.out.println("Cola llena, no se pueden agregar más elementos");

                        } else {
                            System.out.println("Inserte el valor a agregar");
                            valorPila = readerFunciones.nextLong();
                            cola.insert(valorPila);

                        }

                        break;
                    case 2:

                        if (cola.isEmpty()) {
                            System.out.println("Cola vacia, no se puede eliminar");
                        } else {
                            System.out.println("Se ha eliminado el valor " + cola.peekFront());
                            cola.remove();
                        }

                        break;
                    case 3:
                    if (cola.isEmpty()) {
                        System.out.println("Cola vacia, no hay tope");
                    } else {
                        System.out.println("El tope es: " + cola.peekFront());
                    }

                        

                        break;
                    case 4:
                        if (cola.isEmpty()) {
                            System.out.println("La Cola está vacía");
                        } else {
                            System.out.println("La cola no está vacía y el tope es:" + cola.peekFront());
                            cola.remove();
                        }
                        break;
                    case 5:
                        if (cola.isFull()) {
                            System.out.println("La Cola llena");

                        } else {
                            System.out.println("La cola no está llena");

                        }

                        break;
                    case 6:
                        break;

                    default:
                        break;

                }

            } while (opcion != 6);

        } catch (Exception e)  {
            reader.close();
            readerFunciones.close();
            
        }

    }

}
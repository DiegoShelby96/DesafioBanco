import java.util.Scanner;

public class desafioBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombreUsuario = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1000.0;
        boolean salir = false;

        System.out.println("\n---- Bienvenido al Banco mi Casa ----");
        System.out.println("Nombre: " + nombreUsuario);
        System.out.println("Cuenta " + tipoDeCuenta);



        while (!salir) {
            System.out.println("--------------------------------------");
            System.out.println("1. Ver saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("9. Salir");

            int opcion = teclado.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("Tu saldo actual es: $" + saldo);
                    break;

                case 2:
                    System.out.print("Ingresa la cantidad a retirar: $");
                    double cantidadARetirar = teclado.nextDouble();

                    if (cantidadARetirar > saldo) {
                        System.out.println("Saldo insuficiente. No puedes retirar más de $" + saldo);
                    } else {
                        saldo -= cantidadARetirar;
                        System.out.println("Has retirado $" + cantidadARetirar + ". Tu nuevo saldo es: $" + saldo);
                    }
                    break;

                case 3:
                    System.out.print("Ingresa la cantidad a depositar: $");
                    double cantidadADepositar = teclado.nextDouble();
                    saldo += cantidadADepositar;

                    System.out.println("Has depositado $" + cantidadADepositar + ". Tu nuevo saldo es: $" + saldo);
                    break;

                case 9:
                    System.out.println("Gracias por usar la Aplicación Bancaria. ¡Adiós!");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }
        }

    }


}
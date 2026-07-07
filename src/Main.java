import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        PlataformaStreaming plataforma = new PlataformaStreaming();

        String contraseña = null;
        int opcion;

        do{
            System.out.print("====PLATAFORMA====");
            System.out.print("1. Registrarse: ");
            System.out.print("2. Plan Basico");
            System.out.print("3. Plan Estandar");
            System.out.print("4. Plan Premium");

            switch (opcion) {

                case 1:

                    System.out.println("Ingresa tu nombre: ");
                    sc.nextLine();
                    System.out.println("Ingresa tu correo: ");
                    sc.nextLine();
                    System.out.println("Ingresa tu contraseña: ");
                    contraseña = sc.nextLine();

                    break;

                case 2:



                    break;

                case 3:

                    break;



            }
        }
    }

}
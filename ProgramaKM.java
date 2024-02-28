import java.util.Scanner;

public class ProgramaKM {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, numFinal;

        System.out.println("Escribe el numero en Km");
        num = teclado.nextInt();

        numFinal=num*1000;

        System.out.println("La distancia en metros es: " + numFinal);

        //Joje dice paco que me comas los KM
    }
}

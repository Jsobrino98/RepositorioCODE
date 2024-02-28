import java.util.Scanner;

public class ProgramaKM {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, numFinal;
    //Solicitamos al usuario que introduzca el numero de Km que quiere saber en metros
        System.out.println("Escribe el numero en Km");
        num = teclado.nextInt();
    //Multiplicamos el numero introducido por teclado por 1000
        numFinal=num*1000;
    //Imprimimos un mensaje con la solucion final
        System.out.println("La distancia en metros es: " + numFinal);
    }
}

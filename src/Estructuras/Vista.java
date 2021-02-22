package Estructuras;
import java.util.Arrays;
import java.util.Scanner;

public class Vista {

    public Vista(){}
    Scanner scan = new Scanner(System.in);

    public int Menu(){
        System.out.println("Elija una de los siguientes tipos de sorts: ");
        System.out.println("1. Gnome Sort ");
        System.out.println("2. Merge Sort");
        System.out.println("3. Quick Sort ");
        System.out.println("4. Radix Sort ");
        System.out.println("5. Insertion Sort ");
        return scan.nextInt();
    }

    public void Error(){
        System.out.println("Error en el sistema");
    }

    public void Correcto(int[] a, int[] b){
        if(a == b){
            System.out.println("Sistema ordenado!");
        } else{
            Error();
        }

        imprimir(a);
    }

    public void Fin(){
        System.out.println("Saliendo del sistema");
    }


    public void imprimir(int[] e){
        System.out.println("Secuencia ordenada: ");
        System.out.println(Arrays.toString(e));
        System.out.println(" ");
    }


}

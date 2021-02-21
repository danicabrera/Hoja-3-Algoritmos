package Estructuras;
import java.util.Scanner;

public class Vista {

    public Vista(){};
    Scanner scan = new Scanner();

    public int Menu(){
        System.out.println("Elija una de los siguientes tipos de sorts: ");
        System.out.println("1. Gnome Sort ");
        System.out.println("2. Merge Sort");
        System.out.println("3. Quick Sort ");
        System.out.println("4. Radix Sort ");
        System.out.println("5. Insertion Sort ");
        int resp = scan.nextInt();
        return resp;
    }
}

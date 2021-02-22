package Estructuras;
import java.util.ArrayList;

public class Sorts {
    public Sorts(){}

    public void Gnome(ArrayList<Integer> listado){
        int num = 0;
        while(num<3000){
            if (num == 0){
                num++;
            }

            if(listado.get(num) >= listado.get(num - 1)){
                num++;
            } else{
                int temp1 = listado.get(num);
                int temp2 = listado.get(num -1);

                listado.set(num, temp2);
                listado.set(num - 1, temp1);
            }
        }
    }

    public void Merge(ArrayList<Integer> listado){

    }

    public void Quick(ArrayList<Integer> listado){

    }

    public void Radix(ArrayList<Integer> listado){

    }

    public void Insert(ArrayList<Integer> listado){

    }
}

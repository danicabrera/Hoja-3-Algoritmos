package Estructuras;
import java.util.Arrays;

public class Sorts {
    public Sorts(){}

    public void Gnome(int[] listado){
        int num = 0;
        while(num<3000){
            if (num == 0){
                num++;
            }

            if(listado[num] >= listado[num - 1]){
                num++;
            } else{
                int temp1 = listado[num];
                int temp2 = listado[num -1];

                listado[num] = temp2;
                listado[num - 1] = temp1;
            }
        }
    }

    public void Merge(int[] listado, int izq, int med, int der){
        int num1 = med - izq;
        int num2 = der - med;

        int[] Izquierda = new int[num1];
        int[] Derecha = new int[num2];


        if (num1 >= 0) System.arraycopy(listado, izq, Izquierda, 0, num1);

        for(int j = 0 ; j < num2; j++){
            Derecha[j] = listado[med + j +1];
        }

        int j = 0, i = 0;

        int k = izq;

        while(i < num1 && j < num2){
            if(Izquierda[i] <= Derecha[j]){
                listado[k] = Izquierda[i];
                i++;
            } else{
                listado[k] = Derecha[j];
                j++;
            }
            k++;
        }

        while(i < num1){
            listado[k] = Izquierda[i];
            i++;
            k++;
        }

        while(j < num2){
            listado[k] = Derecha[j];
            j++;
            k++;
        }

    }

    public void Mergesort(int[] lista, int izq, int der){
        if(izq < der ){
            int med = izq + (der - 1)/2;
            Mergesort(lista, izq, med);
            Mergesort(lista, med + 1, der);

            Merge(lista, izq, med, der);
        }
    }

    public void Quick(int[] listado, int izq, int der){
        int p = listado[izq];
        int i = izq;
        int j = der;
        int num;

        while (i < j){
            while (listado[i] <= p && i<j){
                i++;
            }

            while(listado[j] > p){
                j--;
            }

            if(i<j){
                num = listado[i];
                listado[i] = listado[j];
                listado[j] = num;
            }
        }

        listado[izq] = listado[j];
        listado[j] = p;

        if(izq< j - 1){
            Quick(listado, izq, j-1);
        }

        if (j+1 < der){
            Quick(listado, j+1, der);
        }
    }

    public void Radix(int[] listado, int num, int exp){
        int[] salida = new int[num];
        int i;
        int[] conteo = new int[10];
        Arrays.fill(conteo, 0);

        for (i = 0; i < num; i++) {
            conteo[(listado[i] / exp) % 10]++;
        }

        for (i = 1; i < 10; i++) {
            conteo[i] += conteo[i - 1];
        }

        for (i = num - 1; i >= 0; i--){
            salida[conteo[(listado[i] / exp) % 10] - 1] = listado[i];
            conteo[(listado[i] / exp) % 10]--;
        }

        for(i = 0; i< num; i++){
            listado[i] = salida[i];
        }
    }

    public void RadixSort(int[] listado, int num){
        int max = listado[0];
        for (int i = 1; i < num; i++){
            if(listado[i] > max){
                max = listado[i];
            }
        }

        for (int exp = 1; (max/ exp) > 0; exp *= 10 ){
            Radix(listado, num, exp);
        }
    }

    public void Insert(int[] listado){
        int largo = listado.length;
        for (int i = 1; i < largo; i++){
            int clave = listado[i];
            int j = i - 1;

            while(j > 0 && listado[j]> clave){
                listado[j+1] = listado[j];
                j--;
            }

            listado[j+1] = clave;
        }
    }
}

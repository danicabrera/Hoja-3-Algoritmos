package Estructuras;
import java.util.ArrayList;
import java.util.Collections;


public class Archivo {
    ArrayList<Integer> lista = new ArrayList<>();
    ArrayList<Integer> listaOrdenada;
    public Archivo(){

        for (int i = 1; i <= 3000; i++){
            lista.add(i);
        }
        listaOrdenada = lista;
        Collections.shuffle(lista);

    }

    public void revolver(){
        Collections.shuffle(lista);
    }

    public ArrayList<Integer> getLista(){
        return lista;
    }

    public ArrayList<Integer> getListaOrdenada(){
        return listaOrdenada;
    }


}

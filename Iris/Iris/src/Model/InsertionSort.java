
package Model;

import java.util.List;

public class InsertionSort {
    public List<Integer> Ordenar(List<Integer> listaNumeros) {
        int tamanho = listaNumeros.size();
        for(int i = 1; i < tamanho; i++) {
            int key = listaNumeros.get(i);
            int j = i - 1;
            while(j >= 0 && listaNumeros.get(j) > key) {
                listaNumeros.set(j+1, listaNumeros.get(j));
                j = j-1;
            }
            listaNumeros.set(j+1, key);
        }
        return listaNumeros;
    }
}

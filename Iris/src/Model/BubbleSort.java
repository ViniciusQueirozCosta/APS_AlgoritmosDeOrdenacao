
package Model;

import java.util.List;

public class BubbleSort {
    public List<Integer> Ordenar(List<Integer> listaNumeros) {
        int tamanho = listaNumeros.size();
        for(int i = 0; i < tamanho; i++) {
            for(int j = i + 1; j < tamanho; j++) {
                if(listaNumeros.get(i) > listaNumeros.get(j)) {
                    int auxiliar = listaNumeros.get(i);
                    listaNumeros.set(i, listaNumeros.get(j));
                    listaNumeros.set(j, auxiliar);
                }
            }
        }
        return listaNumeros;
    }
}

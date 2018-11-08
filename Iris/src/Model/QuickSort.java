package Model;

import java.util.List;

public class QuickSort
{
    public List<Integer> Ordenar(List<Integer> listaNumeros) 
    {
       quicksort(listaNumeros, 0, listaNumeros.size() - 1);
       return listaNumeros;
    }
   
   private List<Integer> quicksort(List<Integer> listaNumeros, int inicio, int fim)
   {
    
        int Pivo;
        if (inicio < fim) 
        {
            Pivo = separar(listaNumeros, inicio, fim);
            quicksort(listaNumeros, inicio, Pivo - 1);
            quicksort(listaNumeros, Pivo + 1, fim);
        }
       
       return listaNumeros;
   }
    public int separar(List<Integer> listaNumeros, int inicio, int fim)
    {
        int pivo = listaNumeros.get(fim);
        int i = inicio - 1;
        int troca;
        
        for(int j = inicio; j <= fim - 1; j++)
        {
            if(listaNumeros.get(j) <= pivo)
            {
                i++;
                troca = listaNumeros.get(i);
                listaNumeros.set(i, listaNumeros.get(j));
                listaNumeros.set(j, troca);
            }
        }
        
        troca = listaNumeros.get(fim);
        listaNumeros.set(fim , listaNumeros.get(i + 1));
        listaNumeros.set(i + 1, troca);
        
        return i+1;
    }
}


package Model;

import java.util.ArrayList;
import java.util.List;

public class CountingSort 
{
    public void Ordenar(List<Integer> listaNumeros) 
    {
        List<Integer> listaAux = new ArrayList();
        int tam = listaNumeros.size();
        int maior = valorMaximo(listaNumeros);
        
  
        for(int i = 0; i < maior + 1 ; i++)
            listaAux.add(i,0);
  
        for(int i = 0; i < tam; i++)
            listaAux.set(listaNumeros.get(i), listaAux.get(listaNumeros.get(i))+1);
  
        int j = 0;
        for(int i = 0; i <= maior; i++)
        {
            int tmp = listaAux.get(i);
            
            while(tmp-- > 0)
            {
                listaNumeros.set(j, i);
                j++;
            }
        }
    }
    
    private int valorMaximo(List<Integer> listaNumeros)
    {
        int max=0;
        
        for(int i = 0 ; i < listaNumeros.size(); i++)
            if(listaNumeros.get(i) > max)
                max = listaNumeros.get(i);
        return max;
    }

} 
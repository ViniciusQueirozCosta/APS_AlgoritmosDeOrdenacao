package Controller;

import java.util.List;
import Model.BubbleSort;
import Model.InsertionSort;
import Model.QuickSort;
import Model.CountingSort;
import Service.Utils;

public class Controle extends Utils<Object> {
    Utils<Integer> utils = new Utils<>();
    
    public double bubbleSort(List<Integer> listaNumeros) {
        BubbleSort bubble = new BubbleSort();
        
        double horaInicio = System.nanoTime();
        bubble.Ordenar(listaNumeros);
        double horaParada = System.nanoTime();

        return (horaParada - horaInicio)/1000000;
    }
    
    public double insertionSort(List<Integer> listaNumeros) {
        InsertionSort insertion = new InsertionSort();
        
        double horaInicio = System.nanoTime();
        insertion.Ordenar(listaNumeros);
        double horaParada = System.nanoTime();

        return (horaParada - horaInicio)/1000000;
    }
    
    public double quickSort(List<Integer> listaNumeros){
        QuickSort quicksort = new QuickSort();
        
        double horaInicio = System.nanoTime();
        quicksort.Ordenar(listaNumeros);
        double horaParada = System.nanoTime();

        return (horaParada - horaInicio)/1000000;
    }
    
    public double countingSort(List<Integer> listaNumeros){
        CountingSort counting = new CountingSort();
        
        double horaInicio = System.nanoTime();
        counting.Ordenar(listaNumeros);
        double horaParada = System.nanoTime();

        return (horaParada - horaInicio)/1000000;
    }
    
    public boolean isOrdenado(List<Integer> listaNumeros)
    {
        int atual=0;
        for(int i = 0; i < listaNumeros.size(); i++)
        {
            if(atual <= listaNumeros.get(i))
                atual = listaNumeros.get(i);
            else
                return false;
        }
        
        return true;
    }
    
    public boolean CriarEExportarArquivo() {
        List<Integer> listaNumeros = utils.criarListaInteger(getQuantidade(), getValorMaximo());
        
        return utils.ExportarArquivo(listaNumeros, getNome());
    }
    
    public List<Integer> CriarListaRandomica() {
        return utils.criarListaInteger(getQuantidade(), getValorMaximo());
    }
    
    public List<Integer> LerArquivoExterno() {
        return utils.lerArquivoExterno(getNome());
    }
}

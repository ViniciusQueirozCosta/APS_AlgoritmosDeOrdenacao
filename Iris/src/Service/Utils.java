package Service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Utils<T> {
    //Se nescessário, altere valores aqui
    private final String nome="listaNumeros.txt";
    private final int quantidade=100000;
    private final int valorMaximo=32000;
    
    public boolean ExportarArquivo(List<Integer> listaInteiros, String arquivo) {
        try {
            File file = new File("./" + arquivo);
            if(!file.exists())
                file.createNewFile();
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0; i < listaInteiros.size(); i++) {
                bw.write(listaInteiros.get(i).toString());
                if(i < listaInteiros.size() - 1)
                    bw.newLine();
            }
            bw.flush();
            bw.close();
            
            return true;
        } 
        catch (IOException e) {
            return false;
        }
    }
    
    public List<Integer> lerArquivoExterno(String arquivo) {
        List<Integer> listaInteiros = new ArrayList();
        try {
            FileReader file = new FileReader(arquivo);
            BufferedReader input = new BufferedReader(file);
            
            String temp = "";
            
            while((temp = input.readLine()) != null) 
                listaInteiros.add(new Integer(temp));
            
            input.close();
        } 
        catch (IOException ie) {
            System.out.println(ie);
        }
        
        return listaInteiros;
    }
    
    public List<Integer> criarListaInteger(int quantidade, int valorMaximo) {
        List<Integer> listaInteiros = new ArrayList();
        Random random = new Random();
        
        for(int i = 0; i < quantidade; i++)
            listaInteiros.add(random.nextInt(valorMaximo) + 1);
        
        return listaInteiros;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getValorMaximo() {
        return valorMaximo;
    }  
}

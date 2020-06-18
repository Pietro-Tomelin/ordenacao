//Classe principal

package Ordenacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ordenar {
	public static void main (String [] args) throws IOException{
		
		// instancia dos construtores
		PesquisaBinaria binaria = new PesquisaBinaria();
		BuscaLinear linear = new BuscaLinear();
	    
		//definição dos métodos
		String linha;
		ArrayList<String> lista = new ArrayList<String>();
		
		//informa o arquivo
		String caminho = JOptionPane.showInputDialog("Informe o caminho do arquivo:");
		
		//lê o arquivo
		
		try { 
		FileReader ler = new FileReader(caminho);
		BufferedReader reader = new BufferedReader(ler);
		
        while( (linha = reader.readLine()) != null ){//se encontrar o arquivo joga no arraylist string
	                lista.add(linha);
        }
            
	    // arraylist string para long
	    ArrayList<Long> listaInt = new ArrayList<Long>(lista.size()) ;
	    for (String myInt : lista) {
	    listaInt.add(Long.valueOf(myInt));
	    }
	        
	    //joption pane para escolhas de métodos
		Object [] opcoesMetodos = {"Quick Sort","Insertion Sort","Merge Sort"};
		int escolhaMetodo =  JOptionPane.showOptionDialog( null , "Opções" , "Escolha um método de ordenaão!" ,
		JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE , null , opcoesMetodos , opcoesMetodos );
		
		//case para impressão das ordenações
		switch(escolhaMetodo){
		case 0:
			long tempoInicial = System.currentTimeMillis();//temporizador inicial
			
			QuickSort quick = new QuickSort(listaInt);//construtor quick sort
	        quick.startQuickStart(0, listaInt.size()-1);//chama o metodo
	     
	     	
	        for(Long i:quick.getSortedArray()){
	            System.out.println(i);//imprime array ordenado
	        }
	        
	        long tempoFinal = System.currentTimeMillis();//temporizador final
	        
	        long tempo = tempoFinal - tempoInicial;//calculo tempo execução
	        JOptionPane.showMessageDialog(null, "Tempo de execução: "+tempo+"ms");//imprime tempo execução
	        		
		break;
		case 1:
			tempoInicial = System.currentTimeMillis();
			
			InsertionSort insertion = new InsertionSort();//construtor do metodo insertion
			insertion.sort(listaInt);// chama o metodo para ordenar
			InsertionSort print = new InsertionSort();// construtor para imprimir
			print.printArray(listaInt);// imprime o array ordenado
			
			tempoFinal = System.currentTimeMillis();
			
			tempo = tempoFinal - tempoInicial;
			JOptionPane.showMessageDialog(null, "Tempo de execução: "+tempo+"ms");
			break;
			
		case 2: 
			tempoInicial = System.currentTimeMillis();//temporizador inicial
			
			MergeSort merge = new MergeSort(listaInt);//construtor merge sort
	        merge.sortGivenArray();//chama o metodo
	        
	        for(long i:merge.getSortedArray()){
	            System.out.println(i);//imprime array ordenado
	        }
	        
	        tempoFinal = System.currentTimeMillis();//temporizador final
	        
	         tempo = tempoFinal- tempoInicial;//calculo tempo execução
	        JOptionPane.showMessageDialog(null, "Tempo de execução: "+tempo+"ms");//imprime tempo execução
			break;
			
		}
		
		//busca binária e linear
		Object [] opcoesPesquisa = {"Pesquisa Binária","Busca Linear"};
		int escolhaPesquisa =  JOptionPane.showOptionDialog( null , "Opções" , "Escolha um método de pesquisa!" ,
		JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE , null , opcoesPesquisa , opcoesPesquisa );
		
		switch(escolhaPesquisa) {
			case 0:
				
				//entrada para buscar valor no array
				long busca = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o valor que deseja buscar:"));
				
				//entrada para buscar valor no array
				binaria.retorno(listaInt, busca);
	
			break;
			case 1:
				
				//entrada para buscar valor no array
				busca = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o valor que deseja buscar:"));
				
				//entrada para buscar valor no array
				linear.retornoLinear(listaInt, busca);
				
			break;
		}
		
		//excessões caso houver erros
		} catch (java.io.FileNotFoundException exception) {
		       JOptionPane.showMessageDialog(null, "Não foi possível ler o arquivo!");
		}
		
		catch (java.lang.NullPointerException exception) {
		}
		
		catch (java.lang.NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Insira apenas números!");
		}
	}
}





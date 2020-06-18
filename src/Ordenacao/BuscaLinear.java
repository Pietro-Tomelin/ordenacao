//clase para busca de elemento pelo método linear
package Ordenacao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BuscaLinear{
	public int linear(ArrayList<Long> listaInt, long x) {
		
		int i=0;
		int indice = 0;
		
		while(i<listaInt.size()){
			i++;
			if(listaInt.get(i-1) != x){
				indice=i;
			}
			else {
				
				break;
			}
		}
		return indice;
	}
	
	public void retornoLinear(ArrayList<Long> listaInt, long busca){
		int i = linear(listaInt, busca);
		
		if(i == listaInt.size()){
			JOptionPane.showMessageDialog(null, "Valor não encontrado!");
		}
		else{
			JOptionPane.showMessageDialog(null, "O elemento "+busca+" foi encontrado na "+(i+1)+"ª linha do arquivo.");
		}
	}
}
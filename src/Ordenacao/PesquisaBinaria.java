//Classe para pesquisar o elemento dentro do array

package Ordenacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PesquisaBinaria extends ImportaArquivo {

	public int binaria(ArrayList<Long> listaEscrita, long x) {
		int meio;
		int inicio, fim;
		inicio = 0;
		fim = listaEscrita.size() - 1;

		while (inicio <= fim) {

			meio = (inicio + fim) / 2;

			if (listaEscrita.get(meio) == x) {
				return meio;
			} else if (listaEscrita.get(meio) < x) {
				inicio = meio + 1;

			} else if (listaEscrita.get(meio) > x) {
				fim = meio - 1;
			}
		}

		return 0;
	}

	public void retorno(ArrayList<Long> listaEscrita, long x) {

		long indice = binaria(listaEscrita, x);
		
		if(indice == 0){
			JOptionPane.showMessageDialog(null, "Valor não encontrado!");
		}
		else{
			JOptionPane.showMessageDialog(null, "O valor de número "+x+" foi encontrado na " + (indice + 1)+"ª linha do arquivo.");
		}
	}
}

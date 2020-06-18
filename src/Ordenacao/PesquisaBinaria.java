//Classe para pesquisar o elemento dentro do array

package Ordenacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PesquisaBinaria {

	public int binaria(ArrayList<Long> listaInt, long x) {
		int meio;
		int inicio, fim;
		inicio = 0;
		fim = listaInt.size() - 1;

		while (inicio <= fim) {

			meio = (inicio + fim) / 2;

			if (listaInt.get(meio) == x) {
				return meio;
			} else if (listaInt.get(meio) < x) {
				inicio = meio + 1;

			} else if (listaInt.get(meio) > x) {
				fim = meio - 1;
			}
		}

		return 0;
	}

	public void retorno(ArrayList<Long> listaInt, long x) {

		long indice = binaria(listaInt, x);
		
		if(indice == 0){
			JOptionPane.showMessageDialog(null, "Valor não encontrado!");
		}
		else{
			JOptionPane.showMessageDialog(null, "O valor de número "+x+" foi encontrado na " + (indice + 1)+"ª linha do arquivo.");
		}
	}
}

//importação do arquivo
package Ordenacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ImportaArquivo {

	ArrayList<String> lista = new ArrayList<String>();
	
	// arraylist string para long
	ArrayList<Long> listaInt = new ArrayList<Long>(lista.size());
	
	//arraylist ordenado
	ArrayList<Long> listaEscrita = new ArrayList<Long>(lista.size());

	public void impArquivo(String caminho) throws IOException {
		
		// leitura arquivo

		// instancia da classe Pesquisar Elemento
		PesquisaBinaria pesquisar = new PesquisaBinaria();

		FileReader ler = new FileReader(caminho);

		BufferedReader reader = new BufferedReader(ler);

		String linha;
		
		while((linha=reader.readLine())!=null)
		{
			lista.add(linha);
		}

		for(
		String myInt:lista)
		{

			listaInt.add(Long.valueOf(myInt));// alteraçao pra long//

		}
	}

	public ArrayList<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}

	public ArrayList<Long> getListaInt() {
		return listaInt;
	}

	public void setListaInt(ArrayList<Long> listaInt) {
		this.listaInt = listaInt;
	}
	
	public ArrayList<Long> getListaEscrita() {
		return listaEscrita;
	}

	public void setListaEscrita(ArrayList<Long> listaEscrita) {
		this.listaEscrita = listaEscrita;
	}
	
	//metodos getter and setters
	
}


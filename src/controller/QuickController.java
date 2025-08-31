package controller;

import br.gui.ordenacao.OrdenacaoQuick;

public class QuickController {
	
	public QuickController() {
		super();
	}
	
	public void quick(int[] vetor, int inicio, int fim) {
		OrdenacaoQuick sort = new OrdenacaoQuick();
		sort.quickSort(vetor, inicio, fim);
		
		for (int i : vetor) {
			System.out.print(i + " ");
			}
		System.out.println("\n");
	}
}

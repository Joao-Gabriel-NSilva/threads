package br.com.alura.lista;

public class TarefaImprime implements Runnable {

	private Lista lista;

	public TarefaImprime(Lista lista) {
		this.lista = lista;
	}

	@Override
	public void run() {
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}
		
		synchronized (lista) {
			if(!lista.estaCheia()) {
				try {
					System.out.println("indo dormir, esperando notificacao");
					lista.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();	
				}				
			}
			
			for (int i = 0; i < lista.tamanho(); i++) {
				System.out.println(i + " - " + lista.pegaElemento(i));
			}			
		}
	}

}

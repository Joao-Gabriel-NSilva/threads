package br.com.alura.threads;

public class RespostaMain {

	public static void main(String[] args) {

		Runnable tarefa = new ImprimeString("bla bla bla");
		Thread thread = new Thread(tarefa);
		thread.start();
	}

}

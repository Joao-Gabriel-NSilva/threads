package br.com.alura.threads;

public class ImprimeString implements Runnable{
	
	private String msg;

	public ImprimeString(String msg) {
		this.msg = msg;
	}


	@Override
	public void run() {

		System.out.println(msg);
	}

}

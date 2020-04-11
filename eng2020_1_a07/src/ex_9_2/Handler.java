package ex_9_2;

public class Handler {
	private Handler handler;
	private String nome;
	private long temporizador;
		
	public Handler(String nome) {
		super();
		this.nome = nome;
	}
	
	public void processa() {
		long tempo = System.currentTimeMillis();
		long tt = tempo - this.temporizador;
		
		if (tt < 20) { //200 milissegundos foram alterados para 20 milissegundos.
			System.out.println("Handler "+nome+" ocupado. Requisicao sera enviada para o Handler "+this.handler.getNome());
			this.handler.processa();
		}else if (this.handler != null) {
			this.temporizador = tempo;
			System.out.println("Handler "+nome+" processou.");
		} else System.out.println("Todos os handlers estao ocupados");
	};
	
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	public String getNome() {
		return nome;
	}




	
	
	
}

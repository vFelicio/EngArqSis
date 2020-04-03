package ex_5_1;

public class IOFacade {

	LerArquivoTexto txt = new LerArquivoTexto();
	LerArquivoBinario bn = new LerArquivoBinario();
	LerArquivoObjeto obj = new LerArquivoObjeto();
	String stxt = "";
	String sbn = "";
	String sobj = "";
	
	
	
public void lerTxt() {
	//le o aluno.txt
	stxt = txt.lerArquivoTxt();
	System.out.println(stxt+"\n");
}
public void lerBinario() {
	//le o Aluno.class (devolve os bytes)
	sbn = bn.lerArquivoBinario();
	System.out.println(sbn+"\n");
}
public void lerObjeto() {
	//le o aluno (objeto)
	sobj = obj.lerArquivoObjeto();
	System.out.println(sobj+"\n");
}
	
}

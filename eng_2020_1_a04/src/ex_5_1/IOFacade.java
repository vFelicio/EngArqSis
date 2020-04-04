package ex_5_1;

public class IOFacade {	
public void lerTxt() {
	//le o aluno.txt
	LerArquivoTexto txt = new LerArquivoTexto();
	String stxt = "";
	stxt = txt.lerArquivoTxt();
	System.out.println(stxt+"\n");
}
public void lerBinario() {
	//le o Aluno.class (devolve os bytes)
	LerArquivoBinario bn = new LerArquivoBinario();
	String sbn = "";
	sbn = bn.lerArquivoBinario();
	System.out.println(sbn+"\n");
}
public void lerObjeto() {
	//le o aluno (objeto)
	LerArquivoObjeto obj = new LerArquivoObjeto();
	String sobj = "";
	sobj = obj.lerArquivoObjeto();
	System.out.println(sobj+"\n");
}
	
}

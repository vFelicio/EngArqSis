package ex_7_1;

public class ManipuladorTest {

	public static void main(String[] args) {
		
		ManipuladorAbstrato manipulador;

		System.out.println("Transforma em maiusculo:\n");
		manipulador = new ManipuladorMaiusculo();
		manipulador.manipularString();

		System.out.println("Transforma em minusculo:\n");
		manipulador = new ManipuladorMinusculo();
		manipulador.manipularString();

		System.out.println("Duplica:\n");
		manipulador = new ManipuladorDuplica();
		manipulador.manipularString();

		System.out.println("Inverte:\n");
		manipulador = new ManipuladorInverte();
		manipulador.manipularString();

	}

}

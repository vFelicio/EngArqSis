package ex_9_2;

public class HandlerTest {

	public static void main(String[] args) {
		
		Handler h1 = new Handler("1");
		Handler h2 = new Handler("2");
		Handler h3 = new Handler("3");
		Handler h4 = new Handler("4");
		Handler h5 = new Handler("5");
		Handler h6 = new Handler("6");
		Handler h7 = new Handler("7");
		Handler h8 = new Handler("8");
		Handler h9 = new Handler("9");
		Handler h10 = new Handler("10");
		Handler h11 = new Handler("11");
		Handler h12 = new Handler("12");
		Handler h13 = new Handler("13");
		Handler h14 = new Handler("14");
		Handler h15 = new Handler("15");
		
		h1.setHandler(h2);
		h2.setHandler(h3);
		h3.setHandler(h4);
		h4.setHandler(h5);
		h5.setHandler(h6);
		h6.setHandler(h7);
		h7.setHandler(h8);
		h8.setHandler(h9);
		h9.setHandler(h10);
		h10.setHandler(h11);
		h11.setHandler(h12);
		h12.setHandler(h13);
		h13.setHandler(h14);
		h14.setHandler(h15);
		
		for(int i = 0; i < 100; i++)
		h1.processa();
		
	}

}

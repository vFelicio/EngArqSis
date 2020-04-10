package ex_8_2;

import ex_8_1.subject.FonteNoticias;
import ex_8_1.subject.Noticia;

public class TesteAgrPub {

	public static void main(String[] args) {
		
FonteNoticias fonte = new FonteNoticias();
		
		Agregadores obs1 = new Agregadores(fonte, "Desimpedidos", "futebol");	
		obs1.assina();
        Publicadores obs2 = new Publicadores(fonte, "G1");
        obs2.assina();
		
		Noticia noticia = new Noticia();
		noticia.setTexto(" Historia do Brasil pentacampeao");
		noticia.setDia(2);
		noticia.setMes(4);
		noticia.setTopico("futebol");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Historia do Brasil tetracampeao");
		noticia.setDia(3);
		noticia.setMes(4);
		noticia.setTopico("futebol");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Historia do Brasil tricampeao");
		noticia.setDia(4);
		noticia.setMes(4);
		noticia.setTopico("futebol");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Historia do Brasil bicampeao");
		noticia.setDia(5);
		noticia.setMes(4);
		noticia.setTopico("futebol");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Historia do Brasil campeao");
		noticia.setDia(6);
		noticia.setMes(4);
		noticia.setTopico("futebol");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Historia do 7 a 1 ");
		noticia.setDia(7);
		noticia.setMes(4);
		noticia.setTopico("futebol");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Brasil chega a 16000 casos ");
		noticia.setDia(7);
		noticia.setMes(4);
		noticia.setTopico("coronavirus");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Historia do Santos de Pele");
		noticia.setDia(8);
		noticia.setMes(4);
		noticia.setTopico("futebol");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Historia do Sao Paulo de Tele");
		noticia.setDia(9);
		noticia.setMes(4);
		noticia.setTopico("futebol");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Historia da premier league");
		noticia.setDia(10);
		noticia.setMes(4);
		noticia.setTopico("futebol");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Receita de massa de pizza italiana ");
		noticia.setDia(11);
		noticia.setMes(4);
		noticia.setTopico("comida");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Quiz sobre futebol ");
		noticia.setDia(12);
		noticia.setMes(4);
		noticia.setTopico("futebol");
		fonte.setNoticia(noticia);
		
		noticia.setTexto(" Brasil chega a 23000 casos ");
		noticia.setDia(1);
		noticia.setMes(5);
		noticia.setTopico("coronavirus");
		fonte.setNoticia(noticia);
		
		

	}

}

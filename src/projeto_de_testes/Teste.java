package projeto_de_testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teste {
	public static void main(String[] args) throws ParseException{
//		TESTANDO SUBSTRING EM JAVA
//		
//		String phone = "Sucesso :: CustomerOrderManagement#109501682 :: BA_ONLINE_EDITION";		
//		System.out.println(phone.substring(0,34));
		
//		//TESTANDO SE EXISTE DETERMINADA STRING EM UM VETOR DE STRING
//		String[] nomes = {"joao", "maria", "jose"};
//		List<String> nomess = Arrays.asList(nomes);
//		
//		if (nomess.contains("joao")) {
//			System.out.println("foi");
//		} else {
//			System.out.println("não foi");
//		}
		
//		String teste = "TDM", teste2 = "Tdm";
//		if (teste.toUpperCase().contains(teste2.toUpperCase())) {
//			System.out.println("Sim");
//		} else {
//			System.out.println("Não");
//		}
		
		//COLOCANDO STRING DENTRO DE STRING
		//System.out.println("O campo \"asdasdsadasd\" não pode ser vazio.");

//		String strDate = "2019/01/31";
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			 dateFormat.setLenient(false);
//			 dateFormat.parse(strDate);
//		 } catch (ParseException e) {
//			 System.out.println("Data inválida");
//		 }
		
//		//Testando variável genérica, ou seja, sem tipo
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		Date dataHr = dateFormat.parse("2019-01-01 00:00:00");
//		Object o = dataHr;
//		boolean b = ((o != null) && (!o.toString().isEmpty()));
//		System.out.println(b);
		
//		//Pegar CHAR dentro de uma STRING
//		String palavra = "Vitor";
//		for (int i = 0; i < palavra.length(); i++) {
//			//System.out.println(palavra.substring(i, i + 1));
//			System.out.println(palavra.charAt(i));
//		}
		
		//Validando CARACTERES ESPECIAIS
		String caracteresValidos = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_123456789";		
		String palavra = "Vitorï";
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(caracteresValidos.contains(String.valueOf(palavra.charAt(i))));
		}
			
	}
}

package projeto_de_testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

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
//			System.out.println("nï¿½o foi");
//		}
		
//		String teste = "TDM", teste2 = "Tdm";
//		if (teste.toUpperCase().contains(teste2.toUpperCase())) {
//			System.out.println("Sim");
//		} else {
//			System.out.println("Nï¿½o");
//		}
		
		//COLOCANDO STRING DENTRO DE STRING
		//System.out.println("O campo \"asdasdsadasd\" nï¿½o pode ser vazio.");

//		String strDate = "2019/01/31";
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			 dateFormat.setLenient(false);
//			 dateFormat.parse(strDate);
//		 } catch (ParseException e) {
//			 System.out.println("Data invï¿½lida");
//		 }
		
//		//Testando variï¿½vel genï¿½rica, ou seja, sem tipo
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
		
//		//Validando CARACTERES ESPECIAIS
//		String caracteresValidos = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_0123456789";		
//		String palavra = "Vitorï¿½";
//		for (int i = 0; i < palavra.length(); i++) {
//			System.out.println(caracteresValidos.contains(String.valueOf(palavra.charAt(i))));
//		}

//		//Mï¿½todo para criaï¿½ï¿½o de String aleatï¿½ria
//		UUID uuid = UUID.randomUUID();
//		String stringRandom = uuid.toString(); 
//		System.out.println(stringRandom);
		
//		//Mï¿½todo para criaï¿½ï¿½o de String aleatï¿½ria 2
//	    byte[] array = new byte[6]; // length is bounded by 7
//	    new Random().nextBytes(array);
//	    String generatedString = new String(array, Charset.forName("UTF-8"));
//		System.out.println(generatedString);
		
//		Random random = new Random();
//		String codConfirm = "";
//		for (int i = 0; i< 6; i++) {
//			codConfirm += String.valueOf((random.nextInt(9))); 
//		}
//		
//		System.out.println(codConfirm);

//		//Gerar String aleatï¿½ria entre Letras e Nï¿½meros somente
//		final char[] ALL_CHARS = new char[62];
//		final Random RANDOM = new Random();
//
//		for (int i = 48, j = 0; i < 127; i++) {
//			if (Character.isLetterOrDigit(i)) {
//				ALL_CHARS[j] = (char) i;
//				j++;
//			}
//		}
//
//		final char[] result = new char[tamanho];
//		for (int i = 0; i < tamanho; i++) {
//			result[i] = ALL_CHARS[RANDOM.nextInt(ALL_CHARS.length)];
//		}

//		//Gerar String aleatï¿½ria com todas as Strings incluindo Caracteres especiais
//		int tamanho = 8;
//		final char[] ALL_CHARS = new char[94];
//		final Random RANDOM = new Random();
//
//		for (int i = 33, j = 0; i < 127; i++, j++) {
//			ALL_CHARS[j] = (char) i;
//		}
//
//		final char[] result = new char[tamanho];
//		for (int i = 0; i < tamanho; i++) {
//			result[i] = ALL_CHARS[RANDOM.nextInt(ALL_CHARS.length)];
//		}
//		
//		System.out.println(String.valueOf(result));
		
//		Date dataInicial, dataFinal;
//		SimpleDateFormat dateFormatDtHr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SimpleDateFormat dateFormatInt = new SimpleDateFormat("HHmmss");
//		
//		
//		dataInicial = dateFormatDtHr.parse("2020-01-21 20:00:00");
//		dataFinal = dateFormatDtHr.parse("2020-01-21 20:21:00");
//		
//		int dataInicialInt = Integer.valueOf(dateFormatInt.format(dataInicial));
//		int dataFinalInt = Integer.valueOf(dateFormatInt.format(dataFinal));
//		
//		System.out.println(dataInicialInt);
//		System.out.println(dataFinalInt);
//		System.out.println((dataFinalInt - dataInicialInt));
//		System.out.println((dataFinalInt - dataInicialInt) > 2000);
		
		
//		//CALCULAR DIFERENÇA ENTRE DUAS DATAS
//		Date dataInicial, dataFinal;
//		SimpleDateFormat dateFormatDtHr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SimpleDateFormat dateFormatInt = new SimpleDateFormat("HHmmss");
//		
//		dataInicial = dateFormatDtHr.parse("2020-01-21 20:00:00");
//		dataFinal = dateFormatDtHr.parse("2020-01-21 20:00:00");
//		
//		LocalDateTime ldtI = dataInicial.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
//		LocalDateTime ldtF = dataFinal.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
//		System.out.println(ldtI.until(ldtF, ChronoUnit.MINUTES)); 
		
		SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(TimeZone.getDefault());
		isoFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println(TimeZone.getDefault());
		System.out.println(isoFormat.format(new Date()));
		
//		//ENVIANDO HTML COMO E-MAIL
//		private boolean enviarEmailHtml(String titulo, String texto, String emailDestino) {
//			// Sender's email ID needs to be mentioned
//			String from = "sullyapplication@gmail.com";
//			final String username = "sullyapplication@gmail.com";//change accordingly
//			final String password = "cvplrwbfkptsbcap";//change accordingly
//			Properties props = new Properties();
//			props.put("mail.host", "smtp.gmail.com");
//			props.put("mail.port", "587");
//			props.put("mail.smtp.auth", "true");
//			props.put("mail.smtp.starttls.enable", "true");
//			
//			// Get the Session object.
//			Session session = Session.getInstance(props,
//					new javax.mail.Authenticator() {
//				protected PasswordAuthentication getPasswordAuthentication() {
//					return new PasswordAuthentication(username, password);
//				}
//			});
//			
//			try {
//				// Create a default MimeMessage object.
//				Message message = new MimeMessage(session);
//				// Set From: header field of the header.
//				message.setFrom(new InternetAddress(from));
//				// Set To: header field of the header.
//				message.setRecipients(Message.RecipientType.TO,
//						InternetAddress.parse(emailDestino));
//				// Set Subject: header field
//				message.setSubject(titulo);
//				// Send the actual HTML message, as big as you like
//				message.setContent(
//						"<h1><b><center>Teste de envio de HTML</center></b></h1>",
//						"text/html");
//				// Send message
//				Transport.send(message);
//				log.info("Sent message successfully....");
//				return true;
//			} catch (Exception e) {
//				log.info("Sent message failed....");
//				System.out.println(e);
//				return false;
//			}
//		}
	}
}

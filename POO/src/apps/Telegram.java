package apps;

public class Telegram extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando menssagem pelo Telegram Menssager");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Telegram menssagem pelo Telegram Menssager");
		
	}
	

}

package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando menssagem pelo Facebook Menssager");
		
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo menssagem pelo Facebook Menssager");
		
	}

}

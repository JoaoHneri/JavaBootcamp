package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando menssagem pelo MSN Menssager");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo menssagem pelo MSN Menssager");
		
	}

}
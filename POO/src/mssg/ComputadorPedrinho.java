package mssg;

import java.util.Scanner;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		ServicoMensagemInstantanea smi = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o serviço que utilizará para mandar uma mss \n fcb - para facebook \n msn - para MSN \n tel - para telegram \n");
		String servico = sc.nextLine();
		sc.close();
		
		if(servico.equals("msn")) {
			smi = new MSNMessenger();
		}else if(servico.equals("fcb")) {
			smi = new FacebookMessenger();
		}else if(servico.equals("tel")) {
			smi = new Telegram();
		}else {
			System.out.println("Digite um serviço válido");
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
	
}
package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // System.out.println("Processo Seletivo");
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);
        // selecaoCandidatos();
        // imprimirSelecionados();
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
        do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);
        if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
    }

    public static boolean atender() {
		return new Random().nextInt(3)==1;	
	}   

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"}; 

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de numero " + (indice+1) + " é " + candidatos[indice]);
        }

    }



    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
   }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o Candidato com contra proposta");
        } else {
            System.out.println("Aguardando o Resultado dos demais candidatos");
        }
    }

        static void selecaoCandidatos(){
// Array com a lista de candidatos

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"}; 
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato +" Solicitou este valor de salario " + salarioPretendido );
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga " );
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
}
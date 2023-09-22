package one.digitalinnovation;
import java.util.logging.Logger;

public class BancoDeDados {
    
    private static final Logger LOGGER= Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao(){
        LOGGER.info("finalizou conexao");
    }

        public static void insereDados(){
        LOGGER.info("inseriu dados");
    }
        public static void removeDados(){
        LOGGER.info("removeu Dados");
    }
}

package one.digitalinnovation;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class dbTeste {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
        System.out.println("iniciou conexao");
    }
    @BeforeEach
    void insereDados(){
        BancoDeDados.insereDados();
        System.out.println("dados inseridos");
    }
    @AfterEach
     void removeDadosConexao(){
        BancoDeDados.removeDados();
        System.out.println("dados removidos");
    }
    @Test
    void validarDados()
    {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDados2()
    {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        System.out.println("conexao finalizada");
    }
}

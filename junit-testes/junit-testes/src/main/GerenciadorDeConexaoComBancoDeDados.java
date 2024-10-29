package main;

import java.util.logging.Logger;

public class GerenciadorDeConexaoComBancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoComBancoDeDados.class.getName());

    public static void iniciarConexao() {

        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao() {

        LOGGER.info("finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa) {

        LOGGER.info("inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {

        LOGGER.info("removeu dados");
    }
}

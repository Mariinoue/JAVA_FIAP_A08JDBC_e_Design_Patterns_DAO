package br.com.fiap.main;

import br.com.fiap.dao.CarroDao;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

import java.sql.Connection;

public class TesteDelete {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        Carro carro = new Carro();

        carro.setPlaca("eeeeeee");

        CarroDao carroDao = new CarroDao(con);
        System.out.println(carroDao.excluir(carro));
        ConnectionFactory.fecharConexao(con);
    }
}

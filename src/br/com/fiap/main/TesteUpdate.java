package br.com.fiap.main;

import br.com.fiap.dao.CarroDao;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

import java.sql.Connection;

public class TesteUpdate {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        Carro carro = new Carro();
        CarroDao carroDao = new CarroDao(con);
        carro.setPlaca("PPP123");
        carro.setCor("pink");
        carro.setDescricao("Fiesta");

        System.out.println(carroDao.alterar(carro));
        ConnectionFactory.fecharConexao(con);
    }
}

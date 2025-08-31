package br.com.fiap.main;

import br.com.fiap.dao.CarroDao;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

import java.sql.Connection;

public class TesteCreate {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();
        Carro carro = new Carro();
        CarroDao carroDao = new CarroDao(con);
        carro.setPlaca("eeeeeee");
        carro.setCor("branco");
        carro.setDescricao("Jimmy 4x4");
        System.out.println(carroDao.inserir(carro));
        ConnectionFactory.fecharConexao(con);
    }
}

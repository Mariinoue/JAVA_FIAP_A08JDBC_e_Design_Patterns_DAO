package br.com.fiap.main;

import br.com.fiap.dao.CarroDao;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

import java.sql.Connection;
import java.util.ArrayList;

public class TesteRead {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();

        CarroDao carroDao = new CarroDao(con);

        ArrayList<Carro> resultado = carroDao.listarTodos();

        if(resultado != null){
           for (Carro carro : resultado) {
               System.out.printf("Placa: %s \nCon: %s \nDescrição: \n", carro.getPlaca(), carro.getDescricao());
           }
        }
        ConnectionFactory.fecharConexao(con);
    }
}

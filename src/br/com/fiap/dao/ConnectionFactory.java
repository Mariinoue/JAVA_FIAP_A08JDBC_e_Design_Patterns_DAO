package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection abrirConexao()  {
        Connection con = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            final String USER = "user_name";
            final String PASS = "user_password";
            con = DriverManager.getConnection(url,USER,PASS);
            System.out.println("Conexão aberta!");
        }catch(ClassNotFoundException e){
            System.out.println("Erro: A classe de conexão não foi encontrada! \n" + e.getMessage());

        }catch (SQLException e){
            System.out.println("Erro de SQL! \n" + e.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+ e.getMessage());
        }
        return con;
    }
}

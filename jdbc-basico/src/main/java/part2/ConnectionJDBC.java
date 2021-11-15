package part2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionJDBC {

    public static void main(String[] args) {


        // 1 - NÃO ESQUECER DE BAIXAR O DRIVER PARA O BANCO DE DADOS QUE IRÁ UTILIZAR! (Como demonstrado na parte 1 do curso)

        // 2 - Definir parâmetros para se conectar ao banco de dados MySQL.

        String urlConnection = "jdbc:mysql://localhost/dio_me";

        try (Connection conn = DriverManager.getConnection(urlConnection, "root", "")) {
            System.out.println("Sucesso");
        } catch (Exception e) {
            System.out.println("Falha");
        }
    }
}

/*
    String driver = "mysql";
    String dataBaseAddress = "localhost";
    String dataBaseName = "digital_innovation_one";
    String user = "root";
    String password = "password";

    // 3 - Construção da string de conexão.
    StringBuilder sb = new StringBuilder("jdbc:")
            .append(driver).append("://")
            .append(dataBaseAddress).append("/")
            .append(dataBaseName);

    String connectionUrl = sb.toString(); //sb.toString() == "jdbc:mysql://localhost/digital_innovation_one"

//Carregar a classe específica de implementação do driver na memória da JVM. (A partir da versão JDBC 4 não é mais necessário!!!)
//Class.forName("com.mysql.jdbc.Driver");

// 4 - Criar conexão usando o DriverManager, passando como parâmetros a string de conexão, usuário e senha do usuário.
        try (Connection conn = DriverManager.getConnection(connectionUrl, user, password)) {
                System.out.println("SUCESSO ao se conectar ao banco MySQL!");
                } catch (SQLException e) {
                System.out.println("FALHA ao se conectar ao banco MySQL!");
                e.printStackTrace();
                }
*/


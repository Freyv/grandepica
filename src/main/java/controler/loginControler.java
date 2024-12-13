package controler;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Conection_db;
import model.Usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author devmat
 */
public class loginControler {
     public Usuario authenticate(String user, String senha) {
        String query = "SELECT * FROM usuario WHERE email = ? AND senha = ?";
        try (Connection connection = Conection_db.getConection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, user);
            preparedStatement.setString(2, senha);

try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if(resultSet.next()){
                
                // captura do banco de dados os dados do usuário
                int id = resultSet.getInt("id_usuario");
                String nome = resultSet.getString("nome");
                String senhausuario = resultSet.getString("senha");
                String emailusuario = resultSet.getString("email");
                String cpf = resultSet.getString("cpf");
                Date data = resultSet.getDate("data_nascimento");
                // mandando um usuário para a tela de login
                return new Usuario(id, emailusuario, senhausuario,  cpf, 
                        nome, data);
                }// fim do if
                
            }
        } catch (SQLException e) {
            System.err.println("Erro ao autenticar o usuário: " + e.getMessage());
            return null;
        }
    return null;
     }
}

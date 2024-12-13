/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author jhessikkaelly
 */
public class Usuario {
    private int id;
    private String email;
    private String senha;
    private String cpf;
    private String nome;
    private Date dataNascimento;
    
    // Usuario objusuario = new Usuario();
    // Usuario objusuario2 = new Usuario(nome,cpf,data);
    
    // criando construtor
    Usuario(String nome, String email, String senha,
            String cpf, Date data_nascimento){
        this.nome = nome;
        this.email=email;
      
        this.senha = senha;
        this.dataNascimento=data_nascimento;
        
    }// final construtor
    
    // segundo construtor com o id

    public Usuario(int id, String email, String senha, String cpf, String nome, Date dataNascimento) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    
    // cosntrutor sem parametros
    Usuario(){
        
    }
    
    
    
    // getter captura o que tem dentro da variavel
    public int getId() {
        return id;
    }
   // setter ele manda algo para dentro da variavel
    public void setId(int id) {
        this.id = id; // this. referencia variavel local
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
}

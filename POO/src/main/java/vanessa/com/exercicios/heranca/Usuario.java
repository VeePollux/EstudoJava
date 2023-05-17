/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanessa.com.exercicios.heranca;

/**
 *
 * @author aldri
 */
public abstract class Usuario {
    private String nome;
    private String email;
    private int senha;

    public Usuario(String nome, String email, int senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    
    public String login(String email, int senha){
        if((email.equals(this.email)) && (senha == this.senha))
            return ("Usuário " + this.nome + " logado!");
        return ("Usuário "+ this.nome + " não foi logado!");
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
}

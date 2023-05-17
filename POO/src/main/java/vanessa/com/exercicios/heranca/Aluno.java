/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanessa.com.exercicios.heranca;

/**
 *
 * @author aldri
 */
public class Aluno extends Usuario{
    private int matricula;
    private int ingresso;

    public Aluno( String nome, String email, int senha ,int matricula, int ingresso) {
        super(nome, email, senha);
        this.matricula = matricula;
        this.ingresso = ingresso;

    }

   //public double coeficiente()
    
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIngresso() {
        return ingresso;
    }

    public void setIngresso(int ingresso) {
        this.ingresso = ingresso;
    }
    
}

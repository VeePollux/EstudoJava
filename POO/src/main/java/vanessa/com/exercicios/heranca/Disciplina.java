/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanessa.com.exercicios.heranca;

/**
 *
 * @author aldri
 */
public class Disciplina {
    private String titulo;
    private final Turma[] turmas;
    private int prox_turma,ind_array;

    public Disciplina(String titulo) {
        this.titulo = titulo;
        prox_turma = 1;
        turmas = new Turma[20];
    }
    
    public Turma addTurma(){
        Turma t;
        if (this.prox_turma == 20) {
            t = null;
        } else {
            t = new Turma();
            this.prox_turma++;
            this.turmas[this.ind_array++] = t; }
        return t;}
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}

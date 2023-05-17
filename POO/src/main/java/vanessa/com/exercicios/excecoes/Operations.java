/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanessa.com.exercicios.excecoes;

/**
 *
 * @author aldri
 */
public class Operations {
    
    public double soma(double sum, double value){
        if((sum + value) > 100)
            throw new sum100Exception("Erro: Soma maior que 100.");
        else 
            return sum + value;
    }
    
}

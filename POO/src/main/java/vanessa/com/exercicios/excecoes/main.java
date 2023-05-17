/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanessa.com.exercicios.excecoes;
import java.util.Scanner;

/**2) Crie um programa que receba n números e some esses números.
 *Enquanto a soma dos números for inferior a 100 receba novos números.
 *O programa deverá imprimir o valor somado (antes de atingir a soma maior que  100)
 *O programa deverá imprimir quantos  números  foram  somados.
 *O programa deverá imprimir qual  a  média dos números digitados. 
 *a.Utilize os tratamentos de exceção para lidar com a entrada de dados.                  
 *b.Quando a soma for superior a 100, o programa deverá gerar uma exceção criada pelo  programador  com  nome ExcecaoAcimaDeCem.
 *c.Lance essa exceção, com o uso de throws
 *
 * @author aldri
 */
public class main {
    public static void main(String[] args){
    Operations op = new Operations();
    Scanner scan = new Scanner(System.in);
    double n1, n2, sum=0;
    
    System.out.println("Digite a quantidade de números para somar: ");
    n1 = scan.nextInt();
    try{
        for(int i = 1; i <= n1; i++){
            System.out.println("Digite o valor " + i +":");
            n2 = scan.nextInt();
            sum = op.soma(sum, n2);
        }
    }catch(sum100Exception e){
        System.out.println(e.getMessage());
    }finally{
        System.out.println("Soma total: " + sum);}
    }
}

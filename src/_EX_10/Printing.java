/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :  Printing
 * @author       :  Emiliano Costa
 * @date         :  9 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :  Java como programar, Deitel, 10º edição                                                             
 * Capitulo      :  5 Instruções de controle: parte 2; operadores lógicos
 * Exercício 5.10:  Printing.java
 * ___________________________________________________________________________________________________________________
 * Descrição     :  O que o seguinte programa faz?
 *                                                                                                                    
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_10;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Printing 
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
{

    public static void inicia()
    {
    System.out.println("Exercicio 10 - Printing");
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print("@");
            }
            System.out.println("");
        }
    }
    
}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

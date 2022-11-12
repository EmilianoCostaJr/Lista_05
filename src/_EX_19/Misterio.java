/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :   Misterio
 * @author       :   Emiliano Costa
 * @date         :   7 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :   Java como programar, Deitel, 10º edição
 * Capitulo      :   5 Instruções de controle: parte 2; operadores lógicos 
 * Exercício 5.19:   O que cada uma das seguintes instruções imprime?
 * ___________________________________________________________________________________________________________________
 * Descrição     : 
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_19;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Misterio {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
   public static void inicio()
   {
        /*Suponha que...*/
        int i = 1; 
        int j = 2; 
        int k = 3;
        int m = 2;
        
        /*O que cada uma das seguintes instruções imprime?*/
        System.out.println("O que cada uma das seguintes instruções imprime?");
        System.out.println("a) System.out.println(i == 1)");
        System.out.println(i == 1);
        System.out.println("b) System.out.println(j == 3)");
        System.out.println(j == 3);
        System.out.println("c) System.out.println((i >= 1) && (j < 4))");
        System.out.println((i >= 1) && (j < 4));
        System.out.println("d) System.out.println((m <= 99) & (k < m))");
        System.out.println((m <= 99) & (k < m));
        System.out.println("e) System.out.println((j >= i) || (k == m))");
        System.out.println((j >= i) || (k == m));
        System.out.println("f) System.out.println((k + m < j) | (3 - j >= k))");    
        System.out.println((k + m < j) | (3 - j >= k));
        System.out.println("g) System.out.println(!(k > m))");
        System.out.println(!(k > m));    
    }
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

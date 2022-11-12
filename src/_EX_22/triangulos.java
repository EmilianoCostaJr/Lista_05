/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :  Triplos_de_Pitagoras
 * @author       :  Emiliano Costa
 * @date         :  11 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :  Java como programar, Deitel, 10º edição                                                             
 * Capitulo      :  5 Instruções de controle: parte 2; operadores lógicos
 * Exercício 5.22:  (Programa de impressão de triângulos modificado)  
 * ___________________________________________________________________________________________________________________
 * Descrição     :  
        Modifique a Questão 5.15 para combinar seu código dos quatro triângulos de asteriscos separados, 
        de modo que todos os quatro padrões sejam impressos lado a lado. 
        [Dica: faça uso inteligente de loops for aninhados.] 
   
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_22;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class triangulos 
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
{

    
    public static void inicio(){
        
        System.out.printf("%10s\t%10s\t%10s\t%10s\n","Padrão A","Padrão B","Padrão C","Padrão D");
        
        /*Loop principal*/
        for (int i = 1; i <= 10; i++)
        {
            /*Desenha padrão A*/
            for (int j = 1; j <= 10; j++)
            {
                System.out.print(i >= j ? "*" : " ");
            }
            System.out.print("\t");
            
            /*Desenha padrão B*/
            for (int j = 10; j >= 1; j--)
            {
                System.out.print(i > j ? " " : "*");
            }
            System.out.print("\t");
            
            /*Desenha padrão C*/
            for (int j = 1; j <= 10; j++)
            {
                System.out.print(i > j ? " " : "*");
            }
            System.out.print("\t");
            
            /*Desenha padrão D*/
            for (int j = 10; j >= 1; j--)
            {
                System.out.print(i >= j ? "*" : " ");
            }
            System.out.println("");
        }/*Fim Loop principal*/
    }
    
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

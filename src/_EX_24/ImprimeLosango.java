/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :   ImprimeLosango
 * @author       :   Emiliano Costa
 * @date         :   7 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :  Java como programar, Deitel, 10º edição
 * Capitulo      :  5 Instruções de controle: parte 2; operadores lógicos
 * ___________________________________________________________________________________________________________________
 * Descrição     :  Exercício 5.24  (Programa de impressão de losangos)
        Escreva um aplicativo que imprime a seguinte forma de um losango. 
        Você pode utilizar instruções de saída que imprimem um único asterisco (*), 
        um único espaço ou um único caractere de nova linha. 
        Maximize sua utilização de repetição (com instruções for aninhadas) e minimize o número de instruções de saída.
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_24;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class ImprimeLosango {

   public static void inicio()
   {
        int tamanho = 9;
        int centro = 5;
        int delta = 0;

        /*Imprime o Losango, linha a linha*/
        for(int x = 1;x <=tamanho;x++)
        {
            /*Corre toda a linha */
            for(int y = 1; y <= tamanho; y++)
            {
                /*Imprime o caractere adequado*/
                if(y >= (centro - delta) && y <= (centro + delta))
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(""); /*Próxima Linha*/
            if(x < centro){
                delta++; /*Losângulo esta se abrindo*/
            }else{
                delta--; /*Losângulo esta se fechando*/
            }
        }    
    }            
        
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/


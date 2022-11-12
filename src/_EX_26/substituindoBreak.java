/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :  substituindoBreak
 * @author       :  Emiliano Costa
 * @date         :  10 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :  Java como programar, Deitel, 10º edição
 * Capitulo      :  5 Instruções de controle: parte 2; operadores lógicos
 * Exercício     :  26  
 * ___________________________________________________________________________________________________________________
 * Descrição     :  
      Uma crítica à instrução break e à instrução continue é que cada uma é desestruturada. 
      Na verdade, essas instruções sempre podem ser substituídas por instruções estruturadas, embora fazer isso possa 
      ser difícil. Descreva de maneira geral como você removeria qualquer instrução break de um loop em um programa e 
      a substituiria por alguma equivalente estruturada. 

Resposta:[Alterando o valor da variável de controle do loop]

[Dica: a instrução break sai de um loop do corpo do loop. A outra maneira de sair de um loop é falhando no teste de 
continuação do loop. Considere a possibilidade de utilizar no teste de continuação do loop um segundo teste que indica 
“saída prévia por causa de uma condição ‘break’ ”.] 
Utilize a técnica que você desenvolve aqui para remover a instrução break do aplicativo na Figura 5.13
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_26;



/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class substituindoBreak {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
   public static void inicio()
   {

      int count;
      int saida = 0;
      System.out.println("Figura 5.13: verifica break saindo da estrutura for");
      for (count = 1; count <= 10; count++){
         if (count == 6){
            saida = count;
            count = 11;
         }
         System.out.printf("%d ", count);

      }
      System.out.printf("\nSaiu do loop com o contador em %d\n",saida);
      System.out.println("");
   }

}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/


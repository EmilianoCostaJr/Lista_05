/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :  Vendas
 * @author       :  Emiliano Costa
 * @date         :  11 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :  Java como programar, Deitel, 10º edição                                                             
 * Capitulo      :  5 Instruções de controle: parte 2; operadores lógicos
 * Exercício 5.17:  (Calculando vendas)
 * ___________________________________________________________________________________________________________________
 * Descrição     :  
        Um varejista on-line vende cinco produtos cujos preços no varejo são como a seguir: 
            produto 1, US$ 2,98; 
            produto 2, US$ 4,50; 
            produto 3, US$ 9,98; 
            produto 4, US$ 4,49 e 
            produto 5, US$ 6,87. 
            Escreva um aplicativo que leia uma série de pares de números como segue:
        a) número de produto
        b) quantidade vendida
        Seu programa deve utilizar uma instrução switch para determinar o preço de varejo de cada produto. 
        Você deve calcular e exibir o valor de varejo total de todos os produtos vendidos. 
        Utilize um loop controlado por sentinela para determinar quando o programa deve parar o loop e exibir os 
        resultados finais.
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_17;

import javax.swing.JOptionPane;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Vendas 
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
{
    public static void inicio() 
    {
        int produto = 0;
        int quantidade = 0;
        double total = 0.0;
        do{
            produto = Integer.parseInt(JOptionPane.showInputDialog("Digite o produto de 1 a 5"));
            quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade\n Ou Digite 0 para sair"));
            switch (produto)
            {
                case 1 ->
                {
                    total += quantidade * 2.98;
                    System.out.printf("%d X Produto1 = $%.2f\n",quantidade, quantidade * 2.98);
                }
                case 2 ->
                {
                    total += quantidade * 4.50; 
                    System.out.printf("%d X Produto2 = $%.2f\n",quantidade, quantidade * 4.50);
                }
                case 3 ->
                {
                    total += quantidade * 9.98;
                    System.out.printf("%d X Produto3 = $%.2f\n",quantidade, quantidade * 9.98);
                }
                case 4 ->
                {
                    total += quantidade * 4.49;
                    System.out.printf("%d X Produto4 = $%.2f\n",quantidade, quantidade * 4.49);
                }
                case 5 ->
                {
                    total += quantidade * 6.87;
                    System.out.printf("%d X Produto1 = $%.2f\n",quantidade, quantidade * 6.87);
                }
                default -> quantidade = 0;
            }
        } while (quantidade != 0);
        
        System.out.printf("Valor total das vendas: %.2f\n", total);
    
    }/*Fim do método main*/
    
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::Fim:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :  Localiza_o_menor_valor
 * @author       :  Emiliano Costa
 * @date         :  9 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :  Java como programar, Deitel, 10º edição                                                             
 * Capitulo      :  5 Instruções de controle: parte 2; operadores lógicos
 * Exercício 5.11:  (Localize o menor valor)
 * ___________________________________________________________________________________________________________________
 * Descrição     :  Escreva um aplicativo que localiza o menor de vários números inteiros. 
                    Suponha que o primeiro valor lido especifica o número de valores a serem inseridos pelo usuário.
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_11;
import javax.swing.JOptionPane;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Localiza_o_menor_valor 
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
{

    public static void inicio() 
    {
        String mensagem = "";    /*String a ser exibiba na caixa de dialogo*/
        String sInput;           /*String recebe o que foi digitado pelo usuário*/

        mensagem = "Exercicio 11 - Localiza o menor valor";
        JOptionPane.showMessageDialog(null, mensagem);
    
        
        sInput = JOptionPane.showInputDialog("Digite a quantidade de numeros a ser pesquisada");
        int quantidade = Integer.parseInt(sInput);
        
        sInput = JOptionPane.showInputDialog("Digite a primeiro numero");
        int menor = Integer.parseInt(sInput);
        int temp;
        
        for (int i = 2; i <= quantidade; i++)
        {
            sInput = JOptionPane.showInputDialog("Digite o " + i +"º numero");
            temp = Integer.parseInt(sInput);
            if (temp < menor)
            {
                menor = temp;
            }
        }
        mensagem = String.format("O menor valor que foi digitado foi: %d", menor);
        JOptionPane.showMessageDialog(null,mensagem);
    }
    
}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

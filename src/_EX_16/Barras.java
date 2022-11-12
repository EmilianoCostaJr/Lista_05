/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :  Barras
 * @author       :  Emiliano Costa
 * @date         :  11 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :  Java como programar, Deitel, 10º edição                                                             
 * Capitulo      :  5 Instruções de controle: parte 2; operadores lógicos
 * Exercício 5.16:  (Gráfico de barras do programa de impressão) 
 * ___________________________________________________________________________________________________________________
 * Descrição     :  
        Uma aplicação interessante dos computadores é exibir diagramas e gráficos de barras.
        Escreva um aplicativo que leia cinco números entre 1 e 30. Para cada número que é lido, seu programa deve exibir
        o mesmo número de asteriscos adjacentes. Por exemplo, se seu programa lê o número 7, ele deve exibir *******. 
        Exiba as barras dos asteriscos depois de ler os cinco números.
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_16;
import javax.swing.JOptionPane;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Barras 
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
{
    public static void inicio() 
    {
        int cont = 1;
        int barra1 = tamanhoBarra(cont++);
        int barra2 = tamanhoBarra(cont++);
        int barra3 = tamanhoBarra(cont++);
        int barra4 = tamanhoBarra(cont++);
        int barra5 = tamanhoBarra(cont++);
        
    //    System.out.println("Primeira Barra");
        for (int i = 1; i < barra1; i++)
        {
            System.out.print("*");
        }
        System.out.println("");
    //    System.out.println("Segunda Barra");
        for (int i = 1; i < barra2; i++)
        {
            System.out.print("*");
        }
        System.out.println("");
    //    System.out.println("Terceira Barra");
        for (int i = 1; i < barra3; i++)
        {
            System.out.print("*");
        }
        System.out.println("");
    //    System.out.println("Quarta Barra");
        for (int i = 1; i < barra4; i++)
        {
            System.out.print("*");
        }
        System.out.println("");
    //    System.out.println("Quinta Barra");
        for (int i = 1; i < barra5; i++)
        {
            System.out.print("*");
        }
        System.out.println("");

    }
    
    private static int tamanhoBarra(int contador)
    {
        int valor;
        try {
            valor = Integer.parseInt(JOptionPane.showInputDialog(null,String.format("Digite o valor da %d° Barra", contador)));
            /*Validação*/
            if(valor > 30)
                valor = 30;
            if(valor < 0)
                valor =0;
        } catch (Exception e) {
            valor = 0;
        }
         return  valor;
    }

}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

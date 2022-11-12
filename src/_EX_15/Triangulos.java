/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe        :  Triangulos
 * @author       :  Emiliano Costa
 * @date         :  11 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia  :  Java como programar, Deitel, 10º edição                                                             
 * Capitulo      :  5 Instruções de controle: parte 2; operadores lógicos
 * Exercício 5.15:  (Programa para impressão de triângulos)
 * ___________________________________________________________________________________________________________________
 * Descrição     :  
        Escreva um aplicativo que exibe os seguintes padrões separadamente, um embaixo do outro.
        Utilize loops for para gerar os padrões. Todos os asteriscos (*) devem ser impressos por uma única instrução na 
        forma System.out.print('*'); o que faz com que os asteriscos sejam impressos lado a lado. 
        Uma instrução na forma System.out.println(); pode ser utilizada para mover-se para a próxima linha. 
        Uma instrução na forma System.out.print(' '); pode ser utilizada para exibir um espaço para os últimos dois 
        padrões. Não deve haver outras instruções de saída no programa. 
        [Dica: os dois últimos padrões requerem que cada linha inicie com um número adequado de espaços em branco.]
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _EX_15;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Triangulos 
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
{
    public static void inicio()
    {
        System.out.println("Padrão A");
        padrao_A();
        System.out.println("Padrão B");
        padrao_B();
        System.out.println("Padrão C");
        padrao_C();
        System.out.println("Padrão D");
        padrao_D();
    }

    public static void padrao_A()
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void padrao_B()
    {
        for (int i = 10; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void padrao_C()
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                if (j <= i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
    public static void padrao_D()
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                if (j <= i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::Fim classe Triangulos*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

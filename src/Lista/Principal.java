/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Principal
 * @author      :   Emiliano Costa
 * @date        :   7 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição                                                             
 * Capitulo     :   5 Instruções de controle: parte 2; operadores lógicos
 * Seção        :   
 * ___________________________________________________________________________________________________________________
 * Descrição    :
 *                                                                                                                    
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
package Lista;
import javax.swing.JOptionPane;
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Principal 
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
{

    /**Procedimento principal que inicia e termina a aplicação*/
    public static void main(String[] args)
    {
        choice();
        sucesso();
        display();
    }/*FIM Método main()*/

    /**Seleciona o aplicativo a ser executado*/
    public static void choice()
    {
        int seleciona;
        try {
            seleciona = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do exercício\n ou zero para sair"));
        } catch (Exception e) {
            seleciona = 0;
            String msg = String.format("Exception: %s%n", e.getMessage());
            JOptionPane.showMessageDialog(null,msg);
            JOptionPane.showMessageDialog(null,"Encerrando o app");
        }
        
        if(seleciona != 0)
            drive(seleciona);
        
    }/*FIM Método choice()*/

    /**Procedimento conduz a execução do aplicativo selecionado*/
    public static void drive(int escolha)
    {
        switch(escolha){
        case 10 -> _EX_10.Printing.inicia();
        case 11 -> _EX_11.Localiza_o_menor_valor.inicio();
        case 12 -> _EX_12.Produto_dos_impares_ate_quinze.inicio();
        case 13 -> _EX_13.Fatoriais.inicio();
        case 14 -> _EX_14.Interest.inicio();
        case 15 -> _EX_15.Triangulos.inicio();
        case 16 -> _EX_16.Barras.inicio();
        case 17 -> _EX_17.Vendas.inicio();
        case 18 -> _EX_18.Interest.inicio();/*ERRO! Exercício não finalizado*/
        case 19 -> _EX_19.Misterio.inicio();
        case 20 -> _EX_20.Calcula_PI.inicio();
        case 21 -> _EX_21.Triplos_de_Pitagoras.inicio();
        case 22 -> _EX_22.triangulos.inicio();
        case 23 -> _EX_23.Leis_de_Morgan.inicio();
        case 24 -> _EX_24.ImprimeLosango.inicio();
        case 25 -> _EX_25.ImprimeLosango2.inicio();
        case 26 -> _EX_26.substituindoBreak.inicio();
        
        default -> JOptionPane.showMessageDialog(null, "Houve erro na escolha");
        }
        choice();
    }/*FIM Método drive()*/

    /**Procedimento que gera saída com meu nome*/
    public static void display()
    {
        System.out.println("");
        System.out.println("&&&&&&&& &&     && &&&& &&       &&&&    &&&    &&    &&  &&&&&&&");
        System.out.println("&&       &&&   &&&  &&  &&        &&    && &&   &&&   && &&     &&"); 
        System.out.println("&&       &&&& &&&&  &&  &&        &&   &&   &&  &&&&  && &&     &&"); 
        System.out.println("&&&&&&   && &&& &&  &&  &&        &&  &&     && && && && &&     &&"); 
        System.out.println("&&       &&     &&  &&  &&        &&  &&&&&&&&& &&  &&&& &&     &&"); 
        System.out.println("&&       &&     &&  &&  &&        &&  &&     && &&   &&& &&     &&"); 
        System.out.println("&&&&&&&& &&     && &&&& &&&&&&&& &&&& &&     && &&    &&  &&&&&&&");  
        System.out.println("");/*Pula uma linha*/
    }/*FIM Método display()*/
    
    /**Procedimento imprime uma mensagem no display*/
    public static void sucesso()
    {
        JOptionPane.showMessageDialog(null, "Aplicativo executado com sucesso!");
    }/*FIM Método sucesso()*/
    
}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::Fim da classe Principal*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
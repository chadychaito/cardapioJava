/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/* OBSERVAÇÕES IMPORTANTES 
* Levei em consideração que a entrada sempre são separadas por virguala, seguida de espaço. Exemplo: night, 1, 2
* Levei em consideração que o pedido é sempre night ou morning 
*/


package testeestagio;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chady Chaito
 */
public class TesteEstagio {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in); //Ler entrada
         String entrada;
         String[] array_palavras;
         int num_pedido, flag = 0, retorno;
         
         Pedidos pedido = new Pedidos();
         Cardapio cardapio = new Cardapio();
         
         /* LENDO ENTRADA */
         entrada = ler.nextLine();
         
         /* Separando a entrada por virgula em um array de String */
         array_palavras = entrada.split(", ");
         
         pedido.setPeriodo(array_palavras[0]);
         /* Desconsiderando o primeiro elemento que é o Período, transforme a String em um número e atualize o Array de pedidos */
         for(int count = 1 ; count < array_palavras.length ; count++){
             num_pedido = Integer.parseInt(array_palavras[count]);
             /* Pedido precisa estar entre 1 e 4 */
             if(num_pedido >= 1 && num_pedido <= 4)
                pedido.setPedidos(num_pedido);
             else{
                 flag  = 1;
                 break;
             }
                 
         }
         /* Imprindo os pedidos de acordo com o cardapio */
         retorno = cardapio.listarCardapio(pedido);
         if(flag == 1 && retorno != -1 && array_palavras.length > 2){
             System.out.println(", error");
         }
         else if(flag == 1 && array_palavras.length == 2){
             System.out.println("error");
         }
     }
    
}

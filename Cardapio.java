/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeestagio;
import java.util.ArrayList;

/**
 *
 * @author Chady Chaito
 */
public class Cardapio {
    private final ArrayList<String> morning = new ArrayList();
    private final ArrayList<String> night = new ArrayList();
    
    /* Construtor do Cardapio */
    public Cardapio(){
     this.morning.add("eggs");
     this.morning.add("toast");
     this.morning.add("coffe");
     this.morning.add("error");
     
     this.night.add("steak");
     this.night.add("potato");
     this.night.add("wine");
     this.night.add("cake");
    }
   
    /* Listar Cardapio de acordo com pedido do Cliente */
    public int listarCardapio(Pedidos pedido){
     String periodo = pedido.getPeriodo();
     int value, flag = 0;
     
     /* Se manhã */
     if("morning".equals(periodo)){
       for(int i = 0 ; i < 4 ; i++){ 
            value = pedido.getVetValue(i); //Pegando valor do vetor de pedidos
            /* Se ele fez o pedido então o Value do Vetor = 1 */
            if(value >= 1){
                // Colocar ou não virgula
                if(flag == 0){
                    /* Se pedir mais de um Prato que não seja Café  - ERROR */
                    if(value > 1 && i != 2){
                        System.out.printf("%s", morning.get(i));
                        System.out.printf(", error");
                        flag = 1;
                        return -1;
                    }
                    else{
                        System.out.printf("%s", morning.get(i));
                        flag = 1;
                    }
                } 
                else{
                    if(value > 1 && i == 2){
                        System.out.printf(", %s (x%d)", morning.get(i), value);
                    }
                    /* Se pedir mais de um Prato que não seja Café  - ERROR */
                    else if(value > 1 && i != 2){
                        System.out.printf(", %s", morning.get(i));
                        System.out.printf(", error");
                        return -1;
                    }
                    else{
                         System.out.printf(", %s", morning.get(i));
                    }
                }
            }
        }
     }
     else if("night".equals(periodo)){
        for(int i = 0 ; i < 4 ; i++){ 
            value = pedido.getVetValue(i); //Pegando valor do vetor de pedidos
            /* Se ele fez o pedido então o Value do Vetor = 1 */
            if(value >= 1){
                // Colocar ou não virgula
                if(flag == 0){
                    /* Se pedir mais de um Prato que não seja Café  - ERROR */
                    if(value > 1 && i != 1){
                        System.out.printf("%s", night.get(i));
                        System.out.printf(", error");
                        flag = 1;
                        return -1;
                    }
                    else{
                        System.out.printf("%s", night.get(i));
                        flag = 1;
                    }
                } 
                else{
                    if(value > 1 && i == 1){
                        System.out.printf(", %s (x%d)", night.get(i), value);
                    }
                    /* Se pedir mais de um Prato que não seja Café  - ERROR */
                    else if(value > 1 && i != 1){
                        System.out.printf(", %s", night.get(i));
                        System.out.printf(", error");
                        return -1;
                    }
                    else{
                         System.out.printf(", %s", night.get(i));
                    }
                }
            }
        }
     }
     return 1;
   }
}

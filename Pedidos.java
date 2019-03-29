/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeestagio;

/**
 *
 * @author Chady Chaito
 */
public class Pedidos {
      
            
    /* Array que representa os pedidos */
    private int [] pedido = new int[4];
    private String periodo;
    
    /* Construtor de Pedidos */
    public Pedidos(){
        for(int i = 0 ; i < 4 ; i++){
           this.pedido[i] = 0;
        }
    }
    
    /* Retornar o periodo - Morning ou Night */
    public String getPeriodo(){
        return this.periodo;
    }
    
    /* Retorna o valor do indice */
    public int getVetValue(int index){
        return this.pedido[index];
    }
    
    /* Setando pedidos. SE pediu opção 1 ENTÃO indice 0 = 1  */
    public void setPeriodo(String periodo){
        this.periodo = periodo;
    }
    
    
    /* Setando pedidos. SE pediu opção 1 ENTÃO indice 0 = 1  */
    public void setPedidos(int indice){
        this.pedido[indice - 1] += 1;
    }
}

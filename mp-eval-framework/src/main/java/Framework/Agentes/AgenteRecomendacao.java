/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.Agentes;

import Framework.Modelo.Cliente;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import java.util.List;

/**
 *
 * @author Jessica
 */
public abstract class AgenteRecomendacao <T extends Cliente> extends Agent {

    private int timeTicker = 10000;
    
    public abstract List<T> verificaClientesParaNotificar();

    public abstract void geraRecomendacao(T obj);
    
    @Override
    protected void setup() {
        addBehaviour(new TickerBehaviour(this, this.timeTicker){
            @Override
            protected void onTick() {
                
                List<T> lista = verificaClientesParaNotificar();
                if(lista != null && !lista.isEmpty()){
                    for(T obj : lista){
                        geraRecomendacao(obj);
                    }
                }
            }
            
        });
    }
}
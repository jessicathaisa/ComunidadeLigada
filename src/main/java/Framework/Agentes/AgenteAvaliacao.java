/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.Agentes;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

/**
 *
 * @author Jessica
 */
public abstract class AgenteAvaliacao<T> extends Agent {

    public abstract void acionaAgente(Object obj);

    public abstract void notificaPrestador();
    
    @Override
    protected void setup() {
        addBehaviour(new CyclicBehaviour(this){

            @Override
            public void action() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.Agentes;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author Jessica
 */
public abstract class AgenteContratacao extends Agent {

    public abstract void acionaAgente(Object obj);

    public abstract void notificaPrestador();

    protected void setup() {
        addBehaviour(new CyclicBehaviour(this) {

            @Override
            public void action() {
                ACLMessage msg = receive();

                if (msg != null) {
                    notificaPrestador();
                }
            }
        });
    }
}

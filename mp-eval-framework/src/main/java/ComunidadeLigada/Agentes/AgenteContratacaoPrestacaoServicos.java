/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComunidadeLigada.Agentes;

import jade.core.AID;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author Jessica
 */
public class AgenteContratacaoPrestacaoServicos extends Framework.Agentes.AgenteContratacao {

    @Override
    public void acionaAgente(Object obj) {
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);

        msg.addReceiver(new AID("AgenteContratacao", AID.ISLOCALNAME));
        msg.setLanguage("Português");
        msg.setOntology("Teste");
        msg.setContent("Teste");
    }

    @Override
    public void notificaPrestador() {
        System.out.println("Fui notificado!");
    }

}

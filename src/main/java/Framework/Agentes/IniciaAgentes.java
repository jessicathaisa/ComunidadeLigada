/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.Agentes;

import jade.Boot;
import jade.core.Agent;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;
import java.util.Set;
import org.reflections.Reflections;

/**
 *
 * @author Jessica
 */
public class IniciaAgentes {

    public IniciaAgentes() {

        Boot.main(new String[]{"-gui"});
        try{ /*Uso de Reflexão para descobrir quais os métodos estão extendendo ClienteDAO*/
            
            Reflections reflections = new Reflections("");
            Set<Class<? extends AgenteAvaliacao>> classes = reflections.getSubTypesOf(AgenteAvaliacao.class);
            
            if(classes.isEmpty())
                throw new Exception("Não foi possível encontrar nenhuma classe AgenteContratacao");
            if(classes.size() > 1)
                throw new Exception("Existem mais de uma classe do tipo ClienteDAO.");
            
            for (Class<?> clazz : classes) {
                //IniciarAgentes((AgenteContratacao)clazz.newInstance(), "AgenteContratacao", "container");
            }
        }
        catch(Exception ie){
            System.out.println("Erro ao encontrar instancias de ClienteDAO: " + ie.getMessage());
        }
    }

    /**
     * @param agent
     * @param nameAgent
     * @param nameContainer
     */
    public void IniciarAgentes(Agent agent, String nameAgent, String nameContainer) {
        setAgentInContainer(agent, nameAgent, nameContainer);
    }

    /**
     * @param agent
     * @param nameAgent
     * @param nameContainer
     */
    private void setAgentInContainer(Agent agent, String nameAgent,
            String nameContainer) {

        jade.core.Runtime runtime = jade.core.Runtime.instance();

        Profile profile = new ProfileImpl();
        profile.setParameter(Profile.CONTAINER_NAME, nameContainer);

        AgentContainer controllerAgentContainer = runtime
                .createAgentContainer(profile);

        try {

            AgentController controller = controllerAgentContainer
                    .acceptNewAgent(nameAgent, agent);

            controller.start();

        } catch (StaleProxyException ex) {
            System.out.println("Agente não pode ser iniciado!");
        }
    }
}

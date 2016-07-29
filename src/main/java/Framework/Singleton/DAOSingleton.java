/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.Singleton;

import Framework.DAO.ClienteDAO;
import Framework.Modelo.Cliente;
import java.util.Set;
import org.reflections.Reflections;

/**
 *
 * @author Jessica
 */
public class DAOSingleton {
    public ClienteDAO<Cliente> clienteDao;
    /*TODOS OS DEMAIS*/
    
    private static DAOSingleton instance = null;

    private DAOSingleton() {
        try{ /*Uso de Reflexão para descobrir quais os métodos estão extendendo ClienteDAO*/
            
            Reflections reflections = new Reflections("");
            Set<Class<? extends ClienteDAO>> classes = reflections.getSubTypesOf(ClienteDAO.class);
            
            if(classes.isEmpty())
                throw new Exception("Não foi possível encontrar nenhuma classe ClienteDAO");
            if(classes.size() > 1)
                throw new Exception("Existem mais de uma classe do tipo ClienteDAO.");
            
            for (Class<?> clazz : classes) {
                clienteDao = (ClienteDAO) clazz.newInstance();
            }
        }
        catch(Exception ie){
            System.out.println("Erro ao encontrar instancias de ClienteDAO: " + ie.getMessage());
        }
    }
    
    public static DAOSingleton getInstance(){
        if (instance == null)
            instance = new DAOSingleton();
        return instance;
    }
}

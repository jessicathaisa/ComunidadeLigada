/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.Singleton;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jessica
 */
public class DAOSingleton {
    
    private Map<Class, Object> mapping = new HashMap<>();

    public void registraDAO(Class classe, Object obj){
        mapping.put(classe, obj);
    }
    
    public Object recuperaDAO(Class classe){
        if(!mapping.containsKey(classe))
            throw new RuntimeException("Você não registrou nenhuma Dao com a classe " + classe.getName());
        return mapping.get(classe);
    }
    
    private static DAOSingleton instance = null;

    private DAOSingleton() {

    }
    
    public static DAOSingleton getInstance(){
        if (instance == null)
            instance = new DAOSingleton();
        return instance;
    }
}

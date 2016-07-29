/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.Fachada;

import Framework.DAO.ClienteDAO;
import Framework.Modelo.Cliente;
import Framework.Singleton.DAOSingleton;



/**
 *
 * @author Jessica
 */
public class ClienteController<T extends Cliente> {
    private DAOSingleton dao;
    public ClienteController() {
        dao = DAOSingleton.getInstance();
    }
    
    public T[] listarCliente(){
        
        return null;
    }
    
    public void adicionarCliente(T c){
        
    }
    
    public void editarCliente(T c){
    
    }
    
    public void excluirCliente(T c){
    
    }
    
    public T trazClientePorId(int id){
        T c = ((ClienteDAO<T>) dao.recuperaDAO(ClienteDAO.class)).retrieve(id);
        return c;
    }
    
}

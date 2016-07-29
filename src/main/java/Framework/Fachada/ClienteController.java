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
        return recuperaDAO().findAll();
    }
    
    public void adicionarCliente(T c){
        recuperaDAO().add(c);
    }
    
    public void editarCliente(T c){
        recuperaDAO().update(c);
    }
    
    public void excluirCliente(T c){
        recuperaDAO().delete(c);
    }
    
    public T trazClientePorId(int id){
        T c = recuperaDAO().retrieve(id);
        return c;
    }
    
    private ClienteDAO<T> recuperaDAO(){
        return ((ClienteDAO<T>) dao.recuperaDAO(ClienteDAO.class));
    }
    
}

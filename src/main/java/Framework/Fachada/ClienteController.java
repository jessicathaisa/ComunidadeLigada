/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.Fachada;

import Framework.Singleton.DAOSingleton;



/**
 *
 * @author Jessica
 * @param <Cliente>
 */
public class ClienteController<Cliente> {
    private DAOSingleton dao;
    public ClienteController() {
        dao = DAOSingleton.getInstance();
    }
    
    public Cliente[] listarCliente(){
        
        return null;
    }
    
    public void adicionarCliente(Cliente c){
        
    }
    
    public void editarCliente(Cliente c){
    
    }
    
    public void excluirCliente(Cliente c){
    
    }
    
    public Cliente trazClientePorId(int id){
        Cliente c = (Cliente) dao.clienteDao.retrieve(id);
        return c;
    }
    
}

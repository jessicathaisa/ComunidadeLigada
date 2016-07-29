/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.Fachada;

import Framework.DAO.ServicoDAO;
import Framework.Modelo.Cliente;
import Framework.Modelo.Servico;
import Framework.Singleton.DAOSingleton;
/**
 *
 * @author Jessica
 */
public class ServicoController <T extends Servico> {
    
    private DAOSingleton dao;
    public ServicoController() {
        dao = DAOSingleton.getInstance();
    }
    
    private ServicoDAO<T> recuperaDAO(){
        return ((ServicoDAO<T>) dao.recuperaDAO(ServicoDAO.class));
    }
    
    public T[] listarServico(){
        
        return recuperaDAO().findAll();
    }
    
    public void adicionarServico(T c){
        recuperaDAO().add(c);
    }
    
    public void editarServico(T c){
        recuperaDAO().update(c);
    }
    
    public void excluirServico(T c){
        recuperaDAO().delete(c);
    }
    
    public T trazServicoPorId(int id){
        return recuperaDAO().retrieve(id);
    }
}

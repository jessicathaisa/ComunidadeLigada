/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.Fachada;

import Framework.DAO.PrestadorDAO;
import Framework.Modelo.Prestador;
import Framework.Singleton.DAOSingleton;

/**
 *
 * @author Jessica
 */
public class PrestadorController <T extends Prestador>{
    
    private DAOSingleton dao;
    public PrestadorController() {
        dao = DAOSingleton.getInstance();
    }
    
    private PrestadorDAO<T> recuperaDAO(){
        return ((PrestadorDAO<T>) dao.recuperaDAO(PrestadorDAO.class));
    }
    
    
    public T[] listarPrestador(){
        
        return null;
    }
    
    public void adicionarPrestador(T c){
        
    }
    
    public void editarPrestador(T c){
    
    }
    
    public void excluirPrestador(T c){
    
    }
    
    public T trazPrestadorPorId(int id){
    
        return null;
    }
}

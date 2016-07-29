/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.Fachada;

import Framework.DAO.ContratacaoDAO;
import Framework.Modelo.Cliente;
import Framework.Modelo.Contratacao;
import Framework.Modelo.Prestador;
import Framework.Singleton.DAOSingleton;
import java.util.Date;

/**
 *
 * @author Jessica
 */
public class ContratacaoOfertaController <T extends Contratacao>{
    
    private DAOSingleton dao;
    public ContratacaoOfertaController() {
        dao = DAOSingleton.getInstance();
    }
    
    private ContratacaoDAO<T> recuperaDAO(){
        return ((ContratacaoDAO<T>) dao.recuperaDAO(ContratacaoDAO.class));
    }    
    
    public T[] listarOfertasContPorCliente(Cliente c){
        return recuperaDAO().findByClient();
    }
    
    public T[] listarOfertasContPorPrestador(Prestador p){
        return recuperaDAO().findByProvider();
    }
    
    public T[] listarOfertasContClientePrestador(Cliente c, Prestador p){
        return recuperaDAO().retrieve(c.getIdentificador().intValue(), p.getIdentificador().intValue());
    }
    
    public void contratarOferta(T o){
        recuperaDAO().add(o);
    }
    
    public void aceitarContratacaoOferta(T o){
        o.setAceite(true);
        o.setDataContratacao(new Date());
        recuperaDAO().update(o);
    }
    
    public void recusarContratacaoOferta(T o){
        o.setAceite(false);
        o.setDataContratacao(new Date());
        recuperaDAO().update(o);
    }
    
    public void avaliarCliente(T o){
        recuperaDAO().update(o);
    }
    
    public void avaliarPrestador(T o){
        recuperaDAO().update(o);
    }
    
    public T trazOfertaContPorId(int id){
        return recuperaDAO().retrieve(id);
    }
    
}

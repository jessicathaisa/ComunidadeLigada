/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.Fachada;

import Framework.DAO.OfertaDAO;
import Framework.Modelo.Oferta;
import Framework.Modelo.Prestador;
import Framework.Modelo.Servico;
import Framework.Singleton.DAOSingleton;

/**
 *
 * @author Jessica
 */
public class OfertaController<T extends Oferta> {
    
    private DAOSingleton dao;
    public OfertaController() {
        dao = DAOSingleton.getInstance();
    }
    
    private OfertaDAO<T> recuperaDAO(){
        return ((OfertaDAO<T>) dao.recuperaDAO(OfertaDAO.class));
    }    
    
    public T[] listarOfertasPorPrestador(Prestador p) {
        return recuperaDAO().findByProvider(p.getIdentificador().intValue());
    }
    public T[] listarOfertasPorServico(Servico p) {
        return recuperaDAO().findByService(p.getIdentificador().intValue());
    }
    public void adicionarOferta(T o){
        recuperaDAO().add(o);
    }
    public void editarOferta(T o){
        recuperaDAO().update(o);
    }
    public void excluirOferta(T o){
        recuperaDAO().delete(o);
    }
    public T trazOfertaPorId(int id){
        return recuperaDAO().retrieve(id);
    }
}

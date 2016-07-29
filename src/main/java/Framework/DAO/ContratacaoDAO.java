/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.DAO;

import Framework.Modelo.Contratacao;

/**
 *
 * @author Jessica
 */
public interface ContratacaoDAO <T extends Contratacao> {
    public T[] findByProvider();
    public T[] findByClient();
    public T add(T c);
    public T update(T c);
    public T[] retrieve(int idCliente, int idPrestador);
    public T retrieve(int id);
}

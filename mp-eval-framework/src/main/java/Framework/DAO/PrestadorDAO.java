/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.DAO;

import Framework.Modelo.Prestador;

/**
 *
 * @author Jessica
 */
public interface PrestadorDAO<T extends Prestador> {
    public T[] findAll();
    public T add(T c);
    public T update(T c);
    public void delete(T c);
    public T retrieve(int id);
}

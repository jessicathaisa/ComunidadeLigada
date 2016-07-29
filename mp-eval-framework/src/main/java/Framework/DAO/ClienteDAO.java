/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.DAO;

/**
 *
 * @author Jessica
 * @param <Cliente>
 */
public interface ClienteDAO<Cliente> {
    public Cliente[] findAll();
    public Cliente add(Cliente c);
    public Cliente update(Cliente c);
    public void delete(Cliente c);
    public Cliente retrieve(int id);
}

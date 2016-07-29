/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComunidadeLigada.Principal;

import ComunidadeLigada.DAO.MoradorDAO;
import ComunidadeLigada.Modelo.Morador;
import Framework.Agentes.IniciaAgentes;
import Framework.DAO.ClienteDAO;
import Framework.Fachada.ClienteController;
import Framework.Singleton.DAOSingleton;

/**
 *
 * @author Jessica
 */
public class ComunidadeLigada {
    public static void main(String[] args) {
        new IniciaAgentes();
        
        System.out.println("...Iniciando Simulação...\n");
        System.out.println("Cliente A1 entrou no sistema - id=1");
        DAOSingleton.getInstance().registraDAO(ClienteDAO.class, new MoradorDAO());
        ClienteController<Morador> CC = new ClienteController();
        Morador m = CC.trazClientePorId(1);
        System.out.println("Seja bem-vindo " + m.getNome());
    }
}

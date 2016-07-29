/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComunidadeLigada.Modelo;

import Framework.Modelo.Cliente;

/**
 *
 * @author Jessica
 */
public class Morador extends Cliente {

    @Override
    public void avaliar() {
        System.out.println("Avaliando... " + this.getNome());
    }
    
}

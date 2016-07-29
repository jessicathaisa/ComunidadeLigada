/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComunidadeLigada.Agentes;

import ComunidadeLigada.Modelo.Morador;
import Framework.Agentes.AgenteAvaliacao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jessica
 */
public class AgenteAvaliacaoAluno<T> extends AgenteAvaliacao<Morador> {

    @Override
    public List<Morador> verificaNovasAvaliacoes() {
        System.out.println("VerificandoAvaliacoes");
        
        List<Morador> lista = new ArrayList<>();
        Morador a = new Morador();
        a.setNome("Jessica");
        lista.add(a);
        Morador b = new Morador();
        b.setNome("Carlos");
        lista.add(b);
        Morador c = new Morador();
        c.setNome("Maria");
        lista.add(c);
        Morador d = new Morador();
        d.setNome("Victor");
        lista.add(d);
        Morador de = new Morador();
        de.setNome("Joao");
        lista.add(de);
        return lista;
    }
    
}

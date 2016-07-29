/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.Modelo;

import java.util.Set;

/**
 *
 * @author Jessica
 */
public abstract class Cliente {
    private Long identificador;
    private String nome;
    private String uri;
    private Set<Servico> servicosInteresse;
    private Set<Contratacao> ofertasContratadas;
    private int avaliacao;
    
    public abstract void avaliar();

    /**
     * @return the identificador
     */
    public Long getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * @param uri the uri to set
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * @return the servicosInteresse
     */
    public Set<Servico> getServicosInteresse() {
        return servicosInteresse;
    }

    /**
     * @param servicosInteresse the servicosInteresse to set
     */
    public void setServicosInteresse(Set<Servico> servicosInteresse) {
        this.servicosInteresse = servicosInteresse;
    }

    /**
     * @return the ofertasContratadas
     */
    public Set<Contratacao> getOfertasContratadas() {
        return ofertasContratadas;
    }

    /**
     * @param ofertasContratadas the ofertasContratadas to set
     */
    public void setOfertasContratadas(Set<Contratacao> ofertasContratadas) {
        this.ofertasContratadas = ofertasContratadas;
    }

    /**
     * @return the avaliacao
     */
    public int getAvaliacao() {
        return avaliacao;
    }

    /**
     * @param avaliacao the avaliacao to set
     */
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    
}

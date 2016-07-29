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
public abstract class Prestador {
    private Long identificador;
    private String nome;
    private String uri;
    private Set<Servico> servicosPrestados;
    private Set<Contratacao> ofertasCriadas;
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
     * @return the servicosPrestados
     */
    public Set<Servico>  getServicosPrestados() {
        return servicosPrestados;
    }

    /**
     * @param servicosPrestados the servicosPrestados to set
     */
    public void setServicosPrestados(Set<Servico>  servicosPrestados) {
        this.servicosPrestados = servicosPrestados;
    }

    /**
     * @return the ofertasCriadas
     */
    public Set<Contratacao> getOfertasCriadas() {
        return ofertasCriadas;
    }

    /**
     * @param ofertasCriadas the ofertasCriadas to set
     */
    public void setOfertasCriadas(Set<Contratacao> ofertasCriadas) {
        this.ofertasCriadas = ofertasCriadas;
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

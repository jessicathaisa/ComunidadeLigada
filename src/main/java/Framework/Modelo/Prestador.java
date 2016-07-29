/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.Modelo;

/**
 *
 * @author Jessica
 */
public abstract class Prestador {
    private int identificador;
    private String nome;
    private String uri;
    private Servico[] servicosPrestados;
    private Contratacao[] ofertasCriadas;
    
    abstract Cliente construir();

    /**
     * @return the identificador
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(int identificador) {
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
    public Servico[] getServicosPrestados() {
        return servicosPrestados;
    }

    /**
     * @param servicosPrestados the servicosPrestados to set
     */
    public void setServicosPrestados(Servico[] servicosPrestados) {
        this.servicosPrestados = servicosPrestados;
    }

    /**
     * @return the ofertasCriadas
     */
    public Contratacao[] getOfertasCriadas() {
        return ofertasCriadas;
    }

    /**
     * @param ofertasCriadas the ofertasCriadas to set
     */
    public void setOfertasCriadas(Contratacao[] ofertasCriadas) {
        this.ofertasCriadas = ofertasCriadas;
    }
}

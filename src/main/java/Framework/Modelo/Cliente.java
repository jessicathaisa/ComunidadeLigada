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
public abstract class Cliente {
    private int identificador;
    private String nome;
    private String uri;
    private Servico[] servicosInteresse;
    private Contratacao[] ofertasContratadas;
    
    public abstract Cliente construir();

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
     * @return the servicosInteresse
     */
    public Servico[] getServicosInteresse() {
        return servicosInteresse;
    }

    /**
     * @param servicosInteresse the servicosInteresse to set
     */
    public void setServicosInteresse(Servico[] servicosInteresse) {
        this.servicosInteresse = servicosInteresse;
    }

    /**
     * @return the ofertasContratadas
     */
    public Contratacao[] getOfertasContratadas() {
        return ofertasContratadas;
    }

    /**
     * @param ofertasContratadas the ofertasContratadas to set
     */
    public void setOfertasContratadas(Contratacao[] ofertasContratadas) {
        this.ofertasContratadas = ofertasContratadas;
    }
    
    
}

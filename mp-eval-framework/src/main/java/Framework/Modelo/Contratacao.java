/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework.Modelo;

import java.util.Date;

/**
 *
 * @author Jessica
 */
public class Contratacao {

    private Long identificador;
    private Oferta oferta;
    private Cliente cliente;
    private Date dataContratacao;
    private boolean aceite;
    private int avaliacaoCliente;
    private int avaliacaoPrestador;

    /**
     * @return the oferta
     */
    public Oferta getOferta() {
        return oferta;
    }

    /**
     * @param oferta the oferta to set
     */
    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the dataContratacao
     */
    public Date getDataContratacao() {
        return dataContratacao;
    }

    /**
     * @param dataContratacao the dataContratacao to set
     */
    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    /**
     * @return the avaliacaoCliente
     */
    public int getAvaliacaoCliente() {
        return avaliacaoCliente;
    }

    /**
     * @param avaliacaoCliente the avaliacaoCliente to set
     */
    public void setAvaliacaoCliente(int avaliacaoCliente) {
        this.avaliacaoCliente = avaliacaoCliente;
    }

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
     * @return the aceite
     */
    public boolean isAceite() {
        return aceite;
    }

    /**
     * @param aceite the aceite to set
     */
    public void setAceite(boolean aceite) {
        this.aceite = aceite;
    }

    /**
     * @return the avaliacaoPrestador
     */
    public int getAvaliacaoPrestador() {
        return avaliacaoPrestador;
    }

    /**
     * @param avaliacaoPrestador the avaliacaoPrestador to set
     */
    public void setAvaliacaoPrestador(int avaliacaoPrestador) {
        this.avaliacaoPrestador = avaliacaoPrestador;
    }
}

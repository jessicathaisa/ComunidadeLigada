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
    private boolean finalizadaCliente;
    private boolean finalizadaPrestador;
    private int avaliacao;

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
     * @return the finalizadaCliente
     */
    public boolean isFinalizada() {
        return finalizadaCliente;
    }

    /**
     * @param finalizada the finalizadaCliente to set
     */
    public void setFinalizada(boolean finalizada) {
        this.finalizadaCliente = finalizada;
    }

    /**
     * @return the finalizadaPrestador
     */
    public boolean isFinalizadaPrestador() {
        return finalizadaPrestador;
    }

    /**
     * @param finalizadaPrestador the finalizadaPrestador to set
     */
    public void setFinalizadaPrestador(boolean finalizadaPrestador) {
        this.finalizadaPrestador = finalizadaPrestador;
    }
}

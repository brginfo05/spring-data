package com.example.demo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "autorizacao_pagamento")
@Entity
public class DuplicataPagamento implements Serializable {

    @Column(name = "ap_key")
    @Id
    private Long duplicataPagamentoKey;

    private Date dataVencimento;

    @Column(name = "VALOR_FATURA")
    private BigDecimal valorNominal;

    private Integer borderoKey;

    @JoinColumn(name = "conta_bancaria_key")
    @ManyToOne
    private ContaBancaria contaBancaria;

    public Long getDuplicataPagamentoKey() {
        return duplicataPagamentoKey;
    }

    public void setDuplicataPagamentoKey(Long duplicataPagamentoKey) {
        this.duplicataPagamentoKey = duplicataPagamentoKey;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public BigDecimal getValorNominal() {
        return valorNominal;
    }

    public void setValorNominal(BigDecimal valorNominal) {
        this.valorNominal = valorNominal;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
}

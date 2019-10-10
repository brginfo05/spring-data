package com.example.demo;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CadastroCaixa implements Serializable {

    @Id
    private Long cadastroCaixaKey;

    private BigDecimal valor;

    public Long getCadastroCaixaKey() {
        return cadastroCaixaKey;
    }

    public void setCadastroCaixaKey(Long cadastroCaixaKey) {
        this.cadastroCaixaKey = cadastroCaixaKey;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}

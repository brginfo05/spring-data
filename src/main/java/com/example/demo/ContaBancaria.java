package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContaBancaria {

    @Id
    private Integer contaBancariaKey;

    private Long contaBancariaNumero;

    public Integer getContaBancariaKey() {
        return contaBancariaKey;
    }

    public void setContaBancariaKey(Integer contaBancariaKey) {
        this.contaBancariaKey = contaBancariaKey;
    }

    public Long getContaBancariaNumero() {
        return contaBancariaNumero;
    }

    public void setContaBancariaNumero(Long contaBancariaNumero) {
        this.contaBancariaNumero = contaBancariaNumero;
    }
}

package com.example.demo.entities;


import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Multa {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long valor;
    private Date datageracao;
    private String motivo;
    private String pago;

    //Construtores
    public Multa() {
    }

    // Construtor com argumentos
    public Multa(Long id, Long valor, Date datageracao, String motivo, String pago ) {
        this.id = id;
        this.valor = valor;
        this.datageracao = datageracao;
        this.motivo = motivo;
        this.pago = pago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public Date getDatageracao() {
        return datageracao;
    }

    public void setDatageracao(Date datageracao) {
        this.datageracao = datageracao;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }
}

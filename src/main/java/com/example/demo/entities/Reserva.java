package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.Date;
        @Entity
public class Reserva {
            @Id
            @Column(length = 11)
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date datareserva;
    private String status;
    private String livro;
    private String usuario;

    public Reserva(){

    }
    public Reserva(Long id, Date datareserva, String status, String livro, String usuario){
        this.id = id;
        this.datareserva = datareserva;
        this.status = status;
        this.livro = livro;
        this.usuario = usuario;

    }

            public Long getId() {
                return id;
            }

            public void setId(Long id) {
                this.id = id;
            }

            public Date getDatareserva() {
                return datareserva;
            }

            public void setDatareserva(Date datareserva) {
                this.datareserva = datareserva;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getLivro() {
                return livro;
            }

            public void setLivro(String livro) {
                this.livro = livro;
            }

            public String getUsuario() {
                return usuario;
            }

            public void setUsuario(String usuario) {
                this.usuario = usuario;
            }
        }

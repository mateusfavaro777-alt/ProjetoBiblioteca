package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Autor {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nacionalidade;
    private Date datanascimento;
    private String biografia;

    //Construtores
    public Autor() {
    }

    // Construtor com argumentos
    public Autor(Long id, String name, String nacionalidade, Date datanascimento, String biografia) {
        this.id = id;
        this.name = name;
        this.nacionalidade = nacionalidade;
        this.datanascimento = datanascimento;
        this.biografia = biografia;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public Date getDatanascimento(){
        return datanascimento;
    }
    public void setDatanascimento(Date datanascimento){
        this.datanascimento = datanascimento;
    }
    public String getBiografia(){
        return biografia;
    }
    public void setBiografia(String biografia){
        this.biografia = biografia;
    }
}

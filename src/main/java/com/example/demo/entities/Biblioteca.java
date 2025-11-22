package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class Biblioteca {

   @Id
   @Column(length = 11)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String endereco;
   private String telefone;
   private String listadelivros;
   private String listadeusuarios;
   private String funcionarios;

   public Biblioteca() {

   }

   public Biblioteca(Long id, String endereco, String telefone, String listadelivros, String listadeusuarios, String funcionarios){
      this.id = id;
      this.endereco = endereco;
      this.telefone = telefone;
      this.listadelivros = listadelivros;
      this.listadeusuarios = listadeusuarios;
      this.funcionarios = funcionarios;

   }

   public Long getId(){
      return id;
   }
   public void setId(Long id){
      this.id = id;
   }
   public String getEndereco(){
      return endereco;
   }
   public void setEndereco(String endereco){
      this.endereco = endereco;
   }
   public String getTelefone(){
      return telefone;
   }
   public void setTelefone(String telefone){
      this.telefone = telefone;
   }
   public String getListadelivros(){
      return listadelivros;
   }
   public void setListadelivros(String listadelivros){
      this.listadelivros = listadelivros;
   }
   public String getListadeusuarios(){
      return listadeusuarios;
   }
   public void setListadeusuarios(String listadeusuarios){
      this.listadeusuarios = listadeusuarios;
   }
   public String getFuncionarios(){
      return funcionarios;
   }
   public void setFuncionarios(String funcionarios){
      this.funcionarios = funcionarios;
   }




}

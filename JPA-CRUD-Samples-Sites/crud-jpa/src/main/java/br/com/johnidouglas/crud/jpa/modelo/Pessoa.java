package br.com.johnidouglas.crud.jpa.modelo;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.johnidouglas.crud.jpa.listener.PessoaListener;


@Entity
@EntityListeners({PessoaListener.class})
public class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String nome;
  
    private String email;   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
            
    
}

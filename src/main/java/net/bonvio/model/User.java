package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mil on 23.11.2015.
 * banana
 */

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String login;
    @JsonIgnore
    private String password;
    @OneToOne
    private Individual individual;

    public User() {
    }

    public User(String login, String password, Individual individual) {
        this.login = login;
        this.password = password;
        this.individual = individual;
    }

    public Integer getId() {
        return this.id;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public Individual getIndividual() {
        return individual;
    }
}



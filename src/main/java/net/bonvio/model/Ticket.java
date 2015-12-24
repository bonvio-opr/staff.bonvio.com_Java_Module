package net.bonvio.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by mil on 18.12.15.
 */

@Entity
public class Ticket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Type(type="text")
    private String name;
    @Type(type="text")
    private String description;
    private Date dateCreate;

    public Ticket() {
    }

    public Ticket(String name, String description, Date dateCreate) {
        this.name = name;
        this.description = description;
        this.dateCreate = dateCreate;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }
}

package net.bonvio.model;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mil on 24.12.15.
 */

@Entity
public class StaticPage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String link;
    private String title;
    @Type(type = "text")
    private String content;

    public StaticPage() {
    }

    public StaticPage(String link, String title, String content) {
        this.link = link;
        this.title = title;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }
    public String getLink() {
        return link;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
}

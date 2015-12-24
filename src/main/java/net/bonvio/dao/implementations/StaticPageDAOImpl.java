package net.bonvio.dao.implementations;

import net.bonvio.dao.generic.implementations.GenericDAOImpl;
import net.bonvio.dao.interfaces.StaticPageDAO;
import net.bonvio.model.StaticPage;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by mil on 23.11.2015.
 * banana
 */

@Repository
public class StaticPageDAOImpl extends GenericDAOImpl<StaticPage> implements StaticPageDAO {

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public StaticPage getByLink(String link) { return (StaticPage) entityManager.createQuery("select c from StaticPage c where c.link=:link").setParameter("link", link).getSingleResult();
    }

}

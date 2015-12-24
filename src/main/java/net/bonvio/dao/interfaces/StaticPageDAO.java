package net.bonvio.dao.interfaces;

import net.bonvio.dao.generic.interfaces.GenericDAO;
import net.bonvio.model.*;

import java.util.List;

/**
 * Created by mil on 30.11.15.
 * banana
 */
public interface StaticPageDAO extends GenericDAO<StaticPage> {
    StaticPage getByLink(String link);
}

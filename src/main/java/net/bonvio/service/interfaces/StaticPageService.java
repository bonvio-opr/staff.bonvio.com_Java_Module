package net.bonvio.service.interfaces;

import net.bonvio.model.StaticPage;
import net.bonvio.model.User;
import net.bonvio.service.generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by mil on 23.11.2015.
 */
public interface StaticPageService extends GenericService<StaticPage> {

    StaticPage getByLink(String link);

}


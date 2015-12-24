package net.bonvio.service.implementations;

import net.bonvio.dao.implementations.StaticPageDAOImpl;
import net.bonvio.model.StaticPage;
import net.bonvio.service.generic.GenericServiceImpl;
import net.bonvio.service.interfaces.StaticPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class StaticPageServiceImpl extends GenericServiceImpl<StaticPage> implements StaticPageService {

    @Autowired
    StaticPageDAOImpl staticPageDAO;

    @Override
    public StaticPage getByLink(String link) {


        System.out.println(staticPageDAO.getByLink(link));

        return staticPageDAO.getByLink(link);
    }
}

package net.bonvio.controller;

import net.bonvio.controller.generic.GenericController;
import net.bonvio.model.StaticPage;
import net.bonvio.service.interfaces.StaticPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("page")
public class StaticPageController extends GenericController<StaticPage> {

    @Autowired
    private StaticPageService staticPageService;

    /*@RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public Object getByLink(@RequestParam("link") String link) {
        return staticPageService.getByLink(link);
    }*/

    @RequestMapping(value = "/index.{link}", method = RequestMethod.GET)
    @ResponseBody
    public Object getByLink(@PathVariable String link) {
        return staticPageService.getByLink(link);
    }

}

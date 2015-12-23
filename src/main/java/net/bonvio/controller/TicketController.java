package net.bonvio.controller;

import net.bonvio.controller.generic.GenericController;
import net.bonvio.model.Ticket;
import net.bonvio.service.interfaces.TicketService;
import net.bonvio.settings.ResponseId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("/ticket")
public class TicketController extends GenericController<Ticket> {

    @Autowired
    TicketService ticketService;

    /**
     * Данные методы переопределены с целью указания занчений для спец полей данной Entity
     * @param ticket
     * @return null
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public Object save(@RequestBody Ticket ticket) {
        ticket.setDateCreate(new Date());
        ticketService.save(ticket);
        return new ResponseId(ticket.getId());
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody Ticket ticket) {
        ticket.setDateCreate(new Date());
        ticketService.update(ticket);
    }

}

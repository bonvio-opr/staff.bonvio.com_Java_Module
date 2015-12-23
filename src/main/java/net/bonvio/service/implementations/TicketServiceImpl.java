package net.bonvio.service.implementations;

import net.bonvio.model.Ticket;
import net.bonvio.service.generic.GenericServiceImpl;
import net.bonvio.service.interfaces.TicketService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class TicketServiceImpl extends GenericServiceImpl<Ticket> implements TicketService {

}

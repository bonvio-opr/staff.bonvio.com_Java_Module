package net.bonvio.controller;

import net.bonvio.model.Phone;
import net.bonvio.controller.generic.GenericController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("/phone")
public class PhoneController extends GenericController<Phone> {

}

package com.rendicion.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/factura")
public class FacturaController {

	@GetMapping("/form/{clinete_id}")
	public String crear(@PathVariable(value="clientId")) {
		
	}

}

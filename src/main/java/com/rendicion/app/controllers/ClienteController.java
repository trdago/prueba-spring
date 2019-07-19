package com.rendicion.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rendicion.app.models.dao.IClienteDao;
import com.rendicion.app.models.entity.Cliente;

@Controller
public class ClienteController {
	
	@Autowired
	@Qualifier("ClienteDaoJPA")
	private IClienteDao clienteDao;

	@GetMapping(value="/lista")
	public @ResponseBody List<Cliente> listar() {
	return clienteDao.findAll();
	}
}

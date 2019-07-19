package com.rendicion.app.models.dao;

import java.util.List;

import com.rendicion.app.models.entity.Cliente;

public interface IClienteDao {
	
	public List<Cliente> findAll();
	
	

}

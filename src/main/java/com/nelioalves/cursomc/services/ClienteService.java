package com.nelioalves.cursomc.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.demain.Cliente;
import com.nelioalves.cursomc.repositories.ClienteRepository;
import com.nelioalves.cursomc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
			Cliente obj = repo.findOne(id);
			if (obj == null) {
				throw new ObjectNotFoundException("Objeto não encotrado! Id: " + id
						+ ", Tipo: " + Cliente.class.getName());
			}
			return obj;
	}

}

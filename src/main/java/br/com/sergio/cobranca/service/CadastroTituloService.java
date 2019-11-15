package br.com.sergio.cobranca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.sergio.cobranca.model.Titulo;
import br.com.sergio.cobranca.repository.Titulos;

@Service
public class CadastroTituloService {

	@Autowired
	private Titulos titulos;
	
	public void salvar(Titulo titulo) {
		try {
		titulos.save(titulo);
		}catch (DataIntegrityViolationException e){
			throw new IllegalArgumentException("Formato de data invalido!");
		}
		
	}

	public void delete(Long codigo) {
		titulos.deleteById(codigo);
	}
	
	
}

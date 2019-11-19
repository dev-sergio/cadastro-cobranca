package br.com.sergio.cobranca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.sergio.cobranca.model.StatusTitulo;
import br.com.sergio.cobranca.model.Titulo;
import br.com.sergio.cobranca.repository.Titulos;
import br.com.sergio.cobranca.repository.filter.TituloFilter;

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

	public StatusTitulo receber(Long codigo) {
		Optional<Titulo> titulo = titulos.findById(codigo);
		
		titulo.get().setStatus(StatusTitulo.RECEBIDO);
		titulos.save(titulo.get());
		
		return titulo.get().getStatus();
		
	}
	
	public List<Titulo> filtrar(TituloFilter filtro){
		String descricao = filtro.getDescricao() == null ? "" : filtro.getDescricao();
		return titulos.findByDescricaoContaining(descricao);
	}
	
	
}

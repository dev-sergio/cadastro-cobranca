package br.com.sergio.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sergio.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long>{

}

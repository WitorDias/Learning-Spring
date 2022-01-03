package br.com.treinaweb.twgerenciadortarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twgerenciadortarefas.modelos.TarefaModel;

public interface RepositorioTarefa extends JpaRepository<TarefaModel, Long>{

}

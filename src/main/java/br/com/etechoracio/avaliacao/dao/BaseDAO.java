package br.com.etechoracio.avaliacao.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract interface  BaseDAO<T> extends JpaRepository<T, Long> {

}

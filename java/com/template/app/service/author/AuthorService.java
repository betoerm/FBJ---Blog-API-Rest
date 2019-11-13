package com.template.app.service.author;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.template.app.entity.AuthorEntity;

@Stateless
public class AuthorService {
	
	@PersistenceContext(unitName = "author-persistence-unit")
	private List<AuthorEntity> getAllAuthors() {
		List<AuthorEntity> listAuthors = EntityManager.createNamedQuery("AuthorEntity.retrieveAll").getResultList();
		return listAuthors;
	}
	
	public AuthorEntity create(AuthorEntity authorEntity) {
		EntityManager.persist(AuthorEntity);
		return authorEntity;
	}
	

}

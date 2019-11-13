package com.template.app.rest.company

import java.util.List;
import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.template.app.entity.AuthorEntity;
import com.template.app.exception.AppException;
import com.template.app.service.author.AuthorService;

@Path("/author")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})

public class AuthorRest {
	
	private final static Logger LOGGER = Logger.getLogger(AuthorRest.class.getName());
	
	@Inject
	private AuthorService authorservice;
	
	@GET
	@Path("/all")
	public List<AuthorEntity> getAllAuthor() throws AppException {
		LOGGER.info("AuthorRest.getAllAuthors");
		List<AuthorEntity> listAuthors = AuthorService.getAllAuthors();
	}
}

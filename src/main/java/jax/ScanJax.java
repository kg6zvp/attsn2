package jax;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Scan;

@Path("scans")
@Produces(MediaType.APPLICATION_JSON)
public class ScanJax {

	@PersistenceContext
	EntityManager em;

	@GET
	@SuppressWarnings("unchecked")
	public List<Scan> data() {
		return (List<Scan>)em.createQuery("SELECT data FROM scans data").getResultList();
	}
	
	@GET
	@Path("/{id}")
	public Scan get(@PathParam("id")Integer id) {
		return em.find(Scan.class, id);
	}
}

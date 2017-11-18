package jax;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Scan;

@Path("scans")
@Produces(MediaType.APPLICATION_JSON)
public class ScanJax {

	@PersistenceContext
	EntityManager em;

	@GET
	public Scan data() {
		return em.find(Scan.class, 1);
	}

}

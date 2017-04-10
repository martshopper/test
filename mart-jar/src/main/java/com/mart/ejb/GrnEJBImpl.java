/**
 * 
 */
package com.mart.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mart.entity.Grn;
import com.mart.utilities.ResponseStatus;

/**
 * @author Hitesh
 *
 */
@Stateless
public class GrnEJBImpl implements GrnEJBIf {

	@PersistenceContext(unitName="martUnit")
	private EntityManager em;
	
	@Override
	public ResponseStatus addGrn(Grn grn) {
		ResponseStatus responseStatus = new ResponseStatus();
		try {
			if(grn != null) {
				em.persist(grn);
				em.flush();
				responseStatus.setStatus(true);
				responseStatus.setPersistingId(grn.getId());
			}
		}catch (Exception e) {
			responseStatus.setStatus(false);
			responseStatus.setErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		return responseStatus;
	}

}

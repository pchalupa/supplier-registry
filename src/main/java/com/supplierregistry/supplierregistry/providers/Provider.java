package com.supplierregistry.supplierregistry.providers;

import com.supplierregistry.supplierregistry.entities.Subject;

public interface Provider {
	/**
	 * Find subject by its ICO.
	 *
	 * @param ico ICO of the subject
	 * @return Subject
	 */
	public Subject findByIco(String ico);
}

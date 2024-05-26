package com.supplierregistry.supplierregistry.providers;

import com.supplierregistry.supplierregistry.entities.Subject;

public interface Provider {
	/**
	 * Find subject by its ICO.
	 *
	 * @return Subject
	 */
	public Subject findByIco(String ico);
}

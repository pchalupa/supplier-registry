package com.supplierregistry.supplierregistry.providers;

public interface Provider {
	/**
	 * Find subject by its ICO.
	 *
	 * @return Subject
	 */
	public Subject findByIco(String ico);
}

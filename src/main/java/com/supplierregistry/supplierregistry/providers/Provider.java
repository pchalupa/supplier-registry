package com.supplierregistry.supplierregistry.providers;

import com.supplierregistry.supplierregistry.entities.SupplierDTO;

public interface Provider {
	/**
	 * Find subject by its ICO.
	 *
	 * @return Subject
	 */
	public SupplierDTO findByIco(String ico);
}

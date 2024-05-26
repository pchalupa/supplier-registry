package com.supplierregistry.supplierregistry.providers.Ares;

import org.springframework.stereotype.Component;

import com.supplierregistry.supplierregistry.entities.Address;
import com.supplierregistry.supplierregistry.entities.Subject;
import com.supplierregistry.supplierregistry.providers.Provider;
import com.supplierregistry.supplierregistry.providers.Ares.entities.FindByIconResponse;
import com.supplierregistry.supplierregistry.providers.Ares.repository.Ares;

/**
 * Provider for ARES.
 */
@Component
public class AresProvider implements Provider {

	/**
	 * Find subject by its ICO.
	 *
	 * @param ico ICO of the subject
	 * @return Subject
	 */
	@Override
	public Subject findByIco(String ico) {
		FindByIconResponse data = Ares.findByIco(ico);

		Address address = Address.create(data.sidlo.ulice, data.sidlo.obec, data.sidlo.psc,
				data.sidlo.stat);
		Subject subject = Subject.create(data.ico, data.obchodniJmeno, address);

		return subject;
	}
}

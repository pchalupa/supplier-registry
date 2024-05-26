package com.supplierregistry.supplierregistry.providers.Ares;

import org.springframework.stereotype.Component;

import com.supplierregistry.supplierregistry.entities.AddressDTO;
import com.supplierregistry.supplierregistry.entities.SupplierDTO;
import com.supplierregistry.supplierregistry.errors.NotFound;
import com.supplierregistry.supplierregistry.providers.Provider;
import com.supplierregistry.supplierregistry.providers.Ares.entities.FindByIconResponse;
/*import com.supplierregistry.supplierregistry.providers.Ares.repository.Ares;*/
import com.supplierregistry.supplierregistry.utilities.Log;

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
	public SupplierDTO findByIco(String ico) {
		/*try {
			FindByIconResponse data = Ares.findByIco(ico);

			if (data == null) {
				throw new NotFound(ico + " not found");
			}

			AddressDTO address = new AddressDTO(data.sidlo.ulice, data.sidlo.obec, data.sidlo.psc,
					data.sidlo.stat);
			SupplierDTO supplier = new SupplierDTO(data.obchodniJmeno, data.ico, data.pravniForma, data.datumVzniku,
					data.datumZaniku, address);

			return supplier;
		} catch (Exception e) {
			Log.debug(e.getMessage());
			return null;
		}*/
		return null;
	}
}

package com.supplierregistry.supplierregistry.providers.Ares.entities;

import java.util.Date;

public class FindByIconResponse {
	public String ico;
	public String obchodniJmeno;
	public Address sidlo;
	public String pravniForma;
	public String financniUrad;
	public Date datumVzniku;
	public Date datumAktualizace;
	public Date datumZaniku;
	public String icoId;
	public Address adresaDorucovaci;
	public String primarniZdroj;

	public class Address {
		public String ulice;
		public String cisloPopisne;
		public String obec;
		public String psc;
		public String stat;
	}
}

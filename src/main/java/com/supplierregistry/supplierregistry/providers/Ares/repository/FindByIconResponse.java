package com.supplierregistry.supplierregistry.providers.Ares.repository;

public class FindByIconResponse {
	public String ico;
	public String obchodniJmeno;
	public Address sidlo;
	public String pravniForma;
	public String financniUrad;
	public String datumVzniku;
	public String datumAktualizace;
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

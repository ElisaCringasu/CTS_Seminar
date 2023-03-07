package cts.s02.principii_clean_code.clase;

import java.util.Scanner;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumiriProiecte;

	protected static Integer pragAcceptat = 80;

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void afisareStatus(){
		System.out.println("Aplicantul " + this.nume + " " + this.prenume +
				(this.punctaj > Aplicant.pragAcceptat ? " " : " nu ") + " a fost acceptat");
	}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}


	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiecte) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumiriProiecte = denumiriProiecte;
	}
	public int getNrProiecte() {
		return nrProiecte;
	}
	public void setNrProiecte(int nrProiecte) {
		this.nrProiecte = nrProiecte;
	}

	public abstract void afisareFinantare();

	public String[] getDenumiriProiecte() {
		return denumiriProiecte;
	}

	public void setDenumiriProiecte(String[] denumiriProiecte) {
		this.denumiriProiecte = denumiriProiecte;
	}



}
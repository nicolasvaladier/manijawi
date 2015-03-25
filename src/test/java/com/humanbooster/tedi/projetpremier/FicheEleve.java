package com.humanbooster.tedi.projetpremier;

public class FicheEleve {
	private String nomeleve = "";
	private String prenomeleve = "";

	public String getNomeleve() {
		return nomeleve;
	}

	public String getPrenomeleve() {
		return prenomeleve;
	}

	public void setNomeleve(final String nomeleve) {
		this.nomeleve = nomeleve;
	}

	public void setPrenomeleve(final String prenomeleve) {
		this.prenomeleve = prenomeleve;
	}

	public void FicheEleve(final String nomeleve, final String prenomeleve) {
		this.nomeleve = nomeleve;
		this.prenomeleve = prenomeleve;
	}
}

package com.example.u4d21.services;

import org.springframework.stereotype.Service;

import com.example.u4d21.entities.Postazione;
import com.example.u4d21.entities.Utente;
import com.example.u4d21.exceptions.UnsupportedLanguageException;

@Service
public class MyServices {
	public String geteffettuaPrenotazione() {
		if (language.equalsIgnoreCase("it")) {
			return "La prenotazione vale per un solo giorno e può essere"
					+ " effettuata solo se per quel giorno la postazione risulta libera";
		} else if (language.equalsIgnoreCase("en")) {
			return "The reservation is valid for one day only and can be"
					+ " made only if the workstation is available for that day";
		} else {
			throw new UnsupportedLanguageException("Unsupported language: " + language);
		}
	}

	public Utente ricercaPostazione() {

	}

	public Utente maxPrenotazioni() {

	}

	public Postazione giorni() {

	}

}

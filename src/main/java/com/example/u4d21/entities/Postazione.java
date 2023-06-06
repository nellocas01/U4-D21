package com.example.u4d21.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Postazione {
	private int id;
	private String descrizione;
	private Tipo tipo;
	private int numeroMax;

	public enum Tipo {
		PRIVATO, OPENSPACE, SALA_RIUNIONI;
	}
}

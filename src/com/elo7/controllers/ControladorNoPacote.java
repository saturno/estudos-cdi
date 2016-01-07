package com.elo7.controllers;

import javax.annotation.PostConstruct;

public class ControladorNoPacote {

	@PostConstruct
	public void init() {
		System.out.println("ControladorNoPacote pronto!");
	}

}

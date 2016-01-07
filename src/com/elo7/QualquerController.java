package com.elo7;

import javax.annotation.PostConstruct;

public class QualquerController {

	@PostConstruct
	public void init() {
		System.out.println("QualquerController pronto!");
	}

}

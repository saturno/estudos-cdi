package com.elo7;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.AnnotatedType;
import javax.enterprise.inject.spi.Extension;
import javax.enterprise.inject.spi.ProcessAnnotatedType;

public class ControllerPorConvensaoExtension implements Extension {

	void configuraControllers(@Observes ProcessAnnotatedType pat) {
		AnnotatedType at = pat.getAnnotatedType();
		Class classe = at.getJavaClass();
		if (classe.getPackage().getName().endsWith("controllers") || classe.getSimpleName().endsWith("Controller")) {
			pat.setAnnotatedType(new AnnotatedTypeControllerWrapper(at));
			System.out.println("Controlador encontrado: " + classe.getName());
		}
	}
}

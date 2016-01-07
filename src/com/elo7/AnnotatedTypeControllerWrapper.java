package com.elo7;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

import javax.enterprise.inject.spi.AnnotatedType;
import javax.enterprise.util.AnnotationLiteral;

public class AnnotatedTypeControllerWrapper implements AnnotatedType {

	private AnnotatedType wrapped;

	public AnnotatedTypeControllerWrapper(AnnotatedType at) {
		this.wrapped = at;
	}

	@Override
	public Set<Annotation> getAnnotations() {
		Set<Annotation> annotations = new HashSet<>(wrapped.getAnnotations());
		annotations.add(new AnnotationLiteral<Controller>() {
		});
		return annotations;
	}

	@Override
	public <T extends Annotation> T getAnnotation(Class<T> arg0) {
		return wrapped.getAnnotation(arg0);
	}

	@Override
	public Type getBaseType() {
		return wrapped.getBaseType();
	}

	@Override
	public Set<Type> getTypeClosure() {
		return wrapped.getTypeClosure();
	}

	@Override
	public boolean isAnnotationPresent(Class<? extends Annotation> arg0) {
		return wrapped.isAnnotationPresent(arg0);
	}

	@Override
	public Set getConstructors() {
		return wrapped.getConstructors();
	}

	@Override
	public Set getFields() {
		return wrapped.getFields();
	}

	@Override
	public Class getJavaClass() {
		return wrapped.getJavaClass();
	}

	@Override
	public Set getMethods() {
		return wrapped.getMethods();
	}

}

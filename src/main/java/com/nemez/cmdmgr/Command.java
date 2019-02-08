package com.nemez.cmdmgr;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target (ElementType.METHOD)
@Retention (RetentionPolicy.RUNTIME)
public @interface Command {
	String hook();

	AsyncType async() default AsyncType.NEVER;

	enum AsyncType {
		NEVER, ALWAYS;
	}
}

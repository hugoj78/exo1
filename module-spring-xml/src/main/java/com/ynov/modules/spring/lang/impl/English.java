/**
 * 
 */
package com.ynov.modules.spring.lang.impl;

import org.springframework.stereotype.Component;

import com.ynov.modules.spring.lang.Language;

/**
 * @author bilonjea
 *
 */
//@Component
public class English implements Language {

	@Override
	public String getGreeting() {
		return "Hello";
	}

	@Override
	public String getBye() {
		return "Bye bye";
	}

}

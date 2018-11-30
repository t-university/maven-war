package com.tsystems.tu;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.apache.log4j.Logger;

/**
 * Clase BackingBean demo.
 * @author krequena
 *
 */
@RequestScoped
@ManagedBean
public class DemoBackingBean {

	private static final Logger LOGGER = Logger.getLogger(DemoBackingBean.class);

	private String dato;

	/**
	 * @return the dato
	 */
	public String getDato() {
		return dato;
	}

	/**
	 * @param dato the dato to set
	 */
	public void setDato(String dato) {
		this.dato = dato;
	}

	public void operacion() {
		LOGGER.info("Dato: " + this.dato);
	}

}

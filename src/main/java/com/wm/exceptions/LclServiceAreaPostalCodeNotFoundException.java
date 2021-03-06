/*
 * Created on 2017-09-12 ( Time 13:14:27 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */

package com.wm.exceptions;

public class LclServiceAreaPostalCodeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -1L;

	public LclServiceAreaPostalCodeNotFoundException(Integer id) {
		super("LclServiceAreaPostalCode not found with id: " + id.toString());
	}

	public LclServiceAreaPostalCodeNotFoundException(String lclserviceareapostalcode) {
		super("LclServiceAreaPostalCode " + lclserviceareapostalcode + " not found!");
	}
}

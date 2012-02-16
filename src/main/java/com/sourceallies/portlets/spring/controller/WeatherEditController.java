/**
 * 
 */
package com.sourceallies.portlets.spring.controller;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import com.sourceallies.webservices.WeatherServiceClient;

/**
 * @author lsah
 * 
 */
@Named("editController")
public class WeatherEditController implements Serializable/*
														 * extends
														 * AbstractController
														 */{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3101026327888688876L;
	@Inject
	@Named("weatherServiceClient")
	private WeatherServiceClient weatherServiceClient;

	// @Override
	// protected ModelAndView handleRenderRequestInternal(RenderRequest request,
	// RenderResponse response) throws Exception {
	// return new ModelAndView("Edit");
	// }
}

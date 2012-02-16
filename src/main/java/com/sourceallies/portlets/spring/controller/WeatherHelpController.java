/**
 * 
 */
package com.sourceallies.portlets.spring.controller;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import com.sourceallies.webservices.WeatherServiceClient;

/**
 * @author lsah
 * 
 */
@Named("helpController")
public class WeatherHelpController implements Serializable/*
														 * extends
														 * AbstractController
														 */{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7181491818279572998L;
	private static final Logger LOGGER = Logger
			.getLogger(WeatherHelpController.class.getName());
	@Inject
	@Named("weatherServiceClient")
	private WeatherServiceClient weatherServiceClient;

	// @Override
	// protected ModelAndView handleRenderRequestInternal(RenderRequest request,
	// RenderResponse response) throws Exception {
	// ModelAndView modelAndView = new ModelAndView("Help");
	// return modelAndView;
	// }

}

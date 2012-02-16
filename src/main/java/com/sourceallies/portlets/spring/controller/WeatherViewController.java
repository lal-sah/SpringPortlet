/**
 * 
 */
package com.sourceallies.portlets.spring.controller;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import com.cdyne.ws.weatherws.WeatherReturn;
import com.sourceallies.webservices.StockWebServiceClient;
import com.sourceallies.webservices.WeatherServiceClient;

/**
 * @author lsah
 * 
 */
@Named("viewController")
public class WeatherViewController implements Serializable/*
														 * extends
														 * AbstractController
														 */{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8811407513884269900L;

	private static final Logger LOGGER = Logger
			.getLogger(WeatherViewController.class.getName());

	// private static final String PAGE_EDIT = "edit";

	private static final DateFormat DATE_FORMAT = new SimpleDateFormat(
			"MM/dd/yyyy hh:mm:ss a z");

	@Inject
	@Named("weatherServiceClient")
	private WeatherServiceClient weatherServiceClient;

	@Inject
	@Named("stockWebServiceClient")
	private StockWebServiceClient stockWebServiceClient;

	private WeatherReturn weatherReturn;

	private String zipCode = "50312";

	private String currentTime = DATE_FORMAT.format(new Date());

	/**
	 * @return the currentTime
	 */
	public String getCurrentTime() {
		return currentTime;
	}

	/**
	 * @param currentTime
	 *            the currentTime to set
	 */
	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public WeatherViewController() {
		LOGGER.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Weather view controller constructed: "
				+ this);
	}

	// @PostConstruct
	// public void postConstruct() {
	// LOGGER.info("*********************************************************************************************");
	// LOGGER.info("Weather Service Client Injected: " + weatherServiceClient);
	// LOGGER.info("*********************************************************************************************");
	// LOGGER.info("WeatherViewController Instance: " + this);
	// }

	// @Override
	// protected ModelAndView handleRenderRequestInternal(RenderRequest request,
	// RenderResponse response) throws Exception {
	// LOGGER.info("Weather service client: " + weatherServiceClient);
	// weatherReturn = weatherServiceClient.getWeatherByZipCode("50312");
	// LOGGER.info("Temperature (Spring Portlet MVC): "
	// + weatherReturn.getTemperature());
	//
	// ModelAndView modelAndView = new ModelAndView("View");
	// modelAndView.addObject("weatherReturn", weatherReturn);
	// return modelAndView;
	// }

	public String updateWeather() {
		LOGGER.info("Weather service client: " + weatherServiceClient);
		LOGGER.info("Zip Code: " + zipCode);
		weatherReturn = weatherServiceClient.getWeatherByZipCode(zipCode);
		LOGGER.info("Temperature (Spring Portlet MVC): "
				+ weatherReturn.getTemperature());

//		LOGGER.info("Getting update: ");
//		GlobalQuote globalQuote = stockWebServiceClient
//				.getGlobalDelayedQuote("BMW.DE");
//		LOGGER.info("NASDAQ:GOOG: Low" + globalQuote.getLow());
//		LOGGER.info("NASDAQ:GOOG: High" + globalQuote.getHigh());

		return null;
	}

	public void updateTime() {
		// LOGGER.info("------------------>>>>>>Updating time...");
		this.currentTime = DATE_FORMAT.format(new Date());
	}

	/**
	 * @return the weatherServiceClient
	 */
	public WeatherServiceClient getWeatherServiceClient() {
		return weatherServiceClient;
	}

	/**
	 * @param weatherServiceClient
	 *            the weatherServiceClient to set
	 */
	public void setWeatherServiceClient(
			WeatherServiceClient weatherServiceClient) {
		this.weatherServiceClient = weatherServiceClient;
		LOGGER.info(">>>>>>>>>>>>>>>>>>>>>>>>Weather Service Client Injected: "
				+ weatherServiceClient);

	}

	/**
	 * @return the weatherReturn
	 */
	public WeatherReturn getWeatherReturn() {
		if (this.weatherReturn == null) {
			LOGGER.info("Weather service client: " + weatherServiceClient);
			weatherReturn = weatherServiceClient.getWeatherByZipCode("50312");
			LOGGER.info("Temperature (Spring Portlet MVC): "
					+ weatherReturn.getTemperature());
		}
		return weatherReturn;
	}

	/**
	 * @param weatherReturn
	 *            the weatherReturn to set
	 */
	public void setWeatherReturn(WeatherReturn weatherReturn) {
		this.weatherReturn = weatherReturn;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 *            the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}

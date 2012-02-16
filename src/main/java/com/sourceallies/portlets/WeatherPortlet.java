/**
 * 
 */
package com.sourceallies.portlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.cdyne.ws.weatherws.WeatherReturn;
import com.sourceallies.webservices.WeatherServiceClient;

/**
 * @author lsah
 * 
 */
public class WeatherPortlet extends GenericPortlet {

	private static final Logger LOGGER = Logger.getLogger(WeatherPortlet.class
			.getName());

	@Inject
	@Named("weatherServiceClient")
	private WeatherServiceClient weatherServiceClient;

	// @Override
	// public void init() throws PortletException {
	// super.init();
	// this.weatherServiceClient = new WeatherServiceClient();
	// }

	@Override
	protected void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		LOGGER.info("Weather Service Client: " + weatherServiceClient);
		WeatherReturn weatherReturn = weatherServiceClient
				.getWeatherByZipCode("50021");
		StringBuffer buffer = new StringBuffer();
		buffer.append("Weather Update: <br />");
		buffer.append("City: ").append(weatherReturn.getCity())
				.append("<br />Temperature: ")
				.append(weatherReturn.getTemperature())
				.append("<br />Description: ")
				.append(weatherReturn.getDescription());
		writer.write(buffer.toString());
		// writer.write("Weather update VIEW coming soon!");
		writer.close();
	}

	@Override
	protected void doHelp(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.write("Weather update HELP coming soon!");
		writer.close();
	}

	@Override
	protected void doEdit(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.write("Weather update EDIT coming soon!");
		writer.close();
	}
}

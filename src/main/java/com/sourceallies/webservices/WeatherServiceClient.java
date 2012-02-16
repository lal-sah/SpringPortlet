/**
 * 
 */
package com.sourceallies.webservices;

import java.util.Date;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.springbyexample.person.schema.beans.GetPersonsRequest;
import org.springbyexample.person.schema.beans.Person;
import org.springbyexample.person.schema.beans.PersonResponse;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.cdyne.ws.weatherws.GetCityWeatherByZIP;
import com.cdyne.ws.weatherws.GetCityWeatherByZIPResponse;
import com.cdyne.ws.weatherws.WeatherReturn;

/**
 * @author lsah
 * 
 */
@Named(value = "weatherServiceClient")
public class WeatherServiceClient {

	private static final Logger LOGGER = Logger
			.getLogger(WeatherServiceClient.class.getName());

	@Inject
	@Named("webServiceTemplate")
	private WebServiceTemplate webServiceTemplate;

	// @Inject
	// @Named("soapAction")
	private String soapAction = "http://ws.cdyne.com/WeatherWS/GetCityWeatherByZIP";

	@Inject
	@Named("holidayServiceClient")
	private HolidayServiceClient holidayServiceClient;

	@Inject
	@Named("personWSTemplate")
	private WebServiceTemplate personWSTemplate;

	public WeatherServiceClient() {
		LOGGER.info(">>>>>>> WeatherServiceClient contructed: " + this);
	}

	/**
	 * Gets person list.
	 */
	public PersonResponse getPersons(GetPersonsRequest request) {
		PersonResponse response = (PersonResponse) personWSTemplate
				.marshalSendAndReceive(request);

		return response;

	}

	/**
	 * @param zipCode
	 * @return the weather for the given zip code.
	 */
	public WeatherReturn getWeatherByZipCode(String zipCode) {
		LOGGER.info("Zip Code: " + zipCode);
		LOGGER.info("webServiceTemplate: " + webServiceTemplate);
		LOGGER.info(">>>>>>>> SOAP Action: " + soapAction);

		GetCityWeatherByZIP request = new GetCityWeatherByZIP();
		request.setZIP(zipCode);
		SoapActionCallback callback = new SoapActionCallback(soapAction);
		GetCityWeatherByZIPResponse response = null;
		try {
			response = (GetCityWeatherByZIPResponse) webServiceTemplate
					.marshalSendAndReceive(request, callback);
		} catch (Exception e) {
			LOGGER.severe("ERROR occurred while retrieving weather!");
			e.printStackTrace();
		}

		holidayServiceClient.bookHoliday("", new Date(), new Date());
		GetPersonsRequest personsRequest = new GetPersonsRequest();
		personsRequest.setName("Lal Sah");
		PersonResponse presponse = getPersons(personsRequest);
		LOGGER.info("Response person: " + presponse);
		for (Person person : presponse.getPerson()) {
			LOGGER.info("Id: " + person.getId() + ", Name: "
					+ person.getFirstName());
		}

		return response.getGetCityWeatherByZIPResult();
	}

	/**
	 * @return the webServiceTemplate
	 */
	public WebServiceTemplate getWebServiceTemplate() {
		return webServiceTemplate;
	}

	/**
	 * @param webServiceTemplate
	 *            the webServiceTemplate to set
	 */
	public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
		this.webServiceTemplate = webServiceTemplate;
		LOGGER.info(">>>>>>>>>>>>>Instance of WSC: " + this);
		LOGGER.info(">>>>>>>>>>Web Service Template is set to: "
				+ webServiceTemplate);
	}

	/**
	 * @return the soapAction
	 */
	public String getSoapAction() {
		return soapAction;
	}

	/**
	 * @param soapAction
	 *            the soapAction to set
	 */
	public void setSoapAction(String soapAction) {
		this.soapAction = soapAction;
		LOGGER.info(">>>>>>>>>>>>>>>>SOAP Action is set to: " + soapAction);
	}

}

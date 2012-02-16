/**
 * 
 */
package com.sourceallies.webservices;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.ws.client.core.WebServiceTemplate;

import com.sourceallies.hr.schemas.EmployeeType;
import com.sourceallies.hr.schemas.HolidayRequest;
import com.sourceallies.hr.schemas.HolidayType;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

/**
 * @author lsah
 * 
 */
@Named("holidayServiceClient")
public class HolidayServiceClient {

	private static final Logger LOGGER = Logger
			.getLogger(HolidayServiceClient.class.getName());

	// @Inject
	// @Named("holidaySoapAction")
	// private String soapAction;

	@Inject
	@Named(value = "holidayServiceTemplate")
	private WebServiceTemplate webServiceTemplate;

	public void bookHoliday(String name, Date startDate, Date endDate) {
		try {
			LOGGER.info("name: " + name);
			LOGGER.info("start date: " + startDate);
			LOGGER.info("end date: " + endDate);
			HolidayRequest request = new HolidayRequest();
			EmployeeType employeeType = new EmployeeType();
			employeeType.setNumber(545465);
			employeeType.setFirstName("John");
			employeeType.setLastName("Manning");
			request.setEmployee(employeeType);

			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			GregorianCalendar calendar = new GregorianCalendar();

			HolidayType holidayType = new HolidayType();
			calendar.setTimeInMillis(format.parse("2012-02-15").getTime());
			holidayType.setStartDate(new XMLGregorianCalendarImpl(calendar));
			calendar.setTimeInMillis(format.parse("2012-02-22").getTime());
			holidayType.setEndDate(new XMLGregorianCalendarImpl(calendar));
			request.setHoliday(holidayType);

			webServiceTemplate.marshalSendAndReceive(request);
			// SoapActionCallback callback = new SoapActionCallback(soapAction);
			// webServiceTemplate.marshalSendAndReceive(request, callback);
		} catch (Exception e) {
			LOGGER.severe("ERROR OCCURRED while calling holiday service");
			e.printStackTrace();
		}
	}
}

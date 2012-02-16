package com.sourceallies.portlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author lsah
 * 
 */
public class HelloWorld extends GenericPortlet {

	private static final Logger LOGGER = Logger.getLogger(HelloWorld.class

	.getName());

	@Override
	protected void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		LOGGER.info("VIEW MODE invoked!");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.write("Hello World VIEW MODE using overriding!");
		writer.close();
	}

	@Override
	protected void doHelp(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		LOGGER.info("HELP mode invoked!");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.write("HW HELP using overriding!");
		writer.close();
	}

	@Override
	protected void doEdit(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		LOGGER.info("EDIT mode invoked!");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.write("HW EDIT using overriding!");
		writer.close();
	}

	// /**
	// * @param request
	// * @param response
	// * @throws PortletException
	// * @throws IOException
	// * @throws UnavailableException
	// */
	// @RenderMode(name = "VIEW")
	// public void sayHello(RenderRequest request, RenderResponse response)
	// throws PortletException, IOException, UnavailableException {
	// LOGGER.info("VIEW MODE invoked!");
	// response.setContentType("text/html");
	// PrintWriter writer = response.getWriter();
	// writer.write("Hello World VIEW MODE using annotation!");
	// writer.close();
	// }
	//
	// /**
	// * @param request
	// * @param response
	// * @throws PortletException
	// * @throws IOException
	// * @throws UnavailableException
	// */
	// @RenderMode(name = "HELP")
	// public void help(RenderRequest request, RenderResponse response)
	// throws PortletException, IOException, UnavailableException {
	// LOGGER.info("HELP mode invoked!");
	// response.setContentType("text/html");
	// PrintWriter writer = response.getWriter();
	// writer.write("HW HELP using overriding!");
	// writer.close();
	// }
}
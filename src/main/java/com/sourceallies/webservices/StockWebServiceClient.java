/**
 * 
 */
package com.sourceallies.webservices;

import java.util.logging.Logger;

import javax.inject.Named;

import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * @author lsah
 * 
 */
@Named("stockWebServiceClient")
public class StockWebServiceClient {

	private static final Logger LOGGER = Logger
			.getLogger(StockWebServiceClient.class.getName());

	// @Inject
	// @Named("stockWSTemplate")
	private WebServiceTemplate webServiceTemplate;

	// @Inject
	// @Named("getGlobalDelayedQuoteSoapAction")
	private String soapAction;

	// /**
	// * @param identifier
	// * @return
	// */
	// public GlobalQuote getGlobalDelayedQuote(String identifier) {
	// GlobalQuote quote = null;
	// GetGlobalDelayedQuote payLoad = new GetGlobalDelayedQuote();
	// payLoad.setIdentifier(identifier);
	// payLoad.setIdentifierType(IdentifierTypes.SYMBOL);
	// SoapActionCallback callback = new SoapActionCallback(soapAction);
	// try {
	// quote = ((GetGlobalDelayedQuoteResponse) webServiceTemplate
	// .marshalSendAndReceive(quote, callback))
	// .getGetGlobalDelayedQuoteResult();
	// } catch (Exception e) {
	// LOGGER.severe("ERROR OCCURRED while getting stock quote: "
	// + e.getMessage());
	// e.printStackTrace();
	// }
	//
	// return quote;
	// }
	//
	// /**
	// * @param identifiers
	// * @return
	// */
	// public List<GlobalQuote> getGlobalQuotes(List<String> identifiers) {
	// List<GlobalQuote> globalQuotes = null;
	// GetGlobalDelayedQuotes payLoad = new GetGlobalDelayedQuotes();
	// StringBuilder builder = new StringBuilder();
	// for (String identifier : identifiers) {
	// builder.append(identifier).append(",");
	// }
	// payLoad.setIdentifiers(builder.substring(0, builder.length() - 1));
	// payLoad.setIdentifierType(IdentifierTypes.SYMBOL);
	// SoapActionCallback callback = new SoapActionCallback(soapAction);
	// try {
	// globalQuotes = ((GetGlobalDelayedQuotesResponse) webServiceTemplate
	// .marshalSendAndReceive(payLoad, callback))
	// .getGetGlobalDelayedQuotesResult().getGlobalQuote();
	// } catch (Exception e) {
	// LOGGER.severe("ERROR OCCURRED while getting stock quotes: "
	// + e.getMessage());
	// e.printStackTrace();
	// }
	// return globalQuotes;
	// }
}

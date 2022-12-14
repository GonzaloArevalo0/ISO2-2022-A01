package org.it6.server_controller;

public class BusinessOwner extends Client {

	private String business_name;
	private String type;

	public String getBusiness_name() {
		return this.business_name;
	}

	/**
	 * 
	 * @param business_name
	 */
	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}

	public String getType() {
		return this.type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 
	 * @param business_name
	 * @param type
	 */
	public BusinessOwner(String business_name, String type) {
		// TODO - implement BusinessOwner.BusinessOwner
		throw new UnsupportedOperationException();
	}

	public String makeOffer() {
		// TODO - implement BusinessOwner.makeOffer
		throw new UnsupportedOperationException();
	}

	public String seeComments() {
		// TODO - implement BusinessOwner.seeComments
		throw new UnsupportedOperationException();
	}

	public String respondComment() {
		// TODO - implement BusinessOwner.respondComment
		throw new UnsupportedOperationException();
	}

}
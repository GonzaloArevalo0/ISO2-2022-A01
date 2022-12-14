package org.it3.server_domain;

public class Route {

	private String name;
	private String begin_date;
	private String end_date;
	private String description;
	private Resources[] resources;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getBegin_date() {
		return this.begin_date;
	}

	/**
	 * 
	 * @param begin_date
	 */
	public void setBegin_date(String begin_date) {
		this.begin_date = begin_date;
	}

	public String getEnd_date() {
		return this.end_date;
	}

	/**
	 * 
	 * @param end_date
	 */
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @param name
	 * @param begin_date
	 * @param end_date
	 * @param description
	 * @param resources
	 */
	public Route(String name, String begin_date, String end_date, String description, Resources[] resources) {
		// TODO - implement Route.Route
		throw new UnsupportedOperationException();
	}

}
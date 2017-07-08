/**
 * 
 */
package com.example.struts2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author
 *
 */
public class LinkAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7223801763804396372L;

	public String welcome() {
		return "welcome";
	}

	public String friends() {
		return "friends";
	}

	public String office() {
		return "office";
	}

}

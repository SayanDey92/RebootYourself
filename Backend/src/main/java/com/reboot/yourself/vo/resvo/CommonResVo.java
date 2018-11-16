/**
 * 
 */
package com.reboot.yourself.vo.resvo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author AyanD
 * @param <T>
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonResVo<T> {

	public static final String DEFAULT_RESPONSE_MESSAGE = "APP.DEFAULT.RESPONSE.MESSAGE";
	public static final String SUCCESS_MESSAGE = "Success";
	public static final String ERROR_MESSAGE = "Error";
	
	@JsonProperty("status")
	private String status;

	@JsonProperty("responseMessage")
	private String responseMessage;
	
	@JsonProperty("result")
	private T result;
	
	public CommonResVo() {}

	public CommonResVo(String status, String responseMessage, T result) {
		super();
		this.status = status;
		this.responseMessage = responseMessage;
		this.result = result;
	}



	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public T isResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
	
	
	
}

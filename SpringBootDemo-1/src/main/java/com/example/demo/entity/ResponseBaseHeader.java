package com.example.demo;

public class ResponseStatus {
	
	/**
	 * 返回数据结构
	 */
	private String returnCode;
	private String returnMsg;
	private String data;
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnMsg() {
		return returnMsg;
	}
	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public ResponseStatus(String returnCode, String returnMsg, String data) {
		super();
		this.returnCode = returnCode;
		this.returnMsg = returnMsg;
		this.data = data;
	}
	public ResponseStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public static ResponseStatus build(String returnCode, String returnMsg, String data) {
		return new ResponseStatus(returnCode,returnMsg,data);
	}
	
}

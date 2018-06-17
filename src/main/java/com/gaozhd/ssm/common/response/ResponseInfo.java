package com.gaozhd.ssm.common.response;

import java.io.Serializable;

/**
 * <p>
 * 
 * @classname ResponseInfo
 *            <p>
 *            <p>
 * @description 前台和后台做交互时，后台响应给前台的JSON格式的响应信息模型。它由响应状态信息和数据信息组成。
 *              建立此模型主要是为了统一约定响应信息的格式。
 *              <p>
 * @author huk
 * @since JDK 1.6
 * @version
 * @date 2014-8-31
 */
@SuppressWarnings("serial")
public class ResponseInfo<T> implements Serializable {

	/* Client应用请求Server端时，Server端返回的响应状态信息。 */
	private ResponseStatusInfo responseStatus;

	/* Client应用请求Server端时，Server端返回的响应数据信息。 */
	private T data;

	/**
	 * 构造一个空的响应信息对象。
	 */
	public ResponseInfo() {
		ResponseStatusInfo rs = new ResponseStatusInfo();
		rs.setMessageType(ResponseMessageType.ERROR.getValue());
		rs.setResponseCode(ResponseCode.FAILURE.getValue());
		this.setResponseStatus(rs);
	}

	/**
	 * 根据给定的响应状态信息和响应数据信息构造一个响应信息对象。
	 * 
	 * @param responseStatus
	 *            响应状态信息。
	 * @param data
	 *            响应数据信息。
	 */
	public ResponseInfo(ResponseStatusInfo responseStatus, T data) {
		this.responseStatus = responseStatus;
		this.data = data;
	}

	/**
	 * 获取Server端返回给Client应用的响应状态信息。
	 * 
	 * @return Server端返回给Client应用的响应状态信息。
	 */
	public ResponseStatusInfo getResponseStatus() {
		return responseStatus;
	}

	/**
	 * 设置Server端返回给Client应用的响应状态信息。
	 * 
	 * @param responseStatus
	 *            Server端返回给Client应用的响应状态信息。
	 */
	public void setResponseStatus(ResponseStatusInfo responseStatus) {
		this.responseStatus = responseStatus;
	}

	/**
	 * 获取Server端返回给Client应用的响应数据信息。
	 * 
	 * @return Server端返回给Client应用的响应数据信息。
	 */
	public T getData() {
		return data;
	}

	/**
	 * 设置Server端返回给Client应用的响应数据信息。
	 * 
	 * @param data
	 *            Server端返回给Client应用的响应数据信息。
	 */
	public void setData(T data) {
		this.data = data;
	}
}

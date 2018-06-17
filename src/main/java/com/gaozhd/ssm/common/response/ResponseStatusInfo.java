/**
 * Created at 2015-09-27.
 * Info:
 * @Tiantanhehe (C)2011-3011 Tiantanhehe
 * @Author huke <huke@tiantanhehe.com>
 */
package com.gaozhd.ssm.common.response;

import java.io.Serializable;

/**
 * <p>
 * 
 * @classname ResponseStatusInfo
 *            <p>
 *            <p>
 * @description * 前台和后台做交互时，后台响应给前台的JSON格式的响应状态信息实体模型。 *
 *              建立此模型主要是为了统一约定响应状态信息的格式。
 *              <p>
 * @author huke
 * @since JDK 1.6
 * @version
 * @date 2014-8-31
 */
public class ResponseStatusInfo implements Serializable{
    private static final long serialVersionUID = -1975576668678117731L;

	/* 响应码。在整个系统中唯一。 */
    private Integer responseCode;

	/* 响应信息的类型。 */
    private Integer messageType;

	/* 响应信息。 */
    private String message;

    /**
	 * 构造一个空的响应状态信息对象。
	 */
    public ResponseStatusInfo(){

    }

    /**
	 * 根据给定的响应码、响应信息的类型、响应信息构造一个响应状态信息对象。
	 * 
	 * @param responseCode
	 *            响应码，在整个系统中唯一。
	 * @param messageType
	 *            响应信息的类型。
	 * @param message
	 *            响应信息。
	 */
    public ResponseStatusInfo(Integer responseCode, Integer messageType,
            String message){
        this.responseCode = responseCode;
        this.messageType = messageType;
        this.message = message;
    }

    /**
	 * 获取响应码。
	 * 
	 * @return 响应码。
	 */
    public Integer getResponseCode(){
        return responseCode;
    }

    /**
	 * 设置响应码。
	 * 
	 * @param responseCode
	 *            响应码。
	 */
    public void setResponseCode(Integer responseCode){
        this.responseCode = responseCode;
    }

    /**
	 * 获取响应信息的类型。
	 * 
	 * @return 响应信息的类型。
	 */
    public Integer getMessageType(){
        return messageType;
    }

    /**
	 * 设置响应信息的类型。
	 * 
	 * @param messageType
	 *            响应信息的类型。
	 */
    public void setMessageType(Integer messageType){
        this.messageType = messageType;
    }

    /**
	 * 获取响应信息。
	 * 
	 * @return 响应信息。
	 */
    public String getMessage(){
        return message;
    }

    /**
	 * 设置响应信息。
	 * 
	 * @param message
	 *            响应信息。
	 */
    public void setMessage(String message){
        this.message = message;
    }
}

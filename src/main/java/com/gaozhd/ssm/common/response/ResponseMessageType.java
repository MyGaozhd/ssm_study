/**
 * Created at 2015-09-27.
 * Info:
 * @Tiantanhehe (C)2011-3011 Tiantanhehe
 * @Author huke <huke@tiantanhehe.com>
 */
package com.gaozhd.ssm.common.response;

/**
 * <p>
 * 
 * @classname ResponseMessageType
 *            <p>
 *            <p>
 * @description *
 *              系统响应信息的类型枚举列表。它有5个值，OK表示成功信息，TIPS表示提示信息，WARNING表示警告信息，ERROR表示错误信息
 *              ， EXCEPTION表示异常信息。
 *              <p>
 * @author huk
 * @since JDK 1.6
 * @version
 * @date 2014-8-31
 */
public enum ResponseMessageType{
    OK(0), TIPS(1), WARNING(2), ERROR(3), EXCEPTION(4);

    private Integer value;

    ResponseMessageType(Integer value){
        this.value = value;
    }

    @Override
    public String toString(){
        return value.toString();
    }

    public int getValue(){
        return value;
    }

}

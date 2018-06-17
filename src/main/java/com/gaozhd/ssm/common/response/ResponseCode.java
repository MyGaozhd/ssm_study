/**
 * Created at 2015-09-27.
 * Info:
 * @Tiantanhehe (C)2011-3011 Tiantanhehe
 * @Author huke <huke@tiantanhehe.com>
 */
package com.gaozhd.ssm.common.response;

/**
 * <p>
 * @classname ResponseCode
 * <p>
 * <p>
 * @description TODO
 * <p>
 * @author huk
 * @since JDK 1.6
 * @version
 * @date 2014-8-31
 */
public enum ResponseCode{
	/* 表示成功。 */
    SUCCESS(0),

	/* 表示失败(通用)。 */
    FAILURE(-1);

    private Integer value;

    ResponseCode(Integer value){
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

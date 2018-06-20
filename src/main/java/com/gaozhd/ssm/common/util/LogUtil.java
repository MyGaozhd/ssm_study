package com.gaozhd.ssm.common.util;

import com.gaozhd.ssm.common.util.json.JsonUtil;

public class LogUtil {

	public static void logJson(Object object) {
		System.out.println(JsonUtil.toJson(object));
	}
}

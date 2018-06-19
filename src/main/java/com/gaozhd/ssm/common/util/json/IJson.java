package com.gaozhd.ssm.common.util.json;

import java.lang.reflect.Type;

public interface IJson {
    public String toJson(Object obj);

    public <T> T fromJson(String jsonString, Type type);
}

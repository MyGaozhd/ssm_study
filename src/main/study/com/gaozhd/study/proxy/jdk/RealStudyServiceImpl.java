package com.gaozhd.study.proxy.jdk;

public class RealStudyServiceImpl implements IStudyService {
    @Override
    public String study(String book) {
        return "读【" + book + "】";
    }
}

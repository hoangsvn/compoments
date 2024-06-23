package com.github.hoangsvn.compoments.interfaces;

public interface EntityConvert<Init,Data> {
    Init convert(Init Init, Data data);
}

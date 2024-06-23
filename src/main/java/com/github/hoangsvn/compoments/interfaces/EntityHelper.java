package com.github.hoangsvn.compoments.interfaces;

public interface EntityHelper<Init,InitData> {


    Init create();

    Init init(InitData data);

    Init update(Init Init, Init update);

}

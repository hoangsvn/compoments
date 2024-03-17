package com.github.hoangsvn.compoments.entitys;

import java.io.Serializable;

public interface CONVERT<I,S> extends Serializable {
    public I convert(I i,S s);
}

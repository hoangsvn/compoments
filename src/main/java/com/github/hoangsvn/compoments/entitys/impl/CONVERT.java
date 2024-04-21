package com.github.hoangsvn.compoments.entitys.impl;

import java.io.Serializable;

public interface Convert<I,S> extends Serializable {
    public I convert(I i,S s);
}

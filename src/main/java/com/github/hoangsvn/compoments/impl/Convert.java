package com.github.hoangsvn.compoments.impl;

import java.io.Serializable;

public interface Convert<I,S> extends Serializable {
    public I convert(I i,S s);
}

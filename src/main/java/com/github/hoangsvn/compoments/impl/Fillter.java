package com.github.hoangsvn.compoments.impl;

import java.io.Serializable;

public interface Fillter<I> extends Serializable {
    public I filter(I data);

}
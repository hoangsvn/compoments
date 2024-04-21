package com.github.hoangsvn.compoments.impl;

import java.io.Serializable;

public interface Create<I> extends Serializable {
    public I create();
}
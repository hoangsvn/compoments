package com.github.hoangsvn.compoments.impl;

import java.io.Serializable;

public interface Update<I> extends Serializable {

    public I update(I data ,I update);

}
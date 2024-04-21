package com.github.hoangsvn.compoments.entitys.impl;

import java.io.Serializable;

public interface Update<I> extends Serializable {

    public I update(I data ,I update);

}
package com.github.hoangsvn.compoments.entitys;

import java.io.Serializable;

public interface IDU<I> extends Serializable {

    public I update(I data ,I update);
    public I create();
    public I filter(I data);

}
package com.github.hoangsvn.compoments.impl;

import java.io.Serializable;

public interface SendMail<I> extends Serializable {
    public Boolean SendMail(I i);
}

package com.github.hoangsvn.compoments.process.impl;

public interface Process<I>   {

    public String setProcessId();

    public void ProcessStart();

    public void ProcessRun();

    public void ProcessEnd();

    public I ProcessReturn();

    public Exception ProcessException();

}

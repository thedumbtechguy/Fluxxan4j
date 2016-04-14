package com.umaplay.fluxxan4j.impl;

import com.umaplay.fluxxan4j.Action;
import com.umaplay.fluxxan4j.ActionCreator;
import com.umaplay.fluxxan4j.Dispatcher;

/**
 * Created by user on 5/8/2015.
 */
public class BaseActionCreator implements ActionCreator {
    protected Dispatcher mDispatcher;

    @Override
    public void setDispatcher(Dispatcher dispatcher) {
        mDispatcher = dispatcher;
    }


    public void dispatch(Action action) {
        if(mDispatcher == null)
            throw new IllegalStateException("Dispatcher has not been set on this creator");

        mDispatcher.dispatch(action);
    }
}

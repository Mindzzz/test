package com.mindzzz.utils;

public interface ILock {

    boolean tryLock(long timeoutSec);

    void unLock();
}

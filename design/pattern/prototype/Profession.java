package com.design.pattern.prototype;

import java.nio.channels.ClosedChannelException;

public abstract class Profession implements Cloneable {
    int id;
    String name;

    public abstract void print();

    public Object cloningMethod() throws CloneNotSupportedException {
        return super.clone();
    }
}

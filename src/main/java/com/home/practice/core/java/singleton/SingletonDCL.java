package com.home.practice.core.java.singleton;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;

public class SingletonDCL implements Cloneable {

    private static SingletonDCL INSTANCE = null;
    private static final long serialVersionUID = 1L;

    private SingletonDCL(){}

    public static SingletonDCL getInstance() {
        if(INSTANCE == null) {
            synchronized (SingletonDCL.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDCL();
                }
            }
        }
        return INSTANCE;
    }

    /**
     *customize Serialization process.
     */
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        System.out.println("in readObject()");
        ois.defaultReadObject();
        synchronized (SingletonDCL.class) {
            if (INSTANCE == null) {
                INSTANCE = this;
            }
        }
    }

    /**
     * Method ensures that we don't break singleton pattern during DeSerialization process- method must not be called other than DeSerialization time.
     */
    private Object readResolve() throws ObjectStreamException {
        System.out.println("in readResolve()");
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        /*
         * If clone is called on this class object
         */
        throw new CloneNotSupportedException();
        // return super.clone();
    }

}

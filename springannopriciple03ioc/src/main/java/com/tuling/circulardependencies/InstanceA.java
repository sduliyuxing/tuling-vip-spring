package com.tuling.circulardependencies;



/**
 * Created by smlz on 2019/5/29.
 */

public class InstanceA {

    private InstanceB instanceB;

    public InstanceB getInstanceB() {
        return instanceB;
    }


    public void setInstanceB(InstanceB instanceB) {
        this.instanceB = instanceB;
    }

}

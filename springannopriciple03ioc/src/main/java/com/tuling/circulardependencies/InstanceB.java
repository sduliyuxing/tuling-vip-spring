package com.tuling.circulardependencies;


/**
 * Created by smlz on 2019/5/29.
 */

public class InstanceB {

    private InstanceA instanceA;

    public InstanceA getInstanceA() {
        return instanceA;
    }

    public void setInstanceA(InstanceA instanceA) {
        this.instanceA = instanceA;
    }
}

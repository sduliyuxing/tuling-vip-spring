package com.tuling;

import org.springframework.aop.framework.AopContext;

/**
 * Created by smlz on 2019/6/10.
 */
public class TulingCalculate implements Calculate {

    public int add(int numA, int numB) {

        return numA+numB;
    }

    public int reduce(int numA, int numB) {
        return numA-numB;
    }

    public int div(int numA, int numB) {
        return numA/numB;
    }

    public int multi(int numA, int numB) {
        return numA*numB;
    }

    public int mod(int numA,int numB){
        //int retVal = ((Calculate) AopContext.currentProxy()).add(numA,numB);

        int retVal = this.add(numA,numB);
        return retVal%numA;
    }
}

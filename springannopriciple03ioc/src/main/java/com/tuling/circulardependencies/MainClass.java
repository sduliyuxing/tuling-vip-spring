package com.tuling.circulardependencies;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by smlz on 2019/5/29.
 */
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
/*        System.out.println(ctx.getBean(InstanceA.class));
        System.out.println(ctx.getBean(InstanceB.class).getInstanceA());
        System.out.println(ctx.getBean(InstanceB.class));
        System.out.println(ctx.getBean(InstanceA.class).getInstanceB());*/


        //System.out.println(ctx.getBean("person"));
        ctx.close();
    }
}

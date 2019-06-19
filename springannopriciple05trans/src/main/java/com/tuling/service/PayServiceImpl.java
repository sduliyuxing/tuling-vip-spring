package com.tuling.service;

import com.tuling.dao.AccountInfoDao;
import org.springframework.aop.TargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * Created by smlz on 2019/6/17.
 */
@Component

public class PayServiceImpl implements PayService,TargetSource {

    @Autowired
    private AccountInfoDao accountInfoDao;


    @Transactional
    public void pay(String accountId, double money) {
        //查询余额
        double blance = accountInfoDao.qryBlanceByUserId(accountId);

        //更新
        int retVal = accountInfoDao.updateAccountBlance(accountId,money);

        //余额不足
        if(new BigDecimal(blance).compareTo(new BigDecimal(money))<0) {
            throw new RuntimeException("余额不足");
        }

    }

    public Class<?> getTargetClass() {
        return this.getClass();
    }

    public boolean isStatic() {
        return true;
    }

    public Object getTarget() throws Exception {
        return this;
    }

    public void releaseTarget(Object target) throws Exception {

    }
}

package com.itheima.api;

import com.itheima.entity.Result;
import com.itheima.shop.pojo.TradePay;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.remoting.exception.RemotingException;

/**
 * @author Tom
 */
public interface IPayService {

    Result createPayment(TradePay tradePay);

    Result callbackPayment(TradePay tradePay) throws InterruptedException, RemotingException, MQClientException, MQBrokerException;
}

package com.itheima.api;

import com.itheima.entity.Result;
import com.itheima.shop.pojo.TradeOrder;

public interface IOrderService {
    /**
     * 下单接口
     */
    public Result confirmOrder(TradeOrder order);
}

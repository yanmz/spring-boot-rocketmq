package com.itheima.api;

import com.itheima.entity.Result;
import com.itheima.shop.pojo.TradeOrder;
import com.itheima.shop.pojo.TradeUser;

public interface  IUserService {

    TradeUser findOne(Long goodsId);

    Result reduceMoneyPaid(TradeOrder order);
}

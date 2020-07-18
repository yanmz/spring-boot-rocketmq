package com.itheima.api;

import com.itheima.entity.Result;
import com.itheima.shop.pojo.TradeCoupon;

/**
 * 优惠券接口
 */
public interface  ICouponService {

    /**
     * 根据ID查询优惠券对象
     * @param couponID
     * @return
     */
    TradeCoupon findOne(Long couponID);

    /**
     * 更新优惠券状态
     * @param coupon
     * @return
     */
    Result updateCouponStatus(TradeCoupon coupon);
}

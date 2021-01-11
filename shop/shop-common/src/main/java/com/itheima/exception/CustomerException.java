package com.itheima.exception;

import com.itheima.constant.ShopCode;

/**
 * 自定义异常
 * @author Tom
 */
public class CustomerException extends RuntimeException{

    private ShopCode shopCode;

    public CustomerException(ShopCode shopCode) {
        this.shopCode = shopCode;
    }
}

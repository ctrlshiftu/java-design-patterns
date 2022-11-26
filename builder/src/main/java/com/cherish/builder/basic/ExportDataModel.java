package com.cherish.builder.basic;

import lombok.Getter;
import lombok.Setter;

import java.util.function.DoubleBinaryOperator;

/**
 * @author zengjia
 */
@Setter
@Getter
public class ExportDataModel {

    /**
     * 产品编号
     */
    private String productId;

    /**
     * 销售价格
     */
    private double price;

    /**
     * 销售数量
     */
    private double amount;
}

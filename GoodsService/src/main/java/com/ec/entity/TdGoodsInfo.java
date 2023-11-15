package com.ec.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * td_goods_info
 * @author 
 */
@Data
public class TdGoodsInfo implements Serializable {
    private String goodsId;

    private String goodsName;

    private String goodsDesc;

    private Double goodsPrice;

    private Date insertDt;

    private String onlineFlag;

    private static final long serialVersionUID = 1L;
}
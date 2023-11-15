package com.ec.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * tf_goods_storage
 * @author 
 */
@Data
public class TfGoodsStorage implements Serializable {
    private String goodsId;

    private Integer goodsVolume;

    private Integer versionFlag;

    private static final long serialVersionUID = 1L;
}
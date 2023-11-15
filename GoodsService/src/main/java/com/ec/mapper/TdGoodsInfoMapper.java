package com.ec.mapper;

import com.ec.entity.TdGoodsInfo;

public interface TdGoodsInfoMapper {
    int insert(TdGoodsInfo record);

    int insertSelective(TdGoodsInfo record);
}
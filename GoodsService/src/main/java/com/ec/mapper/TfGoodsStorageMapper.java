package com.ec.mapper;

import com.ec.entity.TfGoodsStorage;
import org.apache.ibatis.annotations.Param;

public interface TfGoodsStorageMapper {
    int insert(TfGoodsStorage record);

    int insertSelective(TfGoodsStorage record);

    TfGoodsStorage queryRecordByGoodsId(@Param("goodsId") String goodsId);

    int updateGoodsInventory(@Param("goodsId") String goodsId,
                             @Param("amt") int amt,
                             @Param("versionId") int versionId);
}
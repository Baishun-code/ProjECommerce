package com.ec.service.impl;

import com.ec.entity.TfGoodsStorage;
import com.ec.mapper.TdGoodsInfoMapper;
import com.ec.mapper.TfGoodsStorageMapper;
import com.ec.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private TdGoodsInfoMapper tdGoodsInfoMapper;
    @Autowired
    private TfGoodsStorageMapper tfGoodsStorageMapper;


    @Override
    public int deductFromInventory(String goodsId, int amt, int targetVid) {
        return tfGoodsStorageMapper.updateGoodsInventory(goodsId, amt, targetVid);
    }

    @Override
    public TfGoodsStorage getGoodsStorageInfo(String goodsId) {
        return tfGoodsStorageMapper.queryRecordByGoodsId(goodsId);
    }
}

package com.ec.service;

import com.ec.entity.TfGoodsStorage;

public interface GoodsService {

    int deductFromInventory(String goodsId, int amt, int targetVid);

    TfGoodsStorage getGoodsStorageInfo(String goodsId);
}

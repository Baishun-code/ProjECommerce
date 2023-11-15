package com.ec.service.impl;

import com.ec.entity.TfGoodsStorage;
import com.ec.service.GoodsService;
import com.ec.service.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PurchaseImpl implements Purchase {
    @Autowired
    private GoodsService goodsService;
    private int LOCK_RETRY_TIME;
    /**
     * Use optimistic lock to avoid over-selling
     * @param goodsId
     * @param amt
     */
    @Override
    //@Transactional(rollbackFor = Exception.class)
    public void purchaseGoods(String serialNo, String goodsId, int amt) {
        for (int i = 0; i < LOCK_RETRY_TIME; i++) {
            TfGoodsStorage goodsStorageInfo =
                    goodsService.getGoodsStorageInfo(goodsId);
            int goodsVolumeRemaining = goodsStorageInfo.getGoodsVolume();
            int currVersion = goodsStorageInfo.getVersionFlag();
            if(goodsVolumeRemaining - amt >= 0){
                int flag = goodsService.deductFromInventory(goodsId,
                        goodsVolumeRemaining - amt, currVersion);

                if(flag != 0){

                }
            }
        }
    }
}

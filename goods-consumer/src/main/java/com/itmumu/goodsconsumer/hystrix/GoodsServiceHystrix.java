package com.itmumu.goodsconsumer.hystrix;

/**
 * Created by JachinLin on 2020/08/07.
 */

import com.itmumu.common.model.Cart;
import com.itmumu.common.model.Goods;
import com.itmumu.common.model.Userorder;
import com.itmumu.goodsconsumer.service.GoodsService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GoodsServiceHystrix implements GoodsService {
    @Override
    public List<Goods> getAllgoods() {
        return null;
    }
    @Override
    public List<Goods> getOnegoods(String gname) {
        return null;
    }
    @Override
    public Goods getOnegid(int gid) {
        return null;
    }

    public int updateCart(int number,int id) {
        return 0;
    }
    public int intcart(String goodsname,int number,int price,int goodid,int uid){
        return 0;
    }
    public List<Cart> getAllcart(int uid) {
        return null;
    }

    @Override
    public int deleteCart(int gid) {
        return 0;
    }

    @Override
    public int insertOrder(String goodsname, int number, int price, int uid) {
        return 0;
    }

    @Override
    public List<Userorder> getAllorder(int uid) {
        return null;
    }

}

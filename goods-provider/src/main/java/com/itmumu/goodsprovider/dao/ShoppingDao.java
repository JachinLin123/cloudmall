package com.itmumu.goodsprovider.dao;

import com.itmumu.common.model.Cart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname ShoppingDao
 * @Description TODO
 * @Date 2020-08-07 17:37
 * @Created by JachinLin
 */
@Mapper
public interface ShoppingDao {
    List<Cart> getAllcart(@Param(value = "uid") int uid);//查询所有订单
    int intcart(@Param(value = "goodsname") String goodsname, @Param(value = "number") int number,
        @Param(value = "price") int price, @Param(value = "goodid") int goodid, @Param(value = "uid") int uid);//插入一条购物车
    int updateCart(@Param(value = "number") int number, @Param(value = "id") int id);//修改购物车商品数量
}

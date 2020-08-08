package com.itmumu.goodsprovider.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname CartDao
 * @Description TODO
 * @Date 2020-08-07 9:31
 * @Created by JachinLin
 */
@Mapper
public interface CartDao {

    int deleteCart(@Param(value = "gid") int gid);//根据ID删除订单
    int insertOrder(@Param(value = "goodsname") String goodsname, @Param(value = "number") int number,
        @Param(value = "price") int price, @Param(value = "uid") int uid);//购买商品后添加一条订单数据
}

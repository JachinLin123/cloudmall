package com.itmumu.goodsprovider.dao;

import com.itmumu.common.model.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname GoodsDao
 * @Description TODO
 * @Date 2020-08-07 16:57
 * @Created by JachinLin
 */
@Mapper
public interface GoodsDao {
    List<Goods> getAllgoods();//查询所有商品
    List<Goods> getOnegoods(@Param(value = "gname") String gname);//根据商品名称模糊查找
    Goods getOnegid(@Param(value = "gid") int gid);//根据id查询单个商品详情
}

package com.itmumu.goodsprovider.dao;

import com.itmumu.common.model.Userorder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname OrderDao
 * @Description TODO
 * @Date 2020-08-07 9:31
 * @Created by JachinLin
 */
@Mapper
public interface OrderDao {
    List<Userorder> getAllorder(@Param(value = "uid") int uid);//查询所有订单
}

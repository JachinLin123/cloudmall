package com.itmumu.goodsconsumer.service;

/**
 * Created by JachinLin on 2020/08/07.
 */

import com.itmumu.common.model.Cart;
import com.itmumu.common.model.Goods;
import com.itmumu.common.model.Userorder;
import com.itmumu.goodsconsumer.hystrix.GoodsServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Component
@FeignClient(value="goods-provider",fallback =
        GoodsServiceHystrix.class)
public interface GoodsService {
    @RequestMapping(value = "/getAllgoods",method = RequestMethod.GET)
    public List<Goods> getAllgoods();
    @RequestMapping(value = "/getOnegoods",method = RequestMethod.GET)
    public List<Goods> getOnegoods(@RequestParam(value = "gname") String gname);
    @RequestMapping(value = "/getOnegid",method = RequestMethod.GET)
    public Goods getOnegid(@RequestParam(value = "gid") int gid);


    @RequestMapping(value = "/updateCart",method = RequestMethod.GET)
    public int updateCart(@RequestParam(value = "number") int number, @RequestParam(value = "id") int id);
    @RequestMapping(value = "/intcart",method = RequestMethod.GET)
    public int intcart(@RequestParam(value = "goodsname") String goodsname, @RequestParam(value = "number") int number,
        @RequestParam(value = "price") int price, @RequestParam(value = "goodid") int goodid,
        @RequestParam(value = "uid") int uid);
    @RequestMapping(value = "/getAllcart",method = RequestMethod.GET)
    public List<Cart> getAllcart(@RequestParam(value = "uid") int uid);

    @RequestMapping(value = "deleteCart" ,method = RequestMethod.GET)
    public int deleteCart(@RequestParam(value = "gid") int gid);
    @RequestMapping(value = "/insertOrder",method = RequestMethod.GET)
    public int insertOrder(@RequestParam(value = "goodsname") String goodsname,
        @RequestParam(value = "number") int number, @RequestParam(value = "price") int price,
        @RequestParam(value = "uid") int uid);

    @RequestMapping(value = "/getAllorder")
    public List<Userorder> getAllorder(@RequestParam(value = "uid") int uid);


}


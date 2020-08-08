package com.itmumu.goodsprovider.controller;

import com.itmumu.common.model.Cart;
import com.itmumu.goodsprovider.dao.ShoppingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname ShoppingController
 * @Description TODO
 * @Date 2020-08-07 9:32
 * @Created by JachinLin
 */
@RestController
public class ShoppingController {
    @Autowired ShoppingDao shoppingDao;

    @RequestMapping(value = "/getAllcart",method = RequestMethod.GET)
    public List<Cart> getAllcart(@RequestParam(value = "uid")int uid){
        return shoppingDao.getAllcart(uid);
    }
    @RequestMapping(value = "/updateCart",method = RequestMethod.GET)
    public int updateCart(@RequestParam(value = "number")int number, @RequestParam(value = "id")int id){
        return shoppingDao.updateCart(number,id);
    }
    @RequestMapping(value = "/intcart",method = RequestMethod.GET)
    public int intcart(@RequestParam(value = "goodsname")String goodsname, @RequestParam(value = "number")int number, @RequestParam(value = "price")int price,@RequestParam(value = "goodid")int goodid,@RequestParam(value = "uid")int uid){
        return shoppingDao.intcart(goodsname,number,price,goodid,uid);
    }
}
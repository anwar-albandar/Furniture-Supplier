/*
Author: Ntumba Owin
Date of Creation: 4/7/2020
Desc:This is the CartFactoryTest class, it helps with the test of all the object of the Cart class.

 */
package com.furnitureapp.factory.sales;

import com.furnitureapp.entity.sales.Cart;
import com.furnitureapp.entity.sales.SaleProduct;
import com.furnitureapp.factory.sales.CartFactory;
import com.furnitureapp.factory.sales.SaleProductFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CartFactoryTest {

    @Test
    public void createCart() {
        //add element to the
        List <SaleProduct> cartItems = new ArrayList();
        cartItems.add(SaleProductFactory.createSaleProduct(152,3));
        //create an object of Cart class
        Cart cart = CartFactory.createCart( cartItems, 2, 6000);
        Cart cart1 = new Cart.CartBuilder().copy(cart).build();
        //asserting the objects
        Assert.assertNotEquals(cart.toString(),cart1.toString());

    }
}
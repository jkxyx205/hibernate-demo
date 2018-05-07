package com.rick;

import com.rick.one2many.dao.CustomerRepository;
import com.rick.one2many.dao.OrderRepository;
import com.rick.one2many.entity.Customer;
import com.rick.one2many.entity.Orders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rick on 5/6/18.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class One2ManyTest {
    @Resource
    private CustomerRepository customerRepository;

    @Resource
    private OrderRepository orderRepository;

    @Test
    public void addCustomerTest() {
        Customer customer = new Customer();
        customer.setName("Rick");

        Orders order = new Orders();
        order.setName("order-1");
        order.setPrice(1.2f);

        List<Orders> orderList = new ArrayList<>();
        orderList.add(order);
        customer.setOrderList(orderList);

        customerRepository.save(customer);
    }

    @Test
    public void addOrdersTest() {
        Customer customer = new Customer();
        customer.setName("Ashley");

        Orders order = new Orders();
        order.setName("order-1");
        order.setPrice(1.2f);
        order.setCustomer(customer);
        orderRepository.save(order);
    }

    @Test
    public void addCustomerOrdersTest() {
        Customer customer = new Customer();
        customer.setName("Jim");

        Orders order = new Orders();
        order.setName("order-2");
        order.setPrice(2.2f);

        List<Orders> orderList = new ArrayList<>();
        orderList.add(order);
        //互相关联
        customer.setOrderList(orderList);
        order.setCustomer(customer);

        customerRepository.save(customer);
    }

    @Test
    public void load() {
        Customer customer = customerRepository.findById(2L).get();
        Orders orders = orderRepository.findById(1L).get();
        orders.setName("----xx--00");
        customer.getOrderList().add(orders);
//        orders.setCustomer(customer);
//        customer.setName("xxxxx222");
        customerRepository.save(customer);
//        orders.getCustomer().setName("333333");
//        orderRepository.save(orders);

    }

}

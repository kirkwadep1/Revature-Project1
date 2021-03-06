package com.project1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

/*
    This is not fully implemented
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name="order", schema="public")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int orderId;
    private int userId;
    private int itemId;
    private String country;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="cartId", referencedColumnName = "cartId")
//    private Cart cart = new Cart();

    //@ManyToOne()
    //@JoinTable(name = "orderlist", joinColumns = @JoinColumn(name = "itemId", referencedColumnName = "itemId"), inverseJoinColumns =@JoinColumn(name="", name="" ))
    //private List<Order> orderList;

}

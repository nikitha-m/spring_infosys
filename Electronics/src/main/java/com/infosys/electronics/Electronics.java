package com.infosys.electronics;

import java.util.HashMap;
import java.util.Map;

public class Electronics {
    private Map<CustomerDetail, ProductDetail> orders = new HashMap<>();

    public void setOrders(Map<CustomerDetail, ProductDetail> orders) {
        this.orders = orders;
    }

    public Map<CustomerDetail, ProductDetail> getOrders() {
        return orders;
    }
}

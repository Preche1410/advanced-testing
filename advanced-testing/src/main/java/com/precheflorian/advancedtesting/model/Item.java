package com.precheflorian.advancedtesting.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private int id;
    private String name;
    private int price;
    private int quantity;

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ",\"name\":" + name +
                ",\"price\":" + price +
                ",\"quantity\":" + quantity +
                '}';
    }
}

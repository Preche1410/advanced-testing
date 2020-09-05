package com.precheflorian.advancedtesting.Repository;

import com.precheflorian.advancedtesting.model.Item;

import java.util.List;

public interface ItemRepository{
  Item findItem(int id);

  List<Item> findAll();
}

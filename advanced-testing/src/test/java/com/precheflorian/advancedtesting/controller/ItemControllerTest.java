package com.precheflorian.advancedtesting.controller;

import com.precheflorian.advancedtesting.Repository.ItemRepository;
import com.precheflorian.advancedtesting.model.Item;
import com.precheflorian.advancedtesting.service.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ItemController.class)
class ItemControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    ItemRepository itemRepository;

    @MockBean
    ItemService itemService;


    @Test
    public void given_someItem_when_get_then_return_item() throws Exception {

        // given
        Item someItem = new Item(2, "someItem", 40, 3);
        when(itemRepository.findItem(2)).thenReturn(someItem);

        //when
        RequestBuilder request = MockMvcRequestBuilders.get("/item-from-repository/2");
        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andReturn();

        // then
        assertEquals(someItem.toString(),result.getResponse().getContentAsString());

    }



}

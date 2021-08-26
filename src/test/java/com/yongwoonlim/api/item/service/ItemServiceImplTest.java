package com.yongwoonlim.api.item.service;

import com.yongwoonlim.api.item.domain.Item;
import com.yongwoonlim.api.item.repository.ItemRepository;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ItemServiceImplTest {

    private ItemServiceImpl itemService;
    @Mock
    ItemRepository itemRepository;

    private AutoCloseable closable;
    @BeforeEach
    void setUp() {
        itemService = new ItemServiceImpl(itemRepository);
    }

    @BeforeAll
    void openMock(){
        closable = MockitoAnnotations.openMocks(this);
    }

    @AfterAll
    void closeMock() throws Exception {
        closable.close();
    }

    @Test
    void save() {
        Item item = Item.builder().itemBrand("삼성").itemColor("적색").itemName("갤럭시2").build();
        itemService.save(item);
        List<Item> list = itemService.findAll();
        list.forEach(System.out::println);
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void existsById() {
    }

    @Test
    void count() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void deleteAll() {
    }
}
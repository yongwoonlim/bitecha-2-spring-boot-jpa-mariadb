package com.yongwoonlim.api.item.service;

import com.yongwoonlim.api.item.domain.Item;
import com.yongwoonlim.api.item.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;

    @Override
    public void save(Item item) {
        itemRepository.save(item);
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<Item> findById(long id) {
        return itemRepository.findById(id);
    }

    @Override
    public boolean existsById(long id) {
        return itemRepository.existsById(id);
    }

    @Override
    public long count() {
        return itemRepository.count();
    }

    @Override
    public void deleteById(long id) {
        itemRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        itemRepository.deleteAll();
    }
}

package com.api.service;

import com.api.model.Items;
import com.api.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Items create(Items items) {
        log.info("create items : {} ",items);
        return itemRepository.save(items);
    }

    @Override
    public List<Items> all() {
        log.info("fetching all items ");
        return itemRepository.findAll();
    }
}

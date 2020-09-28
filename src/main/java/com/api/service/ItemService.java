package com.api.service;
import com.api.model.Items;

import java.util.List;

public interface ItemService {
    Items create(Items items);
    List<Items> all();
}

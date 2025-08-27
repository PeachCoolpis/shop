package com.shop.respository;

import com.shop.entity.Item;
import com.shop.respository.coustom.ItemCustomRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> , ItemCustomRepository {
}

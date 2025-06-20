package br.com.centroinfo.api.api.service.item;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.centroinfo.api.api.dto.itemDTO.ItemDTO;
import br.com.centroinfo.api.api.entity.item.Item;
import br.com.centroinfo.api.api.repository.item.ItemRepository;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> create(ItemDTO itemDTO) {
        Item item = new Item();
        item.setCreatedAt(LocalDateTime.now());
        item.setName(itemDTO.name);
        item.setPriceMax(itemDTO.priceMax);
        item.setPriceMin(itemDTO.priceMin);
        item.setBrand(itemDTO.brand);
        item.setSector(itemDTO.sector);
        item.setBarCode(itemDTO.barCode);
        item.setImagem(itemDTO.imagem);
        itemRepository.save(item);
        return list();
    }

    public List<Item> list() {
        return itemRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }



    public List<Item> update(ItemDTO itemDTO) {
        Item item = new Item();
        item.setId(itemDTO.id);
        item.setCreatedAt(itemDTO.createdAt);
        item.setUpdatedAt(LocalDateTime.now());
        item.setName(itemDTO.name);
        item.setPriceMax(itemDTO.priceMax);
        item.setPriceMin(itemDTO.priceMin);
        item.setBrand(itemDTO.brand);
        item.setSector(itemDTO.sector);
        item.setBarCode(itemDTO.barCode);
        item.setImagem(itemDTO.imagem);
        itemRepository.save(item);
        return list();
    }

    public List<Item> delete(Long id) {
        itemRepository.deleteById(id);
        return list();
    }

}

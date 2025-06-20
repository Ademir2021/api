package br.com.centroinfo.api.api.controller.itemcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.centroinfo.api.api.dto.itemDTO.ItemDTO;
import br.com.centroinfo.api.api.entity.item.Item;
import br.com.centroinfo.api.api.service.item.ItemService;

@RestController
@RequestMapping("items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping("/items")
    public List<Item> create(@RequestBody ItemDTO itemDTO) {
        return itemService.create(itemDTO);
    }

    @GetMapping("/items")
    public List<Item> list() {
        return itemService.list();
    }

    @PutMapping("/items")
    public List<Item> update(@RequestBody ItemDTO itemDTO) {
        return itemService.update(itemDTO);
    }

    @DeleteMapping("/items/{id}")
    public List<Item> delete(@PathVariable("id") Long id) {
        return itemService.delete(id);
    }

}

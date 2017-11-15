package com.zyp.service;

import com.zyp.dao.TbItemMapper;
import com.zyp.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    //注入DAO接口
    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem findById(Long itemId) {
        TbItem tbItem = tbItemMapper.selectByPrimaryKey(itemId);
        return tbItem;
    }
}

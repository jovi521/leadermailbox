package com.skybrian.leadermailbox.service.tel;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.skybrian.leadermailbox.dao.tel.TTelGetDealMapper;
import com.skybrian.leadermailbox.domain.entity.tel.TTelGetDeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author jovi
 * @Date 2020/2/14 12:07
 * @Description
 **/
@Service
public class TTelGetDealService {

    @Autowired
    TTelGetDealMapper tTelGetDealMapper;

    public IPage<TTelGetDeal> selectWithPage(Integer pageNo, Integer pageSize) {
        QueryWrapper<TTelGetDeal> wrapper = new QueryWrapper<>();
        IPage<TTelGetDeal> iPage = new Page<>(pageNo, pageSize);
        return tTelGetDealMapper.selectPage(iPage, wrapper);
    }
}

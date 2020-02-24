package com.skybrian.leadermailbox.dao.tel;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.skybrian.leadermailbox.domain.entity.tel.TTelGetDeal;
import org.springframework.stereotype.Repository;

/**
 * @Author jovi
 * @Date 2020/2/14 12:05
 * @Description
 **/
@Repository
public interface TTelGetDealMapper extends BaseMapper<TTelGetDeal> {

    /**
     * @description 根据id查询单个电话记录
     * @param:
     * @return:
     * @author: jovi
     * @date: 2020/2/14 12:24
     */
    TTelGetDeal getDealById(Integer id);

    /**
     * @description 分页查询
     * @param:
     * @return:
     * @author: jovi
     * @date: 2020/2/14 12:24
     */
    IPage<TTelGetDeal> selectWithPage(Integer pageNo, Integer pageSize);
}

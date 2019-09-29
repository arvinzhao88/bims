package com.cummins.receipt.dao;

import com.cummins.receipt.model.ScrapTicket;
import com.cummins.receipt.model.ScrapTicketCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ScrapTicketMapper {
    long countByExample(ScrapTicketCriteria example);

    int deleteByExample(ScrapTicketCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScrapTicket record);

    int insertSelective(ScrapTicket record);

    List<ScrapTicket> selectByExample(ScrapTicketCriteria example);

    ScrapTicket selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScrapTicket record, @Param("example") ScrapTicketCriteria example);

    int updateByExample(@Param("record") ScrapTicket record, @Param("example") ScrapTicketCriteria example);

    int updateByPrimaryKeySelective(ScrapTicket record);

    int updateByPrimaryKey(ScrapTicket record);

    ScrapTicket selectByPrimaryKeyOnlyShow(Integer id);
}
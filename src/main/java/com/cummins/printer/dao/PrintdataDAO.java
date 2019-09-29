package com.cummins.printer.dao;

import com.cummins.printer.model.Printdata;
import com.cummins.printer.model.PrintdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PrintdataDAO {
    long countByExample(PrintdataExample example);

    int deleteByExample(PrintdataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Printdata record);

    int insertSelective(Printdata record);

    List<Printdata> selectByExample(PrintdataExample example);

    Printdata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Printdata record, @Param("example") PrintdataExample example);

    int updateByExample(@Param("record") Printdata record, @Param("example") PrintdataExample example);

    int updateByPrimaryKeySelective(Printdata record);

    int updateByPrimaryKey(Printdata record);

    /**
     * 查询最后一条打印信息
     * @param printdata
     * @return
     */
    Printdata getLastPrintDataByIp(Printdata printdata);
}
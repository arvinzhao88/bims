package com.cummins.printer.dao;

import com.cummins.model.SearchParam;
import com.cummins.printer.model.Printer;
import com.cummins.printer.model.PrinterExample;
import java.util.List;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PrinterDAO {
    long countByExample(PrinterExample example);

    int deleteByExample(PrinterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Printer record);

    int insertSelective(Printer record);

    List<Printer> selectByExample(PrinterExample example);

    Printer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Printer record, @Param("example") PrinterExample example);

    int updateByExample(@Param("record") Printer record, @Param("example") PrinterExample example);

    int updateByPrimaryKeySelective(Printer record);

    int updateByPrimaryKey(Printer record);

    /**
     * 分页查询
     * @param param
     * @return
     */
    List<Printer> getPrinterList(@Param("param") SearchParam param);
}
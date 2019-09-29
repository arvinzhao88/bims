package com.cummins.model;

import com.cummins.common.ExcelColumn;
import lombok.Data;

@Data
public class RefPartExcel {

	@ExcelColumn("XX工号")
	private String bimsAccount;

	@ExcelColumn("角色")
	private String bimsRole;

	@ExcelColumn("对应区域")
	private String belongArea;

}
package com.cummins.bims.dto;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.io.Serializable;
import java.util.List;

public class SysMenu implements Serializable {
	private Integer id;

	private Integer parentId;

	private String parentIds;

	private String name;

	private Integer sort;

	private String href;

	private Integer isShow;

	private String permission;

	private Integer status;

	private String liId;
	
	private List<SysMenu> childList;
	
	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds == null ? null : parentIds.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href == null ? null : href.trim();
	}

	public Integer getIsShow() {
		return isShow;
	}

	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission == null ? null : permission.trim();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getLiId() {
		return liId;
	}

	public void setLiId(String liId) {
		this.liId = liId;
	}

	public List<SysMenu> getChildList() {
		return childList;
	}

	public void setChildList(List<SysMenu> childList) {
		this.childList = childList;
	}


	@JsonIgnore
	public static void sortList(List<SysMenu> list, List<SysMenu> sourcelist, int parentId, boolean cascade) {
		for (int i = 0; i < sourcelist.size(); i++) {
			SysMenu e = sourcelist.get(i);

			if (e.getParentId() != null) {
				if (e.getParentId() != null && e.getParentId() == parentId) {
					// && e.getParent().getId().longValue() == parentId.longValue()){
					list.add(e);
					if (cascade) {
						// 判断是否还有子节点, 有则继续获取子节点
						for (int j = 0; j < sourcelist.size(); j++) {
							SysMenu child = sourcelist.get(j);
							if (child.getParentId() != null) {
								if (child.getParentId() != null
										&& child.getParentId().longValue() == e.getId().longValue()) {
									sortList(list, sourcelist, e.getId(), true);
									break;
								}
							}
							/*if (child.getParent()!=null && child.getParent().getId()!=null
									&& child.getParent().getId().longValue() == e.getId().longValue()){
								sortList(list, sourcelist, e.getId(), true);
								break;
							}*/
						}
					}
				}
			}

		}
	}
}
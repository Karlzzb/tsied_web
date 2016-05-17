package com.ingenuity.tsiedweb.service;

import java.util.List;

import com.ingenuity.tsiedweb.entity.Dic;
import com.ingenuity.tsiedweb.entity.Menu;
import com.ingenuity.tsiedweb.entity.User;

/**
 * @date 2016-03-15
 * @author rock
 */
public interface IIndexService {
	List<Menu> getMenuList(User user);// 获取菜单栏

	List<Dic> getDicList(String dicKey);// 获取字典表

	String getIndexTypeByValue(String dicValue);
}

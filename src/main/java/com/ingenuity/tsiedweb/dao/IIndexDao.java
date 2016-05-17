package com.ingenuity.tsiedweb.dao;

import java.util.List;

import com.ingenuity.tsiedweb.entity.Dic;
import com.ingenuity.tsiedweb.entity.Menu;
import com.ingenuity.tsiedweb.entity.User;

/**
 * @date 2016-03-15
 * @author rock
 */
public interface IIndexDao {
	List<Menu> getMenuList(User user);

	List<Dic> getDicList(String dicKey);

	String getIndexTypeByValue(String dicValue);
}

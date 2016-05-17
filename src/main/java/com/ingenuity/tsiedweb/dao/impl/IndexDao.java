package com.ingenuity.tsiedweb.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ingenuity.tsiedweb.dao.IIndexDao;
import com.ingenuity.tsiedweb.entity.Dic;
import com.ingenuity.tsiedweb.entity.Menu;
import com.ingenuity.tsiedweb.entity.User;

/**
 * @date 2016-03-15
 * @author rock
 * @desc 菜单实现类
 */
@Repository
public class IndexDao extends BaseDao implements IIndexDao {
	@Override
	public List<Menu> getMenuList(User user) {
		return this.getSqlSession().selectList("menuList", user);
	}

	@Override
	public List<Dic> getDicList(String dicKey) {
		return this.getSqlSession().selectList("dicList", dicKey);
	}

	@Override
	public String getIndexTypeByValue(String dicValue) {
		return this.getSqlSession().selectOne("selectIndexType", dicValue);
	}

}

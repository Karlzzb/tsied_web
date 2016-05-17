package com.ingenuity.tsiedweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingenuity.tsiedweb.dao.IIndexDao;
import com.ingenuity.tsiedweb.entity.Dic;
import com.ingenuity.tsiedweb.entity.Menu;
import com.ingenuity.tsiedweb.entity.User;
import com.ingenuity.tsiedweb.service.IIndexService;

/**
 * @date 2015-03-15
 * @author rock
 */
@Service("indexService")
public class IndexService implements IIndexService {

	@Autowired
	private IIndexDao indexDao;

	@Override
	public List<Menu> getMenuList(User user) {
		return indexDao.getMenuList(user);
	}

	@Override
	public List<Dic> getDicList(String dicKey) {
		return indexDao.getDicList(dicKey);
	}

	@Override
	public String getIndexTypeByValue(String dicValue) {
		return indexDao.getIndexTypeByValue(dicValue);
	}

}

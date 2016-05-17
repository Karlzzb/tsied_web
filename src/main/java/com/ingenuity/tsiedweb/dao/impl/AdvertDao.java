package com.ingenuity.tsiedweb.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ingenuity.tsiedweb.dao.IAdvertDao;
import com.ingenuity.tsiedweb.entity.Advert;

/**
 * @date 2016-03-18
 * @author rock
 *
 */
@Repository
public class AdvertDao extends BaseDao implements IAdvertDao {

	@Override
	public List<Advert> getAdvertList(Advert advert) {
		return this.getSqlSession().selectList("advertList", advert);
	}

	@Override
	public int getAdvertCount(Advert advert) {
		int count = 0;
		count = this.getSqlSession().selectList("advertcount", advert).size();
		return count;
	}

	@Override
	public void saveAdvert(Advert advert) {
		this.getSqlSession().insert("saveAdvert", advert);
	}

	@Override
	public Advert getAdvert(Advert advert) {
		return this.getSqlSession().selectOne("findAdvert", advert);
	}

	@Override
	public void modifyAdvert(Advert advert) {
		this.getSqlSession().update("modifyAdvert", advert);
	}

	@Override
	public void delAdvert(Advert advert) {
		this.getSqlSession().delete("delAdvert", advert);
	}
}

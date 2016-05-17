package com.ingenuity.tsiedweb.service;

import java.util.List;

import com.ingenuity.tsiedweb.entity.Advert;

public interface IAdvertService {
	int getAdvertCount(Advert advert);// 获取广告信息总数

	List<Advert> getAdvertList(Advert advert);// 获取广告信息集

	void saveAdvert(Advert advert);// 保存广告信息

	Advert getAdvert(Advert advert);// 获取广告信息

	void modifyAdvert(Advert advert);// 修改广告

	void delAdvert(Advert advert);// 删除广告
}

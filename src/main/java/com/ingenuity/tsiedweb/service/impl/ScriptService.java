package com.ingenuity.tsiedweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingenuity.tsiedweb.dao.IScriptDao;
import com.ingenuity.tsiedweb.entity.Script;
import com.ingenuity.tsiedweb.service.IScriptService;

/**
 * @date 2016-03-14
 * @author rock DESC：脚本配置服务层
 */
@Service("scriptService")
public class ScriptService implements IScriptService {

	@Autowired
	private IScriptDao scriptDao;

	@Override
	public void saveScript(Script script) {
		scriptDao.saveScript(script);
	}

	@Override
	public List<Script> getScriptList() {
		return scriptDao.getScriptList();
	}

	@Override
	public Script getScriptByScript(Script script) {
		return scriptDao.getScriptByScript(script);
	}

}

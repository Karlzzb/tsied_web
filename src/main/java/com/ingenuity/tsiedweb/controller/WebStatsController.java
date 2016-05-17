package com.ingenuity.tsiedweb.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.ingenuity.tsiedweb.utils.DateUtils;

/**
 * web 基础访问统计
 * 
 * @author kerl
 *
 */
@Controller
@RequestMapping("/household")
public class WebStatsController extends GeneralController {

	@RequestMapping(value = "/household-data")
	public String init(HttpServletRequest request, HttpServletResponse response) throws JsonParseException,
			JsonMappingException, IOException, ParseException {
		initPage(request, response);
		getHouseholdData(request, DateUtils.formatDate(DateUtils.daysDiff(-90)),
				DateUtils.formatDate(DateUtils.daysDiff(-1)));
		return "household-data";
	}

	private void getHouseholdData(HttpServletRequest request, String startDate, String endDate) throws IOException,
			JsonParseException, JsonMappingException, JsonProcessingException, ParseException {

	}

	public Integer getMaxValueFromList(List<Integer> list) {
		int max = 0;
		for (int i = 0; i <= list.size() - 1; i++) {
			if (max <= list.get(i)) {
				max = list.get(i);
			}
		}
		return max;
	}
}

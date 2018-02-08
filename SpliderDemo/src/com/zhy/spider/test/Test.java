package com.zhy.spider.test;

import java.util.List;

import com.zhy.spider.bean.LinkTypeData;
import com.zhy.spider.core.ExtractService;
import com.zhy.spider.rule.Rule;

public class Test {

	@org.junit.Test
	public void getDatasByCssQuery() {
		Rule rule = new Rule("https://nba.hupu.com/",
				new String[] { "name" }, new String[] { "兴网" },
				"div.nba-latestNews li", Rule.SELECTION, Rule.GET);
		List<LinkTypeData> extracts = ExtractService.extract(rule);
		printf(extracts);
	}

	public void printf(List<LinkTypeData> datas) {
		for (LinkTypeData data : datas) {
			System.out.println(data.getLinkText());
			System.out.println(data.getLinkHref());
//			String url = "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe "+ data.getLinkHref();
//			try {
//				Runtime.getRuntime().exec(url);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("***********************************");
		}

	}
}

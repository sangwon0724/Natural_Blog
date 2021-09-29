package com.my.util;

import java.util.HashMap;

public class paging {
	public HashMap<String, Object> settingPaging(String mode, HashMap<String, Object> map){
		HashMap<String, Object> result = new HashMap<String, Object>();
		
		int count=Integer.parseInt(String.valueOf(map.get("count")));
		int orderNo=Integer.parseInt(String.valueOf(map.get("orderNo")));
		
		switch (mode) {
		case "blog_post":
			//블록의 단위가 5인 경우
			result.put("count", count); //게시글 전체 개수
			result.put("page_total", count/5+1); //전체 페이지 수
			result.put("page_current", orderNo/5+1); //현재 페이지
			result.put("block_current", (orderNo/5+1)/10+1); //현재 블록
			break;

		default:
			break;
		}
		
		return result;
	}
}
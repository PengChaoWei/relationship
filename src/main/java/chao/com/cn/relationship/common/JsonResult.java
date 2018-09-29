/*** Eclipse Class Decompiler plugin, copyright (c) 2012 Chao Chen (cnfree2000@hotmail.com) ***/
package chao.com.cn.relationship.common;

import java.util.ArrayList;
import java.util.List;

public class JsonResult {
	public static final Integer JSON_RESULT_SUCCESS = Integer.valueOf(1);

	public static final Integer JSON_RESULT_FAILED = Integer.valueOf(0);

	public static final Integer JSON_RESULT_SUCCESS_PART = Integer.valueOf(2);

	private final List<Object> data = new ArrayList();
	private Integer code;
	private String msg;
	private String html;
	private String totalCount;
	private String pageCount;

	public JsonResult() {
	}

	private JsonResult(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public static JsonResult createSuccess() {
		return new JsonResult(JSON_RESULT_SUCCESS, null);
	}

	public static JsonResult createSuccess(String msg) {
		return new JsonResult(JSON_RESULT_SUCCESS, msg);
	}

	public static JsonResult createSuccessPart() {
		JsonResult jsonResult = new JsonResult(JSON_RESULT_SUCCESS_PART, null);
		return jsonResult;
	}

	public static JsonResult createSuccessPart(String msg) {
		JsonResult jsonResult = new JsonResult(JSON_RESULT_SUCCESS_PART, msg);
		return jsonResult;
	}

	public static JsonResult createFalied(String msg) {
		JsonResult jsonResult = new JsonResult(JSON_RESULT_FAILED, msg);
		return jsonResult;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Object> getData() {
		return this.data;
	}

	public void addData(Object obj) {
		this.data.add(obj);
	}

	public String getHtml() {
		return this.html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public void removeDataAll() {
		if (this.data != null)
			this.data.clear();
	}

	public void addDataAll(List list) {
		if (null != list)
			this.data.addAll(list);
	}

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageCount() {
		return pageCount;
	}

	public void setPageCount(String pageCount) {
		this.pageCount = pageCount;
	}
}
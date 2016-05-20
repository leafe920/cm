package com.bill99.cm.adapter.web.freemarker;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

/**
 * FreeMarker组件，用于定义网络路径
 * @author leafe.qian
 * @date 2016年5月19日 下午10:14:40
 */
public class FreeMarkerViewImpl extends FreeMarkerView {
	private static final String CONTEXT_PATH = "base";

	@Override
	protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception {
		model.put(CONTEXT_PATH, request.getContextPath());
		super.exposeHelpers(model, request);
	}
}

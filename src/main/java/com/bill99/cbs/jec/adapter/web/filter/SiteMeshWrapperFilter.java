package com.bill99.cbs.jec.adapter.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 * SiteMash过滤框架
 * @author leafe.qian
 *
 */
public class SiteMeshWrapperFilter extends ConfigurableSiteMeshFilter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException,
			ServletException {
		System.out.println("12");
		HttpServletRequest request = (HttpServletRequest) req;
		if (isAjax(request)) {
			chain.doFilter(req, res);
		} else {
			super.doFilter(req, res, chain);
		}

	}

	private boolean isAjax(HttpServletRequest request) {
		if (request != null
				&& ("XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With")) || request
						.getParameter("ajax") != null))
			return true;
		return false;
	}
}

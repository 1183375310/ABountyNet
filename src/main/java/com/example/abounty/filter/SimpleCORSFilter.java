package com.example.abounty.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * 解决跨域名问题
 * @author 刘铖
 * @since 2018/5/2
 */


public class SimpleCORSFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse)res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", "x---with, content-type, accept, origin, X-CERT-SysUser-Token,X-Requested-With, utoken, appToken,sessionId");
        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {

    }
}

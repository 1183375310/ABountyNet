package com.example.abounty.filter;


import org.springframework.core.annotation.Order;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
/**
 * 使用@WebFilter注解标注过滤器
 * 属性filterName声明过滤器的名称,可选
 * 属性urlPatterns指定要过滤 的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
 * @Order(1)控制加载顺序
 * @author 刘铖
 * @since 2018/4/9
 */
@Order(1)
//重点
@WebFilter(filterName = "myfilter", urlPatterns = "/*")
public class IndexFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.print("================需要过滤器做什么？==================");
        if("2".equals(servletRequest.getParameter("id"))){
            servletResponse.getWriter().write("Cannot query the data！");
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }
    @Override
    public void destroy() {}
}

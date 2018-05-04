package com.example.abounty;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 使用 @ServletComponentScan注解后，Servlet、Filter、Listener
 * 可以直接通过 @WebServlet、@WebFilter、@WebListener 注解自动注册，无需其他代码。
 * @author 刘铖
 * @since 2018-04-09
 **/
@SpringBootApplication
//重点
@ServletComponentScan
//开启缓存功能
@EnableCaching
//在启动类中添加对mapper包扫描,这样就不用每个mapper都写注解@Mapper
@MapperScan("com.example.abounty.dao")
public class ABountyNetApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(ABountyNetApplication1.class, args);
    }
}

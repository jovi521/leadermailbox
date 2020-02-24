package com.skybrian.leadermailbox.config;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.MybatisXMLLanguageDriver;
import com.baomidou.mybatisplus.extension.MybatisMapWrapperFactory;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author jovi
 * @Date 2020/2/14 12:18
 * @Description
 **/
@Configuration
public class MybatisPlusConfig {

    @Bean("mybatisSqlSession")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
        MybatisConfiguration configuration = new MybatisConfiguration();
        configuration.setDefaultScriptingLanguage(MybatisXMLLanguageDriver.class);
        configuration.setJdbcTypeForNull(JdbcType.NULL);
        //*注册Map 下划线转驼峰*
        configuration.setObjectWrapperFactory(new MybatisMapWrapperFactory());

        // 添加数据源
        sqlSessionFactory.setDataSource(dataSource);

        sqlSessionFactory.setConfiguration(configuration);

        // 添加分页插件，这里有个坑
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        sqlSessionFactory.setPlugins(paginationInterceptor);

        return sqlSessionFactory.getObject();
    }
}

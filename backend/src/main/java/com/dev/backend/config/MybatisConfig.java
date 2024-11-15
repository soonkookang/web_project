package com.dev.backend.config;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan("com.dev.backend.mapper")
@RequiredArgsConstructor
public class MybatisConfig {

    @Bean
    public SqlSessionFactory getSqlSessionFactory(DataSource dataSource) throws Exception {

        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
//        configuration.addInterceptor(new MybatisInterceptorConfig());

        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.addMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/**/*.xml"));
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setConfiguration(configuration);
        return sessionFactoryBean.getObject();
    }

}

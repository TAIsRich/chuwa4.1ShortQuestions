/**
 * @Copyright: 2018 cetian.com Inc. All rights reserved. 
 * @Title: WebSecurityConfig.java 
 * @date 2018年3月1日 下午1:15:59 
 * @version V1.0
 * @author zangrong
 */
package test.demo.rest.login.support;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

/**
 * @ClassName: WebSecurityConfig
 * @Description:TODO
 * @date: 2018年3月1日 下午1:15:59
 * @author: zangrong
 * 
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.anyRequest().permitAll()
			.and()
			.cors().and()
			.csrf().disable()
			.headers().frameOptions().disable();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoderBuild(){
		return new BCryptPasswordEncoder();
	}

}

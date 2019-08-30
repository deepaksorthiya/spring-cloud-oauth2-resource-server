package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * Aug 28, 2019 deepakk
 */
@EnableResourceServer
@Configuration
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		// TODO Auto-generated method stub
		super.configure(resources);
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		super.configure(http);
	}

}

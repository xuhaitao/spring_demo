//package com.zeaho.base.config;
//
//import com.zeaho.base.model.user.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
///**
// * Created by xht on 2017/2/5.
// */
//@Configuration
//public class WebSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {
//    @Autowired
//    UserRepo userRepo;
//
//    @Override
//    public void init(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService());
//    }
//
//    @Bean
//    UserDetailsService userDetailsService() {
//        return new UserDetailsService() {
//            @Override
//            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//                return null;
//            }
//        }
//    }
//}

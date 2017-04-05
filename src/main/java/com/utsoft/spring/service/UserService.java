package com.utsoft.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * <br />日期：2017/4/5
 * <br />时间：22:51
 * <br />创建人：刘坤
 * <br />描述：
 * 打印 service 层的日志。
 */
@Service
public class UserService {

    private Logger log = LoggerFactory.getLogger(UserService.class);

    public void log(){
        log.debug("只让service 包 启动 debug 日志：==user dao debug log");
        log.info("只让service 包 启动 debug 日志：==user dao info log");
        log.warn("只让service 包 启动 debug 日志：==user dao warn log");
        log.error("只让service 包 启动 debug 日志：==user dao error log");
    }
}

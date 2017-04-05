package com.utsoft.spring.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * <br />日期：2017/4/5
 * <br />时间：22:28
 * <br />创建人：刘坤
 * <br />描述：
 * 记录日志。
 */
@Component
public class UserDao {

    private Logger log = LoggerFactory.getLogger(UserDao.class);

    public void log(){
        log.debug("user dao debug log");
        log.info("user dao info log");
        log.warn("user dao warn log");
        log.error("user dao error log");
    }
}

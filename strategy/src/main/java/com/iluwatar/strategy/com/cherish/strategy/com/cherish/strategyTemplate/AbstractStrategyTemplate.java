package com.iluwatar.strategy.com.cherish.strategy.com.cherish.strategyTemplate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zengjia
 */
public abstract class AbstractStrategyTemplate implements LogStrategy {

    @Override
    public final void log(String msg) {
        // 1 为消息添加记录日志的时间
        String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss SSS"));
        msg = format + " 内容是：" + msg;
        // 2 真正记录日志
        doLog(msg);
    }

    /**
     * 真正记录日志，让子类实现
     * @param msg 待记录日志
     */
    protected abstract void doLog(String msg);
}

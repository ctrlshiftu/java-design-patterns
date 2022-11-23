package com.iluwatar.strategy.com.cherish.strategy.com.cherish.tolerantRecovery;

/**
 * 日志记录上下文
 *
 * @author zengjia
 */
public class LogContext {

    /**
     * 记录日志的方法，提供客户使用
     * @param msg 待记录日志
     */
    public void log(String msg) {
        // 上下文中，自定实现对具体策略的选择
        // 优先选用策略，记录到数据库
        LogStrategy strategy = new DatabaseLog();
        try {
            strategy.log(msg);
        } catch (Exception exception) {
            // 出错了，那就记录到文件中
            strategy = new FileLog();
            strategy.log(msg);
        }
    }
}

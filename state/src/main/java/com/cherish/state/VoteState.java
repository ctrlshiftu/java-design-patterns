package com.cherish.state;

/**
 *  状态模式：允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类。
 *       1）定义状态接口
 *       2）状态接口具体实现，
 *
 * 需求：在线投票应用，实现同一用户只能投一票，
 *      如果一个用户反复投票，且投票次数超过 5 次，判定为恶意刷票，取消投票资格，取消他所投的票。
 *      如果一个用户投票次数超过 8 次，进入黑名单，禁止再登录和使用系统。
 * 实现：
 *      方式一：if-else 模式
 *      方式二：状态模式
 *          分析：几种用户投票的类型，相当于描述人员的几种投票状态，而各个状态和对应的功能处理具有很强的对应性，有点类似于"一个萝卜一个坑"，各个状态下的处理基本上都是不一样的，也不存在可以相互替换的可能。
 *

 *
 * @author zengjia
 */
public interface VoteState {

    /**
     * 状态对应的处理
     * @param
     *
     */
    void vote(String user, String voteItem, VoteManager voteManager);
}

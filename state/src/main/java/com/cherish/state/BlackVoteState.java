package com.cherish.state;

/**
 * @author zengjia
 */
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 黑名单：禁止登录系统
        System.out.println("进入黑名单，禁止登录和使用本系统");
    }
}

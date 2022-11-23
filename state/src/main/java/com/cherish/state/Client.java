package com.cherish.state;

/**
 * 客户
 *
 * @author zengjia
 */
public class Client {

    public static void main(String[] args) {
        VoteManager voteManager = new VoteManager();
        for (int i = 0; i < 8; i++) {
            voteManager.vote("u1", "A");
        }
    }
}

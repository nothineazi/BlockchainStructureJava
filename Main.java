package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Blockchain tcpCoin = new Blockchain();

    Block a = new Block("0x200", new Date(), "<transactions>");
    Block b = new Block("0x200", new Date(), "<transactions>");
    Block c = new Block("0x200", new Date(), "<transactions>");

    tcpCoin.addBlock(a);
    tcpCoin.addBlock(b);
    tcpCoin.addBlock(c);

    //Modify the last black
    //tcpCoin.getLatestBlock().setPreviousHash("ABCDEFG");

    tcpCoin.displayChain();
    tcpCoin.isValid();
    }
}

package com.kdroid.kotlintuts.codingquestion;

import java.util.HashMap;

public class CoinThief {
    public static void main(String[] args) {

        int thief = 4;
        int coin = 18;

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int j = -1;
        for (int i = 1; i <= thief; i++) {
            hashMap.put(i, j);
        }
        int key = 1;
        int coinLen = coin;

        int remGold = -1;
        int coinSpent = 0;
        for (int i = 1; i <= coinLen; i++) {

            if (key > thief) {
                key = 1;
            }

            if (i == 1 && coin > 0) {
                hashMap.put(key, i);
                remGold = coin - i;
            } else {
                if (remGold > 0) {
                    int val = hashMap.get(key);
                    if (val > 0) {
                        i = i + val;
                        if (i > remGold)
                            hashMap.put(key, i);
                    } else {

                        if (i < remGold) {
                            hashMap.put(key, i);
                        } else {
                            hashMap.put(key, remGold);
                        }

                    }
//                    coinSpent = coinSpent+i;
//                    if(coinSpent>=coin){
//                        System.out.println("Exit loop coin end:"+coinSpent+" : i= "+i);
//                        break;
//                    }
                    remGold = (remGold - i);
                } else {
                    System.out.println("Exit loop:" + remGold + " : i= " + i);
                    break;

                }
            }
            key++;
            System.out.println(hashMap);


//            if (hashMap.get(key) == -1) {
//                if ((coin - i) > 1) {
//                    hashMap.put(key, i);
//                } else {
//                    hashMap.put(key, 1);
//                }
//                coin = coin - i;
//            } else {
//                int val = hashMap.get(key);
//                hashMap.put(key, val + coin);
//                coin = coin - i;
//            }
//            key++;
//            System.out.println(hashMap);
//
        }
        System.out.println("final ooutput : " + hashMap);


    }
}

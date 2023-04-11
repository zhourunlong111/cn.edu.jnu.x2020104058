package com.example.cnedujnux2020104058;

public class BowlingGame {
    int _pins[]=new int[21];
    int currentPinIndex=0;
    public void roll(int i) {
        _pins[currentPinIndex++]=i;

    }

    public int score() {
        int totalScore=0;
        for(int scoreIndex=0;scoreIndex<_pins.length;scoreIndex++){
            totalScore+=_pins[scoreIndex];
            //如果是一个补中，就计算把下下个球的分数也计入当前轮次
            if(scoreIndex<19)
            {
                if(10==_pins[scoreIndex]+_pins[scoreIndex+1]){
                    totalScore+=_pins[scoreIndex+2];
                }
            }
        }
        return totalScore;
    }
}

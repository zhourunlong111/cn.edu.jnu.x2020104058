package com.example.cnedujnux2020104058;

public class BowlingGame {
    int _pins[]=new int[21];
    int currentPinIndex=0;
    public void roll(int i) {
        _pins[currentPinIndex++]=i;

    }

    public int score() {
        int totalScore=0;
        int currentFrameScoreIndex=0;
        for(int currentFrame=0;currentFrame<10;currentFrame++){
            totalScore+=_pins[currentFrameScoreIndex];
            totalScore+=_pins[currentFrameScoreIndex+1];
            if(isaStrike(currentFrameScoreIndex)){
                totalScore+=_pins[currentFrameScoreIndex+2];
            }
            else if(isaSpare(currentFrameScoreIndex)){
                totalScore+=_pins[currentFrameScoreIndex+2];
                currentFrameScoreIndex++;
            }else{
                currentFrameScoreIndex++;
            }
            currentFrameScoreIndex++;
        }
        return totalScore;
    }

    private boolean isaSpare(int scoreIndex) {
        return 10==_pins[scoreIndex]+_pins[scoreIndex+1];
    }
    private boolean isaStrike(int scoreIndex) {
        return 10==_pins[scoreIndex];
    }
}

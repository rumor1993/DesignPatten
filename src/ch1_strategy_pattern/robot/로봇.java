package ch1_strategy_pattern.robot;

public class 로봇 {
    점프행동 행동;

    public 로봇() {
        this.행동 = new 점프못함();
    }

    public void 인사하기() {
        System.out.println("안녕하세요!");
    }

    public void 이동하기() {
        System.out.println("이동합니다.");
    }

    public void 점프수행() {
        행동.점프하기();
    }
}

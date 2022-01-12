package ch1_strategy_pattern.robot;

public class 점프못함 implements 점프행동 {
    @Override
    public void 점프하기() {
        System.out.println("점프를 못합니다.");
    }
}
package com.winter.app.ioc;

public class RobotMainEx {

	public static void main(String[] args) {
		//생성자를 이용한 방법
		//1. 재활용 불가능 (라이프사이클이 같음)
//		Robot robot = new Robot();
//		robot.getLeftArm().act();
//		robot=null;;
//		
//		//2. 재활용 가능 (라이프사이클이 다름)
//		LeftArm leftArm = new LeftArm();
//		RightArm rightArm = new RightArm();
//		robot = new Robot(leftArm, rightArm);
//		robot = null;
//		
//		//세터를 이용한 방법 (재활용 가능)
//		robot = new Robot();
//		robot.setLeftArm(leftArm);
	}

}

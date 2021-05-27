package com.alphabet.gmail.inbox;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Tester22 {

	public static void main(String[] args) throws Exception {
		Thread.sleep(5000);
		Robot robot = new Robot();
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		robot.keyPress(KeyEvent.VK_CONTEXT_MENU);
		robot.keyRelease(KeyEvent.VK_CONTEXT_MENU);
	}

}

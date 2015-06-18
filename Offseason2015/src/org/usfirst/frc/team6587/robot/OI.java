package org.usfirst.frc.team6587.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team6587.robot.commands.claw.*;
import org.usfirst.frc.team6587.robot.commands.lift.SetLiftSpeed;
import org.usfirst.frc.team6587.utils.GamePad;
import org.usfirst.frc.team6587.utils.GamePad.DPadButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	private GamePad gp1 = new GamePad(0);
	// JOYSTICK 1
	private Button b_dpadU = new DPadButton(gp1, GamePad.DPAD_Y, true);
	private Button b_dpadD = new DPadButton(gp1, GamePad.DPAD_Y, false);
	private Button b_dpadR = new DPadButton(gp1, GamePad.DPAD_X, true);
	private Button b_dpadL = new DPadButton(gp1, GamePad.DPAD_X, false);
	private Button b_bumpR = new JoystickButton(gp1, GamePad.BTN_RB);
	private Button b_bumpL = new JoystickButton(gp1, GamePad.BTN_LB);
	private Button b_trigR = new JoystickButton(gp1, GamePad.BTN_RT);
	private Button b_trigL = new JoystickButton(gp1, GamePad.BTN_LT);
	private Button b_sBack = new JoystickButton(gp1, GamePad.BTN_BACK);
	private Button b_sStar = new JoystickButton(gp1, GamePad.BTN_START);
	private Button b_btnA = new JoystickButton(gp1, GamePad.BTN_A);
	private Button b_btnX = new JoystickButton(gp1, GamePad.BTN_X);
	private Button b_btnB = new JoystickButton(gp1, GamePad.BTN_B);
	private Button b_btnY = new JoystickButton(gp1, GamePad.BTN_Y);
	private Button b_clicR = new JoystickButton(gp1, GamePad.AXISBTN_R);
	private Button b_clicL = new JoystickButton(gp1, GamePad.AXISBTN_L);
	
	public OI(){
		
		b_trigR.whenPressed(new SetLiftSpeed(-1));
		b_trigR.whenReleased(new SetLiftSpeed(0));

		b_bumpR.whenPressed(new SetLiftSpeed(1));
		b_bumpR.whenReleased(new SetLiftSpeed(0));

		/*b_bumpL.whenPressed(new SetLiftSpeed(-0.5));
		b_bumpL.whenReleased(new SetLiftSpeed(0));

		b_bumpL.whenPressed(new SetLiftSpeed(0.5));
		b_bumpL.whenReleased(new SetLiftSpeed(0));*/

		b_btnA.whenPressed(new ToggleClaw());
	}
	
	public double getRawAnalogStickALX() {
		return gp1.getLX();
	}

	public double getRawAnalogStickALY() {
		return gp1.getLY();
	}

	public double getRawAnalogStickARX() {
		return gp1.getRX();
	}

	public double getRawAnalogStickARY() {
		return gp1.getRY();
	}
}


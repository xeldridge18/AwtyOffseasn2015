package org.usfirst.frc.team6587.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6587.robot.RobotMap;

public class TopClaw extends Subsystem{
	Solenoid topClaw;
	
	public TopClaw(){
		topClaw = new Solenoid(RobotMap.solenoidTopClaw);
		topClaw.set(false);
	}
	
	public void setClaw(boolean intakeSet){
		topClaw.set(intakeSet);
	}
	
	public boolean getClawValue(){
		return topClaw.get();
	}
	
	public void initDefaultCommand(){
		
	}

}
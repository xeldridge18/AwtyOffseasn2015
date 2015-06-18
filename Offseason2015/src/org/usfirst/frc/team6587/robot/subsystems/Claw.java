package org.usfirst.frc.team6587.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6587.robot.RobotMap;

public class Claw extends Subsystem{
	Solenoid claw;
	
	public Claw(){
		claw = new Solenoid(RobotMap.solenoidIntake);
		claw.set(false);
	}
	
	public void setIntake(boolean intakeSet){
		claw.set(intakeSet);
	}
	
	public boolean getIntakeValue(){
		return claw.get();
	}
	
	public void initDefaultCommand(){
		
	}

}

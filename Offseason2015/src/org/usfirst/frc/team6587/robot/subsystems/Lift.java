package org.usfirst.frc.team6587.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6587.robot.RobotMap;

public class Lift extends Subsystem{
	
	private Victor liftMotor1;
	private Victor liftMotor2;
	
	public Lift(){
		liftMotor1 = new Victor(RobotMap.liftMotor1);
		liftMotor2 = new Victor(RobotMap.liftMotor2);
	}
	
	public void setSpeed(double input){
		liftMotor1.set(input);
		liftMotor2.set(-input);
	}

}

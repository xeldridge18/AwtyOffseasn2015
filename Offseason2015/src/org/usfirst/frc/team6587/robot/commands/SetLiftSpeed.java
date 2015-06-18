package org.usfirst.frc.team6587.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6587.robot.*;
import org.usfirst.frc.team6587.robot.subsystems.Lift.*;

public class SetLiftSpeed extends Command{
	double liftSpeed;
	
	public SetLiftSpeed(double liftSpeed){
		requries(Robot.lift);
		this.liftSpeed = liftSpeed;
		}
	
	protected void initialize(){
		 Robot.lift.setSpeed(liftSpeed);
	}
	
	protected void excute(){
		
	}
	
	protected boolean isFinished(){
		return true;
	}
	
	protected void end(){
		
	}
	
	protected void interrupted(){
		end();
	}
}

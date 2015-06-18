package org.usfirst.frc.team6587.robot.commands.lift;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6587.robot.subsystems.Lift;

import org.usfirst.frc.team6587.robot.Robot;

public class SetLiftSpeed extends Command{
	double liftSpeed;
	
	public SetLiftSpeed(double liftSpeed){
		requires(Robot.lift);
		this.liftSpeed = liftSpeed;
		}
	
	protected void initialize(){
		 Robot.lift.setSpeed(liftSpeed);
	}
	
	protected void execute(){
		
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

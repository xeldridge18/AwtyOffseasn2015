package org.usfirst.frc.team6587.robot.commans.topclaw;

import org.usfirst.frc.team6587.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SetTopClaw extends Command{
	
	boolean intakeSet;
	
	public SetTopClaw(boolean intakeSet){
		requires(Robot.claw);
		this.intakeSet = intakeSet;
	}
	
	protected void initialize(){
		Robot.claw.setClaw(intakeSet);
	}
	
	protected void execute(){
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		end();
	}

}
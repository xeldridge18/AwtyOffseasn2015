package org.usfirst.frc.team6587.robot.commands.claw;

import org.usfirst.frc.team6587.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SetClaw extends Command{
	
	boolean intakeSet;
	
	public SetClaw(boolean intakeSet){
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

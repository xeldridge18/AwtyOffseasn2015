package org.usfirst.frc.team6587.robot.commands.claw;

import org.usfirst.frc.team6587.robot.Robot;
import org.usfirst.frc.team6587.robot.subsystems.Claw;
import org.usfirst.frc.team6587.robot.subsystems.Electrical;
import edu.wpi.first.wpilibj.command.Command;

public class ToggleClaw extends Command{
	
	public ToggleClaw(){
		requires(Robot.claw);
	}
	
	protected void initialize(){
		Robot.claw.setIntake(!Robot.claw.getClawValue());
		Robot.electrical.setCompressor(true);
	}
	
	protected void execute(){
		
	}
	
	protected boolean isFinished(){
		return true;
	}
	
	protected void end(){
		
	}
	
	protected void interrupted(){
		
	}

}

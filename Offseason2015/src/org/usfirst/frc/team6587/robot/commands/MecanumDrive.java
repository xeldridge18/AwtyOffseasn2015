package org.usfirst.frc.team6587.robot.commands;

import org.usfirst.frc.team6587.robot.*;
import org.usfirst.frc.team6587.robot.subsystems.Drivetrain;

public class MecanumDrive {
	
	public MecanumDrive(){
		requires(Robot.drivetrain);
	}
	
	 private void requires(Drivetrain drivetrain) {
		// TODO Auto-generated method stub
		
	}

	// Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double y = Robot.oi.getRawAnalogStickALY();
    	double x = Robot.oi.getRawAnalogStickALX();
    	double r = Robot.oi.getRawAnalogStickARX();
    	
    	Robot.drivetrain.holonomicDriveRamp(y,x,r);
    }
    
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.holonomicDriveUnramped(0,0,0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }

}

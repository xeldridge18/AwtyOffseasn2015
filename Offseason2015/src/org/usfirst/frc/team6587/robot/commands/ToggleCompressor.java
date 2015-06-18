package org.usfirst.frc.team6587.robot.commands;

import org.usfirst.frc.team6587.robot.Robot;
import org.usfirst.frc.team6587.robot.subsystems.Electrical;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ToggleCompressor extends Command {

    public ToggleCompressor() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.electrical);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(Robot.electrical.getCompressorState())
    		Robot.electrical.setCompressor(false);
    	else
    		Robot.electrical.setCompressor(true);
    		
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
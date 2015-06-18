package org.usfirst.frc.team6587.robot.commands;

import org.usfirst.frc.team6587.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetIntakeCommand extends Command {
	
	boolean intakeState;

    public SetIntakeCommand(boolean intakeState) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.intakeSub);
    	this.intakeState = intakeState;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.intakeSub.setIntakeSolenoid(intakeState);
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

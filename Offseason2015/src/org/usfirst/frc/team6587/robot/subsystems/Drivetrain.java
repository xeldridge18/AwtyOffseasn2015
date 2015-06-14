package org.usfirst.frc.team6587.robot.subsystems;


import org.usfirst.frc.team6587.robot.RobotMap;
import org.usfirst.frc.team6587.robot.commands.MecanumDrive;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem{
	
	private Victor frontLeftDrive;
	private Victor frontRightDrive;
	private Victor backLeftDrive;
	private Victor backRightDrive;
	
	static final double CONSTANT_RAMP_LIMIT = 0.1; // ramping
	// 0.05 = 4/10 seconds to full, 0.1 = 2/10 seconds to full
	boolean allowRamped = false;
	private double prevLeft = 0, prevRight = 0;
	private double prevY = 0, prevX = 0, prevR;

	static double kSpeedScaling = 1.0;
	
	RobotDrive robotdrive;
	
	public Drivetrain(){
		frontLeftDrive = new Victor(RobotMap.frontleft);
		frontRightDrive = new Victor(RobotMap.frontright);
		backLeftDrive = new Victor(RobotMap.backleft);
		backRightDrive = new Victor(RobotMap.backrght);
		
		robotdrive = new RobotDrive(frontLeftDrive, frontRightDrive, backLeftDrive, backRightDrive);
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new MecanumDrive());
	}
	
	public void holonomicDriveRamp(double y, double x, double r) { // h-drive
		if (!allowRamped) {
			holonomicDriveUnramped(y, x, r);
			return;
		}
		// deadband
		if (Math.abs(y) < 0.1)
			y = 0;
		if (Math.abs(x) < 0.1)
			x = 0;
		if (Math.abs(r) < 0.1)
			r = 0;
		double ox = x, oy = y, or = r;

		if (ox - prevX > CONSTANT_RAMP_LIMIT) {
			ox = prevX + CONSTANT_RAMP_LIMIT;
		} else if (prevX - ox > CONSTANT_RAMP_LIMIT) {
			ox = prevX - CONSTANT_RAMP_LIMIT;
		}
		if (oy - prevY > CONSTANT_RAMP_LIMIT) {
			oy = prevY + CONSTANT_RAMP_LIMIT;
		} else if (prevY - oy > CONSTANT_RAMP_LIMIT) {
			oy = prevY - CONSTANT_RAMP_LIMIT;
		}
		if (or - prevR > CONSTANT_RAMP_LIMIT) {
			or = prevR + CONSTANT_RAMP_LIMIT;
		} else if (prevR - or > CONSTANT_RAMP_LIMIT) {
			or = prevR - CONSTANT_RAMP_LIMIT;
		}

		prevX = ox;
		prevY = oy;
		prevR = or;

	}
	
	public void holonomicDriveUnramped(double y, double x, double r) { // h-drive
		double ox, oy, or;
		
		if (Math.abs(y) < 0.1)
			y = 0;
		if (Math.abs(x) < 0.1)
			x = 0;
		if (Math.abs(r) < 0.1)
			r = 0;
		
		ox = x;
		oy = -y;
		or = r;
	}
}

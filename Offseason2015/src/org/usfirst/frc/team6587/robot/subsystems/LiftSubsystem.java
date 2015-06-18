package org.usfirst.frc.team6587.robot.subsystems;

import org.usfirst.frc.team6587.utils.*;
import org.usfirst.frc.team6587.robot.HW;

import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class LiftSubsystem extends PIDSubsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private Victor liftMotor2;
	private Victor liftMotor1;
	
	private double setpointSpeed;
	
	private Lidar lidarLift;
	
	public static final double kP = 1.0 / 4.0, kI = 0, kD = 0;
	PIDOutput output;
	PIDSource source;
	
	private boolean useLidar = true;
	
	public LiftSubsystem(){
		super(kP, kI, kD);
		liftMotor1 = new Victor(HW.liftRight);
		liftMotor2 = new Victor(HW.liftLeft);
		
		lidarLift = new Lidar(HW.lidarControlLift);
		
		this.setOutputRange(-1, 1);
	}
	
	public double getLiftHeightInches() {
		return lidarLift.getDistanceIn() + 3.5;
	}  

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double input) {
		this.disable();
		this.setpointSpeed = input;
		//setSpeedInternal(input);
	}
    
    public double getSpeed(){
    	return this.getSpeed();
    }
    
	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return this.getLiftHeightInches();
	}

	@Override
	protected void usePIDOutput(double output) {
		this.setpointSpeed = output;
		//setSpeedInternal(output);
	}
	
	public void disableLidar() {
		useLidar = false;
	}
}


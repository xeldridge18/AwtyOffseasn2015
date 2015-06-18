package org.usfirst.frc.team6587.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class HW {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	// DRIVE MOTORS
    public static final int 
    		backRight = 0, frontRight = 1,
    		backLeft = 2, frontLeft = 3,
    		liftRight = 4, liftLeft = 5,
    		intakeRight = 6, intakeLeft = 7,
    		
    		
    		clawSolenoidIn = 1, clawSolenoidOut = 2,
    		intakeSolenoidIn = 3, intakeSolenoidOut=4,
    		topClawSolenoidIn = 5, topClawSolenoidOut = 6,
    		brakeSolenoidIn = 7, brakeSolenoidOut = 8;
    
    public final static int lidarControlLift = 20;
    		
}
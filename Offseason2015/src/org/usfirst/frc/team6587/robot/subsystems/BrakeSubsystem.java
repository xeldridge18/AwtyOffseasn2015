package org.usfirst.frc.team6587.robot.subsystems;

import org.usfirst.frc.team6587.robot.HW;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BrakeSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Solenoid brakeSolenoid;
	
	public BrakeSubsystem(){
		brakeSolenoid = new Solenoid(HW.brakeSolenoidIn,HW.brakeSolenoidOut);
		brakeSolenoid.set(false);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setBrake(boolean brakeState){
    	brakeSolenoid.set(brakeState);
    }
    
    public boolean getBrakeState(){
    	return brakeSolenoid.get();
    }
}


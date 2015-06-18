package org.usfirst.frc.team6587.robot.subsystems;

import org.usfirst.frc.team6587.robot.HW;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Victor left, right;
	Solenoid intakeSolenoid;
	
	public IntakeSubsystem(){
		left = new Victor(HW.intakeLeft);
		right = new Victor(HW.intakeRight);
		intakeSolenoid = new Solenoid(HW.intakeSolenoidIn,HW.intakeSolenoidOut);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void setSpeedRight(double input) {
		right.set(input);
	}
    public void setSpeedLeft(double input) {
		left.set(input);
	}
    public void setIntakeSolenoid(boolean intakeState){
    	intakeSolenoid.set(intakeState);
    }
    
    public boolean getIntakeState(){
    	return intakeSolenoid.get();
    }
}


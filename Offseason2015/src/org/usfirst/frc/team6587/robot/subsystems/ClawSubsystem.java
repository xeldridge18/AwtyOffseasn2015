package org.usfirst.frc.team6587.robot.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6587.robot.*;

import edu.wpi.first.wpilibj.Solenoid;

public class ClawSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private Solenoid clawSolenoid;

	public ClawSubsystem(){
		clawSolenoid = new Solenoid(HW.clawSolenoidIn,HW.clawSolenoidOut);
		clawSolenoid.set(false);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setClaw(boolean clawState){
    	clawSolenoid.set(clawState);
    }
    
    public boolean getClawState(){
    	return clawSolenoid.get();
    }
}


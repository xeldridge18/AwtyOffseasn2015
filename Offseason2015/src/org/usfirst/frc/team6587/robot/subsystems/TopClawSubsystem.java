package org.usfirst.frc.team6587.robot.subsystems;

import org.usfirst.frc.team6587.robot.HW;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TopClawSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private Solenoid topClawSolenoid;

	public TopClawSubsystem(){
		topClawSolenoid = new Solenoid(HW.topClawSolenoidIn,HW.topClawSolenoidOut);
		topClawSolenoid.set(false);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setTopClaw(boolean topClawState){
    	topClawSolenoid.set(topClawState);
    }
    
    public boolean getTopClawState(){
    	return topClawSolenoid.get();
    }
}


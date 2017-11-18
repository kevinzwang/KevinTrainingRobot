package org.usfirst.frc199.KevinTrainingRobot.subsystems;

import org.usfirst.frc199.KevinTrainingRobot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem implements PneumaticsInterface {

	public final DoubleSolenoid solenoid = RobotMap.solenoid;
	
	public boolean solenoidActuated = false;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

	@Override
	public void actuate() {
		if(solenoidActuated) {
			solenoid.set(DoubleSolenoid.Value.kReverse);
			solenoidActuated = false;
		} else {
			solenoid.set(DoubleSolenoid.Value.kForward);
			solenoidActuated = true;
		}
	}
}


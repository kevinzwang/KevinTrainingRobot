package org.usfirst.frc199.KevinTrainingRobot.subsystems;

/**
 * Interfaces are used to easily test code using JUnitTest.
 */

public interface DrivetrainInterface {
	public void initDefaultCommand();
	public void toggleDriveType();
	public void drive();
	
	/**
	 * An enumeration is used here instead of an integer or boolean to make it clear what drivetype it is
	 */
	public enum DriveTypes {
		ARCADE, TANK
	}
}


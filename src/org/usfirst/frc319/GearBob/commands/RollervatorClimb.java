// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc319.GearBob.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc319.GearBob.Robot;

import com.ctre.CANTalon.TalonControlMode;

/**
 *
 */
public class RollervatorClimb extends Command {
	
	private double climbSpeed = 0; 
	

	public RollervatorClimb(double setPoint) {
		
		this.climbSpeed = setPoint;
		//requires(Robot.rollervator);
		requires(Robot.rollervator);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		//Robot.rollervator.changeModeToVbus();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.rollervator.setClimber(climbSpeed);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Robot.rollervator.isExceedingCurrentThreshhold(50); // This
																				// is
																				// the
																				// amount
																				// of
																				// current
																				// that
																				// stops
																				// the
																				// climb
		// return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		//Robot.rollervator.changeModeToSpeed();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
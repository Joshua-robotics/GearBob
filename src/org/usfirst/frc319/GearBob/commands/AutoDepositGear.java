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
import org.usfirst.frc319.GearBob.subsystems.GearCollector;

import com.ctre.CANTalon.TalonControlMode;

/**
 *
 */
public class AutoDepositGear extends Command {

	public AutoDepositGear() {

		requires(Robot.gearCollector);

	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.gearCollector.gearCollectorMotor.changeControlMode(TalonControlMode.PercentVbus);
		Robot.gearCollector.gearCollectorGoToAngle(-110.0);//-70
		Robot.gearCollector.gearCollectorOut(0.1);//.3
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Robot.gearCollector.isArmAtSetpoint(3.19);
		// return true;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.gearCollector.gearCollectorStop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}

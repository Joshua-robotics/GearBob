// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc319.GearBob;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon drivetrainleft0;
    public static CANTalon drivetrainleft1;
    public static CANTalon drivetrainleft2;
    public static CANTalon drivetrainleft3;
    public static CANTalon drivetrainright4;
    public static CANTalon drivetrainright5;
    public static CANTalon drivetrainright6;
    public static CANTalon drivetrainright7;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivetrainleft0 = new CANTalon(0);
        LiveWindow.addActuator("Drivetrain", "left0", drivetrainleft0);
        
        drivetrainleft1 = new CANTalon(1);
        LiveWindow.addActuator("Drivetrain", "left1", drivetrainleft1);
        
        drivetrainleft2 = new CANTalon(2);
        LiveWindow.addActuator("Drivetrain", "left2", drivetrainleft2);
        
        drivetrainleft3 = new CANTalon(3);
        LiveWindow.addActuator("Drivetrain", "left3", drivetrainleft3);
        
        drivetrainright4 = new CANTalon(4);
        LiveWindow.addActuator("Drivetrain", "right4", drivetrainright4);
        
        drivetrainright5 = new CANTalon(5);
        LiveWindow.addActuator("Drivetrain", "right5", drivetrainright5);
        
        drivetrainright6 = new CANTalon(6);
        LiveWindow.addActuator("Drivetrain", "right6", drivetrainright6);
        
        drivetrainright7 = new CANTalon(7);
        LiveWindow.addActuator("Drivetrain", "right7", drivetrainright7);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
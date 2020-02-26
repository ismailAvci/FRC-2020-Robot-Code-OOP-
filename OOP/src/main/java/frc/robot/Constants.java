/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final byte port_Victor_FR = 1,
                             port_Victor_BR = 2,
                             port_Victor_FL = 4,
                             port_Victor_BL = 3,

                             port_Victor_Intake = 5,
                             port_Victor_ControlPanel = 6,
                             
                             port_Victor_Hook = 8,
                             port_Victor_Hang = 0,

                             port_Servo_ControlPanel = 7,
                             port_Servo_Ultrasonic = 9,
                             
                             port_js = 0,
                             port_xbox = 1,

                             port_Solenoid_FRW = 4,
                             port_Solenoid_REV = 5,

                             port_Ultrasonic = 0;

    public static final double DriveTrain_Deadbad = 0.2;
}

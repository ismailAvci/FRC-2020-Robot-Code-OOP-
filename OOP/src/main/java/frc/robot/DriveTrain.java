/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * FRC 2020 Drive Train kodu
 */
public class DriveTrain {
    ///////ilk önce motorlarımızı tanımlayalım///////
    private static PWMVictorSPX victor_FR = new PWMVictorSPX(Constants.port_Victor_FR);
    private static PWMVictorSPX victor_FL = new PWMVictorSPX(Constants.port_Victor_FL);
    private static PWMVictorSPX victor_BR = new PWMVictorSPX(Constants.port_Victor_BR);
    private static PWMVictorSPX victor_BL = new PWMVictorSPX(Constants.port_Victor_BL);

    ///////sonra bu morotları "sağ" motorlar ve "sol" motorlar diye guruplandırıyoruz///////
    private static SpeedControllerGroup victor_R = new SpeedControllerGroup(victor_FR, victor_BR);
    private static SpeedControllerGroup victor_L = new SpeedControllerGroup(victor_FL, victor_BL);

    ///////en son olarak da morotumuzu sürecek sistemi tanımlıyoruz///////
    private static DifferentialDrive drive = new DifferentialDrive(victor_L, victor_R);

    ///////Robotumuzu sürecek olan metodu yazıyoruz///////
    public static void START_DRIVE(Object o) {
        drive.setDeadband(Constants.DriveTrain_Deadbad);

        if(o instanceof Joystick) drive.arcadeDrive(Input.js.getRawAxis(1), Input.js.getRawAxis(0));
        else if(o instanceof XboxController) drive.tankDrive(Input.xbox.getRawAxis(1), Input.xbox.getRawAxis(5));
        else drive.stopMotor();
    }

    ///////motorumuzu manuel olarak kullanmak için yazdığımız kodlar///////
    public static void FRW(double s) {
        drive.tankDrive(s, s);
    }

    public static void REV(double s) {
        drive.tankDrive(-s, -s);
    }

    public static void TURN_R(double s) {
        drive.tankDrive(s, -s);
    }

    public static void TURN_L(double s) {
        drive.tankDrive(-s, s);
    }

    public static void STOP() {
        drive.stopMotor();
    }

    ///////smartdashboarda drivetrainimizin durumunu yazdırmk için yazdığımız kod///////
    public static void putData(){
        SmartDashboard.putNumber("DriveTrain FR value", victor_FR.get());
        SmartDashboard.putNumber("DriveTrain FL value", victor_FL.get());
        SmartDashboard.putNumber("DriveTrain BR value", victor_BR.get());
        SmartDashboard.putNumber("DriveTrain BL value", victor_BL.get());
    }
}

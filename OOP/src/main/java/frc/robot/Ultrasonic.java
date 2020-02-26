/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * FRC 2020 için ultrasonik sensör kodları
 */
public class Ultrasonic {
    ///////ilk önce sensörümüzü ve servomuzu tanımlayalım///////
    private static AnalogInput in = new AnalogInput(Constants.port_Ultrasonic);
    private static Servo s = new Servo(Constants.port_Servo_Ultrasonic);
    
    ///////bu değeri döndüren fonksiyornu yazıyoruz///////
    public static double getRange(){
        double range = in.getValue() * 0.125 * 2.54;
        return range;
    }

    ///////ultasonik sensörü hazne tarafına döndürecek kodu yazıyoruz///////
    public static void mode_AUTO() {
        s.setAngle(0);
    }

    public static void mode_TELEOP() {
        s.setAngle(180);
    }

    public static void mode_custom(byte angle) {
        s.setAngle(angle);
    }

    ///////verileri yazdırmak için gerekli kod///////
    public static final void putData() {
        SmartDashboard.putNumber("Servo angle", s.getAngle());
        SmartDashboard.putNumber("Range", getRange());
    }
}

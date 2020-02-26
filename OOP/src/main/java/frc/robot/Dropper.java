/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * FRC 2020 için hazne bırakma kodu
 */
public abstract class Dropper {
    ///////Hazneyi kontrol edecek solenoid'i tanımlıyouz///////
    private static DoubleSolenoid solenoid = new DoubleSolenoid(Constants.port_Solenoid_FRW, Constants.port_Solenoid_REV);

    ///////pistonu kontrol edebilmek için gerekli kodları yazıyoruz///////
    public static void setSolenoidFrw(){
        solenoid.set(Value.kForward);
    }

    public static void setSolenoidRev(){
        solenoid.set(Value.kReverse);
    }

    ///////solenoid bilgilerini smartdashboarda yazdıracak kodu yazıyoruz///////
    public static void putData(){
        String solenoidStatus = "";
        if(solenoid.get() == Value.kForward) solenoidStatus = "FORWARD";
        else if(solenoid.get() == Value.kReverse) solenoidStatus = "REVERSE";
        else solenoidStatus = "OFF";

        SmartDashboard.putString("Solenoid Status", solenoidStatus);
    }
}

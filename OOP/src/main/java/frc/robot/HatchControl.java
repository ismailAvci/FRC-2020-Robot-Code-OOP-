/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Add your docs here.
 */
public class HatchControl extends Dropper {
    ///////öncelikle alış sistemindeki motoru taımlıyoruz///////
    private static PWMVictorSPX intake = new PWMVictorSPX(Constants.port_Victor_Intake);

    ///////intake siaiteminin motorunu kontrol için gerekli kodlarımızı yazalım///////
    public static void setIntake(double s){
        intake.set(s);
    }

    public static double getIntake(){
        return intake.get();
    }

    ///////intake sisteminin gelen veriyi işlediği kod///////
    public static void setIntakeAuto(double s) {
        if(Input.but_js_3.get()) intake.set(-s);
        else if(Input.but_js_4.get()) intake.stopMotor();
    }

    ///////intake motorunun durumunu alan kod///////
    public static void putData(){
        Dropper.putData();
        SmartDashboard.putNumber("INTAKE STATUS", getIntake());
    }
}

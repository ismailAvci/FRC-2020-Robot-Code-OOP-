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
 * FRC 2020 Asılma sistemi kodları
 */
public class HangingSystem extends Hook {
    ///////ilk önce motorumuzu tanımlıyoruz///////
    private static PWMVictorSPX hang = new PWMVictorSPX(Constants.port_Victor_Hang);
    
    ///////asılma sisteminin kontrol kodlarını yazıyoruz///////
    public static void up(){
        hang.set(1);
    }

    public static void down(){
        hang.set(-1);
    }

    public static void saveStatus(){
        hang.stopMotor();
    }

    private static double getStatus(){
        return hang.get();
    }

    ///////asılma sistemi bilgilerini yazdıran kod///////
    public static void putData(){
        Hook.putData();
        SmartDashboard.putNumber("lift Status", getStatus());
    }
}

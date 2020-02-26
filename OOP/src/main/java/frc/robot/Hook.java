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
 * FRC 2020 kanca kodu
 */
public abstract class Hook {
    ///////ilk önce kancayı kontrol edecek motoru tanımlayalım///////
    private static PWMVictorSPX hook = new PWMVictorSPX(Constants.port_Victor_Hook);

    ///////sonra bu kancayı kontrol edecek olan teleskop sisteminin kodlarını yazıyoruz///////
    public static void hook_up(){
        hook.set(0.5);
    }

    public static void hook_down(){
        hook.set(-0.5);
    }

    public static void hook_SaveStatus(){
        hook.stopMotor();
    }

    public static double getHookStatus(){
        return hook.get();
    }

    ///////kanca durumunu yazdıracak kod///////
    public static void putData(){
        SmartDashboard.putNumber("Hook Status", getHookStatus());
    }
}

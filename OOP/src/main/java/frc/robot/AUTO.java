/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Timer;

/**
 * FRC 2020 için Otonom kodu
 */
public class AUTO {
    ///////ilk önce yapılandırıcı metodumuzu oluşturuyoruz///////
    public AUTO(){
        Ultrasonic.mode_AUTO();
    }

    ///////Otonom kodumuz///////
    public void startAutonomus(double s){
        DriveTrain.FRW(s*0.5);
        Timer.delay(1);
        DriveTrain.TURN_R(s*0.5);

        while(Ultrasonic.getRange() > 200) {
            DriveTrain.FRW(s*0.5);
        }

        DriveTrain.TURN_R(s*0.5);

        while(Ultrasonic.getRange() > 2) {
            DriveTrain.FRW(s*0.5);
        }

        HatchControl.setSolenoidFrw();
        Timer.delay(1.5);
        HatchControl.setSolenoidRev();

        DriveTrain.REV(s*0.5);
        Timer.delay(2);
    }

    public void PUT_DATA(){
        DriveTrain.putData();
        HatchControl.putData();
        ControlPanel.PutData();
        HangingSystem.putData();
    }
}

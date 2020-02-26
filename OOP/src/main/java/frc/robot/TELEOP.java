/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * FRC 2020 için Teleop kodu
 */
public class TELEOP {
    ///////ilk önce kodumuzda başlatmamız gereken yerler olacaktır bu yüzden bir yapılandırıcı metod tanımlıyoruz///////
    public TELEOP(){
        ControlPanel.init();
        Ultrasonic.mode_TELEOP();
    }

    ///////Ve teleop kodlarımızı yazmaya başlıyoruz///////
    public void startTeleop(double intake, String renk){
        ///////ilk önce driveTrain'imizi ve alış sistemimizi başlatıyoruz///////
        DriveTrain.START_DRIVE(Input.js);
        HatchControl.setIntakeAuto(intake);

        ///////bırakma sistemimizin kontrol kodlarını yazıyoruz///////
        if(Input.but_xbox_5.get()) HatchControl.setSolenoidFrw();
        else if(Input.but_xbox_6.get()) HatchControl.setSolenoidRev();

        ///////Kontrol paeli kodlarını yazıyoruz///////
        if(Input.but_js_7.get()) ControlPanel.setRotationControl();
        else if(Input.but_js_8.get()) ControlPanel.setPositionControl_Manual(renk);

        ///////asılma sisteminin kodunu yazıyoruz///////
        if(Input.but_xbox_4.get()) HangingSystem.hook_up();
        else if(Input.but_xbox_1.get()) HangingSystem.hook_down();
        else Hook.hook_SaveStatus();

        if(Input.but_js_11.get()) HangingSystem.up();
        else if(Input.but_js_12.get()) HangingSystem.down();
        else HangingSystem.saveStatus();
    }

    ///////son olarak da smartdashboard'a robotun tüm genel bilgilerini yazacağız///////
    public void PUT_DATA(){
        DriveTrain.putData();
        HatchControl.putData();
        ControlPanel.PutData();
        HangingSystem.putData();
    }
}

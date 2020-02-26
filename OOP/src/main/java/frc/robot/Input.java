/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * frc 2020 de kullanılacak tüm inputlar
 */
public class Input {
    public static Joystick js = new Joystick(Constants.port_js);
    public static XboxController xbox = new XboxController(Constants.port_xbox);

    public static final JoystickButton but_js_1 = new JoystickButton(js, 1);
    public static final JoystickButton but_js_2 = new JoystickButton(js, 2);
    public static final JoystickButton but_js_3 = new JoystickButton(js, 3);
    public static final JoystickButton but_js_4 = new JoystickButton(js, 4);
    public static final JoystickButton but_js_5 = new JoystickButton(js, 5);
    public static final JoystickButton but_js_6 = new JoystickButton(js, 6);
    public static final JoystickButton but_js_7 = new JoystickButton(js, 7);
    public static final JoystickButton but_js_8 = new JoystickButton(js, 8);
    public static final JoystickButton but_js_9 = new JoystickButton(js, 9);
    public static final JoystickButton but_js_10 = new JoystickButton(js, 10);
    public static final JoystickButton but_js_11 = new JoystickButton(js, 11);
    public static final JoystickButton but_js_12 = new JoystickButton(js, 12);

    public static final JoystickButton but_xbox_1 = new JoystickButton(xbox, 1);
    public static final JoystickButton but_xbox_2 = new JoystickButton(xbox, 2);
    public static final JoystickButton but_xbox_3 = new JoystickButton(xbox, 3);
    public static final JoystickButton but_xbox_4 = new JoystickButton(xbox, 4);
    public static final JoystickButton but_xbox_5 = new JoystickButton(xbox, 5);
    public static final JoystickButton but_xbox_6 = new JoystickButton(xbox, 6);
    public static final JoystickButton but_xbox_7 = new JoystickButton(xbox, 7);
    public static final JoystickButton but_xbox_8 = new JoystickButton(xbox, 8);
    public static final JoystickButton but_xbox_9 = new JoystickButton(xbox, 9);
    public static final JoystickButton but_xbox_10 = new JoystickButton(xbox, 10);
}

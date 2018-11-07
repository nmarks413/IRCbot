package frc.team4159.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

public class OI extends Subsystem{
    private static OI instance;

    public static OI getInstance(){
        if(instance == null){
            instance = new OI();
        }

        return instance;

    }
    private Joystick leftJoy;
    private Joystick rightJoy;
    private Joystick armJoy;

    private OI(){
        leftJoy = new Joystick(0);
        rightJoy = new Joystick(1);
        armJoy = new Joystick(2);
    }
    public double getLeftJoy(){
        return leftJoy.getY();
    }
    public double getRightJoy(){
        return rightJoy.getY();
    }
    public double getArmJoy(){
        return armJoy.getY();
    }



    @Override
    protected void initDefaultCommand() {

    }
}
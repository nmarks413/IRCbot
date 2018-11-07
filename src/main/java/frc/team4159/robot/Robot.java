package frc.team4159.robot;

import edu.wpi.first.wpilibj.TimedRobot;

import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team4159.robot.subsystems.Drivetrain;
import frc.team4159.robot.subsystems.Arm;

public class Robot extends TimedRobot {
    
    private static Drivetrain drivetrain;
    private static Arm arm;

    private OI oi;


    public void robotInit(){
        
        drivetrain = Drivetrain.getInstance();
        oi = OI.getInstance();
        arm = Arm.getInstance();

    }
    public void disabledInit(){

    }
    public void disabledPeriodic(){

    }
    public void autonomousInit(){

    }
    public void autonomousPeriodic(){
        
        Scheduler.getInstance().run();

    }
    public void teleopInit(){

    }
    public void teleopPeriodic(){
        
        Scheduler.getInstance().run();

    }
    public static Drivetrain getDriveTrain() {
            return drivetrain;
    }
    public static Arm getArm() {
        return arm;
}
}
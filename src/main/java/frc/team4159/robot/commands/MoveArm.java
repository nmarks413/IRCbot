package frc.team4159.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4159.robot.OI;
import frc.team4159.robot.Robot;
import frc.team4159.robot.subsystems.Arm;

public class MoveArm extends Command {

    private OI oi;
    private Arm arm;

    @Override
    protected void execute(){
        arm.setSpeed(oi.getArmJoy());
    }


    @Override
    protected boolean isFinished() {
        return false;
    }
    
    @Override
    protected void initialize(){}
   
    @Override
    protected void end(){
        arm.setSpeed(0);
    }
    @Override
    protected void interrupted() {super.interrupted();}


    public MoveArm() {
        oi = OI.getInstance();
        arm = Robot.getArm();
        requires(arm);
    }
}


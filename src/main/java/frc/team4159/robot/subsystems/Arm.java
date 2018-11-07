package frc.team4159.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team4159.robot.commands.MoveArm;

public class Arm extends Subsystem{
    private static Arm instance;

    public static Arm getInstance(){
        if(instance == null){
            instance = new Arm();
        }

        return instance;

    }


    private VictorSP armMoter;


    public void setSpeed(double speed) {
        armMoter.set(speed);
    }


    private Arm() {
        armMoter = new VictorSP(0);
    }


	@Override
	protected void initDefaultCommand() {
		new MoveArm();
	}

    
}
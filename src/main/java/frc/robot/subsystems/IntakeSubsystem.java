package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    /** Constructor. Creates a new ExampleSubsystem. */
    private final SparkMax intakeEngine;

    public IntakeSubsystem() {
        intakeEngine = new SparkMax(12,MotorType.kBrushless);
    }

    public void startIntake() {
        intakeEngine.set(1);
    }

    public void stopIntake() {
        intakeEngine.set(0);
    }


    
    //not needed
    
    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}



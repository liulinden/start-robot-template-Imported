package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TankDriveSubsystem extends SubsystemBase {
    private final WPI_VictorSPX leftWheel1, leftWheel2,rightWheel1,rightWheel2;

    /** Constructor. Creates a new ExampleSubsystem. */
    public TankDriveSubsystem() {
        leftWheel1= new WPI_VictorSPX(0);
        leftWheel2= new WPI_VictorSPX(0);
        rightWheel1= new WPI_VictorSPX(0);
        rightWheel2= new WPI_VictorSPX(0);
    }

    private void setLeftWheelsSpeed(double speed) {
        leftWheel1.set(speed);
        leftWheel2.set(speed);
    }
    private void setRightWheelsSpeed(double speed) {
        rightWheel1.set(speed);
        rightWheel2.set(speed);
    }

    public static void tankDrive(double angle, double r) {
        double adjustedAngle = angle % 360;
        double leftSpeed, rightSpeed;
        if (adjustedAngle < 90) {
            leftSpeed = 1-adjustedAngle/45;
            rightSpeed=1;
        } else if (adjustedAngle < 180) {
            leftSpeed = -1;
            rightSpeed = 1-(adjustedAngle-90)/45;
        } else if (adjustedAngle < 270) {
            leftSpeed = -1+(adjustedAngle-180)/45;
            rightSpeed = -1;
        } else {
            leftSpeed = 1;
            rightSpeed = -1+(adjustedAngle-270)/45;
        }
        setLeftWheelsSpeed(r*leftSpeed);
        setRightWheelsSpeed(r*rightSpeed);
    }

    /**
     * This method is called periodically by the CommandScheduler, about every 20ms.
     * It should be used for updating subsystem-specific state that you don't want to offload to a Command.
     * Try not to make it "do too much".
     */
    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}

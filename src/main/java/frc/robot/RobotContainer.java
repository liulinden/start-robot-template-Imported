package frc.robot;

import frc.robot.Constants.DriverConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.ShooterCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.FlywheelSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.TankDriveSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import frc.robot.commands.Drive;

/**
 * This class is where the bulk of the robot should be declared.
 * Since Command-based is a "declarative" paradigm, very little robot logic
 * should actually be handled in the {@link Robot} periodic methods (other than
 * the scheduler calls).
 * Instead, the structure of the robot (including subsystems, commands, and
 * trigger mappings) should be declared here.
 */
public class RobotContainer {
    // The robot's subsystems and commands are defined here...

    // Create joysticks
    //private final CommandXboxController controller = new CommandXboxController(DriverConstants.DRIVER_JOYSTICK_PORT);
    
    
    private final TankDriveSubsystem tankDriveSubsystem = new TankDriveSubsystem();

    /**
     * The container for the robot. Contains subsystems, OI devices, and commands.
     */
    public RobotContainer() {

        // Configure the trigger bindings
        configureBindings();
    }

    /** Use this method to define your trigger->command mappings. */
    private void configureBindings() {
        tankDriveSubsystem.setDefaultCommand(new Drive(tankDriveSubsystem));
        /*
        controller.leftTrigger().whileTrue(new IntakeCommand(intake));
        controller.rightTrigger().onTrue(new ShooterCommand(intake, flywheels));

        controller.rightTrigger().onTrue(
                flywheels.runOnce(flywheels::startFlywheels).andThen(
                        new WaitCommand(1)).andThen(
                                intake.runOnce(intake::startIntake))
                        .andThen(
                                new WaitCommand(1))
                        .andThen(
                                flywheels.runOnce(flywheels::stopFlywheels))
                        .andThen(
                                intake.runOnce(intake::stopIntake)));
        
        controller.rightTrigger().onTrue(
            Commands.sequence(
                flywheels.runOnce(flywheels::startFlywheels),
                Commands.waitSeconds(1),
                Commands.parallel(flywheels.runOnce(flywheels::stopFlywheels),intake.runOnce(intake::stopIntake))
                )
            );
        */
    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     **/

    public Command getAutonomousCommand() {
        // An example command will be run in autonomous
        return Commands.none();
    }

}

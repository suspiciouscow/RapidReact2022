package frc.team2412.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.team2412.robot.subsystem.ShooterSubsystem;

public class ShooterFlywheelSetVelocityCommand extends InstantCommand {
    public ShooterFlywheelSetVelocityCommand(ShooterSubsystem shooter, double velocity) {
        super(() -> shooter.setFlywheelVelocity(velocity), shooter);
    }
}

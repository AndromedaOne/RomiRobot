// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
    public AutonomousDistance(Drivetrain drivetrain) {
    addCommands(
        new DriveDistance(-0.5, 10, drivetrain),
        new TurnDegrees(-0.5, 180, drivetrain),
        new DriveDistance(-0.5, 10, drivetrain),
        new TurnDegrees(0.5, 180, drivetrain));

        new DriveDistance(-0.5, 18, drivetrain),
        new TurnDegrees(-0.5, 90, drivetrain),
        new DriveDistance(-0.5, 14, drivetrain),
        new TurnDegrees(0.5, 90, drivetrain));
        new DriveDistance(-0.5, 12, drivetrain),
        new TurnDegrees(0.5, 90, drivetrain));
        new DriveDistance(-0.5, 8, drivetrain),
        new TurnDegrees(0.5, -90, drivetrain));
        new DriveDistance(-0.5, 10, drivetrain),
        new TurnDegrees(0.5, 90, drivetrain));
        new DriveDistance(-0.5, 10, drivetrain),
        new TurnDegrees(0.5, 90, drivetrain),
        new DriveDistance(-0.5, 10, drivetrain));

      }
   */
 

  public AutonomousDistance(Drivetrain drivetrain) {
    addCommands(
        new DriveDistance(0.75, 17, drivetrain),
        new TurnDegrees(-0.5, 90, drivetrain),
        new DriveDistance(0.75, 12, drivetrain),
        new TurnDegrees(-0.5, 90, drivetrain),

        new DriveDistance(0.75, 13, drivetrain),
        new TurnDegrees(-0.5, 90, drivetrain),
        new DriveDistance(0.75, 9, drivetrain),
        new TurnDegrees(0.5, 90, drivetrain),

        new DriveDistance(0.75, 13, drivetrain),
        new TurnDegrees(0.5, 90, drivetrain),
        new DriveDistance(0.75, 17, drivetrain),
        new TurnDegrees(0.5, 90, drivetrain),
        new DriveDistance(0.75, 17, drivetrain));
     
 
  }


}

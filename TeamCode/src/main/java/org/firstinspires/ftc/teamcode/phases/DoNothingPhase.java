package org.firstinspires.ftc.teamcode.phases;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.RobotHardware;

public class DoNothingPhase implements AutonomousPhase {

    /**
     * This method processes one op-mode process call with the intent of executing the do-nothing phase
     * This is useful when what you really want is just to move the robot around manually and verify
     * sensing telemetry.
     *
     * @param robot The robot configuration (provided by the op-mode class
     * @return False always.
     */
    @Override
    public boolean process(RobotHardware robot, Telemetry telemetry) {
        return false;
    }
}
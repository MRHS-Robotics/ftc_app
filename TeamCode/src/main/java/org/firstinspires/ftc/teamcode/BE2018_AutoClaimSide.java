package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.phases.AutonomousPhase;
import org.firstinspires.ftc.teamcode.phases.DoNothingPhase;
import org.firstinspires.ftc.teamcode.phases.DropRobotPhase;
import org.firstinspires.ftc.teamcode.phases.ForwardColorPhase;
import org.firstinspires.ftc.teamcode.phases.ForwardDurationPhase;
import org.firstinspires.ftc.teamcode.phases.ForwardSensePhase;
import org.firstinspires.ftc.teamcode.phases.MarkerDropPhase;

import java.util.LinkedList;

@Autonomous(name="BE2018_AutoClaimSide", group="Iterative Opmode")
public class BE2018_AutoClaimSide extends AutoAbstract {

    @Override
    void setPhases(LinkedList<AutonomousPhase> phaseList) {
        phaseList.add(new DropRobotPhase());

        // escape latch
        phaseList.add(new ForwardDurationPhase(100, 0.28, true,false));
        phaseList.add(new ForwardDurationPhase(100, 0.28, false,false));
        phaseList.add(new ForwardDurationPhase(100, -0.28, true,false));

        // forward to minerals
        phaseList.add(new ForwardSensePhase(3.85, 1, false, 15, 0.90));

        // strafe left beyond leftmost mineral
        phaseList.add(new ForwardDurationPhase(200, 1, true, false));
        phaseList.add(new ForwardSensePhase(5, 0.25,true, 0, 0));
        phaseList.add(new ForwardDurationPhase(10, 0.5, true,false));

        // strafe to select gold mineral
        phaseList.add(new ForwardColorPhase(-0.28, true,45,10, 10000, 9));

        //
        phaseList.add(new ForwardDurationPhase(1200, 1, false,false));
        phaseList.add(new MarkerDropPhase(0.87, true));
        phaseList.add(new DoNothingPhase());
    }
}

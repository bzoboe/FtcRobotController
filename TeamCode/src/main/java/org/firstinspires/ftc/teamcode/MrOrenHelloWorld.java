package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;



@Autonomous
public class MrOrenHelloWorld extends OpMode {
    @Override
    public void init(){
        telemetry.addData("Hello","Oren");
    }

    @Override
    public void loop() {

    }
}

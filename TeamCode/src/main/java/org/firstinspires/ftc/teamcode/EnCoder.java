package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Encoder")
public class EnCoder extends LinearOpMode
{

    DcMotor motor;

    @Override
    public void runOpMode() throws InterruptedException
    {
        motor = hardwareMap.get(DcMotor.class, "motor5");
        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        waitForStart();
        motor.setPower(1);
        motor.setTargetPosition(50);

    }
}

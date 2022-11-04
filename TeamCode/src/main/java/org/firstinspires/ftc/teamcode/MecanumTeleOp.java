package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class MecanumTeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        // Declare our motors
        // Make sure your ID's match your configuration
        DcMotor motorBackLeft = hardwareMap.dcMotor.get("motor3");
        DcMotor motorFrontLeft = hardwareMap.dcMotor.get("motor4");
        DcMotor motorBackRight = hardwareMap.dcMotor.get("motor1");
        DcMotor motorFrontRight = hardwareMap.dcMotor.get("motor2");
//        DcMotor viperSlide = hardwareMap.dcMotor.get("motor5");
        Servo servo = hardwareMap.servo.get("servo 1");
        Servo servo2 = hardwareMap.servo.get("servo 2");
        Servo servo3 = hardwareMap.servo.get("servo 3");


        // Reverse the right side motors
        // Reverse left motors if you are using NeveRests
//        motorFrontRight.setDirection(DcMotorSimple   .Dire3ction.REVERSE);
//        motorBackRight.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        if (isStopRequested()) return;

        while (opModeIsActive()) {
//            servo2.setDirection(Servo.Direction.REVERSE);
            double y = -0.5*gamepad1.left_stick_y; // Remember, this is reversed!
            double x = 0.5*gamepad1.left_stick_x * 1.0; // Counteract imperfect strafing
            double rx = 0.5*gamepad1.right_stick_x;
            // Denominator is the largest motor power (absolute value) or 1
            // This ensures all the powers maintain the same ratio, but only when
            // at least one is out of the range [-1, 1]
            double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
            double frontLeftPower = (y + x + rx) / denominator;
            double backLeftPower = (y - x + rx) / denominator;
            double frontRightPower = (y - x - rx) / denominator;
            double backRightPower = (y + x - rx) / denominator;

//            motorFrontLeft.setPower(-frontLeftPower);
//            motorBackLeft.setPower(-backLeftPower);
//            motorFrontRight.setPower(frontRightPower);
//            motorBackRight.setPower(backRightPower);
            servo3.setPosition(0);

            servo3.setPosition(1);

            servo3.setPosition(0);
            servo3.setPosition(1);



//            if (gamepad2.dpad_down) {
//                servo3.setPosition(0);
//            }
//            if (gamepad2.dpad_up) {
//                servo3.setPosition(1);
//            }



            if(gamepad2.left_bumper) {

<<<<<<< Updated upstream
                servo2.setPosition(0.7);
                servo.setPosition(0);

            }


            if(gamepad2.right_bumper) {

                servo2.setPosition(1);
                servo.setPosition(0.3);
            }

            viperSlide.setPower(0.8 * gamepad1.left_trigger);
            viperSlide.setPower(0.8 * gamepad1.right_trigger);
=======
            if(gamepad2.left_bumper) {
                servo2.setPosition(-1);
//                servo.setPosition(1);

            }
            if(gamepad2.right_bumper) {
                servo2.setPosition(-0.75);
//                servo.setPosition(0.75);
            }
            telemetry.addData("servo1 position:", servo.getPosition());
            telemetry.addData("Servo2 position:", servo2.getPosition());
            telemetry.update();
//
//            viperSlide.setPower(-0.8 * gamepad1.left_trigger);
//            viperSlide.setPower(0.8 * gamepad1.right_trigger);
>>>>>>> Stashed changes



        }
    }
}
package Simple_Sump_Pump {

    private import HAMR::*;

    enum def Pump_Command {
        enum Pump_On;
        enum Pump_Off;
    }

    enum def Alarm_State {
        enum Alarm_On;
        enum Alarm_Off;
    }

    enum def Controller_Mode {
        enum Normal;
        enum Maintenance;
    }

    enum def Reading_Status {
        enum Valid;
        enum Invalid;
    }
    

    part def Water_Level_i :> Data {
        // current water level in sump 
        part centimeters : Base_Types::Integer_32;

        // status of the water level sensor
        attribute status : Reading_Status;

        // whatever level is only plausibly bewteen 0 and 200 cm
        language "GUMBO" /*{
            invariants
                inv physically_plausible_level:
                    0 [s32] <= centimeters & centimeters <= 200 [s32];
        }*/
    }
    
    // Start a thread: this actually have application behavior that we can define GUMBO contracts over
    part def Pump_Controller_i :> Thread {
        // HAMR dispatches this thread on a fixed periodic schedule of once per second
        attribute :>> Dispatch_Protocol = Periodic;
        attribute :>> Period = 1000 [ms];

        // input from water level sensor
        port water_level : DataPort { in:>> type : Water_Level_i; }

        // input from operator / controller
        port mode : DataPort { in:>> type : Controller_Mode; }

        // Output to the pump actuator
        port pump_command : DataPort { out :>> type : Pump_Command; }

        // output to the alarm
        port alarm_state : DataPort { out :>> type : Alarm_State; }

        // GUMBO CONTRACTS GO HERE
        language "GUMBO" /*{
            initialize
                // REQ-001: On initialization, the controller shall command the pump off.
                guarantee init_controller_mode:
                    pump_command == Pump_Command::Pump_Off;

                // REQ-002: On initialization, the controller shall set the alarm off.
                guarantee init_alarm_state:
                    alarm_state == Alarm_State::Alarm_Off;

                // REQ-003: The controller shall only assume water-level readings in the physically plausible range of 0 cm through 200 cm, inclusive.
                guarantee init_water_level:
                    0[s32] <= water_level.centimeters & water_level.centimeters <= 200[s32];
                
                // May need to add assumption about valid reading status of water level
                // guarantee init_water_status:
                //     water_level.status == Reading_Status::Valid;
                
            compute
                // REQ-004: If the controller is in `Maintenance` mode, it shall command the pump off regardless of the water-level reading.
                assume mode == Controller_Mode::Maintenance;
                guarantee pump_command == Pump_Command::Pump_Off;

                // REQ-005: If the controller is in `Maintenance` mode and the water-level reading is valid, it shall set the alarm on exactly when the water level is at least 120 cm.
                // assume mode == Controller_Mode::Maintenance 
                // & water_level.status == Reading_Status::Valid
                // & water_level.centimeters >= 120[s32];
                // guarantee alarm_state == Alarm_State::Alarm_On;


        }*/
    }


    // Process for deployment/container boundary
    part def Pump_Controller_Process_i :> Process {
        // behavioral thread 
        part controller : Pump_Controller_i;

        // process level port mirrors the thread ports
        port water_level : DataPort { in :>> type : Water_Level_i; }
        port mode : DataPort { in :>> type : Controller_Mode; }
        port pump_command : DataPort { out :>> type : Pump_Command; }
        port alarm_state : DataPort { out:>> type : Alarm_State; }

        // forward relevant things to the controller thread
        connection level_to_controller : PortConnection
            connect water_level to controller.water_level;

        connection mode_to_controller : PortConnection
            connect mode to controller.mode;

        connection command_from_controller : PortConnection
            connect controller.pump_command to pump_command;

        connection alarm_from_controller : PortConnection
            connect controller.alarm_state to alarm_state;
    }

    // System wrapper: defines the outside world it can provide to and observe from
    part def Sump_Pump_System_i :> System {
        // one process that implements system behavior
        part controller_process : Pump_Controller_Process_i;

        // System boundary ports
        port water_level : DataPort { in :>> type : Water_Level_i; }
        port mode : DataPort { in :>> type : Controller_Mode; }
        port pump_command : DataPort { out :>> type : Pump_Command; }
        port alarm_state : DataPort { out:>> type : Alarm_State; }

        connection level_to_controller : PortConnection
            connect water_level to controller_process.water_level;

        connection mode_to_controller : PortConnection
            connect mode to controller_process.mode;

        connection command_from_controller : PortConnection
            connect controller_process.pump_command to pump_command;

        connection alarm_from_controller : PortConnection
            connect controller_process.alarm_state to alarm_state;
    }
}
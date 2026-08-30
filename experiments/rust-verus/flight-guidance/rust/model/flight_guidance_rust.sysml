// Deployment projection of model/flight_guidance.sysml.
// Only Microkit wrapper/deployment structure differs; FAA-facing names and ports are retained.
package FAA_Flight_Guidance_System {
  private import HAMR::*;

  // @trace SRC-C-TABLE-C-1
  part def Display_FD_Command :> Data {
    attribute displayFd : Base_Types::Boolean;
    // False encodes source status Invalid; true encodes Valid.
    attribute displayFdStatus : Base_Types::Boolean;
  }

  // @trace SRC-C-TABLE-C-1
  part def Sync_FD_Command :> Data {
    attribute syncFd : Base_Types::Boolean;
    // False encodes source status Invalid; true encodes Valid.
    attribute syncFdStatus : Base_Types::Boolean;
  }

  // @trace SRC-C-TABLE-C-3
  part def AP_Guidance_Request_Data :> Data {
    attribute apGuidanceRequest : Base_Types::Boolean;
    // False encodes source status Invalid; true encodes Valid.
    attribute apGuidanceRequestStatus : Base_Types::Boolean;
  }

  // @trace SRC-C-TABLE-C-2 EA-AHS-1 EA-AHS-2 EA-AHS-3 EA-AHS-4
  part def Aircraft_Attitude_Data :> Data {
    // Source unit: degrees; executable encoding: tenths of a degree.
    attribute rollTenthDegree : Base_Types::Integer_32;
    // False encodes source status Invalid; true encodes Valid.
    attribute rollStatus : Base_Types::Boolean;
    attribute pitchTenthDegree : Base_Types::Integer_32;
    // False encodes source status Invalid; true encodes Valid.
    attribute pitchStatus : Base_Types::Boolean;
  }

  // @trace SRC-C-TABLE-C-4 REQ-FGS-3
  part def AP_Guidance_Data :> Data {
    // Source unit: degrees; executable encoding: tenths of a degree.
    attribute rollGuidanceTenthDegree : Base_Types::Integer_32;
    attribute pitchGuidanceTenthDegree : Base_Types::Integer_32;
    attribute guidanceValid : Base_Types::Boolean;
  }

  // @trace SRC-C-TABLE-C-5 REQ-FGS-1
  part def FD_Guidance_Data :> Data {
    // Source unit: degrees; executable encoding: tenths of a degree.
    attribute rollGuidanceTenthDegree : Base_Types::Integer_32;
    attribute pitchGuidanceTenthDegree : Base_Types::Integer_32;
    attribute fdOn : Base_Types::Boolean;
  }

  // Appendix C names one FGS Function and supplies no lower-level part names.
  // @trace SRC-C-4 SRC-C-FUNCTION REQ-FGS-1 REQ-FGS-2 REQ-FGS-3 REQ-FGS-4
  part def FGS_Function :> HAMR_AADL::Thread {
    attribute :>> Implementation_Language = HAMR::Rust;
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    // @formalization logical execution period; Appendix C specifies no period.
    attribute :>> Period = 100 [ms];

    // @trace SRC-C-TABLE-C-1
    port Display_FD : DataPort { in :>> type : Display_FD_Command; }
    // @trace SRC-C-TABLE-C-1 REQ-FGS-2
    port Sync_FD : DataPort { in :>> type : Sync_FD_Command; }
    // @trace SRC-C-TABLE-C-2
    port Aircraft_Attitude : DataPort { in :>> type : Aircraft_Attitude_Data; }
    // @trace SRC-C-TABLE-C-3 REQ-FGS-2
    port AP_Guidance_Request : DataPort { in :>> type : AP_Guidance_Request_Data; }
    // @trace SRC-C-TABLE-C-4 REQ-FGS-3
    port AP_Guidance : DataPort { out :>> type : AP_Guidance_Data; }
    // @trace SRC-C-TABLE-C-5 REQ-FGS-1
    port FD_Guidance : DataPort { out :>> type : FD_Guidance_Data; }
    // Appendix C's table/figure say FGS Failed; REQ-FGS-4 says FCS Failed.
    // @trace SRC-C-TABLE-C-5 REQ-FGS-4
    port FCS_Failed : DataPort { out :>> type : Base_Types::Boolean; }


  }

  // @generated-support Microkit process wrapper for the Appendix C FGS Function.
  part def FGS_Function_Process :> HAMR_AADL::Process {
    attribute :>> Domain = 2;
    port Display_FD : DataPort { in :>> type : Display_FD_Command; }
    port Sync_FD : DataPort { in :>> type : Sync_FD_Command; }
    port Aircraft_Attitude : DataPort { in :>> type : Aircraft_Attitude_Data; }
    port AP_Guidance_Request : DataPort { in :>> type : AP_Guidance_Request_Data; }
    port AP_Guidance : DataPort { out :>> type : AP_Guidance_Data; }
    port FD_Guidance : DataPort { out :>> type : FD_Guidance_Data; }
    port FCS_Failed : DataPort { out :>> type : Base_Types::Boolean; }
    part behavior : FGS_Function;
    connection Display_FD_to_Function : PortConnection connect Display_FD to behavior.Display_FD;
    connection Sync_FD_to_Function : PortConnection connect Sync_FD to behavior.Sync_FD;
    connection Aircraft_Attitude_to_Function : PortConnection connect Aircraft_Attitude to behavior.Aircraft_Attitude;
    connection AP_Guidance_Request_to_Function : PortConnection connect AP_Guidance_Request to behavior.AP_Guidance_Request;
    connection AP_Guidance_from_Function : PortConnection connect behavior.AP_Guidance to AP_Guidance;
    connection FD_Guidance_from_Function : PortConnection connect behavior.FD_Guidance to FD_Guidance;
    connection FCS_Failed_from_Function : PortConnection connect behavior.FCS_Failed to FCS_Failed;
  }

  // @generated-support Microkit deployment metadata.
  part def Flight_Guidance_Processor :> HAMR_AADL::Processor {
    attribute :>> Max_Domain = 2;
    attribute :>> Clock_Period = 1 [ms];
    attribute :>> Frame_Period = 1000 [ms];
  }

  // @trace SRC-C-1 SRC-C-4
  part def Flight_Guidance_System :> System {
    attribute :>> Scheduling = HAMR_Microkit::Domain_Scheduling;
    // @trace SRC-C-TABLE-C-1
    port Display_FD : DataPort { in :>> type : Display_FD_Command; }
    // @trace SRC-C-TABLE-C-1
    port Sync_FD : DataPort { in :>> type : Sync_FD_Command; }
    // @trace SRC-C-TABLE-C-2
    port Aircraft_Attitude : DataPort { in :>> type : Aircraft_Attitude_Data; }
    // @trace SRC-C-TABLE-C-3
    port AP_Guidance_Request : DataPort { in :>> type : AP_Guidance_Request_Data; }
    // @trace SRC-C-TABLE-C-4
    port AP_Guidance : DataPort { out :>> type : AP_Guidance_Data; }
    // @trace SRC-C-TABLE-C-5
    port FD_Guidance : DataPort { out :>> type : FD_Guidance_Data; }
    // @trace SRC-C-TABLE-C-5 REQ-FGS-4
    port FCS_Failed : DataPort { out :>> type : Base_Types::Boolean; }

    part Flight_Guidance_Processor : Flight_Guidance_Processor;
    // The only semantic application part is the source-named FGS Function.
    part Flight_Guidance_System_Function : FGS_Function_Process;
    allocation bind_FGS_Function : Deployment_Properties::Actual_Processor_Binding
      allocate Flight_Guidance_System_Function to Flight_Guidance_Processor;

    connection Display_FD_to_FGS : PortConnection connect Display_FD to Flight_Guidance_System_Function.Display_FD;
    connection Sync_FD_to_FGS : PortConnection connect Sync_FD to Flight_Guidance_System_Function.Sync_FD;
    connection Aircraft_Attitude_to_FGS : PortConnection connect Aircraft_Attitude to Flight_Guidance_System_Function.Aircraft_Attitude;
    connection AP_Guidance_Request_to_FGS : PortConnection connect AP_Guidance_Request to Flight_Guidance_System_Function.AP_Guidance_Request;
    connection AP_Guidance_from_FGS : PortConnection connect Flight_Guidance_System_Function.AP_Guidance to AP_Guidance;
    connection FD_Guidance_from_FGS : PortConnection connect Flight_Guidance_System_Function.FD_Guidance to FD_Guidance;
    connection FCS_Failed_from_FGS : PortConnection connect Flight_Guidance_System_Function.FCS_Failed to FCS_Failed;
  }
}

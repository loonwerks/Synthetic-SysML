package FAA_FCS_Coordination {

  private import HAMR::*;

  enum def Request_Value {
    enum Requested;
    enum Not_Requested;
  }

  enum def Input_Validity {
    enum Valid;
    enum Invalid;
  }

  enum def Qualified_Request {
    enum Requested;
    enum Not_Requested;
  }

  enum def Attitude_Data_Validity {
    enum Valid;
    enum Invalid;
  }

  enum def Attitude_Acceptability {
    enum Acceptable;
    enum Not_Acceptable;
  }

  enum def Reference_State {
    enum Synchronized;
    enum Not_Synchronized;
  }

  enum def AP_Availability {
    enum Available;
    enum Failed;
  }

  enum def FD_Indication {
    enum On;
    enum Off;
  }

  enum def FCS_Failed_Indication {
    enum Asserted;
    enum Clear;
  }

  enum def AP_Status {
    enum On;
    enum Off;
    enum Failed;
  }

  enum def AP_Enable {
    enum Enabled;
    enum Disabled;
  }

  enum def Request_Indication {
    enum Asserted;
    enum Not_Asserted;
  }

  part def FCI_Command_Intake_i :> Thread {
    port display_fd_request_in : DataPort { in :>> type : Request_Value; }
    port display_fd_validity_in : DataPort { in :>> type : Input_Validity; }
    port sync_fd_request_in : DataPort { in :>> type : Request_Value; }
    port sync_fd_validity_in : DataPort { in :>> type : Input_Validity; }
    port engage_ap_request_in : DataPort { in :>> type : Request_Value; }
    port engage_ap_validity_in : DataPort { in :>> type : Input_Validity; }

    port qualified_display_request : DataPort { out :>> type : Qualified_Request; }
    port qualified_sync_request : DataPort { out :>> type : Qualified_Request; }
    port qualified_engage_request : DataPort { out :>> type : Qualified_Request; }
    language "GUMBO" /*{
      compute
        guarantee PART_01_QUALIFY_DISPLAY "qualified display request to Requested exactly when display FD request in is Requested and display FD validity in is Valid":
          ((display_fd_request_in == Request_Value.Requested & display_fd_validity_in == Input_Validity.Valid) implies (qualified_display_request == Qualified_Request.Requested)) & ((qualified_display_request == Qualified_Request.Requested) implies (display_fd_request_in == Request_Value.Requested & display_fd_validity_in == Input_Validity.Valid));
        guarantee PART_01_QUALIFY_SYNC "qualified sync request to Requested exactly when sync FD request in is Requested and sync FD validity in is Valid":
          ((sync_fd_request_in == Request_Value.Requested & sync_fd_validity_in == Input_Validity.Valid) implies (qualified_sync_request == Qualified_Request.Requested)) & ((qualified_sync_request == Qualified_Request.Requested) implies (sync_fd_request_in == Request_Value.Requested & sync_fd_validity_in == Input_Validity.Valid));
        guarantee PART_01_QUALIFY_ENGAGE "qualified engage request to Requested exactly when engage AP request in is Requested and engage AP validity in is Valid":
          ((engage_ap_request_in == Request_Value.Requested & engage_ap_validity_in == Input_Validity.Valid) implies (qualified_engage_request == Qualified_Request.Requested)) & ((qualified_engage_request == Qualified_Request.Requested) implies (engage_ap_request_in == Request_Value.Requested & engage_ap_validity_in == Input_Validity.Valid));
    }*/

                        
             
                                                                                               
                                                                                                         
                                                                       
                                                               
                                                             
                                                                                               
                                                                                                              
                                                                    
                                                            
                                                          
                                                                                               
                                                                                                           
                                                                      
                                                              
                                                            
       
  }

  part def Attitude_Condition_Intake_i :> Thread {
    port attitude_data_in : DataPort { in :>> type : Attitude_Data_Validity; }
    port attitude_acceptable_in : DataPort { in :>> type : Attitude_Acceptability; }
    port attitude_data_out : DataPort { out :>> type : Attitude_Data_Validity; }
    port attitude_acceptable_out : DataPort { out :>> type : Attitude_Acceptability; }
    language "GUMBO" /*{
      compute
        guarantee PART_02_PRESERVE_ATTITUDE_DATA "attitude data out to attitude data in":
          attitude_data_out == attitude_data_in;
        guarantee PART_02_PRESERVE_ATTITUDE_ACCEPTABILITY "attitude acceptable out to attitude acceptable in":
          attitude_acceptable_out == attitude_acceptable_in;
    }*/

                        
             
                                              
                                                                                                                
                                                
                                              
                                                                                                                     
                                                            
       
  }

  part def Reference_State_Intake_i :> Thread {
    port reference_state_in : DataPort { in :>> type : Reference_State; }
    port reference_state_out : DataPort { out :>> type : Reference_State; }
    language "GUMBO" /*{
      compute
        guarantee PART_03_PRESERVE_REFERENCE_STATE "reference state out to reference state in":
          reference_state_out == reference_state_in;
    }*/

                        
             
                                                     
                                                                                                                                      
                                                    
       
  }

  part def AP_Availability_Intake_i :> Thread {
    port ap_availability_in : DataPort { in :>> type : AP_Availability; }
    port ap_availability_out : DataPort { out :>> type : AP_Availability; }
    language "GUMBO" /*{
      compute
        guarantee PART_04_PRESERVE_AP_AVAILABILITY "AP availability out to AP availability in":
          ap_availability_out == ap_availability_in;
    }*/

                        
             
                                              
                                                                                                                        
                                                    
       
  }

  part def Flight_Guidance_Coordination_i :> Thread {
    port qualified_display_request : DataPort { in :>> type : Qualified_Request; }
    port qualified_sync_request : DataPort { in :>> type : Qualified_Request; }
    port attitude_data : DataPort { in :>> type : Attitude_Data_Validity; }
    port attitude_acceptable : DataPort { in :>> type : Attitude_Acceptability; }
    port reference_state : DataPort { in :>> type : Reference_State; }
    port reference_sync_trigger : DataPort { in :>> type : Request_Indication; }

    port fd_on : DataPort { out :>> type : FD_Indication; }
    port fcs_failed : DataPort { out :>> type : FCS_Failed_Indication; }
    port reference_sync_request : DataPort { out :>> type : Request_Indication; }
    language "GUMBO" /*{
      compute
        guarantee PART_05_FD_ON_POLICY "FD on to On exactly when attitude data is Valid and qualified display request is Requested":
          ((attitude_data == Attitude_Data_Validity.Valid & qualified_display_request == Qualified_Request.Requested) implies (fd_on == FD_Indication.On)) & ((fd_on == FD_Indication.On) implies (attitude_data == Attitude_Data_Validity.Valid & qualified_display_request == Qualified_Request.Requested));
        guarantee PART_05_FCS_FAILED_POLICY "FCS failed to Asserted exactly when attitude data is Invalid":
          ((attitude_data == Attitude_Data_Validity.Invalid) implies (fcs_failed == FCS_Failed_Indication.Asserted)) & ((fcs_failed == FCS_Failed_Indication.Asserted) implies (attitude_data == Attitude_Data_Validity.Invalid));
        guarantee PART_05_REFERENCE_SYNC_POLICY "reference sync request to Asserted exactly when attitude data is Valid and (qualified sync request is Requested or reference sync trigger is Asserted)":
          ((attitude_data == Attitude_Data_Validity.Valid & (qualified_sync_request == Qualified_Request.Requested | reference_sync_trigger == Request_Indication.Asserted)) implies (reference_sync_request == Request_Indication.Asserted)) & ((reference_sync_request == Request_Indication.Asserted) implies (attitude_data == Attitude_Data_Validity.Valid & (qualified_sync_request == Qualified_Request.Requested | reference_sync_trigger == Request_Indication.Asserted)));
    }*/

                        
             
                                                                                                                              
                                                                                                         
                                        
                                                            
                                                                       
                                                                                                                       
                                                                                                           
                                                           
                                                              
                                                                                                                                      
                                                                                                                                                                     
                                                                    
                                                            
                                                                     
                                                                      
       
  }

  part def Autopilot_Coordination_i :> Thread {
    port qualified_engage_request : DataPort { in :>> type : Qualified_Request; }
    port attitude_data : DataPort { in :>> type : Attitude_Data_Validity; }
    port attitude_acceptable : DataPort { in :>> type : Attitude_Acceptability; }
    port reference_state : DataPort { in :>> type : Reference_State; }
    port ap_availability : DataPort { in :>> type : AP_Availability; }
    port fd_on : DataPort { in :>> type : FD_Indication; }

    port reference_sync_trigger : DataPort { out :>> type : Request_Indication; }
    port ap_status : DataPort { out :>> type : AP_Status; }
    port ap_on : DataPort { out :>> type : AP_Enable; }
    port ap_guidance_request : DataPort { out :>> type : Request_Indication; }
    language "GUMBO" /*{
      compute
        guarantee PART_06_REFERENCE_SYNC_TRIGGER "reference sync trigger to Asserted exactly when attitude data is Valid, qualified engage request is Requested, attitude acceptable is Acceptable, and reference state is Not Synchronized":
          ((attitude_data == Attitude_Data_Validity.Valid & qualified_engage_request == Qualified_Request.Requested & attitude_acceptable == Attitude_Acceptability.Acceptable & reference_state == Reference_State.Not_Synchronized) implies (reference_sync_trigger == Request_Indication.Asserted)) & ((reference_sync_trigger == Request_Indication.Asserted) implies (attitude_data == Attitude_Data_Validity.Valid & qualified_engage_request == Qualified_Request.Requested & attitude_acceptable == Attitude_Acceptability.Acceptable & reference_state == Reference_State.Not_Synchronized));
        compute_cases
          case PART_06_AP_UNAVAILABLE "if AP availability is Failed, AP status to Failed, AP on to Disabled, AP guidance request to Not Asserted":
            assume ap_availability == AP_Availability.Failed;
            guarantee ap_status == AP_Status.Failed & ap_on == AP_Enable.Disabled & ap_guidance_request == Request_Indication.Not_Asserted;
          case PART_06_AP_ENGAGED_SYNCHRONIZED "if AP availability is Available, attitude data is Valid, qualified engage request is Requested, attitude acceptable is Acceptable, FD on is On, and reference state is Synchronized, AP status to On, AP on to Enabled, AP guidance request to Not Asserted":
            assume ap_availability == AP_Availability.Available & attitude_data == Attitude_Data_Validity.Valid & qualified_engage_request == Qualified_Request.Requested & attitude_acceptable == Attitude_Acceptability.Acceptable & fd_on == FD_Indication.On & reference_state == Reference_State.Synchronized;
            guarantee ap_status == AP_Status.On & ap_on == AP_Enable.Enabled & ap_guidance_request == Request_Indication.Not_Asserted;
          case PART_06_AP_WAITING_FOR_REFERENCE "if AP availability is Available, attitude data is Valid, qualified engage request is Requested, attitude acceptable is Acceptable, FD on is On, and reference state is Not Synchronized, AP status to Off, AP on to Disabled, AP guidance request to Asserted":
            assume ap_availability == AP_Availability.Available & attitude_data == Attitude_Data_Validity.Valid & qualified_engage_request == Qualified_Request.Requested & attitude_acceptable == Attitude_Acceptability.Acceptable & fd_on == FD_Indication.On & reference_state == Reference_State.Not_Synchronized;
            guarantee ap_status == AP_Status.Off & ap_on == AP_Enable.Disabled & ap_guidance_request == Request_Indication.Asserted;
          case PART_06_AP_AVAILABLE_OTHERWISE "if AP availability is Available and it is not the case that attitude data is Valid, qualified engage request is Requested, attitude acceptable is Acceptable, and FD on is On, AP status to Off, AP on to Disabled, AP guidance request to Not Asserted":
            assume ap_availability == AP_Availability.Available & not(attitude_data == Attitude_Data_Validity.Valid & qualified_engage_request == Qualified_Request.Requested & attitude_acceptable == Attitude_Acceptability.Acceptable & fd_on == FD_Indication.On);
            guarantee ap_status == AP_Status.Off & ap_on == AP_Enable.Disabled & ap_guidance_request == Request_Indication.Not_Asserted;
    }*/

                        
             
                                                                                    
                                                                                                                                                                                                  
                                                                    
                                                            
                                                                      
                                                                       
                                                                  

                     
                                                                  
                                                                                                                            
                                                             
                                                     
                                           
                                                                     

                                  
                                                                                                                                                       
                                                                 
                                                             
                                                                       
                                                                        
                                         
                                                              
                                                 
                                          
                                                                     

                                  
                                                                                                                                                                     
                                                                 
                                                             
                                                                       
                                                                        
                                         
                                                                  
                                                  
                                           
                                                                 

                                                                       
                                                                                                                                             
                                                                 
                                                                  
                                                                            
                                                                             
                                              
                                                  
                                           
                                                                     
       
  }

  part def FCS_Snapshot_Publication_i :> Thread {
    port fd_on_in : DataPort { in :>> type : FD_Indication; }
    port fcs_failed_in : DataPort { in :>> type : FCS_Failed_Indication; }
    port ap_status_in : DataPort { in :>> type : AP_Status; }
    port ap_on_in : DataPort { in :>> type : AP_Enable; }
    port ap_guidance_request_in : DataPort { in :>> type : Request_Indication; }
    port reference_sync_request_in : DataPort { in :>> type : Request_Indication; }

    port fd_on_out : DataPort { out :>> type : FD_Indication; }
    port fcs_failed_out : DataPort { out :>> type : FCS_Failed_Indication; }
    port ap_status_out : DataPort { out :>> type : AP_Status; }
    port ap_on_out : DataPort { out :>> type : AP_Enable; }
    port ap_guidance_request_out : DataPort { out :>> type : Request_Indication; }
    port reference_sync_request_out : DataPort { out :>> type : Request_Indication; }
    language "GUMBO" /*{
      compute
        guarantee PART_07_PRESERVE_FD_ON "FD on out to FD on in":
          fd_on_out == fd_on_in;
        guarantee PART_07_PRESERVE_FCS_FAILED "FCS failed out to FCS failed in":
          fcs_failed_out == fcs_failed_in;
        guarantee PART_07_PRESERVE_AP_STATUS "AP status out to AP status in":
          ap_status_out == ap_status_in;
        guarantee PART_07_PRESERVE_AP_ON "AP on out to AP on in":
          ap_on_out == ap_on_in;
        guarantee PART_07_PRESERVE_AP_GUIDANCE_REQUEST "AP guidance request out to AP guidance request in":
          ap_guidance_request_out == ap_guidance_request_in;
        guarantee PART_07_PRESERVE_REFERENCE_SYNC_REQUEST "reference sync request out to reference sync request in":
          reference_sync_request_out == reference_sync_request_in;
    }*/

                        
             
                                        
                                                                       
                                
                                        
                                                                                 
                                          
                                        
                                                                               
                                        
                                        
                                                                       
                                
                                        
                                                                                                   
                                                            
                                        
                                                                                                         
                                                                  
       
  }

  part def FCS_Coordination_Process_i :> Process {
    port display_fd_request : DataPort { in :>> type : Request_Value; }
    port display_fd_validity : DataPort { in :>> type : Input_Validity; }
    port sync_fd_request : DataPort { in :>> type : Request_Value; }
    port sync_fd_validity : DataPort { in :>> type : Input_Validity; }
    port engage_ap_request : DataPort { in :>> type : Request_Value; }
    port engage_ap_validity : DataPort { in :>> type : Input_Validity; }
    port attitude_data : DataPort { in :>> type : Attitude_Data_Validity; }
    port attitude_acceptable : DataPort { in :>> type : Attitude_Acceptability; }
    port reference_state : DataPort { in :>> type : Reference_State; }
    port ap_availability : DataPort { in :>> type : AP_Availability; }
    port fd_on : DataPort { out :>> type : FD_Indication; }
    port fcs_failed : DataPort { out :>> type : FCS_Failed_Indication; }
    port ap_status : DataPort { out :>> type : AP_Status; }
    port ap_on : DataPort { out :>> type : AP_Enable; }
    port ap_guidance_request : DataPort { out :>> type : Request_Indication; }
    port reference_sync_request : DataPort { out :>> type : Request_Indication; }

    part fci_command_intake : FCI_Command_Intake_i;
    part attitude_condition_intake : Attitude_Condition_Intake_i;
    part reference_state_intake : Reference_State_Intake_i;
    part ap_availability_intake : AP_Availability_Intake_i;
    part flight_guidance_coordination : Flight_Guidance_Coordination_i;
    part autopilot_coordination : Autopilot_Coordination_i;
    part fcs_snapshot_publication : FCS_Snapshot_Publication_i;

    connection support_display_request_to_intake : PortConnection
      connect display_fd_request to fci_command_intake.display_fd_request_in;
    connection support_display_validity_to_intake : PortConnection
      connect display_fd_validity to fci_command_intake.display_fd_validity_in;
    connection support_sync_request_to_intake : PortConnection
      connect sync_fd_request to fci_command_intake.sync_fd_request_in;
    connection support_sync_validity_to_intake : PortConnection
      connect sync_fd_validity to fci_command_intake.sync_fd_validity_in;
    connection support_engage_request_to_intake : PortConnection
      connect engage_ap_request to fci_command_intake.engage_ap_request_in;
    connection support_engage_validity_to_intake : PortConnection
      connect engage_ap_validity to fci_command_intake.engage_ap_validity_in;
    connection support_attitude_data_to_intake : PortConnection
      connect attitude_data to attitude_condition_intake.attitude_data_in;
    connection support_attitude_acceptable_to_intake : PortConnection
      connect attitude_acceptable to attitude_condition_intake.attitude_acceptable_in;
    connection support_reference_state_to_intake : PortConnection
      connect reference_state to reference_state_intake.reference_state_in;
    connection support_ap_availability_to_intake : PortConnection
      connect ap_availability to ap_availability_intake.ap_availability_in;

    connection int_01_qualified_display : PortConnection
      connect fci_command_intake.qualified_display_request to flight_guidance_coordination.qualified_display_request;
    connection int_02_qualified_sync : PortConnection
      connect fci_command_intake.qualified_sync_request to flight_guidance_coordination.qualified_sync_request;
    connection int_03_qualified_engage : PortConnection
      connect fci_command_intake.qualified_engage_request to autopilot_coordination.qualified_engage_request;
    connection int_04_attitude_data_to_fgs : PortConnection
      connect attitude_condition_intake.attitude_data_out to flight_guidance_coordination.attitude_data;
    connection int_05_attitude_acceptable_to_fgs : PortConnection
      connect attitude_condition_intake.attitude_acceptable_out to flight_guidance_coordination.attitude_acceptable;
    connection int_06_attitude_data_to_ap : PortConnection
      connect attitude_condition_intake.attitude_data_out to autopilot_coordination.attitude_data;
    connection int_07_attitude_acceptable_to_ap : PortConnection
      connect attitude_condition_intake.attitude_acceptable_out to autopilot_coordination.attitude_acceptable;
    connection int_08_reference_state_to_fgs : PortConnection
      connect reference_state_intake.reference_state_out to flight_guidance_coordination.reference_state;
    connection int_09_reference_state_to_ap : PortConnection
      connect reference_state_intake.reference_state_out to autopilot_coordination.reference_state;
    connection int_10_ap_availability_to_ap : PortConnection
      connect ap_availability_intake.ap_availability_out to autopilot_coordination.ap_availability;
    connection int_11_fd_outcome_to_ap : PortConnection
      connect flight_guidance_coordination.fd_on to autopilot_coordination.fd_on;
    connection int_12_reference_sync_trigger_to_fgs : PortConnection
      connect autopilot_coordination.reference_sync_trigger to flight_guidance_coordination.reference_sync_trigger;
    connection int_13_fd_on_to_publication : PortConnection
      connect flight_guidance_coordination.fd_on to fcs_snapshot_publication.fd_on_in;
    connection int_14_fcs_failed_to_publication : PortConnection
      connect flight_guidance_coordination.fcs_failed to fcs_snapshot_publication.fcs_failed_in;
    connection int_15_reference_sync_to_publication : PortConnection
      connect flight_guidance_coordination.reference_sync_request to fcs_snapshot_publication.reference_sync_request_in;
    connection int_16_ap_status_to_publication : PortConnection
      connect autopilot_coordination.ap_status to fcs_snapshot_publication.ap_status_in;
    connection int_17_ap_on_to_publication : PortConnection
      connect autopilot_coordination.ap_on to fcs_snapshot_publication.ap_on_in;
    connection int_18_ap_guidance_to_publication : PortConnection
      connect autopilot_coordination.ap_guidance_request to fcs_snapshot_publication.ap_guidance_request_in;

    connection support_fd_on_to_boundary : PortConnection
      connect fcs_snapshot_publication.fd_on_out to fd_on;
    connection support_fcs_failed_to_boundary : PortConnection
      connect fcs_snapshot_publication.fcs_failed_out to fcs_failed;
    connection support_ap_status_to_boundary : PortConnection
      connect fcs_snapshot_publication.ap_status_out to ap_status;
    connection support_ap_on_to_boundary : PortConnection
      connect fcs_snapshot_publication.ap_on_out to ap_on;
    connection support_ap_guidance_to_boundary : PortConnection
      connect fcs_snapshot_publication.ap_guidance_request_out to ap_guidance_request;
    connection support_reference_sync_to_boundary : PortConnection
      connect fcs_snapshot_publication.reference_sync_request_out to reference_sync_request;
  }

  part def FAA_FCS_Coordination_Root :> System {
    port display_fd_request : DataPort { in :>> type : Request_Value; }
    port display_fd_validity : DataPort { in :>> type : Input_Validity; }
    port sync_fd_request : DataPort { in :>> type : Request_Value; }
    port sync_fd_validity : DataPort { in :>> type : Input_Validity; }
    port engage_ap_request : DataPort { in :>> type : Request_Value; }
    port engage_ap_validity : DataPort { in :>> type : Input_Validity; }
    port attitude_data : DataPort { in :>> type : Attitude_Data_Validity; }
    port attitude_acceptable : DataPort { in :>> type : Attitude_Acceptability; }
    port reference_state : DataPort { in :>> type : Reference_State; }
    port ap_availability : DataPort { in :>> type : AP_Availability; }

    port fd_on : DataPort { out :>> type : FD_Indication; }
    port fcs_failed : DataPort { out :>> type : FCS_Failed_Indication; }
    port ap_status : DataPort { out :>> type : AP_Status; }
    port ap_on : DataPort { out :>> type : AP_Enable; }
    port ap_guidance_request : DataPort { out :>> type : Request_Indication; }
    port reference_sync_request : DataPort { out :>> type : Request_Indication; }

    part fcs_coordination_process : FCS_Coordination_Process_i;

    connection boundary_display_request : PortConnection
      connect display_fd_request to fcs_coordination_process.display_fd_request;
    connection boundary_display_validity : PortConnection
      connect display_fd_validity to fcs_coordination_process.display_fd_validity;
    connection boundary_sync_request : PortConnection
      connect sync_fd_request to fcs_coordination_process.sync_fd_request;
    connection boundary_sync_validity : PortConnection
      connect sync_fd_validity to fcs_coordination_process.sync_fd_validity;
    connection boundary_engage_request : PortConnection
      connect engage_ap_request to fcs_coordination_process.engage_ap_request;
    connection boundary_engage_validity : PortConnection
      connect engage_ap_validity to fcs_coordination_process.engage_ap_validity;
    connection boundary_attitude_data : PortConnection
      connect attitude_data to fcs_coordination_process.attitude_data;
    connection boundary_attitude_acceptable : PortConnection
      connect attitude_acceptable to fcs_coordination_process.attitude_acceptable;
    connection boundary_reference_state : PortConnection
      connect reference_state to fcs_coordination_process.reference_state;
    connection boundary_ap_availability : PortConnection
      connect ap_availability to fcs_coordination_process.ap_availability;
    connection boundary_fd_on : PortConnection
      connect fcs_coordination_process.fd_on to fd_on;
    connection boundary_fcs_failed : PortConnection
      connect fcs_coordination_process.fcs_failed to fcs_failed;
    connection boundary_ap_status : PortConnection
      connect fcs_coordination_process.ap_status to ap_status;
    connection boundary_ap_on : PortConnection
      connect fcs_coordination_process.ap_on to ap_on;
    connection boundary_ap_guidance_request : PortConnection
      connect fcs_coordination_process.ap_guidance_request to ap_guidance_request;
    connection boundary_reference_sync_request : PortConnection
      connect fcs_coordination_process.reference_sync_request to reference_sync_request;
  }

  part faa_fcs_coordination : FAA_FCS_Coordination_Root;
}

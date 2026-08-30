package Factory_Dispatch_Coordinator {

  private import HAMR::*;

  enum def Dispatch_Request_Event {
    enum No_Request;
    enum Request_Shipment;
  }

  enum def Input_Status {
    enum Valid;
    enum Invalid;
  }

  enum def Product_Availability {
    enum Unavailable;
    enum Available;
  }

  enum def Dispatch_Outcome {
    enum No_Report;
    enum Shipment_Accepted;
  }

  enum def Shipment_Release_Command {
    enum Hold;
    enum Release;
  }

  enum def Dispatch_Status {
    enum Idle;
    enum Waiting_Product;
    enum Release_Issued;
    enum Shipment_Acknowledged;
    enum Unexpected_Outcome;
    enum Input_Fault;
    enum Recovery_Awaiting_Neutral;
  }

  enum def Shipping_Confirmation {
    enum Not_Issued;
    enum Issued;
  }

  enum def Qualified_Request {
    enum Invalid_Request;
    enum No_Qualified_Request;
    enum Qualified_Shipment_Request;
  }

  enum def Availability_Assessment_Value {
    enum Invalid_Availability;
    enum Product_Unavailable;
    enum Product_Available;
  }

  enum def Qualified_Outcome {
    enum Invalid_Outcome;
    enum No_Qualified_Report;
    enum Qualified_Shipment_Accepted;
  }

  enum def Dispatch_Phase {
    enum Idle;
    enum Awaiting_Product;
    enum Release_Outstanding;
  }

  enum def Dispatch_Disposition {
    enum Input_Fault;
    enum Recovery_Blocked;
    enum Recovery_Cleared;
    enum Shipment_Acknowledged;
    enum Unexpected_Outcome;
    enum Release_From_Idle;
    enum Queue_For_Product;
    enum Release_From_Queue;
    enum Hold_Position;
  }

  // Every member below is an attribute because GUMBO inspects it.
  part def Dispatch_Request_Sample :> Data {
    attribute request_event : Dispatch_Request_Event;
    attribute status : Input_Status;
  }

  part def Product_Availability_Sample :> Data {
    attribute availability : Product_Availability;
    attribute status : Input_Status;
  }

  part def Dispatch_Outcome_Sample :> Data {
    attribute outcome : Dispatch_Outcome;
    attribute status : Input_Status;
  }

  part def Dispatch_Resolution :> Data {
    attribute next_phase : Dispatch_Phase;
    attribute next_recovery_required : Base_Types::Boolean;
    attribute disposition : Dispatch_Disposition;
  }

  part def Request_Qualification :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port raw_request : DataPort { in :>> type : Dispatch_Request_Sample; }
    port qualified_request : DataPort { out :>> type : Qualified_Request; }

    language "GUMBO" /*{
                
                                                                                           
                                                                  

      compute
        compute_cases
          case REQUEST_INVALID "qualified request is invalid when raw request status is invalid":
            assume raw_request.status == Input_Status::Invalid;
            guarantee qualified_request == Qualified_Request::Invalid_Request;

          case REQUEST_NEUTRAL "qualified request is no qualified request when raw request is valid and not a shipment":
            assume raw_request.status == Input_Status::Valid &
                   raw_request.request_event == Dispatch_Request_Event::No_Request;
            guarantee qualified_request == Qualified_Request::No_Qualified_Request;

          case REQUEST_SHIPMENT "qualified request is qualified shipment request when raw request is valid and a shipment":
            assume raw_request.status == Input_Status::Valid &
                   raw_request.request_event == Dispatch_Request_Event::Request_Shipment;
            guarantee qualified_request == Qualified_Request::Qualified_Shipment_Request;
    }*/

                        
                
                         
                                                                                                          
                                                                 

             
                     
                               
                                                                                           
                                                              
                                                                             
                               
                                                                                 
                                                             
                                                                            
                                                                                  
                               
                                                                                              
                                                             
                                                                                  
                                                                                        
       
  }

  part def Availability_Assessment :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port raw_availability : DataPort { in :>> type : Product_Availability_Sample; }
    port availability_assessment : DataPort { out :>> type : Availability_Assessment_Value; }

    language "GUMBO" /*{
                
                                                                                                      
                                                                                         

      compute
        compute_cases
          case AVAILABILITY_INVALID "availability assessment is invalid when raw availability status is invalid":
            assume raw_availability.status == Input_Status::Invalid;
            guarantee availability_assessment == Availability_Assessment_Value::Invalid_Availability;

          case PRODUCT_UNAVAILABLE "availability assessment is product unavailable when raw availability is valid and unavailable":
            assume raw_availability.status == Input_Status::Valid &
                   raw_availability.availability == Product_Availability::Unavailable;
            guarantee availability_assessment == Availability_Assessment_Value::Product_Unavailable;

          case PRODUCT_AVAILABLE "availability assessment is product available when raw availability is valid and available":
            assume raw_availability.status == Input_Status::Valid &
                   raw_availability.availability == Product_Availability::Available;
            guarantee availability_assessment == Availability_Assessment_Value::Product_Available;
    }*/

                        
                
                         
                                                                                                                   
                                                                                        

             
                     
                               
                                                                                                          
                                                                   
                                                                                                    
                               
                                                                                   
                                                                  
                                                                                     
                                                                                                   
                               
                                                                             
                                                                  
                                                                                   
                                                                                                 
       
  }

  part def Outcome_Qualification :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port raw_outcome : DataPort { in :>> type : Dispatch_Outcome_Sample; }
    port qualified_outcome : DataPort { out :>> type : Qualified_Outcome; }

    language "GUMBO" /*{
                
                                                                                           
                                                                  

      compute
        compute_cases
          case OUTCOME_INVALID "qualified outcome is invalid when raw outcome status is invalid":
            assume raw_outcome.status == Input_Status::Invalid;
            guarantee qualified_outcome == Qualified_Outcome::Invalid_Outcome;

          case OUTCOME_NEUTRAL "qualified outcome is no qualified report when raw outcome is valid and no report":
            assume raw_outcome.status == Input_Status::Valid &
                   raw_outcome.outcome == Dispatch_Outcome::No_Report;
            guarantee qualified_outcome == Qualified_Outcome::No_Qualified_Report;

          case OUTCOME_ACCEPTED "qualified outcome is qualified shipment accepted when raw outcome is valid and accepted":
            assume raw_outcome.status == Input_Status::Valid &
                   raw_outcome.outcome == Dispatch_Outcome::Shipment_Accepted;
            guarantee qualified_outcome == Qualified_Outcome::Qualified_Shipment_Accepted;
    }*/

                        
                
                         
                                                                                                          
                                                                 

             
                     
                               
                                                                                           
                                                              
                                                                             
                               
                                                                               
                                                             
                                                                     
                                                                                 
                               
                                                                                                
                                                             
                                                                             
                                                                                         
       
  }

  part def Dispatch_Decision_Owner :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port qualified_request : DataPort { in :>> type : Qualified_Request; }
    port availability_assessment : DataPort { in :>> type : Availability_Assessment_Value; }
    port qualified_outcome : DataPort { in :>> type : Qualified_Outcome; }
    port release_resolution : DataPort { out :>> type : Dispatch_Resolution; }
    port notice_resolution : DataPort { out :>> type : Dispatch_Resolution; }

    language "GUMBO" /*{
      state
        current_phase: Dispatch_Phase;
        recovery_required: Base_Types::Boolean;

                
                                                  
                                                                                                                                             
                                                 
                                  
                                                                 
                                                          
                                                                                 
                                                                
                                                         
                                                                               

      compute
        modifies current_phase, recovery_required;

        guarantee OWNER_STATE_AND_RESOLUTIONS_AGREE "if recovery required then owner state and resolutions agree":
          (recovery_required) implies (
            current_phase == Dispatch_Phase::Idle &
            release_resolution.next_phase == current_phase &
            release_resolution.next_recovery_required == recovery_required &
            notice_resolution.next_phase == current_phase &
            notice_resolution.next_recovery_required == recovery_required &
            release_resolution.disposition == notice_resolution.disposition);

        compute_cases
          case CASE_01_INPUT_FAULT "qualified request, availability, or outcome is invalid":
            assume qualified_request == Qualified_Request::Invalid_Request |
                   availability_assessment == Availability_Assessment_Value::Invalid_Availability |
                   qualified_outcome == Qualified_Outcome::Invalid_Outcome;
            guarantee current_phase == Dispatch_Phase::Idle &
              recovery_required == T &
              release_resolution.next_phase == Dispatch_Phase::Idle &
              release_resolution.next_recovery_required == T &
              release_resolution.disposition == Dispatch_Disposition::Input_Fault &
              notice_resolution.next_phase == Dispatch_Phase::Idle &
              notice_resolution.next_recovery_required == T &
              notice_resolution.disposition == Dispatch_Disposition::Input_Fault;

          case CASE_02_RECOVERY_BLOCKED "not invalid inputs, recovery required on entry is true, and a request or outcome is pending":
            assume qualified_request != Qualified_Request::Invalid_Request &
              availability_assessment != Availability_Assessment_Value::Invalid_Availability &
              qualified_outcome != Qualified_Outcome::Invalid_Outcome &
              In(recovery_required) == T &
              (qualified_request != Qualified_Request::No_Qualified_Request |
               qualified_outcome != Qualified_Outcome::No_Qualified_Report);
            guarantee current_phase == Dispatch_Phase::Idle &
              recovery_required == T &
              release_resolution.next_phase == Dispatch_Phase::Idle &
              release_resolution.next_recovery_required == T &
              release_resolution.disposition == Dispatch_Disposition::Recovery_Blocked &
              notice_resolution.next_phase == Dispatch_Phase::Idle &
              notice_resolution.next_recovery_required == T &
              notice_resolution.disposition == Dispatch_Disposition::Recovery_Blocked;

          case CASE_03_RECOVERY_CLEARED "not invalid inputs, recovery required on entry is true, no request and no outcome pending":
            assume qualified_request != Qualified_Request::Invalid_Request &
              availability_assessment != Availability_Assessment_Value::Invalid_Availability &
              qualified_outcome != Qualified_Outcome::Invalid_Outcome &
              In(recovery_required) == T &
              qualified_request == Qualified_Request::No_Qualified_Request &
              qualified_outcome == Qualified_Outcome::No_Qualified_Report;
            guarantee current_phase == Dispatch_Phase::Idle &
              recovery_required == F &
              release_resolution.next_phase == Dispatch_Phase::Idle &
              release_resolution.next_recovery_required == F &
              release_resolution.disposition == Dispatch_Disposition::Recovery_Cleared &
              notice_resolution.next_phase == Dispatch_Phase::Idle &
              notice_resolution.next_recovery_required == F &
              notice_resolution.disposition == Dispatch_Disposition::Recovery_Cleared;

          case CASE_04_EXPECTED_ACCEPTANCE "not invalid inputs, recovery required on entry is false, phase on entry is Release Outstanding, outcome is Qualified Shipment Accepted":
            assume qualified_request != Qualified_Request::Invalid_Request &
              availability_assessment != Availability_Assessment_Value::Invalid_Availability &
              qualified_outcome != Qualified_Outcome::Invalid_Outcome &
              In(recovery_required) == F &
              In(current_phase) == Dispatch_Phase::Release_Outstanding &
              qualified_outcome == Qualified_Outcome::Qualified_Shipment_Accepted;
            guarantee current_phase == Dispatch_Phase::Idle &
              recovery_required == F &
              release_resolution.next_phase == Dispatch_Phase::Idle &
              release_resolution.next_recovery_required == F &
              release_resolution.disposition == Dispatch_Disposition::Shipment_Acknowledged &
              notice_resolution.next_phase == Dispatch_Phase::Idle &
              notice_resolution.next_recovery_required == F &
              notice_resolution.disposition == Dispatch_Disposition::Shipment_Acknowledged;

          case CASE_05_UNEXPECTED_ACCEPTANCE "not invalid inputs, recovery required on entry is false, phase on entry is not Release Outstanding, outcome is Qualified Shipment Accepted":
            assume qualified_request != Qualified_Request::Invalid_Request &
              availability_assessment != Availability_Assessment_Value::Invalid_Availability &
              qualified_outcome != Qualified_Outcome::Invalid_Outcome &
              In(recovery_required) == F &
              In(current_phase) != Dispatch_Phase::Release_Outstanding &
              qualified_outcome == Qualified_Outcome::Qualified_Shipment_Accepted;
            guarantee current_phase == In(current_phase) &
              recovery_required == F &
              release_resolution.next_phase == In(current_phase) &
              release_resolution.next_recovery_required == F &
              release_resolution.disposition == Dispatch_Disposition::Unexpected_Outcome &
              notice_resolution.next_phase == In(current_phase) &
              notice_resolution.next_recovery_required == F &
              notice_resolution.disposition == Dispatch_Disposition::Unexpected_Outcome;

          case CASE_06_RELEASE_FROM_IDLE "not invalid inputs, product available, no qualified report, recovery required on entry is false, phase on entry is Idle, qualified shipment request, product available":
            assume qualified_request != Qualified_Request::Invalid_Request &
              availability_assessment != Availability_Assessment_Value::Invalid_Availability &
              qualified_outcome == Qualified_Outcome::No_Qualified_Report &
              In(recovery_required) == F &
              In(current_phase) == Dispatch_Phase::Idle &
              qualified_request == Qualified_Request::Qualified_Shipment_Request &
              availability_assessment == Availability_Assessment_Value::Product_Available;
            guarantee current_phase == Dispatch_Phase::Release_Outstanding &
              recovery_required == F &
              release_resolution.next_phase == Dispatch_Phase::Release_Outstanding &
              release_resolution.next_recovery_required == F &
              release_resolution.disposition == Dispatch_Disposition::Release_From_Idle &
              notice_resolution.next_phase == Dispatch_Phase::Release_Outstanding &
              notice_resolution.next_recovery_required == F &
              notice_resolution.disposition == Dispatch_Disposition::Release_From_Idle;

          case CASE_07_QUEUE_FOR_PRODUCT "not invalid inputs, product unavailable, no qualified report, recovery required on entry is false, phase on entry is Idle, qualified shipment request, product unavailable":
            assume qualified_request != Qualified_Request::Invalid_Request &
              availability_assessment != Availability_Assessment_Value::Invalid_Availability &
              qualified_outcome == Qualified_Outcome::No_Qualified_Report &
              In(recovery_required) == F &
              In(current_phase) == Dispatch_Phase::Idle &
              qualified_request == Qualified_Request::Qualified_Shipment_Request &
              availability_assessment == Availability_Assessment_Value::Product_Unavailable;
            guarantee current_phase == Dispatch_Phase::Awaiting_Product &
              recovery_required == F &
              release_resolution.next_phase == Dispatch_Phase::Awaiting_Product &
              release_resolution.next_recovery_required == F &
              release_resolution.disposition == Dispatch_Disposition::Queue_For_Product &
              notice_resolution.next_phase == Dispatch_Phase::Awaiting_Product &
              notice_resolution.next_recovery_required == F &
              notice_resolution.disposition == Dispatch_Disposition::Queue_For_Product;

          case CASE_08_RELEASE_FROM_QUEUE "not invalid request, product available, no qualified report, recovery required on entry is false, phase on entry is Awaiting Product":
            assume qualified_request != Qualified_Request::Invalid_Request &
              availability_assessment == Availability_Assessment_Value::Product_Available &
              qualified_outcome == Qualified_Outcome::No_Qualified_Report &
              In(recovery_required) == F &
              In(current_phase) == Dispatch_Phase::Awaiting_Product;
            guarantee current_phase == Dispatch_Phase::Release_Outstanding &
              recovery_required == F &
              release_resolution.next_phase == Dispatch_Phase::Release_Outstanding &
              release_resolution.next_recovery_required == F &
              release_resolution.disposition == Dispatch_Disposition::Release_From_Queue &
              notice_resolution.next_phase == Dispatch_Phase::Release_Outstanding &
              notice_resolution.next_recovery_required == F &
              notice_resolution.disposition == Dispatch_Disposition::Release_From_Queue;

          case CASE_09_HOLD_POSITION "not invalid inputs, no qualified report, recovery required on entry is false, none of the release/queue transitions apply":
            assume qualified_request != Qualified_Request::Invalid_Request &
              availability_assessment != Availability_Assessment_Value::Invalid_Availability &
              qualified_outcome == Qualified_Outcome::No_Qualified_Report &
              In(recovery_required) == F &
              not (In(current_phase) == Dispatch_Phase::Idle &
                   qualified_request == Qualified_Request::Qualified_Shipment_Request &
                   availability_assessment == Availability_Assessment_Value::Product_Available) &
              not (In(current_phase) == Dispatch_Phase::Idle &
                   qualified_request == Qualified_Request::Qualified_Shipment_Request &
                   availability_assessment == Availability_Assessment_Value::Product_Unavailable) &
              not (In(current_phase) == Dispatch_Phase::Awaiting_Product &
                   availability_assessment == Availability_Assessment_Value::Product_Available);
            guarantee current_phase == In(current_phase) &
              recovery_required == F &
              release_resolution.next_phase == In(current_phase) &
              release_resolution.next_recovery_required == F &
              release_resolution.disposition == Dispatch_Disposition::Hold_Position &
              notice_resolution.next_phase == In(current_phase) &
              notice_resolution.next_recovery_required == F &
              notice_resolution.disposition == Dispatch_Disposition::Hold_Position;
    }*/

                        
                        
           
                                      
                                               

                
                         
                                                                                                                           
                                                
                                  
                                                                
                                                          
                                                                                
                                                               
                                                         
                                                                              

             
                          
                                                                                                                                                  
                                                                          
                                                          
                                                                          
                                                         
                                                                         
                                                                          

                     
                           
                                                                                                      
                                                                           
                                                                                                  
                                                                          
                                                            
                                              
                                                                            
                                                                      
                                                                                          
                                                                           
                                                                     
                                                                                        

                           
                                                                                                                   
                                                                           
                                                                                                  
                                                                           
                                               
                                                                                 
                                                                                
                                                            
                                              
                                                                            
                                                                      
                                                                                               
                                                                           
                                                                     
                                                                                             

                           
                                                                                                            
                                                                           
                                                                                                  
                                                                           
                                               
                                                                                
                                                                              
                                                            
                                              
                                                                            
                                                                      
                                                                                               
                                                                           
                                                                     
                                                                                             

                           
                                                                                                                                         
                                                                           
                                                                                                  
                                                                           
                                               
                                                                            
                                                                                      
                                                            
                                              
                                                                            
                                                                      
                                                                                                    
                                                                           
                                                                     
                                                                                                  

                           
                                                                                                                        
                                                                           
                                                                                                  
                                                                           
                                               
                                                                            
                                                                                      
                                                          
                                              
                                                                          
                                                                      
                                                                                                 
                                                                         
                                                                     
                                                                                               

                           
                                                                                                
                                                                           
                                                                                                  
                                                                               
                                               
                                                             
                                                                                      
                                                                                              
                                                                           
                                              
                                                                                           
                                                                      
                                                                                                
                                                                                          
                                                                     
                                                                                              

                           
                                                                                                 
                                                                           
                                                                                                  
                                                                               
                                               
                                                             
                                                                                      
                                                                                                
                                                                        
                                              
                                                                                        
                                                                      
                                                                                                
                                                                                       
                                                                     
                                                                                              

                           
                                                                                                                      
                                                                           
                                                                                               
                                                                               
                                               
                                                                        
                                                                           
                                              
                                                                                           
                                                                      
                                                                                                 
                                                                                          
                                                                     
                                                                                               

                           
                                                                                                  
                                                                           
                                                                                                  
                                                                               
                                               
                                                                  
                                                                                           
                                                                                                     
                                                                  
                                                                                           
                                                                                                       
                                                                              
                                                                                                    
                                                          
                                              
                                                                          
                                                                      
                                                                                            
                                                                         
                                                                     
                                                                                          
       
  }

  part def Release_Command_Derivation :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port dispatch_resolution : DataPort { in :>> type : Dispatch_Resolution; }
    port shipment_release_command : DataPort { out :>> type : Shipment_Release_Command; }

    language "GUMBO" /*{
                
                                                                                            
                                                                     

      compute
        compute_cases
          case RELEASE_COMMAND "release command issued when release resolution disposition is release from idle or from queue":
            assume dispatch_resolution.disposition == Dispatch_Disposition::Release_From_Idle |
                   dispatch_resolution.disposition == Dispatch_Disposition::Release_From_Queue;
            guarantee shipment_release_command == Shipment_Release_Command::Release;

          case HOLD_COMMAND "hold command issued when release resolution disposition is not release from idle and not release from queue":
            assume dispatch_resolution.disposition != Dispatch_Disposition::Release_From_Idle &
                   dispatch_resolution.disposition != Dispatch_Disposition::Release_From_Queue;
            guarantee shipment_release_command == Shipment_Release_Command::Hold;
    }*/

                        
                
                         
                                                                             
                                                                    

             
                     
                           
                                                                                 
                                                                                              
                                                                                              
                                                                                   
                           
                                                                       
                                                                                              
                                                                                              
                                                                                
       
  }

  part def Dispatch_Notice_Derivation :> Thread {
    attribute :>> Dispatch_Protocol = Periodic;
    attribute :>> Period = 1000 [ms];
    port dispatch_resolution : DataPort { in :>> type : Dispatch_Resolution; }
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }

    language "GUMBO" /*{
                
                                                                                                                          
                                                    
                                                                     

      compute
        compute_cases
          case NOTICE_INPUT_FAULT "dispatch status is input fault and shipping confirmation is not issued when dispatch resolution disposition is input fault":
            assume dispatch_resolution.disposition == Dispatch_Disposition::Input_Fault;
            guarantee dispatch_status == Dispatch_Status::Input_Fault &
              shipping_confirmation == Shipping_Confirmation::Not_Issued;

          case NOTICE_RECOVERY_BLOCKED "dispatch status is recovery awaiting neutral and shipping confirmation is not issued when dispatch resolution disposition is recovery blocked":
            assume dispatch_resolution.disposition == Dispatch_Disposition::Recovery_Blocked;
            guarantee dispatch_status == Dispatch_Status::Recovery_Awaiting_Neutral &
              shipping_confirmation == Shipping_Confirmation::Not_Issued;

          case NOTICE_RECOVERY_CLEARED "dispatch status is idle and shipping confirmation is not issued when dispatch resolution disposition is recovery cleared":
            assume dispatch_resolution.disposition == Dispatch_Disposition::Recovery_Cleared;
            guarantee dispatch_status == Dispatch_Status::Idle &
              shipping_confirmation == Shipping_Confirmation::Not_Issued;

          case NOTICE_ACKNOWLEDGED "dispatch status is shipment acknowledged and shipping confirmation is issued when dispatch resolution disposition is shipment acknowledged":
            assume dispatch_resolution.disposition == Dispatch_Disposition::Shipment_Acknowledged;
            guarantee dispatch_status == Dispatch_Status::Shipment_Acknowledged &
              shipping_confirmation == Shipping_Confirmation::Issued;

          case NOTICE_UNEXPECTED "dispatch status is unexpected outcome and shipping confirmation is not issued when dispatch resolution disposition is unexpected outcome":
            assume dispatch_resolution.disposition == Dispatch_Disposition::Unexpected_Outcome;
            guarantee dispatch_status == Dispatch_Status::Unexpected_Outcome &
              shipping_confirmation == Shipping_Confirmation::Not_Issued;

          case NOTICE_RELEASE_ISSUED "dispatch status is release issued and shipping confirmation is not issued when dispatch resolution disposition is release from idle or release from queue":
            assume dispatch_resolution.disposition == Dispatch_Disposition::Release_From_Idle |
                   dispatch_resolution.disposition == Dispatch_Disposition::Release_From_Queue;
            guarantee dispatch_status == Dispatch_Status::Release_Issued &
              shipping_confirmation == Shipping_Confirmation::Not_Issued;

          case NOTICE_WAITING_PRODUCT "dispatch status is waiting product and shipping confirmation is not issued when dispatch resolution disposition is queue for product":
            assume dispatch_resolution.disposition == Dispatch_Disposition::Queue_For_Product;
            guarantee dispatch_status == Dispatch_Status::Waiting_Product &
              shipping_confirmation == Shipping_Confirmation::Not_Issued;

          case NOTICE_HOLD_IDLE "dispatch status is idle and shipping confirmation is not issued when dispatch resolution disposition is hold position and next phase is idle":
            assume dispatch_resolution.disposition == Dispatch_Disposition::Hold_Position &
              dispatch_resolution.next_phase == Dispatch_Phase::Idle;
            guarantee dispatch_status == Dispatch_Status::Idle &
              shipping_confirmation == Shipping_Confirmation::Not_Issued;

          case NOTICE_HOLD_AWAITING "dispatch status is waiting product and shipping confirmation is not issued when dispatch resolution disposition is hold position and next phase is awaiting product":
            assume dispatch_resolution.disposition == Dispatch_Disposition::Hold_Position &
              dispatch_resolution.next_phase == Dispatch_Phase::Awaiting_Product;
            guarantee dispatch_status == Dispatch_Status::Waiting_Product &
              shipping_confirmation == Shipping_Confirmation::Not_Issued;

          case NOTICE_HOLD_OUTSTANDING "dispatch status is release issued and shipping confirmation is not issued when dispatch resolution disposition is hold position and next phase is release outstanding":
            assume dispatch_resolution.disposition == Dispatch_Disposition::Hold_Position &
              dispatch_resolution.next_phase == Dispatch_Phase::Release_Outstanding;
            guarantee dispatch_status == Dispatch_Status::Release_Issued &
              shipping_confirmation == Shipping_Confirmation::Not_Issued;
    }*/

                        
                
                         
                                                                                         
                                                   
                                                                    

             
                     
                             
                                                                                       
                                                                                       
                                                                                                                                 
                             
                                                                                                        
                                                                                            
                                                                                                                                               
                             
                                                                                     
                                                                                            
                                                                                                                          
                             
                                                                                             
                                                                                                 
                                                                                                                                       
                             
                                                                              
                                                                                              
                                                                                                                                        
                             
                                                                                         
                                                                                              
                                                                                              
                                                                                                                                    
                             
                                                                                  
                                                                                             
                                                                                                                                     
                             
                                                            
                                                                                          
                                                                         
                                                                                                                          
                             
                                                                                       
                                                                                          
                                                                                     
                                                                                                                                     
                             
                                                                                            
                                                                                          
                                                                                        
                                                                                                                                    
       
  }

  part def Dispatch_Coordination_Process :> Process {
    part request_qualification : Request_Qualification;
    part availability_assessment : Availability_Assessment;
    part outcome_qualification : Outcome_Qualification;
    part dispatch_decision_owner : Dispatch_Decision_Owner;
    part release_command_derivation : Release_Command_Derivation;
    part dispatch_notice_derivation : Dispatch_Notice_Derivation;

    port dispatch_request : DataPort { in :>> type : Dispatch_Request_Sample; }
    port product_availability : DataPort { in :>> type : Product_Availability_Sample; }
    port dispatch_outcome : DataPort { in :>> type : Dispatch_Outcome_Sample; }
    port shipment_release_command : DataPort { out :>> type : Shipment_Release_Command; }
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }

    connection support_request_to_qualifier : PortConnection
      connect dispatch_request to request_qualification.raw_request;
    connection qualified_request_to_owner : PortConnection
      connect request_qualification.qualified_request to dispatch_decision_owner.qualified_request;
    connection support_availability_to_assessment : PortConnection
      connect product_availability to availability_assessment.raw_availability;
    connection assessed_availability_to_owner : PortConnection
      connect availability_assessment.availability_assessment to dispatch_decision_owner.availability_assessment;
    connection support_outcome_to_qualifier : PortConnection
      connect dispatch_outcome to outcome_qualification.raw_outcome;
    connection qualified_outcome_to_owner : PortConnection
      connect outcome_qualification.qualified_outcome to dispatch_decision_owner.qualified_outcome;
    connection resolution_to_release_derivation : PortConnection
      connect dispatch_decision_owner.release_resolution to release_command_derivation.dispatch_resolution;
    connection resolution_to_notice_derivation : PortConnection
      connect dispatch_decision_owner.notice_resolution to dispatch_notice_derivation.dispatch_resolution;
    connection support_release_to_process_boundary : PortConnection
      connect release_command_derivation.shipment_release_command to shipment_release_command;
    connection support_status_to_process_boundary : PortConnection
      connect dispatch_notice_derivation.dispatch_status to dispatch_status;
    connection support_confirmation_to_process_boundary : PortConnection
      connect dispatch_notice_derivation.shipping_confirmation to shipping_confirmation;
  }

  part def Finished_Product_Dispatch_Coordinator_System :> System {
    part dispatch_coordination_process : Dispatch_Coordination_Process;

    port dispatch_request : DataPort { in :>> type : Dispatch_Request_Sample; }
    port product_availability : DataPort { in :>> type : Product_Availability_Sample; }
    port dispatch_outcome : DataPort { in :>> type : Dispatch_Outcome_Sample; }
    port shipment_release_command : DataPort { out :>> type : Shipment_Release_Command; }
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }

    connection support_boundary_request : PortConnection
      connect dispatch_request to dispatch_coordination_process.dispatch_request;
    connection support_boundary_availability : PortConnection
      connect product_availability to dispatch_coordination_process.product_availability;
    connection support_boundary_outcome : PortConnection
      connect dispatch_outcome to dispatch_coordination_process.dispatch_outcome;
    connection support_boundary_release : PortConnection
      connect dispatch_coordination_process.shipment_release_command to shipment_release_command;
    connection support_boundary_status : PortConnection
      connect dispatch_coordination_process.dispatch_status to dispatch_status;
    connection support_boundary_confirmation : PortConnection
      connect dispatch_coordination_process.shipping_confirmation to shipping_confirmation;
  }

  part finished_product_dispatch_coordinator : Finished_Product_Dispatch_Coordinator_System;
}

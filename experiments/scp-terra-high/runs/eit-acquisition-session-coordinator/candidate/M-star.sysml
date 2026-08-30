package EIT_Acquisition_Session_Coordinator {
  private import HAMR::*;

  enum def DoctorRequest {
    enum NO_DOCTOR_REQUEST;
    enum START_MONITORING;
    enum STOP_MONITORING;
  }

  enum def TechnicianRequest {
    enum NO_TECHNICIAN_REQUEST;
    enum CONFIRM_BELT;
    enum RECORD_CALIBRATION;
    enum RESET_PREPARATION;
  }

  enum def BeltObservation {
    enum BELT_OBSERVATION_INVALID;
    enum BELT_NOT_APPLIED;
    enum BELT_APPLIED;
  }

  enum def CalibrationObservation {
    enum CALIBRATION_OBSERVATION_INVALID;
    enum CALIBRATION_NOT_AVAILABLE;
    enum CALIBRATION_FAILED;
    enum CALIBRATION_PASSED;
  }

  enum def AcquisitionObservation {
    enum ACQUISITION_AVAILABLE;
    enum ACQUISITION_FAULT;
  }

  enum def ImpedanceFrameObservation {
    enum NO_FRAME;
    enum INVALID_FRAME;
    enum FRAME_A;
    enum FRAME_B;
  }

  enum def AcquisitionCommand {
    enum DO_NOT_COLLECT;
    enum COLLECT;
  }

  enum def FrameDelivery {
    enum NO_DELIVERY;
    enum DELIVER_FRAME_A;
    enum DELIVER_FRAME_B;
  }

  enum def BeltQualification {
    enum BELT_UNAVAILABLE;
    enum BELT_ABSENT;
    enum BELT_PRESENT;
  }

  part def BeltAssessment :> Data {
    attribute beltCategory : BeltQualification;
    attribute qualified : Boolean;
  }

  enum def CalibrationQualification {
    enum CALIBRATION_BLOCKED;
    enum NOT_CALIBRATED;
    enum CALIBRATED;
  }

  enum def PreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }

  enum def MonitoringState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }

  enum def EligibilityCondition {
    enum BELT_UNAVAILABLE_CONDITION;
    enum BELT_ABSENT_CONDITION;
    enum CALIBRATION_NOT_READY_CONDITION;
    enum ACQUISITION_FAULT_CONDITION;
    enum ACQUISITION_READY;
  }

  enum def RecoveryProposal {
    enum NO_RECOVERY;
    enum RESET_PREPARATION_RECOVERY;
    enum HOLD_MONITORING_RECOVERY;
  }

  enum def EffectiveIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }

  enum def RequestDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }

  enum def SessionNotice {
    enum NONE;
    enum BELT_OBSERVATION_UNAVAILABLE;
    enum BELT_NOT_CONFIRMED;
    enum CALIBRATION_NOT_READY;
    enum ACQUISITION_UNAVAILABLE;
    enum MONITORING_HELD_NOTICE;
    enum INAPPLICABLE_REQUEST;
    enum WAITING_FOR_FRAME;
    enum FRAME_REJECTED;
  }

  enum def EligibilityEnvelopeCondition {
    enum BELT_UNAVAILABLE_CONDITION;
    enum BELT_ABSENT_CONDITION;
    enum CALIBRATION_NOT_READY_CONDITION;
    enum ACQUISITION_FAULT_CONDITION;
    enum ACQUISITION_READY;
  }
  enum def EligibilityEnvelopeRecovery {
    enum NO_RECOVERY;
    enum RESET_PREPARATION_RECOVERY;
    enum HOLD_MONITORING_RECOVERY;
  }
  enum def EligibilityEnvelopePreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def EligibilityEnvelopeMonitoringState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  part def EligibilityEnvelope :> Data {
    attribute condition : EligibilityEnvelopeCondition;
    attribute recovery : EligibilityEnvelopeRecovery;
    attribute beltQualified : Boolean;
    attribute calibrationQualified : Boolean;
    attribute preparationState : EligibilityEnvelopePreparationState;
    attribute monitoringState : EligibilityEnvelopeMonitoringState;
  }

  enum def ArbitrationDecisionEffectiveIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }
  enum def ArbitrationDecisionDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  part def ArbitrationDecision :> Data {
    attribute effectiveIntent : ArbitrationDecisionEffectiveIntent;
    attribute disposition : ArbitrationDecisionDisposition;
  }

  enum def PreparationDecisionPreState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def PreparationDecisionNextState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def PreparationDecisionIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }
  enum def PreparationDecisionDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  part def PreparationDecisionSnapshot :> Data {
    attribute preState : PreparationDecisionPreState;
    attribute nextState : PreparationDecisionNextState;
    attribute effectiveIntent : PreparationDecisionIntent;
    attribute disposition : PreparationDecisionDisposition;
  }

  enum def MonitoringDecisionPreState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  enum def MonitoringDecisionNextState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  enum def MonitoringDecisionIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }
  enum def MonitoringDecisionDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  enum def MonitoringDecisionNotice {
    enum NONE;
    enum BELT_OBSERVATION_UNAVAILABLE;
    enum BELT_NOT_CONFIRMED;
    enum CALIBRATION_NOT_READY;
    enum ACQUISITION_UNAVAILABLE;
    enum MONITORING_HELD_NOTICE;
    enum INAPPLICABLE_REQUEST;
    enum WAITING_FOR_FRAME;
    enum FRAME_REJECTED;
  }
  enum def MonitoringDecisionPreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  part def MonitoringDecisionSnapshot :> Data {
    attribute preState : MonitoringDecisionPreState;
    attribute nextState : MonitoringDecisionNextState;
    attribute effectiveIntent : MonitoringDecisionIntent;
    attribute disposition : MonitoringDecisionDisposition;
    attribute notice : MonitoringDecisionNotice;
    attribute preparationState : MonitoringDecisionPreparationState;
  }

  enum def SessionStatusPreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def SessionStatusMonitoringState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  enum def SessionStatusDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  enum def SessionStatusNotice {
    enum NONE;
    enum BELT_OBSERVATION_UNAVAILABLE;
    enum BELT_NOT_CONFIRMED;
    enum CALIBRATION_NOT_READY;
    enum ACQUISITION_UNAVAILABLE;
    enum MONITORING_HELD_NOTICE;
    enum INAPPLICABLE_REQUEST;
    enum WAITING_FOR_FRAME;
    enum FRAME_REJECTED;
  }
  part def SessionStatus :> Data {
    attribute preparationState : SessionStatusPreparationState;
    attribute monitoringState : SessionStatusMonitoringState;
    attribute disposition : SessionStatusDisposition;
    attribute notice : SessionStatusNotice;
  }

  part def BeltQualificationOwner :> Thread {
    port beltObservation : DataPort { in :>> type : BeltObservation; }
    port beltAssessment : DataPort { out :>> type : BeltAssessment; }

    language "GUMBO" /*{
      compute
        guarantee CASE_01_INVALID_BELT :
          beltObservation == BeltObservation.BELT_OBSERVATION_INVALID implies
            beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE and not beltAssessment.qualified;
        guarantee CASE_02_BELT_ABSENT :
          beltObservation == BeltObservation.BELT_NOT_APPLIED implies
            beltAssessment.beltCategory == BeltQualification.BELT_ABSENT and not beltAssessment.qualified;
        guarantee CASE_03_BELT_PRESENT :
          beltObservation == BeltObservation.BELT_APPLIED implies
            beltAssessment.beltCategory == BeltQualification.BELT_PRESENT and beltAssessment.qualified;
    }*/

                        
                
                 
                           
                                                                                                                
                                                                                  
                                                                                                                    
                                                                          
                                                                                                               
                                                                      
                                                                                                               
             
                     
                           
                                                                                         
                                                                               
                                                                                         
                                            
                           
                                                                                         
                                                                       
                                                                                    
                                            
                           
                                                                                      
                                                                   
                                                                                     
                                            
       
  }

  part def CalibrationQualificationOwner :> Thread {
    port calibrationObservation : DataPort { in :>> type : CalibrationObservation; }
    port beltAssessment : DataPort { in :>> type : BeltAssessment; }
    port calibrationQualification : DataPort { out :>> type : CalibrationQualification; }

    language "GUMBO" /*{
      compute
        guarantee CASE_04_BELT_BLOCKS_CALIBRATION :
          not beltAssessment.qualified implies calibrationQualification == CalibrationQualification.CALIBRATION_BLOCKED;
        guarantee CASE_05_CALIBRATION_NOT_READY :
          beltAssessment.qualified and calibrationObservation != CalibrationObservation.CALIBRATION_PASSED implies
            calibrationQualification == CalibrationQualification.NOT_CALIBRATED;
        guarantee CASE_06_CALIBRATION_READY :
          beltAssessment.qualified and calibrationObservation == CalibrationObservation.CALIBRATION_PASSED implies
            calibrationQualification == CalibrationQualification.CALIBRATED;
    }*/

                        
                
                 
                           
                                                                                                                
                                                    
                                                                                           
                                                                                                                          
                                                                                      
                                                                                                                          
                                                                                 
             
                     
                           
                                                                                                                        
                                                 
                                                                                               
                           
                                                                                                               
                                                  
                                                                                  
                                                                                          
                           
                                                                                                  
                                                  
                                                                                  
                                                                                      
       
  }

  part def AcquisitionEligibilityOwner :> Thread {
    port acquisitionObservation : DataPort { in :>> type : AcquisitionObservation; }
    port beltAssessment : DataPort { in :>> type : BeltAssessment; }
    port calibrationQualification : DataPort { in :>> type : CalibrationQualification; }
    port preparationState : DataPort { in :>> type : PreparationState; }
    port monitoringState : DataPort { in :>> type : MonitoringState; }
    port eligibilityEnvelope : DataPort { out :>> type : EligibilityEnvelope; }

    language "GUMBO" /*{
      compute
        guarantee PROJECT_ELIGIBILITY_STATES :
          eligibilityEnvelope.preparationState == preparationState and
            eligibilityEnvelope.monitoringState == monitoringState;
        guarantee PROJECT_CALIBRATION_BOOLEAN :
          eligibilityEnvelope.calibrationQualified ==
            (calibrationQualification == CalibrationQualification.CALIBRATED);
        guarantee CASE_08_BELT_UNAVAILABLE :
          not beltAssessment.qualified and beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE implies
            eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_UNAVAILABLE_CONDITION and
              not eligibilityEnvelope.beltQualified and not eligibilityEnvelope.calibrationQualified and
              (preparationState != PreparationState.UNPREPARED implies
                eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY) and
              (preparationState == PreparationState.UNPREPARED and monitoringState == MonitoringState.MONITORING_ACTIVE implies
                eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) and
              (preparationState == PreparationState.UNPREPARED and monitoringState != MonitoringState.MONITORING_ACTIVE implies
                eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY);
        guarantee CASE_09_BELT_ABSENT :
          not beltAssessment.qualified and beltAssessment.beltCategory == BeltQualification.BELT_ABSENT implies
            eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_ABSENT_CONDITION and
              not eligibilityEnvelope.beltQualified and not eligibilityEnvelope.calibrationQualified and
              (preparationState != PreparationState.UNPREPARED implies
                eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY) and
              (preparationState == PreparationState.UNPREPARED and monitoringState == MonitoringState.MONITORING_ACTIVE implies
                eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) and
              (preparationState == PreparationState.UNPREPARED and monitoringState != MonitoringState.MONITORING_ACTIVE implies
                eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY);
        guarantee CASE_10_CALIBRATION_NOT_READY :
          beltAssessment.qualified and
            (preparationState != PreparationState.PREPARATION_CALIBRATED or
              calibrationQualification != CalibrationQualification.CALIBRATED) implies
            eligibilityEnvelope.condition == EligibilityEnvelopeCondition.CALIBRATION_NOT_READY_CONDITION and
              eligibilityEnvelope.beltQualified and
              (preparationState == PreparationState.PREPARATION_CALIBRATED and
                calibrationQualification != CalibrationQualification.CALIBRATED implies
                eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY) and
              ((preparationState != PreparationState.PREPARATION_CALIBRATED or
                calibrationQualification == CalibrationQualification.CALIBRATED) and
                monitoringState == MonitoringState.MONITORING_ACTIVE implies
                eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) and
              ((preparationState != PreparationState.PREPARATION_CALIBRATED or
                calibrationQualification == CalibrationQualification.CALIBRATED) and
                monitoringState != MonitoringState.MONITORING_ACTIVE implies
                eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY);
        guarantee CASE_11_ACQUISITION_FAULT :
          beltAssessment.qualified and calibrationQualification == CalibrationQualification.CALIBRATED and
            preparationState == PreparationState.PREPARATION_CALIBRATED and
            acquisitionObservation == AcquisitionObservation.ACQUISITION_FAULT implies
            eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_FAULT_CONDITION and
              eligibilityEnvelope.beltQualified and eligibilityEnvelope.calibrationQualified and
              (monitoringState == MonitoringState.MONITORING_ACTIVE implies
                eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) and
              (monitoringState != MonitoringState.MONITORING_ACTIVE implies
                eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY);
        guarantee CASE_12_ACQUISITION_READY :
          beltAssessment.qualified and calibrationQualification == CalibrationQualification.CALIBRATED and
            preparationState == PreparationState.PREPARATION_CALIBRATED and
            acquisitionObservation == AcquisitionObservation.ACQUISITION_AVAILABLE implies
            eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY and
              eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY and
              eligibilityEnvelope.beltQualified and eligibilityEnvelope.calibrationQualified;
    }*/

                        
                
                 
                           
                                                                                                                                       
                                                                                                                        
                                                                                                         
                                                                                                         
                                                                                                                   
                                                                                                    
                                                                                                         
                                             
                                                                            
                                                                                        
                                                                                                              
                                                         
                                                                                                               
                                                                           
                                                                                         
                                                                                                          
                                                                                                         
                                                                                                               
                                                                           
                                                                                             
                                                                                                
                                                                                        
                                                                                                        
             
                 
                           
                                                                                                                              
                                                                      
                                                                                                         
                                                                          
                                                                                                             
                                                                                  
                                                                                                                     
                                                                             
                                                                                                                
                                                                           
                                                                                                              
                                                                         
                                                                                                           
                 
                           
                                                                                                                          
                                                                                      
                                                                
                                                                                      
                                                               
                     
                           
                                                                                                                  
                                                                                      
                                            
                                                                                                                
                                                                                                      
                                                                        
                                                                                                           
                                                                                                                               
                                                                                                         
                                                                                                                               
                                                                                           
                           
                                                                                                                            
                                                                                 
                                            
                                                                                                           
                                                                                                      
                                                                        
                                                                                                           
                                                                                                                               
                                                                                                         
                                                                                                                               
                                                                                           
                           
                                                                                                                                
                                                  
                                                                            
                                                                                
                                                                                                                     
                                                      
                                                                             
                                                                                        
                                                                                                           
                                                                              
                                                                                   
                                                                             
                                                                                                         
                                                                              
                                                                                   
                                                                             
                                                                                           
                           
                                                                                                                           
                                                  
                                                                               
                                                                           
                                                                                 
                                                                                                                 
                                                                                                      
                                                                             
                                                                                                         
                                                                             
                                                                                           
                           
                                                                                                                     
                                                  
                                                                               
                                                                           
                                                                                     
                                                                                                       
                                                                                       
                                                                                                     
       
  }

  part def RequestArbiter :> Thread {
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    port technicianRequest : DataPort { in :>> type : TechnicianRequest; }
    port eligibilityEnvelope : DataPort { in :>> type : EligibilityEnvelope; }
    port arbitrationDecision : DataPort { out :>> type : ArbitrationDecision; }

    language "GUMBO" /*{
      compute
        guarantee CASE_13_STOP_PRIORITY :
          doctorRequest == DoctorRequest.STOP_MONITORING implies
            arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT and
              ((eligibilityEnvelope.recovery != EligibilityEnvelopeRecovery.NO_RECOVERY or
                technicianRequest != TechnicianRequest.NO_TECHNICIAN_REQUEST) implies
                arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED) and
              (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY and
                technicianRequest == TechnicianRequest.NO_TECHNICIAN_REQUEST implies
                arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED);
        guarantee CASE_14_RECOVERY_PRIORITY :
          doctorRequest != DoctorRequest.STOP_MONITORING and
            eligibilityEnvelope.recovery != EligibilityEnvelopeRecovery.NO_RECOVERY implies
            (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY implies
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) and
            (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY implies
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT) and
            ((doctorRequest == DoctorRequest.START_MONITORING or
              technicianRequest != TechnicianRequest.NO_TECHNICIAN_REQUEST) implies
              arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED) and
            (doctorRequest != DoctorRequest.START_MONITORING and
              technicianRequest == TechnicianRequest.NO_TECHNICIAN_REQUEST implies
              arbitrationDecision.disposition == ArbitrationDecisionDisposition.RECOVERY_APPLIED);
        guarantee CASE_15_TECHNICIAN_PRIORITY_AND_APPLICABILITY :
          doctorRequest != DoctorRequest.STOP_MONITORING and
            eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY and
            technicianRequest != TechnicianRequest.NO_TECHNICIAN_REQUEST implies
            (technicianRequest == TechnicianRequest.RESET_PREPARATION implies
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT and
                (doctorRequest == DoctorRequest.START_MONITORING implies
                  arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED) and
                (doctorRequest != DoctorRequest.START_MONITORING implies
                  arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED)) and
            (technicianRequest == TechnicianRequest.CONFIRM_BELT and eligibilityEnvelope.beltQualified and
              eligibilityEnvelope.preparationState != EligibilityEnvelopePreparationState.PREPARATION_CALIBRATED implies
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT and
                (doctorRequest == DoctorRequest.START_MONITORING implies
                  arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED) and
                (doctorRequest != DoctorRequest.START_MONITORING implies
                  arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED)) and
            (technicianRequest == TechnicianRequest.RECORD_CALIBRATION and eligibilityEnvelope.beltQualified and
              eligibilityEnvelope.calibrationQualified and
              eligibilityEnvelope.preparationState != EligibilityEnvelopePreparationState.UNPREPARED implies
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT and
                (doctorRequest == DoctorRequest.START_MONITORING implies
                  arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED) and
                (doctorRequest != DoctorRequest.START_MONITORING implies
                  arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED)) and
            ((technicianRequest == TechnicianRequest.CONFIRM_BELT and
              (not eligibilityEnvelope.beltQualified or
                eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.PREPARATION_CALIBRATED) or
              technicianRequest == TechnicianRequest.RECORD_CALIBRATION and
                (not eligibilityEnvelope.beltQualified or not eligibilityEnvelope.calibrationQualified or
                  eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.UNPREPARED)) implies
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT and
                arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED);
        guarantee CASE_16_START_OR_NO_REQUEST :
          doctorRequest != DoctorRequest.STOP_MONITORING and
            eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY and
            technicianRequest == TechnicianRequest.NO_TECHNICIAN_REQUEST implies
            (doctorRequest == DoctorRequest.START_MONITORING and
              eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY implies
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT and
                arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED) and
            (doctorRequest == DoctorRequest.START_MONITORING and
              eligibilityEnvelope.condition != EligibilityEnvelopeCondition.ACQUISITION_READY implies
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT and
                arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) and
            (doctorRequest == DoctorRequest.NO_DOCTOR_REQUEST implies
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT and
                arbitrationDecision.disposition == ArbitrationDecisionDisposition.NO_REQUEST_DISPOSITION);
    }*/

                        
                
                 
                           
                                                                                                                     
                                                                     
                                                                                                        
                                                              
                                                                                                             
                                                                                                                     
                                                              
                                                                                                           
                                                                                                                  
             
                     
                           
                                                                                                         
                                                                  
                                                                                                             
                                                                                          
                                                                                       
                                                                                                
                                                                                         
                                                                                     
                                                                                              
                           
                                                                                                          
                                                                   
                                                                                      
                     
                                                                                                               
                                                                                                                       
                                                                                                             
                                                                                                                     
                                                                  
                                                                                       
                                                                                                
                                                                 
                                                                                     
                                                                                                      
                           
                                                                                                                                                                    
                                                                   
                                                                                       
                                                                           
                     
                                                                                 
                                                                                                                     
                                                                           
                                                                                                   
                                                                           
                                                                                                    
                                                                     
                                                        
                                                                                                                           
                                                                                                                
                                                                           
                                                                                                   
                                                                           
                                                                                                    
                                                                           
                                                                                                        
                                                                                                               
                                                                                                                      
                                                                           
                                                                                                   
                                                                           
                                                                                                    
                                                                      
                                                          
                                                                                                                        
                                                                            
                                                                                                          
                                                                                                                   
                                                                                                      
                                                                                              
                           
                                                                                                                                                  
                                                                   
                                                                                       
                                                                           
                     
                                                                 
                                                                                                        
                                                                                                                    
                                                                                               
                                                                 
                                                                                                        
                                                                                                      
                                                                                               
                                                                         
                                                                                                      
                                                                                                            
       
  }

  part def PreparationStateGovernor :> Thread {
    port arbitrationDecision : DataPort { in :>> type : ArbitrationDecision; }
    port preparationState : DataPort { out :>> type : PreparationState; }
    port preparationDecision : DataPort { out :>> type : PreparationDecisionSnapshot; }

    language "GUMBO" /*{
      state
        committedPreparationState: PreparationState;

      initialize
        guarantee INIT_PREPARATION_STATE :
          committedPreparationState == PreparationState.UNPREPARED and
            preparationState == PreparationState.UNPREPARED and
            preparationDecision.preState == PreparationDecisionPreState.UNPREPARED and
            preparationDecision.nextState == PreparationDecisionNextState.UNPREPARED and
            preparationDecision.effectiveIntent == PreparationDecisionIntent.NO_INTENT and
            preparationDecision.disposition == PreparationDecisionDisposition.NO_REQUEST_DISPOSITION;

      compute
        guarantee PUBLISH_PREPARATION_PRE_STATE :
          preparationState == In(committedPreparationState);
        guarantee PROJECT_PREPARATION_SNAPSHOT :
          (In(committedPreparationState) == PreparationState.UNPREPARED implies
            preparationDecision.preState == PreparationDecisionPreState.UNPREPARED) and
          (In(committedPreparationState) == PreparationState.BELT_CONFIRMED implies
            preparationDecision.preState == PreparationDecisionPreState.BELT_CONFIRMED) and
          (In(committedPreparationState) == PreparationState.PREPARATION_CALIBRATED implies
            preparationDecision.preState == PreparationDecisionPreState.PREPARATION_CALIBRATED) and
          (committedPreparationState == PreparationState.UNPREPARED implies
            preparationDecision.nextState == PreparationDecisionNextState.UNPREPARED) and
          (committedPreparationState == PreparationState.BELT_CONFIRMED implies
            preparationDecision.nextState == PreparationDecisionNextState.BELT_CONFIRMED) and
          (committedPreparationState == PreparationState.PREPARATION_CALIBRATED implies
            preparationDecision.nextState == PreparationDecisionNextState.PREPARATION_CALIBRATED);
        guarantee PROJECT_PREPARATION_DECISION :
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT implies
            preparationDecision.effectiveIntent == PreparationDecisionIntent.NO_INTENT) and
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT implies
            preparationDecision.effectiveIntent == PreparationDecisionIntent.STOP_INTENT) and
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT implies
            preparationDecision.effectiveIntent == PreparationDecisionIntent.RESET_PREPARATION_INTENT) and
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT implies
            preparationDecision.effectiveIntent == PreparationDecisionIntent.HOLD_MONITORING_INTENT) and
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT implies
            preparationDecision.effectiveIntent == PreparationDecisionIntent.CONFIRM_BELT_INTENT) and
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT implies
            preparationDecision.effectiveIntent == PreparationDecisionIntent.RECORD_CALIBRATION_INTENT) and
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT implies
            preparationDecision.effectiveIntent == PreparationDecisionIntent.START_MONITORING_INTENT) and
          (arbitrationDecision.disposition == ArbitrationDecisionDisposition.NO_REQUEST_DISPOSITION implies
            preparationDecision.disposition == PreparationDecisionDisposition.NO_REQUEST_DISPOSITION) and
          (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED implies
            preparationDecision.disposition == PreparationDecisionDisposition.ACCEPTED) and
          (arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED implies
            preparationDecision.disposition == PreparationDecisionDisposition.REJECTED) and
          (arbitrationDecision.disposition == ArbitrationDecisionDisposition.RECOVERY_APPLIED implies
            preparationDecision.disposition == PreparationDecisionDisposition.RECOVERY_APPLIED) and
          (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED implies
            preparationDecision.disposition == PreparationDecisionDisposition.PREEMPTED);
        guarantee CASE_07_RESET_OR_RETAIN_PREPARATION :
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT implies
            committedPreparationState == PreparationState.UNPREPARED) and
          (arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT and
            (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT or
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT or
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT or
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT) implies
            committedPreparationState == In(committedPreparationState));
        guarantee CASE_17_ADVANCE_PREPARATION :
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT implies
            committedPreparationState == PreparationState.BELT_CONFIRMED) and
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT implies
            committedPreparationState == PreparationState.PREPARATION_CALIBRATED);
    }*/

                        
           
                          
                                                     
                
                 
                           
                                                                                                        
                                                                      
                                                             
                                                                                    
                                                                                      
                                                                                        
                                                                                                     
             
                 
                          
                                                                                                          
                                                              
                 
                           
                                                                                                                             
                                                                                   
                                                                                         
                                                                                       
                                                                                             
                                                                                               
                                                                                                     
                                                                               
                                                                                           
                                                                                   
                                                                                               
                                                                                           
                                                                                                       
                                                                                                          
                                                                                             
                                                                                                            
                                                                                               
                                                                                                                         
                                                                                                            
                                                                                                                       
                                                                                                          
                                                                                                                    
                                                                                                       
                                                                                                                          
                                                                                                             
                                                                                                                        
                                                                                                           
                                                                                                               
                                                                                                           
                                                                                                 
                                                                                             
                                                                                                 
                                                                                             
                                                                                                         
                                                                                                     
                                                                                                  
                                                                                             
                     
                           
                                                                                                                                      
                                                                                                                       
                                                                                                     
                                                                                                                
                                                                                                                 
                                                                                                  
                     
                                                                                                                           
                                                                             
                                                                                                                           
                                                                              
                           
                                                                                                                                   
                                                                                                                  
                                                                                                                  
                     
                                                                                                                      
                                                                                 
                                                                                                                            
                                                                                        
       
  }

  part def MonitoringStateGovernor :> Thread {
    port preparationDecision : DataPort { in :>> type : PreparationDecisionSnapshot; }
    port arbitrationDecision : DataPort { in :>> type : ArbitrationDecision; }
    port eligibilityEnvelope : DataPort { in :>> type : EligibilityEnvelope; }
    port monitoringState : DataPort { out :>> type : MonitoringState; }
    port monitoringDecision : DataPort { out :>> type : MonitoringDecisionSnapshot; }

    language "GUMBO" /*{
      state
        committedMonitoringState: MonitoringState;

      initialize
        guarantee INIT_MONITORING_STATE :
          committedMonitoringState == MonitoringState.MONITORING_INACTIVE and
            monitoringState == MonitoringState.MONITORING_INACTIVE and
            monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_INACTIVE and
            monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_INACTIVE and
            monitoringDecision.effectiveIntent == MonitoringDecisionIntent.NO_INTENT and
            monitoringDecision.disposition == MonitoringDecisionDisposition.NO_REQUEST_DISPOSITION and
            monitoringDecision.notice == MonitoringDecisionNotice.NONE and
            monitoringDecision.preparationState == MonitoringDecisionPreparationState.UNPREPARED;

      compute
        guarantee PUBLISH_MONITORING_PRE_STATE :
          monitoringState == In(committedMonitoringState);
        guarantee PROJECT_MONITORING_STATES :
          (In(committedMonitoringState) == MonitoringState.MONITORING_INACTIVE implies
            monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_INACTIVE) and
          (In(committedMonitoringState) == MonitoringState.MONITORING_ACTIVE implies
            monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_ACTIVE) and
          (In(committedMonitoringState) == MonitoringState.MONITORING_HELD implies
            monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_HELD) and
          (committedMonitoringState == MonitoringState.MONITORING_INACTIVE implies
            monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_INACTIVE) and
          (committedMonitoringState == MonitoringState.MONITORING_ACTIVE implies
            monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE) and
          (committedMonitoringState == MonitoringState.MONITORING_HELD implies
            monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_HELD) and
          (preparationDecision.nextState == PreparationDecisionNextState.UNPREPARED implies
            monitoringDecision.preparationState == MonitoringDecisionPreparationState.UNPREPARED) and
          (preparationDecision.nextState == PreparationDecisionNextState.BELT_CONFIRMED implies
            monitoringDecision.preparationState == MonitoringDecisionPreparationState.BELT_CONFIRMED) and
          (preparationDecision.nextState == PreparationDecisionNextState.PREPARATION_CALIBRATED implies
            monitoringDecision.preparationState == MonitoringDecisionPreparationState.PREPARATION_CALIBRATED);
        guarantee PROJECT_MONITORING_DECISION :
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT implies monitoringDecision.effectiveIntent == MonitoringDecisionIntent.NO_INTENT) and
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT implies monitoringDecision.effectiveIntent == MonitoringDecisionIntent.STOP_INTENT) and
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT implies monitoringDecision.effectiveIntent == MonitoringDecisionIntent.RESET_PREPARATION_INTENT) and
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT implies monitoringDecision.effectiveIntent == MonitoringDecisionIntent.HOLD_MONITORING_INTENT) and
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT implies monitoringDecision.effectiveIntent == MonitoringDecisionIntent.CONFIRM_BELT_INTENT) and
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT implies monitoringDecision.effectiveIntent == MonitoringDecisionIntent.RECORD_CALIBRATION_INTENT) and
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT implies monitoringDecision.effectiveIntent == MonitoringDecisionIntent.START_MONITORING_INTENT) and
          (arbitrationDecision.disposition == ArbitrationDecisionDisposition.NO_REQUEST_DISPOSITION implies monitoringDecision.disposition == MonitoringDecisionDisposition.NO_REQUEST_DISPOSITION) and
          (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED implies monitoringDecision.disposition == MonitoringDecisionDisposition.ACCEPTED) and
          (arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED implies monitoringDecision.disposition == MonitoringDecisionDisposition.REJECTED) and
          (arbitrationDecision.disposition == ArbitrationDecisionDisposition.RECOVERY_APPLIED implies monitoringDecision.disposition == MonitoringDecisionDisposition.RECOVERY_APPLIED) and
          (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED implies monitoringDecision.disposition == MonitoringDecisionDisposition.PREEMPTED);
        guarantee CASE_18_MONITORING_TRANSITION :
          (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT implies
            committedMonitoringState == MonitoringState.MONITORING_INACTIVE) and
          (arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.STOP_INTENT and
            In(committedMonitoringState) == MonitoringState.MONITORING_ACTIVE and
            (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT or
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT) implies
            committedMonitoringState == MonitoringState.MONITORING_HELD) and
          (arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.STOP_INTENT and
            arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT and
            eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY implies
            committedMonitoringState == MonitoringState.MONITORING_ACTIVE) and
          (arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.STOP_INTENT and
            not (In(committedMonitoringState) == MonitoringState.MONITORING_ACTIVE and
              (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT or
                arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT)) and
            not (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT and
              eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY) implies
            committedMonitoringState == In(committedMonitoringState));
        guarantee CASE_18_MONITORING_NOTICE :
          ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT or
            arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT or
            arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) and
            eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_UNAVAILABLE_CONDITION implies
            monitoringDecision.notice == MonitoringDecisionNotice.BELT_OBSERVATION_UNAVAILABLE) and
          ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT or
            arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT or
            arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) and
            eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_ABSENT_CONDITION implies
            monitoringDecision.notice == MonitoringDecisionNotice.BELT_NOT_CONFIRMED) and
          ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT or
            arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT or
            arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) and
            eligibilityEnvelope.condition == EligibilityEnvelopeCondition.CALIBRATION_NOT_READY_CONDITION implies
            monitoringDecision.notice == MonitoringDecisionNotice.CALIBRATION_NOT_READY) and
          ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT or
            arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT or
            arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) and
            eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_FAULT_CONDITION implies
            monitoringDecision.notice == MonitoringDecisionNotice.ACQUISITION_UNAVAILABLE) and
          (arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED and
            eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY implies
            monitoringDecision.notice == MonitoringDecisionNotice.INAPPLICABLE_REQUEST) and
          (arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT and
            arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT and
            arbitrationDecision.disposition != ArbitrationDecisionDisposition.REJECTED and
            committedMonitoringState == MonitoringState.MONITORING_HELD implies
            monitoringDecision.notice == MonitoringDecisionNotice.MONITORING_HELD_NOTICE) and
          (arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT and
            arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT and
            arbitrationDecision.disposition != ArbitrationDecisionDisposition.REJECTED and
            committedMonitoringState != MonitoringState.MONITORING_HELD implies
            monitoringDecision.notice == MonitoringDecisionNotice.NONE);
    }*/

                        
           
                          
                                                   
                
                 
                           
                                                                                                    
                                                                             
                                                                    
                                                                                           
                                                                                             
                                                                                      
                                                                                                    
                                                                        
                                                                                                 
             
                 
                          
                                                                                                         
                                                            
                 
                           
                                                                                                                        
                                                                                          
                                                                                                
                                                                                        
                                                                                              
                                                                                      
                                                                                            
                                                                                      
                                                                                                  
                                                                                    
                                                                                                
                                                                                  
                                                                                              
                                                                                               
                                                                                                       
                                                                                                   
                                                                                                           
                                                                                                           
                                                                                                                  
                 
                           
                                                                                                                                                  
                                                                                                          
                                                                                           
                                                                                                            
                                                                                             
                                                                                                                         
                                                                                                          
                                                                                                                       
                                                                                                        
                                                                                                                    
                                                                                                     
                                                                                                                          
                                                                                                           
                                                                                                                        
                                                                                                         
                                                                                                               
                                                                                                         
                                                                                                 
                                                                                           
                                                                                                 
                                                                                           
                                                                                                         
                                                                                                   
                                                                                                  
                                                                                           
                     
                           
                                                                                                                                                          
                     
                                                                                                              
                                                                                    
                                                                                                       
                                                                                   
                                                                                                                     
                                                                                                                           
                                                                                
                                                                                                       
                                                                                                                   
                                                                                                        
                                                                                  
                                                                                                       
                                                                                        
                                                                                                                          
                                                                                                                          
                                                                                                                        
                                                                                                              
                                                                             
                                                                                                                     
                                                                                                                   
                                                                                              
                                                                                                                 
                                                                                                       
                                                                                                                     
                                                                                                                   
                                                                                              
                                                                                                            
                                                                                             
                                                                                                                     
                                                                                                                   
                                                                                              
                                                                                                                      
                                                                                                
                                                                                                                     
                                                                                                                   
                                                                                              
                                                                                                                  
                                                                                                  
                                                                                            
                                                                                                        
                                                                                               
                                                                                                                    
                                                                                                                  
                                                                                            
                                                                                    
                                                                                                 
                                                                                                                    
                                                                                                                  
                                                                                            
                                                                                    
                                                                              
       
  }

  part def AcquisitionCommandPolicy :> Thread {
    port monitoringDecision : DataPort { in :>> type : MonitoringDecisionSnapshot; }
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }

    language "GUMBO" /*{
      initialize
        guarantee INIT_ACQUISITION_COMMAND :
          acquisitionCommand == AcquisitionCommand.DO_NOT_COLLECT;

      compute
        guarantee CASE_19_ACTIVE_COLLECTION_CLASSIFICATION :
          (monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE) ==
            (acquisitionCommand == AcquisitionCommand.COLLECT);
    }*/

                        
                
                 
                           
                                                                                         
                                                                    
             
                     
                           
                                                                                                                                       
                     
                                                                                                      
                                                                     
                                                                                                      
                                                                           
       
  }

  part def SessionPublicationPolicy :> Thread {
    port impedanceFrame : DataPort { in :>> type : ImpedanceFrameObservation; }
    port monitoringDecision : DataPort { in :>> type : MonitoringDecisionSnapshot; }
    port frameDelivery : DataPort { out :>> type : FrameDelivery; }
    port sessionStatus : DataPort { out :>> type : SessionStatus; }

    language "GUMBO" /*{
      initialize
        guarantee INIT_PUBLICATION :
          frameDelivery == FrameDelivery.NO_DELIVERY and
            sessionStatus.preparationState == SessionStatusPreparationState.UNPREPARED and
            sessionStatus.monitoringState == SessionStatusMonitoringState.MONITORING_INACTIVE and
            sessionStatus.disposition == SessionStatusDisposition.NO_REQUEST_DISPOSITION and
            sessionStatus.notice == SessionStatusNotice.NONE;

      compute
        guarantee PROJECT_SESSION_STATUS :
          (monitoringDecision.preparationState == MonitoringDecisionPreparationState.UNPREPARED implies
            sessionStatus.preparationState == SessionStatusPreparationState.UNPREPARED) and
          (monitoringDecision.preparationState == MonitoringDecisionPreparationState.BELT_CONFIRMED implies
            sessionStatus.preparationState == SessionStatusPreparationState.BELT_CONFIRMED) and
          (monitoringDecision.preparationState == MonitoringDecisionPreparationState.PREPARATION_CALIBRATED implies
            sessionStatus.preparationState == SessionStatusPreparationState.PREPARATION_CALIBRATED) and
          (monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_INACTIVE implies
            sessionStatus.monitoringState == SessionStatusMonitoringState.MONITORING_INACTIVE) and
          (monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE implies
            sessionStatus.monitoringState == SessionStatusMonitoringState.MONITORING_ACTIVE) and
          (monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_HELD implies
            sessionStatus.monitoringState == SessionStatusMonitoringState.MONITORING_HELD) and
          (monitoringDecision.disposition == MonitoringDecisionDisposition.NO_REQUEST_DISPOSITION implies
            sessionStatus.disposition == SessionStatusDisposition.NO_REQUEST_DISPOSITION) and
          (monitoringDecision.disposition == MonitoringDecisionDisposition.ACCEPTED implies
            sessionStatus.disposition == SessionStatusDisposition.ACCEPTED) and
          (monitoringDecision.disposition == MonitoringDecisionDisposition.REJECTED implies
            sessionStatus.disposition == SessionStatusDisposition.REJECTED) and
          (monitoringDecision.disposition == MonitoringDecisionDisposition.RECOVERY_APPLIED implies
            sessionStatus.disposition == SessionStatusDisposition.RECOVERY_APPLIED) and
          (monitoringDecision.disposition == MonitoringDecisionDisposition.PREEMPTED implies
            sessionStatus.disposition == SessionStatusDisposition.PREEMPTED);
        guarantee CASE_20_FRAME_ADMISSION :
          (monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE and
            impedanceFrame == ImpedanceFrameObservation.FRAME_A implies
            frameDelivery == FrameDelivery.DELIVER_FRAME_A) and
          (monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE and
            impedanceFrame == ImpedanceFrameObservation.FRAME_B implies
            frameDelivery == FrameDelivery.DELIVER_FRAME_B) and
          (monitoringDecision.nextState != MonitoringDecisionNextState.MONITORING_ACTIVE or
            impedanceFrame == ImpedanceFrameObservation.NO_FRAME or
            impedanceFrame == ImpedanceFrameObservation.INVALID_FRAME implies
            frameDelivery == FrameDelivery.NO_DELIVERY);
        guarantee CASE_20_NOTICE :
          (monitoringDecision.notice == MonitoringDecisionNotice.BELT_OBSERVATION_UNAVAILABLE implies
            sessionStatus.notice == SessionStatusNotice.BELT_OBSERVATION_UNAVAILABLE) and
          (monitoringDecision.notice == MonitoringDecisionNotice.BELT_NOT_CONFIRMED implies
            sessionStatus.notice == SessionStatusNotice.BELT_NOT_CONFIRMED) and
          (monitoringDecision.notice == MonitoringDecisionNotice.CALIBRATION_NOT_READY implies
            sessionStatus.notice == SessionStatusNotice.CALIBRATION_NOT_READY) and
          (monitoringDecision.notice == MonitoringDecisionNotice.ACQUISITION_UNAVAILABLE implies
            sessionStatus.notice == SessionStatusNotice.ACQUISITION_UNAVAILABLE) and
          (monitoringDecision.notice == MonitoringDecisionNotice.MONITORING_HELD_NOTICE implies
            sessionStatus.notice == SessionStatusNotice.MONITORING_HELD_NOTICE) and
          (monitoringDecision.notice == MonitoringDecisionNotice.INAPPLICABLE_REQUEST implies
            sessionStatus.notice == SessionStatusNotice.INAPPLICABLE_REQUEST) and
          (monitoringDecision.notice == MonitoringDecisionNotice.NONE and
            monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE and
            impedanceFrame == ImpedanceFrameObservation.INVALID_FRAME implies
            sessionStatus.notice == SessionStatusNotice.FRAME_REJECTED) and
          (monitoringDecision.notice == MonitoringDecisionNotice.NONE and
            monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE and
            impedanceFrame == ImpedanceFrameObservation.NO_FRAME implies
            sessionStatus.notice == SessionStatusNotice.WAITING_FOR_FRAME) and
          (monitoringDecision.notice == MonitoringDecisionNotice.NONE and
            (monitoringDecision.nextState != MonitoringDecisionNextState.MONITORING_ACTIVE or
              impedanceFrame == ImpedanceFrameObservation.FRAME_A or
              impedanceFrame == ImpedanceFrameObservation.FRAME_B) implies
            sessionStatus.notice == SessionStatusNotice.NONE);
    }*/

                        
                
                 
                           
                                                                                                            
                                                        
                                                                                        
                                                                                               
                                                                                          
                                                             
             
                 
                           
                                                                                                                            
                                                                                                           
                                                                                             
                                                                                                               
                                                                                                 
                                                                                                                       
                                                                                                         
                                                                                                      
                                                                                                    
                                                                                                    
                                                                                                  
                                                                                                  
                                                                                                
                                                                                                             
                                                                                               
                                                                                               
                                                                                 
                                                                                               
                                                                                 
                                                                                                       
                                                                                         
                                                                                                
                                                                                 
                     
                           
                                                                                                                                                   
                     
                                                                                               
                                                                            
                                                                   
                                                                                               
                                                                            
                                                                   
                                                                                               
                                                                      
                                                                                  
                                                               
                                                                                                           
                                                                                             
                                                                                                 
                                                                                   
                                                                                                    
                                                                                      
                                                                                                      
                                                                                        
                                                                                                     
                                                                                       
                                                                                                   
                                                                                     
                                                                            
                                                                                               
                                                                                  
                                                                               
                                                                            
                                                                                               
                                                                             
                                                                                  
                                                                            
                                                                                                
                                                                      
                                                                              
                                                                    
       
  }

  part def AcquisitionCoordinationProcess :> Process {
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    port technicianRequest : DataPort { in :>> type : TechnicianRequest; }
    port beltObservation : DataPort { in :>> type : BeltObservation; }
    port calibrationObservation : DataPort { in :>> type : CalibrationObservation; }
    port acquisitionObservation : DataPort { in :>> type : AcquisitionObservation; }
    port impedanceFrame : DataPort { in :>> type : ImpedanceFrameObservation; }
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    port frameDelivery : DataPort { out :>> type : FrameDelivery; }
    port sessionStatus : DataPort { out :>> type : SessionStatus; }

    part beltQualificationOwner : BeltQualificationOwner;
    part calibrationQualificationOwner : CalibrationQualificationOwner;
    part acquisitionEligibilityOwner : AcquisitionEligibilityOwner;
    part requestArbiter : RequestArbiter;
    part preparationStateGovernor : PreparationStateGovernor;
    part monitoringStateGovernor : MonitoringStateGovernor;
    part acquisitionCommandPolicy : AcquisitionCommandPolicy;
    part sessionPublicationPolicy : SessionPublicationPolicy;

    connection int01 : PortConnection connect doctorRequest to requestArbiter.doctorRequest;
    connection int02 : PortConnection connect technicianRequest to requestArbiter.technicianRequest;
    connection int03 : PortConnection connect beltObservation to beltQualificationOwner.beltObservation;
    connection int04 : PortConnection connect calibrationObservation to calibrationQualificationOwner.calibrationObservation;
    connection int05 : PortConnection connect acquisitionObservation to acquisitionEligibilityOwner.acquisitionObservation;
    connection int06 : PortConnection connect impedanceFrame to sessionPublicationPolicy.impedanceFrame;
    connection int07 : PortConnection connect beltQualificationOwner.beltAssessment to calibrationQualificationOwner.beltAssessment;
    connection int08 : PortConnection connect beltQualificationOwner.beltAssessment to acquisitionEligibilityOwner.beltAssessment;
    connection int09 : PortConnection connect calibrationQualificationOwner.calibrationQualification to acquisitionEligibilityOwner.calibrationQualification;
    connection int10 : PortConnection connect preparationStateGovernor.preparationState to acquisitionEligibilityOwner.preparationState;
    connection int11 : PortConnection connect monitoringStateGovernor.monitoringState to acquisitionEligibilityOwner.monitoringState;
    connection int12 : PortConnection connect acquisitionEligibilityOwner.eligibilityEnvelope to requestArbiter.eligibilityEnvelope;
    connection int13 : PortConnection connect requestArbiter.arbitrationDecision to preparationStateGovernor.arbitrationDecision;
    connection int14 : PortConnection connect preparationStateGovernor.preparationDecision to monitoringStateGovernor.preparationDecision;
    connection int15 : PortConnection connect requestArbiter.arbitrationDecision to monitoringStateGovernor.arbitrationDecision;
    connection int16 : PortConnection connect acquisitionEligibilityOwner.eligibilityEnvelope to monitoringStateGovernor.eligibilityEnvelope;
    connection int17 : PortConnection connect monitoringStateGovernor.monitoringDecision to acquisitionCommandPolicy.monitoringDecision;
    connection int18 : PortConnection connect monitoringStateGovernor.monitoringDecision to sessionPublicationPolicy.monitoringDecision;
    connection int19 : PortConnection connect acquisitionCommandPolicy.acquisitionCommand to acquisitionCommand;
    connection int20 : PortConnection connect sessionPublicationPolicy.frameDelivery to frameDelivery;
    connection int21 : PortConnection connect sessionPublicationPolicy.sessionStatus to sessionStatus;
  }

  part def EITAcquisitionSessionCoordinator :> System {
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    port technicianRequest : DataPort { in :>> type : TechnicianRequest; }
    port beltObservation : DataPort { in :>> type : BeltObservation; }
    port calibrationObservation : DataPort { in :>> type : CalibrationObservation; }
    port acquisitionObservation : DataPort { in :>> type : AcquisitionObservation; }
    port impedanceFrame : DataPort { in :>> type : ImpedanceFrameObservation; }
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    port frameDelivery : DataPort { out :>> type : FrameDelivery; }
    port sessionStatus : DataPort { out :>> type : SessionStatus; }

    part acquisitionCoordinationProcess : AcquisitionCoordinationProcess;

    connection supportDoctorRequest : PortConnection connect doctorRequest to acquisitionCoordinationProcess.doctorRequest;
    connection supportTechnicianRequest : PortConnection connect technicianRequest to acquisitionCoordinationProcess.technicianRequest;
    connection supportBeltObservation : PortConnection connect beltObservation to acquisitionCoordinationProcess.beltObservation;
    connection supportCalibrationObservation : PortConnection connect calibrationObservation to acquisitionCoordinationProcess.calibrationObservation;
    connection supportAcquisitionObservation : PortConnection connect acquisitionObservation to acquisitionCoordinationProcess.acquisitionObservation;
    connection supportImpedanceFrame : PortConnection connect impedanceFrame to acquisitionCoordinationProcess.impedanceFrame;
    connection supportAcquisitionCommand : PortConnection connect acquisitionCoordinationProcess.acquisitionCommand to acquisitionCommand;
    connection supportFrameDelivery : PortConnection connect acquisitionCoordinationProcess.frameDelivery to frameDelivery;
    connection supportSessionStatus : PortConnection connect acquisitionCoordinationProcess.sessionStatus to sessionStatus;
  }

  part eitAcquisitionSessionCoordinator : EITAcquisitionSessionCoordinator;
}

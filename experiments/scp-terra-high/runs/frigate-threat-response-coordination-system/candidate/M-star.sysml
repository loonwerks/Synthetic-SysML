package Frigate_Threat_Response_Coordinator {
  private import HAMR::*;

  enum def ContactSignature {
    enum NONE;
    enum CONTACT;
  }

  enum def ContactIdentity {
    enum NO_HOSTILE;
    enum HOSTILE;
  }

  enum def ContactSignatureStatus {
    enum VALID;
    enum INVALID;
  }

  enum def IdentityStatus {
    enum VALID;
    enum INVALID;
  }

  enum def DefenseAvailabilityStatus {
    enum VALID;
    enum INVALID;
  }

  enum def DroneReadinessStatus {
    enum VALID;
    enum INVALID;
  }

  enum def DestinationEvidenceStatus {
    enum VALID;
    enum INVALID;
  }

  enum def WarpProgressStatus {
    enum VALID;
    enum INVALID;
  }

  enum def RequestStatus {
    enum VALID;
    enum INVALID;
  }

  enum def AcknowledgmentStatus {
    enum VALID;
    enum INVALID;
  }

  enum def DefenseAvailability {
    enum AVAILABLE;
    enum UNAVAILABLE;
  }

  enum def DroneReadiness {
    enum READY;
    enum NOT_READY;
  }

  enum def DestinationStatus {
    enum IDENTIFIED;
    enum ABSENT;
  }

  enum def WarpProgress {
    enum READY;
    enum IN_PROGRESS;
    enum COMPLETE;
    enum UNAVAILABLE;
  }

  enum def ResponseRequestValue {
    enum OBSERVE;
    enum DEFEND_IF_HOSTILE;
    enum RETREAT;
  }

  enum def AcknowledgmentValue {
    enum NOT_ACKNOWLEDGED;
    enum ACKNOWLEDGED;
  }

  enum def QualifiedThreat {
    enum CLEAR;
    enum SUSPECT;
    enum HOSTILE;
    enum UNKNOWN;
  }

  enum def DefenseCondition {
    enum READY;
    enum UNAVAILABLE;
    enum UNKNOWN;
  }

  enum def RetreatCondition {
    enum AVAILABLE;
    enum UNAVAILABLE;
    enum COMPLETE;
    enum UNKNOWN;
  }

  enum def ResponseCommitment {
    enum OPEN;
    enum DEFENSE_COMMITTED;
    enum RETREAT_COMMITTED;
  }

  enum def DefenseActivation {
    enum STAND_DOWN;
    enum ACTIVATE;
  }

  enum def RetreatNavigationCommand {
    enum HOLD;
    enum RETREAT;
  }

  enum def ResponseDisposition {
    enum OBSERVED;
    enum DEFENSE_ACTIVE;
    enum RETREAT_ACTIVE;
    enum RETREAT_BLOCKED;
    enum RETREAT_COMPLETE;
    enum INPUT_FAULT;
  }

  enum def ReportPriority {
    enum COMMUNICATION_FAULT;
    enum CLOSED;
    enum URGENT;
    enum ROUTINE;
  }

  part def ContactEvidence :> Data {
    attribute signature : ContactSignature;
    attribute signatureStatus : ContactSignatureStatus;
  }

  part def IdentificationEvidence :> Data {
    attribute identity : ContactIdentity;
    attribute identityStatus : IdentityStatus;
  }

  part def DefenseEvidence :> Data {
    attribute defenseAvailable : DefenseAvailability;
    attribute defenseStatus : DefenseAvailabilityStatus;
    attribute droneReadiness : DroneReadiness;
    attribute droneStatus : DroneReadinessStatus;
  }

  part def RetreatNavigationEvidence :> Data {
    attribute destination : DestinationStatus;
    attribute destinationStatus : DestinationEvidenceStatus;
    attribute warpProgress : WarpProgress;
    attribute warpStatus : WarpProgressStatus;
  }

  part def ResponseRequest :> Data {
    attribute request : ResponseRequestValue;
    attribute requestStatus : RequestStatus;
  }

  part def ReportAcknowledgment :> Data {
    attribute acknowledgment : AcknowledgmentValue;
    attribute acknowledgmentStatus : AcknowledgmentStatus;
  }

  part def ResponseRecord :> Data {
    attribute qualifiedThreat : QualifiedThreat;
    attribute disposition : ResponseDisposition;
  }

  part def ThreatReport :> Data {
    attribute qualifiedThreat : QualifiedThreat;
    attribute disposition : ResponseDisposition;
    attribute priority : ReportPriority;
  }

  part def ThreatEvidenceInterpreter :> Thread {
    port contactEvidence : DataPort { in :>> type : ContactEvidence; }
    port identificationEvidence : DataPort { in :>> type : IdentificationEvidence; }
    port qualifiedThreat : DataPort { out :>> type : QualifiedThreat; }

    language "GUMBO" /*{
      compute
        compute_cases
          case invalid "invalid or contradictory":
            assume contactEvidence.signatureStatus == ContactSignatureStatus.INVALID | identificationEvidence.identityStatus == IdentityStatus.INVALID | (contactEvidence.signature == ContactSignature.NONE & identificationEvidence.identity == ContactIdentity.HOSTILE);
            guarantee qualifiedThreat == QualifiedThreat.UNKNOWN;
          case hostile "hostile contact":
            assume contactEvidence.signatureStatus == ContactSignatureStatus.VALID & identificationEvidence.identityStatus == IdentityStatus.VALID & contactEvidence.signature == ContactSignature.CONTACT & identificationEvidence.identity == ContactIdentity.HOSTILE;
            guarantee qualifiedThreat == QualifiedThreat.HOSTILE;
          case suspect "suspect contact":
            assume contactEvidence.signatureStatus == ContactSignatureStatus.VALID & identificationEvidence.identityStatus == IdentityStatus.VALID & contactEvidence.signature == ContactSignature.CONTACT & identificationEvidence.identity == ContactIdentity.NO_HOSTILE;
            guarantee qualifiedThreat == QualifiedThreat.SUSPECT;
          case clear "clear":
            assume contactEvidence.signatureStatus == ContactSignatureStatus.VALID & identificationEvidence.identityStatus == IdentityStatus.VALID & contactEvidence.signature == ContactSignature.NONE & identificationEvidence.identity == ContactIdentity.NO_HOSTILE;
            guarantee qualifiedThreat == QualifiedThreat.CLEAR;
    }*/
  }

  part def DefenseReadinessAssessor :> Thread {
    port defenseEvidence : DataPort { in :>> type : DefenseEvidence; }
    port defenseCondition : DataPort { out :>> type : DefenseCondition; }

    language "GUMBO" /*{
      compute
        compute_cases
          case invalid "invalid evidence":
            assume defenseEvidence.defenseStatus == DefenseAvailabilityStatus.INVALID | defenseEvidence.droneStatus == DroneReadinessStatus.INVALID;
            guarantee defenseCondition == DefenseCondition.UNKNOWN;
          case ready "ready":
            assume defenseEvidence.defenseStatus == DefenseAvailabilityStatus.VALID & defenseEvidence.droneStatus == DroneReadinessStatus.VALID & defenseEvidence.defenseAvailable == DefenseAvailability.AVAILABLE & defenseEvidence.droneReadiness == DroneReadiness.READY;
            guarantee defenseCondition == DefenseCondition.READY;
          case unavailable "unavailable":
            assume defenseEvidence.defenseStatus == DefenseAvailabilityStatus.VALID & defenseEvidence.droneStatus == DroneReadinessStatus.VALID & (defenseEvidence.defenseAvailable == DefenseAvailability.UNAVAILABLE | defenseEvidence.droneReadiness == DroneReadiness.NOT_READY);
            guarantee defenseCondition == DefenseCondition.UNAVAILABLE;
    }*/
  }

  part def RetreatReadinessAssessor :> Thread {
    port retreatNavigationEvidence : DataPort { in :>> type : RetreatNavigationEvidence; }
    port retreatCondition : DataPort { out :>> type : RetreatCondition; }

    language "GUMBO" /*{
      compute
        compute_cases
          case invalid "invalid evidence":
            assume retreatNavigationEvidence.destinationStatus == DestinationEvidenceStatus.INVALID | retreatNavigationEvidence.warpStatus == WarpProgressStatus.INVALID;
            guarantee retreatCondition == RetreatCondition.UNKNOWN;
          case complete "complete":
            assume retreatNavigationEvidence.destinationStatus == DestinationEvidenceStatus.VALID & retreatNavigationEvidence.warpStatus == WarpProgressStatus.VALID & retreatNavigationEvidence.warpProgress == WarpProgress.COMPLETE;
            guarantee retreatCondition == RetreatCondition.COMPLETE;
          case available "available":
            assume retreatNavigationEvidence.destinationStatus == DestinationEvidenceStatus.VALID & retreatNavigationEvidence.warpStatus == WarpProgressStatus.VALID & retreatNavigationEvidence.destination == DestinationStatus.IDENTIFIED & (retreatNavigationEvidence.warpProgress == WarpProgress.READY | retreatNavigationEvidence.warpProgress == WarpProgress.IN_PROGRESS);
            guarantee retreatCondition == RetreatCondition.AVAILABLE;
          case unavailable "unavailable":
            assume retreatNavigationEvidence.destinationStatus == DestinationEvidenceStatus.VALID & retreatNavigationEvidence.warpStatus == WarpProgressStatus.VALID & retreatNavigationEvidence.warpProgress != WarpProgress.COMPLETE & (retreatNavigationEvidence.destination == DestinationStatus.ABSENT | retreatNavigationEvidence.warpProgress == WarpProgress.UNAVAILABLE);
            guarantee retreatCondition == RetreatCondition.UNAVAILABLE;
    }*/
  }

  part def PrincipalResponseCoordinator :> Thread {
    port responseRequest : DataPort { in :>> type : ResponseRequest; }
    port qualifiedThreat : DataPort { in :>> type : QualifiedThreat; }
    port defenseCondition : DataPort { in :>> type : DefenseCondition; }
    port retreatCondition : DataPort { in :>> type : RetreatCondition; }
    port defenseActivation : DataPort { out :>> type : DefenseActivation; }
    port retreatNavigationCommand : DataPort { out :>> type : RetreatNavigationCommand; }
    port responseRecord : DataPort { out :>> type : ResponseRecord; }

    /*
    language "GUMBO" /*{
      state
        var responseCommitment: ResponseCommitment = ResponseCommitment.OPEN
        var retreatRequestArmed: B = T

      initialize
        guarantees
          "initial response":
            responseCommitment == ResponseCommitment.OPEN &
            retreatRequestArmed &
            defenseActivation == DefenseActivation.STAND_DOWN &
            retreatNavigationCommand == RetreatNavigationCommand.HOLD &
            responseRecord.qualifiedThreat == QualifiedThreat.UNKNOWN &
            responseRecord.disposition == ResponseDisposition.INPUT_FAULT

      compute
        cases
          "input fault":
            assumes "input fault":
              qualifiedThreat == QualifiedThreat.UNKNOWN |
              defenseCondition == DefenseCondition.UNKNOWN |
              retreatCondition == RetreatCondition.UNKNOWN |
              responseRequest.requestStatus == RequestStatus.INVALID
            guarantees "safe fault response":
              defenseActivation == DefenseActivation.STAND_DOWN &
              retreatNavigationCommand == RetreatNavigationCommand.HOLD &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.INPUT_FAULT &
              ((In(responseCommitment) == ResponseCommitment.RETREAT_COMMITTED &
                responseCommitment == ResponseCommitment.RETREAT_COMMITTED) |
               (In(responseCommitment) != ResponseCommitment.RETREAT_COMMITTED &
                responseCommitment == ResponseCommitment.OPEN)) &
              ((responseRequest.requestStatus == RequestStatus.VALID &
                responseRequest.request != ResponseRequestValue.RETREAT &
                retreatRequestArmed) |
               ((responseRequest.requestStatus == RequestStatus.INVALID |
                 responseRequest.request == ResponseRequestValue.RETREAT) &
                retreatRequestArmed == In(retreatRequestArmed)))
          "committed retreat active":
            assumes "committed available":
              qualifiedThreat != QualifiedThreat.UNKNOWN &
              defenseCondition != DefenseCondition.UNKNOWN &
              retreatCondition != RetreatCondition.UNKNOWN &
              responseRequest.requestStatus == RequestStatus.VALID &
              In(responseCommitment) == ResponseCommitment.RETREAT_COMMITTED &
              retreatCondition == RetreatCondition.AVAILABLE
            guarantees "continue retreat":
              defenseActivation == DefenseActivation.STAND_DOWN &
              retreatNavigationCommand == RetreatNavigationCommand.RETREAT &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.RETREAT_ACTIVE &
              responseCommitment == ResponseCommitment.RETREAT_COMMITTED &
              ((responseRequest.request != ResponseRequestValue.RETREAT & retreatRequestArmed) |
               (responseRequest.request == ResponseRequestValue.RETREAT &
                retreatRequestArmed == In(retreatRequestArmed)))
          "committed retreat blocked":
            assumes "committed unavailable":
              qualifiedThreat != QualifiedThreat.UNKNOWN &
              defenseCondition != DefenseCondition.UNKNOWN &
              retreatCondition != RetreatCondition.UNKNOWN &
              responseRequest.requestStatus == RequestStatus.VALID &
              In(responseCommitment) == ResponseCommitment.RETREAT_COMMITTED &
              retreatCondition == RetreatCondition.UNAVAILABLE
            guarantees "retain commitment":
              defenseActivation == DefenseActivation.STAND_DOWN &
              retreatNavigationCommand == RetreatNavigationCommand.HOLD &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.RETREAT_BLOCKED &
              responseCommitment == ResponseCommitment.RETREAT_COMMITTED &
              ((responseRequest.request != ResponseRequestValue.RETREAT & retreatRequestArmed) |
               (responseRequest.request == ResponseRequestValue.RETREAT &
                retreatRequestArmed == In(retreatRequestArmed)))
          "retreat complete":
            assumes "committed complete":
              qualifiedThreat != QualifiedThreat.UNKNOWN &
              defenseCondition != DefenseCondition.UNKNOWN &
              retreatCondition != RetreatCondition.UNKNOWN &
              responseRequest.requestStatus == RequestStatus.VALID &
              In(responseCommitment) == ResponseCommitment.RETREAT_COMMITTED &
              retreatCondition == RetreatCondition.COMPLETE
            guarantees "close retreat":
              defenseActivation == DefenseActivation.STAND_DOWN &
              retreatNavigationCommand == RetreatNavigationCommand.HOLD &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.RETREAT_COMPLETE &
              responseCommitment == ResponseCommitment.OPEN &
              ((responseRequest.request != ResponseRequestValue.RETREAT & retreatRequestArmed) |
               (responseRequest.request == ResponseRequestValue.RETREAT &
                retreatRequestArmed == In(retreatRequestArmed)))
          "fresh retreat active":
            assumes "fresh available retreat":
              qualifiedThreat != QualifiedThreat.UNKNOWN &
              defenseCondition != DefenseCondition.UNKNOWN &
              retreatCondition != RetreatCondition.UNKNOWN &
              responseRequest.requestStatus == RequestStatus.VALID &
              In(responseCommitment) != ResponseCommitment.RETREAT_COMMITTED &
              retreatCondition == RetreatCondition.AVAILABLE &
              ((responseRequest.request == ResponseRequestValue.RETREAT & In(retreatRequestArmed)) |
               (responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE &
                qualifiedThreat == QualifiedThreat.HOSTILE &
                defenseCondition == DefenseCondition.UNAVAILABLE))
            guarantees "start retreat":
              defenseActivation == DefenseActivation.STAND_DOWN &
              retreatNavigationCommand == RetreatNavigationCommand.RETREAT &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.RETREAT_ACTIVE &
              responseCommitment == ResponseCommitment.RETREAT_COMMITTED &
              ((responseRequest.request == ResponseRequestValue.RETREAT & !retreatRequestArmed) |
               (responseRequest.request != ResponseRequestValue.RETREAT & retreatRequestArmed))
          "fresh retreat blocked":
            assumes "fresh unavailable retreat":
              qualifiedThreat != QualifiedThreat.UNKNOWN &
              defenseCondition != DefenseCondition.UNKNOWN &
              retreatCondition != RetreatCondition.UNKNOWN &
              responseRequest.requestStatus == RequestStatus.VALID &
              In(responseCommitment) != ResponseCommitment.RETREAT_COMMITTED &
              retreatCondition == RetreatCondition.UNAVAILABLE &
              ((responseRequest.request == ResponseRequestValue.RETREAT & In(retreatRequestArmed)) |
               (responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE &
                qualifiedThreat == QualifiedThreat.HOSTILE &
                defenseCondition == DefenseCondition.UNAVAILABLE))
            guarantees "start blocked retreat":
              defenseActivation == DefenseActivation.STAND_DOWN &
              retreatNavigationCommand == RetreatNavigationCommand.HOLD &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.RETREAT_BLOCKED &
              responseCommitment == ResponseCommitment.RETREAT_COMMITTED &
              ((responseRequest.request == ResponseRequestValue.RETREAT & !retreatRequestArmed) |
               (responseRequest.request != ResponseRequestValue.RETREAT & retreatRequestArmed))
          "confirmed defense":
            assumes "hostile defense":
              qualifiedThreat != QualifiedThreat.UNKNOWN &
              defenseCondition != DefenseCondition.UNKNOWN &
              retreatCondition != RetreatCondition.UNKNOWN &
              responseRequest.requestStatus == RequestStatus.VALID &
              In(responseCommitment) != ResponseCommitment.RETREAT_COMMITTED &
              !((retreatCondition != RetreatCondition.COMPLETE) &
                ((responseRequest.request == ResponseRequestValue.RETREAT & In(retreatRequestArmed)) |
                 (responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE &
                  qualifiedThreat == QualifiedThreat.HOSTILE &
                  defenseCondition == DefenseCondition.UNAVAILABLE))) &
              qualifiedThreat == QualifiedThreat.HOSTILE &
              responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE &
              defenseCondition == DefenseCondition.READY
            guarantees "activate defense":
              defenseActivation == DefenseActivation.ACTIVATE &
              retreatNavigationCommand == RetreatNavigationCommand.HOLD &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.DEFENSE_ACTIVE &
              responseCommitment == ResponseCommitment.DEFENSE_COMMITTED &
              retreatRequestArmed
          "observation":
            assumes "otherwise valid":
              qualifiedThreat != QualifiedThreat.UNKNOWN &
              defenseCondition != DefenseCondition.UNKNOWN &
              retreatCondition != RetreatCondition.UNKNOWN &
              responseRequest.requestStatus == RequestStatus.VALID &
              In(responseCommitment) != ResponseCommitment.RETREAT_COMMITTED &
              !((retreatCondition != RetreatCondition.COMPLETE) &
                ((responseRequest.request == ResponseRequestValue.RETREAT & In(retreatRequestArmed)) |
                 (responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE &
                  qualifiedThreat == QualifiedThreat.HOSTILE &
                  defenseCondition == DefenseCondition.UNAVAILABLE))) &
              !(qualifiedThreat == QualifiedThreat.HOSTILE &
                responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE &
                defenseCondition == DefenseCondition.READY)
            guarantees "observe":
              defenseActivation == DefenseActivation.STAND_DOWN &
              retreatNavigationCommand == RetreatNavigationCommand.HOLD &
              responseRecord.qualifiedThreat == qualifiedThreat &
              responseRecord.disposition == ResponseDisposition.OBSERVED &
              responseCommitment == ResponseCommitment.OPEN &
              ((responseRequest.request != ResponseRequestValue.RETREAT & retreatRequestArmed) |
               (responseRequest.request == ResponseRequestValue.RETREAT &
                retreatRequestArmed == In(retreatRequestArmed)))
    }*/

    language "GUMBO" /*{
      state
        responseCommitment: ResponseCommitment;
        retreatRequestArmed: Base_Types::Boolean;
      initialize
        guarantee initial: responseCommitment == ResponseCommitment.OPEN & retreatRequestArmed & defenseActivation == DefenseActivation.STAND_DOWN & retreatNavigationCommand == RetreatNavigationCommand.HOLD & responseRecord.qualifiedThreat == QualifiedThreat.UNKNOWN & responseRecord.disposition == ResponseDisposition.INPUT_FAULT;
      compute
        compute_cases
          case inputFault "input fault":
            assume qualifiedThreat == QualifiedThreat.UNKNOWN | defenseCondition == DefenseCondition.UNKNOWN | retreatCondition == RetreatCondition.UNKNOWN | responseRequest.requestStatus == RequestStatus.INVALID;
            guarantee defenseActivation == DefenseActivation.STAND_DOWN & retreatNavigationCommand == RetreatNavigationCommand.HOLD & responseRecord.qualifiedThreat == qualifiedThreat & responseRecord.disposition == ResponseDisposition.INPUT_FAULT & ((In(responseCommitment) == ResponseCommitment.RETREAT_COMMITTED & responseCommitment == ResponseCommitment.RETREAT_COMMITTED) | (In(responseCommitment) != ResponseCommitment.RETREAT_COMMITTED & responseCommitment == ResponseCommitment.OPEN)) & ((responseRequest.requestStatus == RequestStatus.VALID & responseRequest.request != ResponseRequestValue.RETREAT & retreatRequestArmed) | ((responseRequest.requestStatus == RequestStatus.INVALID | responseRequest.request == ResponseRequestValue.RETREAT) & retreatRequestArmed == In(retreatRequestArmed)));
          case committedActive "committed retreat active":
            assume qualifiedThreat != QualifiedThreat.UNKNOWN & defenseCondition != DefenseCondition.UNKNOWN & retreatCondition != RetreatCondition.UNKNOWN & responseRequest.requestStatus == RequestStatus.VALID & In(responseCommitment) == ResponseCommitment.RETREAT_COMMITTED & retreatCondition == RetreatCondition.AVAILABLE;
            guarantee defenseActivation == DefenseActivation.STAND_DOWN & retreatNavigationCommand == RetreatNavigationCommand.RETREAT & responseRecord.qualifiedThreat == qualifiedThreat & responseRecord.disposition == ResponseDisposition.RETREAT_ACTIVE & responseCommitment == ResponseCommitment.RETREAT_COMMITTED & ((responseRequest.request != ResponseRequestValue.RETREAT & retreatRequestArmed) | (responseRequest.request == ResponseRequestValue.RETREAT & retreatRequestArmed == In(retreatRequestArmed)));
          case committedBlocked "committed retreat blocked":
            assume qualifiedThreat != QualifiedThreat.UNKNOWN & defenseCondition != DefenseCondition.UNKNOWN & retreatCondition != RetreatCondition.UNKNOWN & responseRequest.requestStatus == RequestStatus.VALID & In(responseCommitment) == ResponseCommitment.RETREAT_COMMITTED & retreatCondition == RetreatCondition.UNAVAILABLE;
            guarantee defenseActivation == DefenseActivation.STAND_DOWN & retreatNavigationCommand == RetreatNavigationCommand.HOLD & responseRecord.qualifiedThreat == qualifiedThreat & responseRecord.disposition == ResponseDisposition.RETREAT_BLOCKED & responseCommitment == ResponseCommitment.RETREAT_COMMITTED & ((responseRequest.request != ResponseRequestValue.RETREAT & retreatRequestArmed) | (responseRequest.request == ResponseRequestValue.RETREAT & retreatRequestArmed == In(retreatRequestArmed)));
          case retreatComplete "retreat complete":
            assume qualifiedThreat != QualifiedThreat.UNKNOWN & defenseCondition != DefenseCondition.UNKNOWN & retreatCondition != RetreatCondition.UNKNOWN & responseRequest.requestStatus == RequestStatus.VALID & In(responseCommitment) == ResponseCommitment.RETREAT_COMMITTED & retreatCondition == RetreatCondition.COMPLETE;
            guarantee defenseActivation == DefenseActivation.STAND_DOWN & retreatNavigationCommand == RetreatNavigationCommand.HOLD & responseRecord.qualifiedThreat == qualifiedThreat & responseRecord.disposition == ResponseDisposition.RETREAT_COMPLETE & responseCommitment == ResponseCommitment.OPEN & ((responseRequest.request != ResponseRequestValue.RETREAT & retreatRequestArmed) | (responseRequest.request == ResponseRequestValue.RETREAT & retreatRequestArmed == In(retreatRequestArmed)));
          case freshActive "fresh retreat active":
            assume qualifiedThreat != QualifiedThreat.UNKNOWN & defenseCondition != DefenseCondition.UNKNOWN & retreatCondition != RetreatCondition.UNKNOWN & responseRequest.requestStatus == RequestStatus.VALID & In(responseCommitment) != ResponseCommitment.RETREAT_COMMITTED & retreatCondition == RetreatCondition.AVAILABLE & ((responseRequest.request == ResponseRequestValue.RETREAT & In(retreatRequestArmed)) | (responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE & qualifiedThreat == QualifiedThreat.HOSTILE & defenseCondition == DefenseCondition.UNAVAILABLE));
            guarantee defenseActivation == DefenseActivation.STAND_DOWN & retreatNavigationCommand == RetreatNavigationCommand.RETREAT & responseRecord.qualifiedThreat == qualifiedThreat & responseRecord.disposition == ResponseDisposition.RETREAT_ACTIVE & responseCommitment == ResponseCommitment.RETREAT_COMMITTED & ((responseRequest.request == ResponseRequestValue.RETREAT & ~retreatRequestArmed) | (responseRequest.request != ResponseRequestValue.RETREAT & retreatRequestArmed));
          case freshBlocked "fresh retreat blocked":
            assume qualifiedThreat != QualifiedThreat.UNKNOWN & defenseCondition != DefenseCondition.UNKNOWN & retreatCondition != RetreatCondition.UNKNOWN & responseRequest.requestStatus == RequestStatus.VALID & In(responseCommitment) != ResponseCommitment.RETREAT_COMMITTED & retreatCondition == RetreatCondition.UNAVAILABLE & ((responseRequest.request == ResponseRequestValue.RETREAT & In(retreatRequestArmed)) | (responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE & qualifiedThreat == QualifiedThreat.HOSTILE & defenseCondition == DefenseCondition.UNAVAILABLE));
            guarantee defenseActivation == DefenseActivation.STAND_DOWN & retreatNavigationCommand == RetreatNavigationCommand.HOLD & responseRecord.qualifiedThreat == qualifiedThreat & responseRecord.disposition == ResponseDisposition.RETREAT_BLOCKED & responseCommitment == ResponseCommitment.RETREAT_COMMITTED & ((responseRequest.request == ResponseRequestValue.RETREAT & ~retreatRequestArmed) | (responseRequest.request != ResponseRequestValue.RETREAT & retreatRequestArmed));
          case defense "confirmed defense":
            assume qualifiedThreat != QualifiedThreat.UNKNOWN & defenseCondition != DefenseCondition.UNKNOWN & retreatCondition != RetreatCondition.UNKNOWN & responseRequest.requestStatus == RequestStatus.VALID & In(responseCommitment) != ResponseCommitment.RETREAT_COMMITTED & ~((retreatCondition != RetreatCondition.COMPLETE) & ((responseRequest.request == ResponseRequestValue.RETREAT & In(retreatRequestArmed)) | (responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE & qualifiedThreat == QualifiedThreat.HOSTILE & defenseCondition == DefenseCondition.UNAVAILABLE))) & qualifiedThreat == QualifiedThreat.HOSTILE & responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE & defenseCondition == DefenseCondition.READY;
            guarantee defenseActivation == DefenseActivation.ACTIVATE & retreatNavigationCommand == RetreatNavigationCommand.HOLD & responseRecord.qualifiedThreat == qualifiedThreat & responseRecord.disposition == ResponseDisposition.DEFENSE_ACTIVE & responseCommitment == ResponseCommitment.DEFENSE_COMMITTED & retreatRequestArmed;
          case observation "observation":
            assume qualifiedThreat != QualifiedThreat.UNKNOWN & defenseCondition != DefenseCondition.UNKNOWN & retreatCondition != RetreatCondition.UNKNOWN & responseRequest.requestStatus == RequestStatus.VALID & In(responseCommitment) != ResponseCommitment.RETREAT_COMMITTED & ~((retreatCondition != RetreatCondition.COMPLETE) & ((responseRequest.request == ResponseRequestValue.RETREAT & In(retreatRequestArmed)) | (responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE & qualifiedThreat == QualifiedThreat.HOSTILE & defenseCondition == DefenseCondition.UNAVAILABLE))) & ~(qualifiedThreat == QualifiedThreat.HOSTILE & responseRequest.request == ResponseRequestValue.DEFEND_IF_HOSTILE & defenseCondition == DefenseCondition.READY);
            guarantee defenseActivation == DefenseActivation.STAND_DOWN & retreatNavigationCommand == RetreatNavigationCommand.HOLD & responseRecord.qualifiedThreat == qualifiedThreat & responseRecord.disposition == ResponseDisposition.OBSERVED & responseCommitment == ResponseCommitment.OPEN & ((responseRequest.request != ResponseRequestValue.RETREAT & retreatRequestArmed) | (responseRequest.request == ResponseRequestValue.RETREAT & retreatRequestArmed == In(retreatRequestArmed)));
    }*/

                        
           
                         
                                                
                         
                                                  

                
                 
                           
                                                                                                                   
                                                           
                                      
                                                               
                                                                       
                                                                       
                                                                          

             
                     
                           
                                                                                                               
                                                               
                                                            
                                                            
                                                                     
                                                                         
                                                                         
                                                                 
                                                                             
                                                                                       
                                                                               
                                                                                       
                                                                  
                                                                      
                                                                                
                                             
                                                                        
                                                                                
                                                                  

                           
                                                                                                                          
                                                               
                                                            
                                                            
                                                                    
                                                                              
                                                             
                                                                         
                                                                            
                                                                 
                                                                                
                                                                          
                                                                                
                                             
                                                                                
                                                                  

                           
                                                                                                                                    
                                                               
                                                            
                                                            
                                                                    
                                                                              
                                                               
                                                                         
                                                                         
                                                                 
                                                                                 
                                                                          
                                                                                
                                             
                                                                                
                                                                  

                           
                                                                                                                  
                                                               
                                                            
                                                            
                                                                    
                                                                              
                                                            
                                                                         
                                                                         
                                                                 
                                                                                  
                                                             
                                                                                
                                             
                                                                                
                                                                  

                           
                                                                                                                                   
                                                               
                                                            
                                                            
                                                                    
                                                                              
                                                              
                                                                         
                                               
                                                                                   
                                                            
                                                                   
                                                                         
                                                                            
                                                                 
                                                                                
                                                                          
                                                                                
                                             
                                                                                
                                            

                           
                                                                                                                                         
                                                               
                                                            
                                                            
                                                                    
                                                                              
                                                                
                                                                         
                                               
                                                                                   
                                                            
                                                                   
                                                                         
                                                                         
                                                                 
                                                                                 
                                                                          
                                                                                
                                             
                                                                                
                                            

                           
                                                                                                                               
                                                               
                                                            
                                                            
                                                                    
                                                                              
                                                                    
                                                                           
                                                 
                                                                                     
                                                              
                                                                       
                                                          
                                                                                 
                                                         
                                                                       
                                                                         
                                                                 
                                                                                
                                                                          
                                       

                           
                                                                                                                   
                                                               
                                                            
                                                            
                                                                    
                                                                              
                                                                    
                                                                           
                                                 
                                                                                     
                                                              
                                                                       
                                                               
                                                                                   
                                                            
                                                                         
                                                                         
                                                                 
                                                                          
                                                             
                                                                                
                                             
                                                                                
                                                                  
       
  }

  part def ThreatReportComposer :> Thread {
    port responseRecord : DataPort { in :>> type : ResponseRecord; }
    port reportAcknowledgment : DataPort { in :>> type : ReportAcknowledgment; }
    port threatReport : DataPort { out :>> type : ThreatReport; }

    language "GUMBO" /*{
      compute
        compute_cases
          case communicationFault "communication fault":
            assume reportAcknowledgment.acknowledgmentStatus == AcknowledgmentStatus.INVALID;
            guarantee threatReport.qualifiedThreat == responseRecord.qualifiedThreat & threatReport.disposition == responseRecord.disposition & threatReport.priority == ReportPriority.COMMUNICATION_FAULT;
          case acknowledged "acknowledged":
            assume reportAcknowledgment.acknowledgmentStatus == AcknowledgmentStatus.VALID & reportAcknowledgment.acknowledgment == AcknowledgmentValue.ACKNOWLEDGED;
            guarantee threatReport.qualifiedThreat == responseRecord.qualifiedThreat & threatReport.disposition == responseRecord.disposition & threatReport.priority == ReportPriority.CLOSED;
          case urgent "unacknowledged urgent":
            assume reportAcknowledgment.acknowledgmentStatus == AcknowledgmentStatus.VALID & reportAcknowledgment.acknowledgment == AcknowledgmentValue.NOT_ACKNOWLEDGED & (responseRecord.disposition == ResponseDisposition.INPUT_FAULT | responseRecord.disposition == ResponseDisposition.RETREAT_BLOCKED);
            guarantee threatReport.qualifiedThreat == responseRecord.qualifiedThreat & threatReport.disposition == responseRecord.disposition & threatReport.priority == ReportPriority.URGENT;
          case routine "unacknowledged routine":
            assume reportAcknowledgment.acknowledgmentStatus == AcknowledgmentStatus.VALID & reportAcknowledgment.acknowledgment == AcknowledgmentValue.NOT_ACKNOWLEDGED & (responseRecord.disposition == ResponseDisposition.OBSERVED | responseRecord.disposition == ResponseDisposition.DEFENSE_ACTIVE | responseRecord.disposition == ResponseDisposition.RETREAT_ACTIVE | responseRecord.disposition == ResponseDisposition.RETREAT_COMPLETE);
            guarantee threatReport.qualifiedThreat == responseRecord.qualifiedThreat & threatReport.disposition == responseRecord.disposition & threatReport.priority == ReportPriority.ROUTINE;
    }*/

                        
             
                     
                           
                                                                                                                                
                                                                                             
                                                                                      
                                                                      
                                                                          

                           
                                                                                                          
                                                                                            
                                                                                      
                                                                                      
                                                                      
                                                             

                           
                                                                                                          
                                                                                            
                                                                                           
                                                                              
                                                                                  
                                                                                      
                                                                      
                                                             

                           
                                                                                                                
                                                                                            
                                                                                           
                                                                           
                                                                                 
                                                                                 
                                                                                   
                                                                                      
                                                                      
                                                              
       
  }

  part def ThreatResponseProcess :> Process {
    port contactEvidence : DataPort { in :>> type : ContactEvidence; }
    port identificationEvidence : DataPort { in :>> type : IdentificationEvidence; }
    port defenseEvidence : DataPort { in :>> type : DefenseEvidence; }
    port retreatNavigationEvidence : DataPort { in :>> type : RetreatNavigationEvidence; }
    port responseRequest : DataPort { in :>> type : ResponseRequest; }
    port reportAcknowledgment : DataPort { in :>> type : ReportAcknowledgment; }
    port defenseActivation : DataPort { out :>> type : DefenseActivation; }
    port retreatNavigationCommand : DataPort { out :>> type : RetreatNavigationCommand; }
    port threatReport : DataPort { out :>> type : ThreatReport; }

    part threatEvidenceInterpreter : ThreatEvidenceInterpreter;
    part defenseReadinessAssessor : DefenseReadinessAssessor;
    part retreatReadinessAssessor : RetreatReadinessAssessor;
    part principalResponseCoordinator : PrincipalResponseCoordinator;
    part threatReportComposer : ThreatReportComposer;

    connection int01 : PortConnection connect contactEvidence to threatEvidenceInterpreter.contactEvidence;
    connection int02 : PortConnection connect identificationEvidence to threatEvidenceInterpreter.identificationEvidence;
    connection int03 : PortConnection connect defenseEvidence to defenseReadinessAssessor.defenseEvidence;
    connection int04 : PortConnection connect retreatNavigationEvidence to retreatReadinessAssessor.retreatNavigationEvidence;
    connection int05 : PortConnection connect responseRequest to principalResponseCoordinator.responseRequest;
    connection int06 : PortConnection connect threatEvidenceInterpreter.qualifiedThreat to principalResponseCoordinator.qualifiedThreat;
    connection int07 : PortConnection connect defenseReadinessAssessor.defenseCondition to principalResponseCoordinator.defenseCondition;
    connection int08 : PortConnection connect retreatReadinessAssessor.retreatCondition to principalResponseCoordinator.retreatCondition;
    connection int09 : PortConnection connect principalResponseCoordinator.defenseActivation to defenseActivation;
    connection int10 : PortConnection connect principalResponseCoordinator.retreatNavigationCommand to retreatNavigationCommand;
    connection int11 : PortConnection connect principalResponseCoordinator.responseRecord to threatReportComposer.responseRecord;
    connection int12 : PortConnection connect reportAcknowledgment to threatReportComposer.reportAcknowledgment;
    connection int13 : PortConnection connect threatReportComposer.threatReport to threatReport;
  }

  part def FrigateThreatResponseCoordinator :> System {
    port contactEvidence : DataPort { in :>> type : ContactEvidence; }
    port identificationEvidence : DataPort { in :>> type : IdentificationEvidence; }
    port defenseEvidence : DataPort { in :>> type : DefenseEvidence; }
    port retreatNavigationEvidence : DataPort { in :>> type : RetreatNavigationEvidence; }
    port responseRequest : DataPort { in :>> type : ResponseRequest; }
    port reportAcknowledgment : DataPort { in :>> type : ReportAcknowledgment; }
    port defenseActivation : DataPort { out :>> type : DefenseActivation; }
    port retreatNavigationCommand : DataPort { out :>> type : RetreatNavigationCommand; }
    port threatReport : DataPort { out :>> type : ThreatReport; }

    part threatResponseProcess : ThreatResponseProcess;

    connection supportInt01 : PortConnection connect contactEvidence to threatResponseProcess.contactEvidence;
    connection supportInt02 : PortConnection connect identificationEvidence to threatResponseProcess.identificationEvidence;
    connection supportInt03 : PortConnection connect defenseEvidence to threatResponseProcess.defenseEvidence;
    connection supportInt04 : PortConnection connect retreatNavigationEvidence to threatResponseProcess.retreatNavigationEvidence;
    connection supportInt05 : PortConnection connect responseRequest to threatResponseProcess.responseRequest;
    connection supportInt12 : PortConnection connect reportAcknowledgment to threatResponseProcess.reportAcknowledgment;
    connection supportInt09 : PortConnection connect threatResponseProcess.defenseActivation to defenseActivation;
    connection supportInt10 : PortConnection connect threatResponseProcess.retreatNavigationCommand to retreatNavigationCommand;
    connection supportInt13 : PortConnection connect threatResponseProcess.threatReport to threatReport;
  }

  part frigateThreatResponseCoordinator : FrigateThreatResponseCoordinator;
}

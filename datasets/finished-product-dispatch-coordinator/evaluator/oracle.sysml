package Factory_Dispatch_Coordinator {

  private import HAMR::*;

  // @trace MON-01
  enum def Request_Id { enum None; enum R1; enum R2; enum R3; enum R4; enum R5; enum R6; enum R7; enum R8; }
  // @trace MON-01
  enum def Product_Id { enum None; enum P1; enum P2; enum P3; enum P4; }
  // @trace LOCAL-01
  enum def Dispatch_Amount { enum A0; enum A1; enum A2; enum A3; enum A4; }
  // @trace MON-02
  enum def Inventory_Amount { enum A0; enum A1; enum A2; enum A3; enum A4; }
  // @trace MON-02
  enum def Inventory_Product_Id { enum None; enum P1; enum P2; enum P3; enum P4; }
  // @trace MON-01
  enum def Request_Freshness { enum Fresh; enum Repeated; }
  // @trace MON-02
  enum def Observation_Validity { enum Valid; enum Invalid; }
  // @trace MON-03
  enum def Dock_Disposition { enum Ready; enum Occupied; enum Unavailable; }
  // @trace MON-04
  enum def Dispatch_Attempt { enum FreshAttempt; enum RetryAttempt; }
  // @trace MON-04
  enum def Outcome_Result { enum NoReport; enum InProgress; enum Completed; enum Failed; }
  // @trace PART-01
  enum def Admission_Assessment { enum NoRequest; enum Malformed; enum Repeated; enum AdmissibleFresh; }
  // @trace PART-02
  enum def Fresh_Inventory_Assessment { enum NotApplicable; enum Sufficient; enum Insufficient; enum Unknown; }
  // @trace PART-02
  enum def Recovery_Inventory_Assessment { enum NotApplicable; enum Sufficient; enum Insufficient; enum Unknown; }
  // @trace PART-03
  enum def Dock_Assessment { enum Ready; enum Blocked; enum Unknown; }
  // @trace POL-04
  enum def Dispatch_Lifecycle { enum Idle; enum ActiveFresh; enum RecoveryPending; enum ActiveRetry; enum TerminalCompleted; enum TerminalFailed; }
  // @trace PART-04
  enum def Outcome_Plan { enum Preserve; enum Completed; enum RetryEligible; enum Abort; }
  // @trace INT-17
  enum def Confirmation_Outcome_Class { enum Preserve; enum Completed; enum RetryEligible; enum Abort; }
  // @trace INT-17
  enum def Confirmation_Request_Id { enum None; enum R1; enum R2; enum R3; enum R4; enum R5; enum R6; enum R7; enum R8; }
  // @trace INT-10
  enum def Context_Request_Id { enum None; enum R1; enum R2; enum R3; enum R4; enum R5; enum R6; enum R7; enum R8; }
  // @trace INT-10
  enum def Context_Attempt { enum FreshAttempt; enum RetryAttempt; }
  // @trace INT-14
  enum def Capacity_Request_Id { enum None; enum R1; enum R2; enum R3; enum R4; enum R5; enum R6; enum R7; enum R8; }
  // @trace INT-14
  enum def Capacity_Product_Id { enum None; enum P1; enum P2; enum P3; enum P4; }
  // @trace INT-14
  enum def Capacity_Amount { enum A0; enum A1; enum A2; enum A3; enum A4; }
  // @trace INT-08
  enum def Candidate_Request_Id { enum None; enum R1; enum R2; enum R3; enum R4; enum R5; enum R6; enum R7; enum R8; }
  // @trace INT-08
  enum def Candidate_Product_Id { enum None; enum P1; enum P2; enum P3; enum P4; }
  // @trace INT-08
  enum def Candidate_Amount { enum A0; enum A1; enum A2; enum A3; enum A4; }
  // @trace INT-08
  enum def Candidate_Lifecycle { enum Idle; enum ActiveFresh; enum RecoveryPending; enum ActiveRetry; enum TerminalCompleted; enum TerminalFailed; }
  // @trace PART-05
  enum def Selected_Intent { enum None; enum FreshIntent; enum RecoveryIntent; }
  // @trace PART-06
  enum def Dispatch_Decision_Kind { enum None; enum Reject; enum WaitInventory; enum WaitDock; enum Busy; enum ReleaseFresh; enum ReleaseRetry; enum ResetIdle; }
  // @trace PART-06
  enum def Decision_Reason { enum Idle; enum Rejected; enum WaitingInventory; enum WaitingDock; enum Busy; enum Released; enum TerminalReset; }
  // @trace CTRL-01
  enum def Instruction_Kind { enum NoInstruction; enum ReleaseFresh; enum ReleaseRetry; enum Cancel; }
  // @trace CTRL-02
  enum def Confirmation_Kind { enum None; enum Shipped; enum DispatchFailed; }
  // @trace CTRL-03
  enum def Dispatch_Status { enum Idle; enum Rejected; enum WaitingInventory; enum WaitingDock; enum Busy; enum Released; enum Recovering; enum Completed; enum Failed; }

  // Contract-visible Data members are attributes by LOCAL-02.
  // @trace MON-01
  part def Raw_Dispatch_Request :> Data {
    // @trace MON-01
    attribute request_id : Request_Id;
    // @trace MON-01
    attribute product_id : Product_Id;
    // @trace MON-01
    attribute amount : Dispatch_Amount;
    // @trace MON-01
    attribute freshness : Request_Freshness;
  }

  // @trace MON-02
  part def Dispatch_Inventory_Snapshot :> Data {
    // @trace MON-02
    attribute qty : Inventory_Amount;
    // @trace MON-02
    attribute validity : Observation_Validity;
    // @trace MON-02
    attribute pid : Inventory_Product_Id;
  }

  // @trace MON-03
  part def Dock_Snapshot :> Data {
    // @trace MON-03
    attribute validity : Observation_Validity;
    // @trace MON-03
    attribute disposition : Dock_Disposition;
  }

  // @trace MON-04
  part def Execution_Outcome :> Data {
    // @trace MON-04
    attribute request_id : Request_Id;
    // @trace MON-04
    attribute attempt : Dispatch_Attempt;
    // @trace MON-04
    attribute result : Outcome_Result;
  }

  // @trace PART-01
  part def Qualified_Request_Fact :> Data {
    // @trace PART-01
    attribute assessment : Admission_Assessment;
    // @trace MON-01
    attribute request_id : Request_Id;
    // @trace MON-01
    attribute product_id : Product_Id;
    // @trace MON-01
    attribute amount : Dispatch_Amount;
    // @trace MON-01
    attribute freshness : Request_Freshness;
  }

  // @trace INT-10
  part def Active_Execution_Context :> Data {
    // @trace POL-04
    attribute lifecycle : Dispatch_Lifecycle;
    // @trace POL-05
    attribute active_request_id : Context_Request_Id;
    // @trace POL-05
    attribute active_attempt : Context_Attempt;
  }

  // @trace INT-14
  part def Recovery_Qualification_Context :> Data {
    // @trace POL-04
    attribute lifecycle : Dispatch_Lifecycle;
    // @trace GOAL-02
    attribute stored_request_id : Capacity_Request_Id;
    // @trace GOAL-02
    attribute stored_product_id : Capacity_Product_Id;
    // @trace GOAL-02
    attribute stored_amount : Capacity_Amount;
  }

  // @trace INT-08
  part def Candidate_Inventory_Readiness :> Data {
    // @trace OWN-02
    attribute fresh_assessment : Fresh_Inventory_Assessment;
    // @trace OWN-02
    attribute recovery_assessment : Recovery_Inventory_Assessment;
    // @trace INT-14
    attribute recovery_request_id : Candidate_Request_Id;
    // @trace INT-14
    attribute recovery_product_id : Candidate_Product_Id;
    // @trace INT-14
    attribute recovery_amount : Candidate_Amount;
    // @trace POL-04
    attribute lifecycle_capacity : Candidate_Lifecycle;
  }

  // @trace INT-15
  part def Dispatch_Decision :> Data {
    // @trace PART-06
    attribute kind : Dispatch_Decision_Kind;
    // @trace GOAL-02
    attribute request_id : Request_Id;
    // @trace GOAL-02
    attribute product_id : Product_Id;
    // @trace GOAL-02
    attribute amount : Dispatch_Amount;
  }

  // @trace INT-17
  part def Confirmation_Context :> Data {
    // @trace PART-04
    attribute classification : Confirmation_Outcome_Class;
    // @trace POL-05
    attribute confirmation_request_id : Confirmation_Request_Id;
  }

  // @trace CTRL-01
  part def Shipment_Instruction :> Data {
    // @trace CTRL-01
    attribute kind : Instruction_Kind;
    // @trace CTRL-01
    attribute request_id : Request_Id;
    // @trace CTRL-01
    attribute product_id : Product_Id;
    // @trace CTRL-01
    attribute amount : Dispatch_Amount;
  }

  // @trace CTRL-02
  part def Shipping_Confirmation :> Data {
    // @trace CTRL-02
    attribute kind : Confirmation_Kind;
    // @trace CTRL-02
    attribute request_id : Request_Id;
  }

  // @trace PART-01
  part def Request_Qualifier :> Thread {
    // @trace INT-01
    port request : DataPort { in :>> type : Raw_Dispatch_Request; }
    // @trace INT-05
    port inventory_request_fact : DataPort { out :>> type : Qualified_Request_Fact; }
    // @trace INT-06
    port priority_admission : DataPort { out :>> type : Admission_Assessment; }
    // @trace INT-07
    port arbiter_request_fact : DataPort { out :>> type : Qualified_Request_Fact; }

    language "GUMBO" /*{
      initialize
        // @trace POL-09
        guarantee INITIAL_REQUEST_FACTS "Request facts initialize to the no-request sentinel":
          inventory_request_fact.assessment == Admission_Assessment.NoRequest &
          inventory_request_fact.request_id == Request_Id.None &
          inventory_request_fact.product_id == Product_Id.None &
          inventory_request_fact.amount == Dispatch_Amount.A0 &
          inventory_request_fact.freshness == Request_Freshness.Fresh &
          priority_admission == Admission_Assessment.NoRequest &
          arbiter_request_fact.assessment == Admission_Assessment.NoRequest &
          arbiter_request_fact.request_id == Request_Id.None &
          arbiter_request_fact.product_id == Product_Id.None &
          arbiter_request_fact.amount == Dispatch_Amount.A0 &
          arbiter_request_fact.freshness == Request_Freshness.Fresh;

      compute
        // @trace OWN-01
        guarantee REQUEST_FACT_AGREEMENT "Both consumers receive the locally derived admission class and exact request payload":
          inventory_request_fact.assessment == priority_admission &
          arbiter_request_fact.assessment == priority_admission &
          inventory_request_fact.request_id == request.request_id &
          inventory_request_fact.product_id == request.product_id &
          inventory_request_fact.amount == request.amount &
          inventory_request_fact.freshness == request.freshness &
          arbiter_request_fact.request_id == request.request_id &
          arbiter_request_fact.product_id == request.product_id &
          arbiter_request_fact.amount == request.amount &
          arbiter_request_fact.freshness == request.freshness;

        compute_cases
          // @trace CCASE-20
          case REQUEST_NONE "The exact sentinel is the only NoRequest class":
            assume request.request_id == Request_Id.None &
                   request.product_id == Product_Id.None &
                   request.amount == Dispatch_Amount.A0;
            guarantee priority_admission == Admission_Assessment.NoRequest;
          // @trace CCASE-01
          case REQUEST_MALFORMED "Every nonsentinel request with a missing identifier or zero amount is malformed":
            assume not (request.request_id == Request_Id.None &
                        request.product_id == Product_Id.None &
                        request.amount == Dispatch_Amount.A0) &
                   (request.request_id == Request_Id.None |
                    request.product_id == Product_Id.None |
                    request.amount == Dispatch_Amount.A0);
            guarantee priority_admission == Admission_Assessment.Malformed;
          // @trace CCASE-02
          case REQUEST_REPEATED "A well-formed repeated request is rejected as repeated":
            assume request.request_id != Request_Id.None &
                   request.product_id != Product_Id.None &
                   request.amount != Dispatch_Amount.A0 &
                   request.freshness == Request_Freshness.Repeated;
            guarantee priority_admission == Admission_Assessment.Repeated;
          // @trace CCASE-03
          case REQUEST_ADMISSIBLE "A well-formed fresh request is locally admitted":
            assume request.request_id != Request_Id.None &
                   request.product_id != Product_Id.None &
                   request.amount != Dispatch_Amount.A0 &
                   request.freshness == Request_Freshness.Fresh;
            guarantee priority_admission == Admission_Assessment.AdmissibleFresh;
    }*/
  }

  // @trace PART-02
  part def Inventory_Qualifier :> Thread {
    // @trace INT-02
    port inventory_snapshot : DataPort { in :>> type : Dispatch_Inventory_Snapshot; }
    // @trace INT-05
    port request_fact : DataPort { in :>> type : Qualified_Request_Fact; }
    // @trace INT-14
    port recovery_context : DataPort { in :>> type : Recovery_Qualification_Context; }
    // @trace INT-08
    port candidate_readiness : DataPort { out :>> type : Candidate_Inventory_Readiness; }

    language "GUMBO" /*{
      functions
        // @trace LOCAL-01
        def amount_at_least(available: Inventory_Amount, required: Dispatch_Amount): Base_Types::Boolean :=
          required == Dispatch_Amount.A0 |
          (required == Dispatch_Amount.A1 & available != Inventory_Amount.A0) |
          (required == Dispatch_Amount.A2 &
           (available == Inventory_Amount.A2 | available == Inventory_Amount.A3 | available == Inventory_Amount.A4)) |
          (required == Dispatch_Amount.A3 &
           (available == Inventory_Amount.A3 | available == Inventory_Amount.A4)) |
          (required == Dispatch_Amount.A4 & available == Inventory_Amount.A4);
        // @trace LOCAL-01
        def amount_below(available: Inventory_Amount, required: Dispatch_Amount): Base_Types::Boolean :=
          (required == Dispatch_Amount.A1 & available == Inventory_Amount.A0) |
          (required == Dispatch_Amount.A2 &
           (available == Inventory_Amount.A0 | available == Inventory_Amount.A1)) |
          (required == Dispatch_Amount.A3 &
           (available == Inventory_Amount.A0 | available == Inventory_Amount.A1 | available == Inventory_Amount.A2)) |
          (required == Dispatch_Amount.A4 & available != Inventory_Amount.A4);
        // @trace MON-02
        def same_product(inventory_product: Inventory_Product_Id, requested_product: Product_Id): Base_Types::Boolean :=
          (inventory_product == Inventory_Product_Id.P1 & requested_product == Product_Id.P1) |
          (inventory_product == Inventory_Product_Id.P2 & requested_product == Product_Id.P2) |
          (inventory_product == Inventory_Product_Id.P3 & requested_product == Product_Id.P3) |
          (inventory_product == Inventory_Product_Id.P4 & requested_product == Product_Id.P4);
        // @trace CCASE-04
        def recovery_amount_at_least(available: Inventory_Amount, required: Capacity_Amount): Base_Types::Boolean :=
          required == Capacity_Amount.A0 |
          (required == Capacity_Amount.A1 & available != Inventory_Amount.A0) |
          (required == Capacity_Amount.A2 &
           (available == Inventory_Amount.A2 | available == Inventory_Amount.A3 | available == Inventory_Amount.A4)) |
          (required == Capacity_Amount.A3 &
           (available == Inventory_Amount.A3 | available == Inventory_Amount.A4)) |
          (required == Capacity_Amount.A4 & available == Inventory_Amount.A4);
        // @trace CCASE-05
        def recovery_amount_below(available: Inventory_Amount, required: Capacity_Amount): Base_Types::Boolean :=
          (required == Capacity_Amount.A1 & available == Inventory_Amount.A0) |
          (required == Capacity_Amount.A2 &
           (available == Inventory_Amount.A0 | available == Inventory_Amount.A1)) |
          (required == Capacity_Amount.A3 &
           (available == Inventory_Amount.A0 | available == Inventory_Amount.A1 | available == Inventory_Amount.A2)) |
          (required == Capacity_Amount.A4 & available != Inventory_Amount.A4);
        // @trace MON-02
        def same_recovery_product(inventory_product: Inventory_Product_Id, stored_product: Capacity_Product_Id): Base_Types::Boolean :=
          (inventory_product == Inventory_Product_Id.P1 & stored_product == Capacity_Product_Id.P1) |
          (inventory_product == Inventory_Product_Id.P2 & stored_product == Capacity_Product_Id.P2) |
          (inventory_product == Inventory_Product_Id.P3 & stored_product == Capacity_Product_Id.P3) |
          (inventory_product == Inventory_Product_Id.P4 & stored_product == Capacity_Product_Id.P4);
        // @trace CCASE-04
        def inventory_is_sufficient(snap: Dispatch_Inventory_Snapshot, fact: Qualified_Request_Fact): Base_Types::Boolean :=
          snap.validity == Observation_Validity.Valid &
          fact.product_id != Product_Id.None &
          same_product(snap.pid, fact.product_id) &
          amount_at_least(snap.qty, fact.amount);
        // @trace CCASE-05
        def inventory_is_insufficient(snap: Dispatch_Inventory_Snapshot, fact: Qualified_Request_Fact): Base_Types::Boolean :=
          snap.validity == Observation_Validity.Valid &
          fact.product_id != Product_Id.None &
          same_product(snap.pid, fact.product_id) &
          amount_below(snap.qty, fact.amount);
        // @trace CCASE-06
        def inventory_is_unknown(snap: Dispatch_Inventory_Snapshot, fact: Qualified_Request_Fact): Base_Types::Boolean :=
          snap.validity == Observation_Validity.Invalid |
          fact.product_id == Product_Id.None |
          not same_product(snap.pid, fact.product_id);
        // @trace OWN-02
        def fresh_inventory_class(snap: Dispatch_Inventory_Snapshot, fact: Qualified_Request_Fact): Fresh_Inventory_Assessment :=
          if (fact.assessment != Admission_Assessment.AdmissibleFresh)? Fresh_Inventory_Assessment.NotApplicable
          else if (inventory_is_sufficient(snap, fact))? Fresh_Inventory_Assessment.Sufficient
          else if (inventory_is_insufficient(snap, fact))? Fresh_Inventory_Assessment.Insufficient
          else Fresh_Inventory_Assessment.Unknown;
        // @trace OWN-02
        def recovery_inventory_class(snap: Dispatch_Inventory_Snapshot, context: Recovery_Qualification_Context): Recovery_Inventory_Assessment :=
          if (context.lifecycle != Dispatch_Lifecycle.RecoveryPending |
              context.stored_request_id == Capacity_Request_Id.None |
              context.stored_product_id == Capacity_Product_Id.None |
              context.stored_amount == Capacity_Amount.A0)? Recovery_Inventory_Assessment.NotApplicable
          else if (snap.validity == Observation_Validity.Valid &
                   same_recovery_product(snap.pid, context.stored_product_id) &
                   recovery_amount_at_least(snap.qty, context.stored_amount))? Recovery_Inventory_Assessment.Sufficient
          else if (snap.validity == Observation_Validity.Valid &
                   same_recovery_product(snap.pid, context.stored_product_id) &
                   recovery_amount_below(snap.qty, context.stored_amount))? Recovery_Inventory_Assessment.Insufficient
          else Recovery_Inventory_Assessment.Unknown;
        // @trace INT-08
        def candidate_request(value: Capacity_Request_Id): Candidate_Request_Id :=
          if (value == Capacity_Request_Id.R1)? Candidate_Request_Id.R1
          else if (value == Capacity_Request_Id.R2)? Candidate_Request_Id.R2
          else if (value == Capacity_Request_Id.R3)? Candidate_Request_Id.R3
          else if (value == Capacity_Request_Id.R4)? Candidate_Request_Id.R4
          else if (value == Capacity_Request_Id.R5)? Candidate_Request_Id.R5
          else if (value == Capacity_Request_Id.R6)? Candidate_Request_Id.R6
          else if (value == Capacity_Request_Id.R7)? Candidate_Request_Id.R7
          else if (value == Capacity_Request_Id.R8)? Candidate_Request_Id.R8
          else Candidate_Request_Id.None;
        // @trace INT-08
        def candidate_product(value: Capacity_Product_Id): Candidate_Product_Id :=
          if (value == Capacity_Product_Id.P1)? Candidate_Product_Id.P1
          else if (value == Capacity_Product_Id.P2)? Candidate_Product_Id.P2
          else if (value == Capacity_Product_Id.P3)? Candidate_Product_Id.P3
          else if (value == Capacity_Product_Id.P4)? Candidate_Product_Id.P4
          else Candidate_Product_Id.None;
        // @trace INT-08
        def candidate_amount(value: Capacity_Amount): Candidate_Amount :=
          if (value == Capacity_Amount.A1)? Candidate_Amount.A1
          else if (value == Capacity_Amount.A2)? Candidate_Amount.A2
          else if (value == Capacity_Amount.A3)? Candidate_Amount.A3
          else if (value == Capacity_Amount.A4)? Candidate_Amount.A4
          else Candidate_Amount.A0;
        // @trace INT-08
        def candidate_lifecycle(value: Dispatch_Lifecycle): Candidate_Lifecycle :=
          if (value == Dispatch_Lifecycle.ActiveFresh)? Candidate_Lifecycle.ActiveFresh
          else if (value == Dispatch_Lifecycle.RecoveryPending)? Candidate_Lifecycle.RecoveryPending
          else if (value == Dispatch_Lifecycle.ActiveRetry)? Candidate_Lifecycle.ActiveRetry
          else if (value == Dispatch_Lifecycle.TerminalCompleted)? Candidate_Lifecycle.TerminalCompleted
          else if (value == Dispatch_Lifecycle.TerminalFailed)? Candidate_Lifecycle.TerminalFailed
          else Candidate_Lifecycle.Idle;

      initialize
        // @trace POL-09
        guarantee INITIAL_INVENTORY_ASSESSMENTS "Both candidate-specific assessments initialize as inapplicable with cleared routed context":
          candidate_readiness.fresh_assessment == Fresh_Inventory_Assessment.NotApplicable &
          candidate_readiness.recovery_assessment == Recovery_Inventory_Assessment.NotApplicable &
          candidate_readiness.recovery_request_id == Candidate_Request_Id.None &
          candidate_readiness.recovery_product_id == Candidate_Product_Id.None &
          candidate_readiness.recovery_amount == Candidate_Amount.A0 &
          candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle;

      compute
        // @trace OWN-02
        guarantee FRESH_INVENTORY_CLASSIFIED "Presented fresh readiness is derived only from the admissible presented payload":
          candidate_readiness.fresh_assessment == fresh_inventory_class(inventory_snapshot, request_fact);
        // @trace OWN-02
        guarantee RECOVERY_INVENTORY_CLASSIFIED "Recovery readiness is independently derived only from the stored recovery payload":
          candidate_readiness.recovery_assessment == recovery_inventory_class(inventory_snapshot, recovery_context);
        // @trace INT-08
        guarantee RECOVERY_CONTEXT_ROUTED "Stored recovery payload and pre-state capacity are routed without substitution":
          candidate_readiness.recovery_request_id == candidate_request(recovery_context.stored_request_id) &
          candidate_readiness.recovery_product_id == candidate_product(recovery_context.stored_product_id) &
          candidate_readiness.recovery_amount == candidate_amount(recovery_context.stored_amount) &
          candidate_readiness.lifecycle_capacity == candidate_lifecycle(recovery_context.lifecycle);
    }*/
  }

  // @trace PART-03
  part def Dock_Qualifier :> Thread {
    // @trace INT-03
    port dock_snapshot : DataPort { in :>> type : Dock_Snapshot; }
    // @trace INT-09
    port assessment : DataPort { out :>> type : Dock_Assessment; }

    language "GUMBO" /*{
      initialize
        // @trace POL-09
        guarantee INITIAL_DOCK_ASSESSMENT "Dock readiness begins conservatively unknown":
          assessment == Dock_Assessment.Unknown;

      compute
        compute_cases
          // @trace CCASE-07
          case DOCK_READY "Only a valid ready dock is ready":
            assume dock_snapshot.validity == Observation_Validity.Valid &
                   dock_snapshot.disposition == Dock_Disposition.Ready;
            guarantee assessment == Dock_Assessment.Ready;
          // @trace CCASE-08
          case DOCK_BLOCKED "A valid occupied or unavailable dock is blocked":
            assume dock_snapshot.validity == Observation_Validity.Valid &
                   dock_snapshot.disposition != Dock_Disposition.Ready;
            guarantee assessment == Dock_Assessment.Blocked;
          // @trace CCASE-09
          case DOCK_UNKNOWN "Every invalid dock observation is unknown":
            assume dock_snapshot.validity == Observation_Validity.Invalid;
            guarantee assessment == Dock_Assessment.Unknown;
    }*/
  }

  // @trace PART-04
  part def Outcome_Recovery_Classifier :> Thread {
    // @trace INT-04
    port execution_outcome : DataPort { in :>> type : Execution_Outcome; }
    // @trace INT-10
    port execution_context : DataPort { in :>> type : Active_Execution_Context; }
    // @trace INT-11
    port recovery_plan : DataPort { out :>> type : Outcome_Plan; }
    // @trace INT-12
    port transition_plan : DataPort { out :>> type : Outcome_Plan; }
    // @trace INT-17
    port confirmation_context : DataPort { out :>> type : Confirmation_Context; }

    language "GUMBO" /*{
      functions
        // @trace INT-17
        def confirmation_class(value: Outcome_Plan): Confirmation_Outcome_Class :=
          if (value == Outcome_Plan.Preserve)? Confirmation_Outcome_Class.Preserve
          else if (value == Outcome_Plan.Completed)? Confirmation_Outcome_Class.Completed
          else if (value == Outcome_Plan.RetryEligible)? Confirmation_Outcome_Class.RetryEligible
          else Confirmation_Outcome_Class.Abort;
        // @trace INT-17
        def confirmation_id(value: Context_Request_Id): Confirmation_Request_Id :=
          if (value == Context_Request_Id.R1)? Confirmation_Request_Id.R1
          else if (value == Context_Request_Id.R2)? Confirmation_Request_Id.R2
          else if (value == Context_Request_Id.R3)? Confirmation_Request_Id.R3
          else if (value == Context_Request_Id.R4)? Confirmation_Request_Id.R4
          else if (value == Context_Request_Id.R5)? Confirmation_Request_Id.R5
          else if (value == Context_Request_Id.R6)? Confirmation_Request_Id.R6
          else if (value == Context_Request_Id.R7)? Confirmation_Request_Id.R7
          else if (value == Context_Request_Id.R8)? Confirmation_Request_Id.R8
          else Confirmation_Request_Id.None;
        // @trace POL-05
        def same_request(raw: Request_Id, active: Context_Request_Id): Base_Types::Boolean :=
          (raw == Request_Id.R1 & active == Context_Request_Id.R1) |
          (raw == Request_Id.R2 & active == Context_Request_Id.R2) |
          (raw == Request_Id.R3 & active == Context_Request_Id.R3) |
          (raw == Request_Id.R4 & active == Context_Request_Id.R4) |
          (raw == Request_Id.R5 & active == Context_Request_Id.R5) |
          (raw == Request_Id.R6 & active == Context_Request_Id.R6) |
          (raw == Request_Id.R7 & active == Context_Request_Id.R7) |
          (raw == Request_Id.R8 & active == Context_Request_Id.R8);
        // @trace POL-05
        def same_attempt(raw: Dispatch_Attempt, active: Context_Attempt): Base_Types::Boolean :=
          (raw == Dispatch_Attempt.FreshAttempt & active == Context_Attempt.FreshAttempt) |
          (raw == Dispatch_Attempt.RetryAttempt & active == Context_Attempt.RetryAttempt);

      initialize
        // @trace POL-09
        guarantee INITIAL_OUTCOME_PLAN "Outcome classification initializes to preservation with no active identity":
          recovery_plan == Outcome_Plan.Preserve &
          transition_plan == Outcome_Plan.Preserve &
          confirmation_context.classification == Confirmation_Outcome_Class.Preserve &
          confirmation_context.confirmation_request_id == Confirmation_Request_Id.None;

      compute
        // @trace OWN-04
        guarantee CLASSIFIER_PUBLICATIONS_AGREE "All consumers receive the one locally correlated plan":
          recovery_plan == transition_plan &
          confirmation_context.classification == confirmation_class(transition_plan) &
          confirmation_context.confirmation_request_id == confirmation_id(execution_context.active_request_id);

        compute_cases
          // @trace CCASE-14
          case RECOVERY_REMAINS_ELIGIBLE "Pending recovery remains the recovery candidate independent of raw feedback":
            assume execution_context.lifecycle == Dispatch_Lifecycle.RecoveryPending;
            guarantee transition_plan == Outcome_Plan.RetryEligible;
          // @trace CCASE-15
          case MATCHING_COMPLETION "A matching completion in either active attempt is correlated as completed":
            assume (execution_context.lifecycle == Dispatch_Lifecycle.ActiveFresh |
                    execution_context.lifecycle == Dispatch_Lifecycle.ActiveRetry) &
                   execution_context.active_request_id != Context_Request_Id.None &
                   same_request(execution_outcome.request_id, execution_context.active_request_id) &
                   same_attempt(execution_outcome.attempt, execution_context.active_attempt) &
                   execution_outcome.result == Outcome_Result.Completed;
            guarantee transition_plan == Outcome_Plan.Completed;
          // @trace CCASE-16
          case MATCHING_FRESH_FAILURE "A matching first-attempt failure creates one later recovery opportunity":
            assume execution_context.lifecycle == Dispatch_Lifecycle.ActiveFresh &
                   execution_context.active_request_id != Context_Request_Id.None &
                   same_request(execution_outcome.request_id, execution_context.active_request_id) &
                   execution_outcome.attempt == Dispatch_Attempt.FreshAttempt &
                   execution_outcome.result == Outcome_Result.Failed;
            guarantee transition_plan == Outcome_Plan.RetryEligible;
          // @trace CCASE-18
          case MATCHING_RETRY_FAILURE "A matching retry failure aborts and cannot create a second retry":
            assume execution_context.lifecycle == Dispatch_Lifecycle.ActiveRetry &
                   execution_context.active_request_id != Context_Request_Id.None &
                   same_request(execution_outcome.request_id, execution_context.active_request_id) &
                   execution_outcome.attempt == Dispatch_Attempt.RetryAttempt &
                   execution_outcome.result == Outcome_Result.Failed;
            guarantee transition_plan == Outcome_Plan.Abort;
          // @trace CCASE-19
          case OUTCOME_PRESERVED "Nonactive, nonterminal, or mismatched feedback preserves the commitment":
            assume execution_context.lifecycle != Dispatch_Lifecycle.RecoveryPending &
                   not (((execution_context.lifecycle == Dispatch_Lifecycle.ActiveFresh |
                          execution_context.lifecycle == Dispatch_Lifecycle.ActiveRetry) &
                         execution_context.active_request_id != Context_Request_Id.None &
                         same_request(execution_outcome.request_id, execution_context.active_request_id) &
                         same_attempt(execution_outcome.attempt, execution_context.active_attempt) &
                         execution_outcome.result == Outcome_Result.Completed) |
                        (execution_context.lifecycle == Dispatch_Lifecycle.ActiveFresh &
                         execution_context.active_request_id != Context_Request_Id.None &
                         same_request(execution_outcome.request_id, execution_context.active_request_id) &
                         execution_outcome.attempt == Dispatch_Attempt.FreshAttempt &
                         execution_outcome.result == Outcome_Result.Failed) |
                        (execution_context.lifecycle == Dispatch_Lifecycle.ActiveRetry &
                         execution_context.active_request_id != Context_Request_Id.None &
                         same_request(execution_outcome.request_id, execution_context.active_request_id) &
                         execution_outcome.attempt == Dispatch_Attempt.RetryAttempt &
                         execution_outcome.result == Outcome_Result.Failed));
            guarantee transition_plan == Outcome_Plan.Preserve;
    }*/
  }

  // @trace PART-05
  part def Dispatch_Priority_Resolver :> Thread {
    // @trace INT-06
    port admission : DataPort { in :>> type : Admission_Assessment; }
    // @trace INT-11
    port recovery_plan : DataPort { in :>> type : Outcome_Plan; }
    // @trace INT-13
    port selected_intent : DataPort { out :>> type : Selected_Intent; }

    language "GUMBO" /*{
      initialize
        // @trace POL-09
        guarantee INITIAL_SELECTED_INTENT "Priority selection initializes with no candidate":
          selected_intent == Selected_Intent.None;

      compute
        compute_cases
          // @trace CCASE-14
          case RECOVERY_OUTRANKS_FRESH "A pending recovery outranks every admission class, including fresh work":
            assume recovery_plan == Outcome_Plan.RetryEligible;
            guarantee selected_intent == Selected_Intent.RecoveryIntent;
          // @trace CCASE-03
          case FRESH_SELECTED "An admissible request is selected only when recovery is not pending":
            assume recovery_plan != Outcome_Plan.RetryEligible &
                   admission == Admission_Assessment.AdmissibleFresh;
            guarantee selected_intent == Selected_Intent.FreshIntent;
          // @trace CCASE-20
          case NO_INTENT_SELECTED "No other admission class creates a candidate":
            assume recovery_plan != Outcome_Plan.RetryEligible &
                   admission != Admission_Assessment.AdmissibleFresh;
            guarantee selected_intent == Selected_Intent.None;
    }*/
  }

  // @trace PART-06
  part def Release_Arbiter :> Thread {
    // @trace INT-07
    port request_fact : DataPort { in :>> type : Qualified_Request_Fact; }
    // @trace INT-08
    port candidate_readiness : DataPort { in :>> type : Candidate_Inventory_Readiness; }
    // @trace INT-09
    port dock_assessment : DataPort { in :>> type : Dock_Assessment; }
    // @trace INT-13
    port selected_intent : DataPort { in :>> type : Selected_Intent; }
    // @trace INT-15
    port dispatch_decision : DataPort { out :>> type : Dispatch_Decision; }
    // @trace INT-19
    port decision_reason : DataPort { out :>> type : Decision_Reason; }

    language "GUMBO" /*{
      functions
        // @trace INT-08
        def capacity_request(value: Candidate_Request_Id): Request_Id :=
          if (value == Candidate_Request_Id.R1)? Request_Id.R1
          else if (value == Candidate_Request_Id.R2)? Request_Id.R2
          else if (value == Candidate_Request_Id.R3)? Request_Id.R3
          else if (value == Candidate_Request_Id.R4)? Request_Id.R4
          else if (value == Candidate_Request_Id.R5)? Request_Id.R5
          else if (value == Candidate_Request_Id.R6)? Request_Id.R6
          else if (value == Candidate_Request_Id.R7)? Request_Id.R7
          else if (value == Candidate_Request_Id.R8)? Request_Id.R8
          else Request_Id.None;
        // @trace INT-08
        def capacity_product(value: Candidate_Product_Id): Product_Id :=
          if (value == Candidate_Product_Id.P1)? Product_Id.P1
          else if (value == Candidate_Product_Id.P2)? Product_Id.P2
          else if (value == Candidate_Product_Id.P3)? Product_Id.P3
          else if (value == Candidate_Product_Id.P4)? Product_Id.P4
          else Product_Id.None;
        // @trace INT-08
        def capacity_amount(value: Candidate_Amount): Dispatch_Amount :=
          if (value == Candidate_Amount.A1)? Dispatch_Amount.A1
          else if (value == Candidate_Amount.A2)? Dispatch_Amount.A2
          else if (value == Candidate_Amount.A3)? Dispatch_Amount.A3
          else if (value == Candidate_Amount.A4)? Dispatch_Amount.A4
          else Dispatch_Amount.A0;

      initialize
        // @trace POL-09
        guarantee INITIAL_DISPATCH_DECISION "The arbiter initializes to no action and idle reason":
          dispatch_decision.kind == Dispatch_Decision_Kind.None &
          dispatch_decision.request_id == Request_Id.None &
          dispatch_decision.product_id == Product_Id.None &
          dispatch_decision.amount == Dispatch_Amount.A0 &
          decision_reason == Decision_Reason.Idle;

      compute
        compute_cases
          // @trace CCASE-15
          case RESET_COMPLETED "A completed terminal pre-state deterministically requests a cleared Idle transition":
            assume candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.TerminalCompleted;
            guarantee dispatch_decision.kind == Dispatch_Decision_Kind.ResetIdle &
                      dispatch_decision.request_id == Request_Id.None &
                      dispatch_decision.product_id == Product_Id.None &
                      dispatch_decision.amount == Dispatch_Amount.A0 &
                      decision_reason == Decision_Reason.TerminalReset;
          // @trace CCASE-18
          case RESET_FAILED "A failed terminal pre-state deterministically requests a cleared Idle transition":
            assume candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.TerminalFailed;
            guarantee dispatch_decision.kind == Dispatch_Decision_Kind.ResetIdle &
                      dispatch_decision.request_id == Request_Id.None &
                      dispatch_decision.product_id == Product_Id.None &
                      dispatch_decision.amount == Dispatch_Amount.A0 &
                      decision_reason == Decision_Reason.TerminalReset;
          // @trace CCASE-13
          case PROTECTED_ACTIVE_BUSY "An active commitment blocks a concurrently presented request":
            assume (candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.ActiveFresh |
                    candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.ActiveRetry) &
                   request_fact.assessment != Admission_Assessment.NoRequest;
            guarantee dispatch_decision.kind == Dispatch_Decision_Kind.Busy &
                      dispatch_decision.request_id == capacity_request(candidate_readiness.recovery_request_id) &
                      dispatch_decision.product_id == capacity_product(candidate_readiness.recovery_product_id) &
                      dispatch_decision.amount == capacity_amount(candidate_readiness.recovery_amount) &
                      decision_reason == Decision_Reason.Busy;
          // @trace CCASE-19
          case ACTIVE_NO_REQUEST_PRESERVED "Active work without a concurrent request remains released":
            assume (candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.ActiveFresh |
                    candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.ActiveRetry) &
                   request_fact.assessment == Admission_Assessment.NoRequest;
            guarantee dispatch_decision.kind == Dispatch_Decision_Kind.None &
                      dispatch_decision.request_id == Request_Id.None &
                      dispatch_decision.product_id == Product_Id.None &
                      dispatch_decision.amount == Dispatch_Amount.A0 &
                      decision_reason == Decision_Reason.Released;
          // @trace CCASE-01
          case REJECT_MALFORMED "A malformed request is rejected when capacity is idle":
            assume candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
                   request_fact.assessment == Admission_Assessment.Malformed;
            guarantee dispatch_decision.kind == Dispatch_Decision_Kind.Reject &
                      dispatch_decision.request_id == Request_Id.None &
                      dispatch_decision.product_id == Product_Id.None &
                      dispatch_decision.amount == Dispatch_Amount.A0 &
                      decision_reason == Decision_Reason.Rejected;
          // @trace CCASE-02
          case REJECT_REPEATED "A repeated request is rejected when capacity is idle":
            assume candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
                   request_fact.assessment == Admission_Assessment.Repeated;
            guarantee dispatch_decision.kind == Dispatch_Decision_Kind.Reject &
                      dispatch_decision.request_id == Request_Id.None &
                      dispatch_decision.product_id == Product_Id.None &
                      dispatch_decision.amount == Dispatch_Amount.A0 &
                      decision_reason == Decision_Reason.Rejected;
          // @trace CCASE-11
          case WAIT_FOR_INVENTORY "The selected highest-priority candidate waits when inventory is not sufficient":
            assume (candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
                    selected_intent == Selected_Intent.FreshIntent &
                    candidate_readiness.fresh_assessment != Fresh_Inventory_Assessment.Sufficient) |
                   (candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.RecoveryPending &
                    selected_intent == Selected_Intent.RecoveryIntent &
                    candidate_readiness.recovery_assessment != Recovery_Inventory_Assessment.Sufficient);
            guarantee dispatch_decision.kind == Dispatch_Decision_Kind.WaitInventory &
                      decision_reason == Decision_Reason.WaitingInventory;
          // @trace CCASE-12
          case WAIT_FOR_DOCK "Sufficient inventory waits when the dock is not ready":
            assume ((candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
                     selected_intent == Selected_Intent.FreshIntent &
                     candidate_readiness.fresh_assessment == Fresh_Inventory_Assessment.Sufficient) |
                    (candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.RecoveryPending &
                     selected_intent == Selected_Intent.RecoveryIntent &
                     candidate_readiness.recovery_assessment == Recovery_Inventory_Assessment.Sufficient)) &
                   dock_assessment != Dock_Assessment.Ready;
            guarantee dispatch_decision.kind == Dispatch_Decision_Kind.WaitDock &
                      decision_reason == Decision_Reason.WaitingDock;
          // @trace CCASE-10
          case RELEASE_FRESH "All independent qualifications authorize a fresh release in Idle":
            assume candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
                   selected_intent == Selected_Intent.FreshIntent &
                   candidate_readiness.fresh_assessment == Fresh_Inventory_Assessment.Sufficient &
                   dock_assessment == Dock_Assessment.Ready;
            guarantee dispatch_decision.kind == Dispatch_Decision_Kind.ReleaseFresh &
                      dispatch_decision.request_id == request_fact.request_id &
                      dispatch_decision.product_id == request_fact.product_id &
                      dispatch_decision.amount == request_fact.amount &
                      decision_reason == Decision_Reason.Released;
          // @trace CCASE-17
          case RELEASE_RETRY "Requalified recovery releases the stored commitment, not a competing request":
            assume candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.RecoveryPending &
                   selected_intent == Selected_Intent.RecoveryIntent &
                   candidate_readiness.recovery_assessment == Recovery_Inventory_Assessment.Sufficient &
                   dock_assessment == Dock_Assessment.Ready;
            guarantee dispatch_decision.kind == Dispatch_Decision_Kind.ReleaseRetry &
                      dispatch_decision.request_id == capacity_request(candidate_readiness.recovery_request_id) &
                      dispatch_decision.product_id == capacity_product(candidate_readiness.recovery_product_id) &
                      dispatch_decision.amount == capacity_amount(candidate_readiness.recovery_amount) &
                      decision_reason == Decision_Reason.Released;
          // @trace CCASE-20
          case ARBITER_IDLE "With no selected candidate and idle capacity, the arbiter remains idle":
            assume candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
                   selected_intent == Selected_Intent.None &
                   request_fact.assessment != Admission_Assessment.Malformed &
                   request_fact.assessment != Admission_Assessment.Repeated;
            guarantee dispatch_decision.kind == Dispatch_Decision_Kind.None &
                      dispatch_decision.request_id == Request_Id.None &
                      dispatch_decision.product_id == Product_Id.None &
                      dispatch_decision.amount == Dispatch_Amount.A0 &
                      decision_reason == Decision_Reason.Idle;
    }*/
  }

  // @trace PART-07
  part def Commitment_Tracker :> Thread {
    // @trace INT-12
    port outcome_plan : DataPort { in :>> type : Outcome_Plan; }
    // @trace INT-15
    port dispatch_decision : DataPort { in :>> type : Dispatch_Decision; }
    // @trace INT-10
    port execution_context : DataPort { out :>> type : Active_Execution_Context; }
    // @trace INT-14
    port recovery_context : DataPort { out :>> type : Recovery_Qualification_Context; }
    // @trace INT-16
    port shipment_instruction : DataPort { out :>> type : Shipment_Instruction; }
    // @trace INT-20
    port lifecycle_snapshot : DataPort { out :>> type : Dispatch_Lifecycle; }

    language "GUMBO" /*{
      // @trace OWN-07
      state
        // @trace POL-04
        lifecycle: Dispatch_Lifecycle;
        // @trace GOAL-02
        active_request_id: Request_Id;
        // @trace GOAL-02
        active_product_id: Product_Id;
        // @trace GOAL-02
        active_amount: Dispatch_Amount;
        // @trace POL-07
        active_attempt: Dispatch_Attempt;

      functions
        // @trace INT-10
        def context_id(value: Request_Id): Context_Request_Id :=
          if (value == Request_Id.R1)? Context_Request_Id.R1
          else if (value == Request_Id.R2)? Context_Request_Id.R2
          else if (value == Request_Id.R3)? Context_Request_Id.R3
          else if (value == Request_Id.R4)? Context_Request_Id.R4
          else if (value == Request_Id.R5)? Context_Request_Id.R5
          else if (value == Request_Id.R6)? Context_Request_Id.R6
          else if (value == Request_Id.R7)? Context_Request_Id.R7
          else if (value == Request_Id.R8)? Context_Request_Id.R8
          else Context_Request_Id.None;
        // @trace INT-10
        def context_attempt(value: Dispatch_Attempt): Context_Attempt :=
          if (value == Dispatch_Attempt.RetryAttempt)? Context_Attempt.RetryAttempt
          else Context_Attempt.FreshAttempt;
        // @trace INT-14
        def capacity_id(value: Request_Id): Capacity_Request_Id :=
          if (value == Request_Id.R1)? Capacity_Request_Id.R1
          else if (value == Request_Id.R2)? Capacity_Request_Id.R2
          else if (value == Request_Id.R3)? Capacity_Request_Id.R3
          else if (value == Request_Id.R4)? Capacity_Request_Id.R4
          else if (value == Request_Id.R5)? Capacity_Request_Id.R5
          else if (value == Request_Id.R6)? Capacity_Request_Id.R6
          else if (value == Request_Id.R7)? Capacity_Request_Id.R7
          else if (value == Request_Id.R8)? Capacity_Request_Id.R8
          else Capacity_Request_Id.None;
        // @trace INT-14
        def capacity_product_id(value: Product_Id): Capacity_Product_Id :=
          if (value == Product_Id.P1)? Capacity_Product_Id.P1
          else if (value == Product_Id.P2)? Capacity_Product_Id.P2
          else if (value == Product_Id.P3)? Capacity_Product_Id.P3
          else if (value == Product_Id.P4)? Capacity_Product_Id.P4
          else Capacity_Product_Id.None;
        // @trace INT-14
        def capacity_quantity(value: Dispatch_Amount): Capacity_Amount :=
          if (value == Dispatch_Amount.A1)? Capacity_Amount.A1
          else if (value == Dispatch_Amount.A2)? Capacity_Amount.A2
          else if (value == Dispatch_Amount.A3)? Capacity_Amount.A3
          else if (value == Dispatch_Amount.A4)? Capacity_Amount.A4
          else Capacity_Amount.A0;
      initialize
        // @trace POL-09
        guarantee INITIAL_TRACKER_STATE "The tracker initializes every sentinel and the safe instruction explicitly":
          lifecycle == Dispatch_Lifecycle.Idle &
          active_request_id == Request_Id.None &
          active_product_id == Product_Id.None &
          active_amount == Dispatch_Amount.A0 &
          active_attempt == Dispatch_Attempt.FreshAttempt &
          execution_context.lifecycle == Dispatch_Lifecycle.Idle &
          execution_context.active_request_id == Context_Request_Id.None &
          execution_context.active_attempt == Context_Attempt.FreshAttempt &
          recovery_context.lifecycle == Dispatch_Lifecycle.Idle &
          recovery_context.stored_request_id == Capacity_Request_Id.None &
          recovery_context.stored_product_id == Capacity_Product_Id.None &
          recovery_context.stored_amount == Capacity_Amount.A0 &
          shipment_instruction.kind == Instruction_Kind.NoInstruction &
          shipment_instruction.request_id == Request_Id.None &
          shipment_instruction.product_id == Product_Id.None &
          shipment_instruction.amount == Dispatch_Amount.A0 &
          lifecycle_snapshot == Dispatch_Lifecycle.Idle;

      compute
        // @trace INT-10
        guarantee PRESTATE_EXECUTION_CONTEXT "The classifier receives only the tracker's pre-state correlation context":
          execution_context.lifecycle == In(lifecycle) &
          execution_context.active_request_id == context_id(In(active_request_id)) &
          execution_context.active_attempt == context_attempt(In(active_attempt));
        // @trace INT-14
        guarantee PRESTATE_RECOVERY_CONTEXT "The inventory owner receives only pre-state capacity and the stored active payload":
          recovery_context.lifecycle == In(lifecycle) &
          recovery_context.stored_request_id == capacity_id(In(active_request_id)) &
          recovery_context.stored_product_id == capacity_product_id(In(active_product_id)) &
          recovery_context.stored_amount == capacity_quantity(In(active_amount));
        // @trace INT-20
        guarantee POSTSTATE_LIFECYCLE_PUBLICATION "The status owner receives the selected post-state lifecycle":
          lifecycle_snapshot == lifecycle;

        compute_cases
          // @trace CCASE-10
          case TRACK_FRESH_RELEASE "A fresh release allocates the exact decision payload":
            assume In(lifecycle) == Dispatch_Lifecycle.Idle &
                   dispatch_decision.kind == Dispatch_Decision_Kind.ReleaseFresh;
            guarantee lifecycle == Dispatch_Lifecycle.ActiveFresh &
                      active_request_id == dispatch_decision.request_id &
                      active_product_id == dispatch_decision.product_id &
                      active_amount == dispatch_decision.amount &
                      active_attempt == Dispatch_Attempt.FreshAttempt &
                      shipment_instruction.kind == Instruction_Kind.ReleaseFresh &
                      shipment_instruction.request_id == dispatch_decision.request_id &
                      shipment_instruction.product_id == dispatch_decision.product_id &
                      shipment_instruction.amount == dispatch_decision.amount;
          // @trace CCASE-15
          case TRACK_COMPLETION "A correlated completion enters the observable terminal-completed state without another release":
            assume (In(lifecycle) == Dispatch_Lifecycle.ActiveFresh |
                    In(lifecycle) == Dispatch_Lifecycle.ActiveRetry) &
                   outcome_plan == Outcome_Plan.Completed;
            guarantee lifecycle == Dispatch_Lifecycle.TerminalCompleted &
                      active_request_id == In(active_request_id) &
                      active_product_id == In(active_product_id) &
                      active_amount == In(active_amount) &
                      active_attempt == In(active_attempt) &
                      shipment_instruction.kind == Instruction_Kind.NoInstruction &
                      shipment_instruction.request_id == Request_Id.None &
                      shipment_instruction.product_id == Product_Id.None &
                      shipment_instruction.amount == Dispatch_Amount.A0;
          // @trace CCASE-16
          case TRACK_FIRST_FAILURE "A correlated first failure enters RecoveryPending without same-step retry":
            assume In(lifecycle) == Dispatch_Lifecycle.ActiveFresh &
                   outcome_plan == Outcome_Plan.RetryEligible;
            guarantee lifecycle == Dispatch_Lifecycle.RecoveryPending &
                      active_request_id == In(active_request_id) &
                      active_product_id == In(active_product_id) &
                      active_amount == In(active_amount) &
                      active_attempt == Dispatch_Attempt.FreshAttempt &
                      shipment_instruction.kind == Instruction_Kind.NoInstruction &
                      shipment_instruction.request_id == Request_Id.None &
                      shipment_instruction.product_id == Product_Id.None &
                      shipment_instruction.amount == Dispatch_Amount.A0;
          // @trace CCASE-17
          case TRACK_RETRY_RELEASE "A later recovery decision releases the stored payload as the sole retry":
            assume In(lifecycle) == Dispatch_Lifecycle.RecoveryPending &
                   dispatch_decision.kind == Dispatch_Decision_Kind.ReleaseRetry;
            guarantee lifecycle == Dispatch_Lifecycle.ActiveRetry &
                      active_request_id == In(active_request_id) &
                      active_product_id == In(active_product_id) &
                      active_amount == In(active_amount) &
                      active_attempt == Dispatch_Attempt.RetryAttempt &
                      shipment_instruction.kind == Instruction_Kind.ReleaseRetry &
                      shipment_instruction.request_id == In(active_request_id) &
                      shipment_instruction.product_id == In(active_product_id) &
                      shipment_instruction.amount == In(active_amount);
          // @trace CCASE-18
          case TRACK_RETRY_ABORT "A correlated retry failure cancels the active request and enters terminal failure":
            assume In(lifecycle) == Dispatch_Lifecycle.ActiveRetry &
                   outcome_plan == Outcome_Plan.Abort;
            guarantee lifecycle == Dispatch_Lifecycle.TerminalFailed &
                      active_request_id == In(active_request_id) &
                      active_product_id == In(active_product_id) &
                      active_amount == In(active_amount) &
                      active_attempt == Dispatch_Attempt.RetryAttempt &
                      shipment_instruction.kind == Instruction_Kind.Cancel &
                      shipment_instruction.request_id == In(active_request_id) &
                      shipment_instruction.product_id == In(active_product_id) &
                      shipment_instruction.amount == In(active_amount);
          // @trace CCASE-19
          case TRACK_ACTIVE_PRESERVATION "Preserved feedback cannot mutate an active commitment":
            assume (In(lifecycle) == Dispatch_Lifecycle.ActiveFresh |
                    In(lifecycle) == Dispatch_Lifecycle.ActiveRetry) &
                   outcome_plan == Outcome_Plan.Preserve;
            guarantee lifecycle == In(lifecycle) &
                      active_request_id == In(active_request_id) &
                      active_product_id == In(active_product_id) &
                      active_amount == In(active_amount) &
                      active_attempt == In(active_attempt) &
                      shipment_instruction.kind == Instruction_Kind.NoInstruction &
                      shipment_instruction.request_id == Request_Id.None &
                      shipment_instruction.product_id == Product_Id.None &
                      shipment_instruction.amount == Dispatch_Amount.A0;
          // @trace CCASE-11
          case TRACK_WAIT_INVENTORY "Waiting for inventory preserves idle or recovery state and issues no instruction":
            assume (In(lifecycle) == Dispatch_Lifecycle.Idle |
                    In(lifecycle) == Dispatch_Lifecycle.RecoveryPending) &
                   dispatch_decision.kind == Dispatch_Decision_Kind.WaitInventory;
            guarantee lifecycle == In(lifecycle) &
                      active_request_id == In(active_request_id) &
                      active_product_id == In(active_product_id) &
                      active_amount == In(active_amount) &
                      active_attempt == In(active_attempt) &
                      shipment_instruction.kind == Instruction_Kind.NoInstruction &
                      shipment_instruction.request_id == Request_Id.None &
                      shipment_instruction.product_id == Product_Id.None &
                      shipment_instruction.amount == Dispatch_Amount.A0;
          // @trace CCASE-12
          case TRACK_WAIT_DOCK "Waiting for the dock preserves idle or recovery state and issues no instruction":
            assume (In(lifecycle) == Dispatch_Lifecycle.Idle |
                    In(lifecycle) == Dispatch_Lifecycle.RecoveryPending) &
                   dispatch_decision.kind == Dispatch_Decision_Kind.WaitDock;
            guarantee lifecycle == In(lifecycle) &
                      active_request_id == In(active_request_id) &
                      active_product_id == In(active_product_id) &
                      active_amount == In(active_amount) &
                      active_attempt == In(active_attempt) &
                      shipment_instruction.kind == Instruction_Kind.NoInstruction &
                      shipment_instruction.request_id == Request_Id.None &
                      shipment_instruction.product_id == Product_Id.None &
                      shipment_instruction.amount == Dispatch_Amount.A0;
          // @trace CCASE-20
          case TRACK_IDLE "Idle, rejection, and no-candidate decisions retain a cleared tracker":
            assume In(lifecycle) == Dispatch_Lifecycle.Idle &
                   dispatch_decision.kind != Dispatch_Decision_Kind.ReleaseFresh &
                   dispatch_decision.kind != Dispatch_Decision_Kind.WaitInventory &
                   dispatch_decision.kind != Dispatch_Decision_Kind.WaitDock;
            guarantee lifecycle == Dispatch_Lifecycle.Idle &
                      active_request_id == Request_Id.None &
                      active_product_id == Product_Id.None &
                      active_amount == Dispatch_Amount.A0 &
                      active_attempt == Dispatch_Attempt.FreshAttempt &
                      shipment_instruction.kind == Instruction_Kind.NoInstruction &
                      shipment_instruction.request_id == Request_Id.None &
                      shipment_instruction.product_id == Product_Id.None &
                      shipment_instruction.amount == Dispatch_Amount.A0;
          // @trace POL-04
          case TRACK_TERMINAL_RESET "Either observable terminal state returns to cleared Idle on the next evaluation":
            assume (In(lifecycle) == Dispatch_Lifecycle.TerminalCompleted |
                    In(lifecycle) == Dispatch_Lifecycle.TerminalFailed) &
                   dispatch_decision.kind == Dispatch_Decision_Kind.ResetIdle;
            guarantee lifecycle == Dispatch_Lifecycle.Idle &
                      active_request_id == Request_Id.None &
                      active_product_id == Product_Id.None &
                      active_amount == Dispatch_Amount.A0 &
                      active_attempt == Dispatch_Attempt.FreshAttempt &
                      shipment_instruction.kind == Instruction_Kind.NoInstruction &
                      shipment_instruction.request_id == Request_Id.None &
                      shipment_instruction.product_id == Product_Id.None &
                      shipment_instruction.amount == Dispatch_Amount.A0;
    }*/
  }

  // @trace PART-08
  part def Confirmation_Determiner :> Thread {
    // @trace INT-17
    port confirmation_context : DataPort { in :>> type : Confirmation_Context; }
    // @trace INT-18
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }

    language "GUMBO" /*{
      functions
        // @trace INT-17
        def request_id(value: Confirmation_Request_Id): Request_Id :=
          if (value == Confirmation_Request_Id.R1)? Request_Id.R1
          else if (value == Confirmation_Request_Id.R2)? Request_Id.R2
          else if (value == Confirmation_Request_Id.R3)? Request_Id.R3
          else if (value == Confirmation_Request_Id.R4)? Request_Id.R4
          else if (value == Confirmation_Request_Id.R5)? Request_Id.R5
          else if (value == Confirmation_Request_Id.R6)? Request_Id.R6
          else if (value == Confirmation_Request_Id.R7)? Request_Id.R7
          else if (value == Confirmation_Request_Id.R8)? Request_Id.R8
          else Request_Id.None;

      initialize
        // @trace POL-09
        guarantee INITIAL_CONFIRMATION "Confirmation initializes absent with no identifier":
          shipping_confirmation.kind == Confirmation_Kind.None &
          shipping_confirmation.request_id == Request_Id.None;

      compute
        compute_cases
          // @trace CCASE-19
          case CONFIRMATION_SUPPRESS_PRESERVE "Preserved feedback cannot issue a terminal confirmation":
            assume confirmation_context.classification == Confirmation_Outcome_Class.Preserve;
            guarantee shipping_confirmation.kind == Confirmation_Kind.None &
                      shipping_confirmation.request_id == Request_Id.None;
          // @trace CCASE-16
          case CONFIRMATION_SUPPRESS_RECOVERY "First-failure recovery cannot issue a terminal confirmation":
            assume confirmation_context.classification == Confirmation_Outcome_Class.RetryEligible;
            guarantee shipping_confirmation.kind == Confirmation_Kind.None &
                      shipping_confirmation.request_id == Request_Id.None;
          // @trace CCASE-15
          case CONFIRMATION_SHIPPED "Correlated completion yields a shipped confirmation for the active identifier":
            assume confirmation_context.classification == Confirmation_Outcome_Class.Completed;
            guarantee shipping_confirmation.kind == Confirmation_Kind.Shipped &
                      shipping_confirmation.request_id == request_id(confirmation_context.confirmation_request_id);
          // @trace CCASE-18
          case CONFIRMATION_FAILED "Correlated retry abort yields a dispatch-failed confirmation":
            assume confirmation_context.classification == Confirmation_Outcome_Class.Abort;
            guarantee shipping_confirmation.kind == Confirmation_Kind.DispatchFailed &
                      shipping_confirmation.request_id == request_id(confirmation_context.confirmation_request_id);
    }*/
  }

  // @trace PART-09
  part def Status_Determiner :> Thread {
    // @trace INT-19
    port decision_reason : DataPort { in :>> type : Decision_Reason; }
    // @trace INT-20
    port lifecycle_snapshot : DataPort { in :>> type : Dispatch_Lifecycle; }
    // @trace INT-21
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }

    language "GUMBO" /*{
      initialize
        // @trace POL-09
        guarantee INITIAL_STATUS "Public status initializes Idle":
          dispatch_status == Dispatch_Status.Idle;

      compute
        compute_cases
          // @trace CCASE-15
          case STATUS_COMPLETED "Terminal completion has highest status precedence":
            assume lifecycle_snapshot == Dispatch_Lifecycle.TerminalCompleted;
            guarantee dispatch_status == Dispatch_Status.Completed;
          // @trace CCASE-18
          case STATUS_FAILED "Terminal failure has highest status precedence":
            assume lifecycle_snapshot == Dispatch_Lifecycle.TerminalFailed;
            guarantee dispatch_status == Dispatch_Status.Failed;
          // @trace CCASE-16
          case STATUS_RECOVERING "RecoveryPending reports recovery ahead of fresh-request reasons":
            assume lifecycle_snapshot == Dispatch_Lifecycle.RecoveryPending;
            guarantee dispatch_status == Dispatch_Status.Recovering;
          // @trace CCASE-13
          case STATUS_BUSY "An active commitment reports Busy when the arbiter detects a competing request":
            assume (lifecycle_snapshot == Dispatch_Lifecycle.ActiveFresh |
                    lifecycle_snapshot == Dispatch_Lifecycle.ActiveRetry) &
                   decision_reason == Decision_Reason.Busy;
            guarantee dispatch_status == Dispatch_Status.Busy;
          // @trace CCASE-10
          case STATUS_RELEASED "An active lifecycle without a busy conflict reports Released":
            assume (lifecycle_snapshot == Dispatch_Lifecycle.ActiveFresh |
                    lifecycle_snapshot == Dispatch_Lifecycle.ActiveRetry) &
                   decision_reason != Decision_Reason.Busy;
            guarantee dispatch_status == Dispatch_Status.Released;
          // @trace POL-04
          case STATUS_TERMINAL_RESET "TerminalReset combined with the applied Idle snapshot suppresses repeated terminal reporting":
            assume lifecycle_snapshot == Dispatch_Lifecycle.Idle &
                   decision_reason == Decision_Reason.TerminalReset;
            guarantee dispatch_status == Dispatch_Status.Idle;
          // @trace CCASE-11
          case STATUS_WAIT_INVENTORY "Idle capacity reports the inventory wait with precedence over dock wait":
            assume lifecycle_snapshot == Dispatch_Lifecycle.Idle &
                   decision_reason == Decision_Reason.WaitingInventory;
            guarantee dispatch_status == Dispatch_Status.WaitingInventory;
          // @trace CCASE-12
          case STATUS_WAIT_DOCK "Idle capacity reports a dock wait after inventory passes":
            assume lifecycle_snapshot == Dispatch_Lifecycle.Idle &
                   decision_reason == Decision_Reason.WaitingDock;
            guarantee dispatch_status == Dispatch_Status.WaitingDock;
          // @trace CCASE-01
          case STATUS_REJECTED "Idle capacity exposes a rejected request":
            assume lifecycle_snapshot == Dispatch_Lifecycle.Idle &
                   decision_reason == Decision_Reason.Rejected;
            guarantee dispatch_status == Dispatch_Status.Rejected;
          // @trace CCASE-20
          case STATUS_IDLE "The residual idle partition reports Idle":
            assume lifecycle_snapshot == Dispatch_Lifecycle.Idle &
                   decision_reason != Decision_Reason.WaitingInventory &
                   decision_reason != Decision_Reason.WaitingDock &
                   decision_reason != Decision_Reason.Rejected &
                   decision_reason != Decision_Reason.TerminalReset;
            guarantee dispatch_status == Dispatch_Status.Idle;
    }*/
  }

  // @generated-support SUPPORT-01 behavior-free containment and boundary delegation only
  part def Dispatch_Coordinator_Process :> Process {
    // @trace PART-01
    part request_qualifier : Request_Qualifier;
    // @trace PART-02
    part inventory_qualifier : Inventory_Qualifier;
    // @trace PART-03
    part dock_qualifier : Dock_Qualifier;
    // @trace PART-04
    part outcome_recovery_classifier : Outcome_Recovery_Classifier;
    // @trace PART-05
    part dispatch_priority_resolver : Dispatch_Priority_Resolver;
    // @trace PART-06
    part release_arbiter : Release_Arbiter;
    // @trace PART-07
    part commitment_tracker : Commitment_Tracker;
    // @trace PART-08
    part confirmation_determiner : Confirmation_Determiner;
    // @trace PART-09
    part status_determiner : Status_Determiner;

    // @generated-support SUPPORT-02
    port request : DataPort { in :>> type : Raw_Dispatch_Request; }
    // @generated-support SUPPORT-02
    port inventory_snapshot : DataPort { in :>> type : Dispatch_Inventory_Snapshot; }
    // @generated-support SUPPORT-02
    port dock_snapshot : DataPort { in :>> type : Dock_Snapshot; }
    // @generated-support SUPPORT-02
    port execution_outcome : DataPort { in :>> type : Execution_Outcome; }
    // @generated-support SUPPORT-02
    port shipment_instruction : DataPort { out :>> type : Shipment_Instruction; }
    // @generated-support SUPPORT-02
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }
    // @generated-support SUPPORT-02
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }

    // @trace INT-01
    connection int_01_request : PortConnection connect request to request_qualifier.request;
    // @trace INT-02
    connection int_02_inventory : PortConnection connect inventory_snapshot to inventory_qualifier.inventory_snapshot;
    // @trace INT-03
    connection int_03_dock : PortConnection connect dock_snapshot to dock_qualifier.dock_snapshot;
    // @trace INT-04
    connection int_04_outcome : PortConnection connect execution_outcome to outcome_recovery_classifier.execution_outcome;
    // @trace INT-05
    connection int_05_request_inventory : PortConnection connect request_qualifier.inventory_request_fact to inventory_qualifier.request_fact;
    // @trace INT-06
    connection int_06_request_priority : PortConnection connect request_qualifier.priority_admission to dispatch_priority_resolver.admission;
    // @trace INT-07
    connection int_07_request_arbiter : PortConnection connect request_qualifier.arbiter_request_fact to release_arbiter.request_fact;
    // @trace INT-08
    connection int_08_inventory_arbiter : PortConnection connect inventory_qualifier.candidate_readiness to release_arbiter.candidate_readiness;
    // @trace INT-09
    connection int_09_dock_arbiter : PortConnection connect dock_qualifier.assessment to release_arbiter.dock_assessment;
    // @trace INT-10
    connection int_10_tracker_classifier : PortConnection connect commitment_tracker.execution_context to outcome_recovery_classifier.execution_context;
    // @trace INT-11
    connection int_11_classifier_priority : PortConnection connect outcome_recovery_classifier.recovery_plan to dispatch_priority_resolver.recovery_plan;
    // @trace INT-12
    connection int_12_classifier_tracker : PortConnection connect outcome_recovery_classifier.transition_plan to commitment_tracker.outcome_plan;
    // @trace INT-13
    connection int_13_priority_arbiter : PortConnection connect dispatch_priority_resolver.selected_intent to release_arbiter.selected_intent;
    // @trace INT-14
    connection int_14_tracker_inventory : PortConnection connect commitment_tracker.recovery_context to inventory_qualifier.recovery_context;
    // @trace INT-15
    connection int_15_arbiter_tracker : PortConnection connect release_arbiter.dispatch_decision to commitment_tracker.dispatch_decision;
    // @trace INT-16
    connection int_16_instruction : PortConnection connect commitment_tracker.shipment_instruction to shipment_instruction;
    // @trace INT-17
    connection int_17_classifier_confirmation : PortConnection connect outcome_recovery_classifier.confirmation_context to confirmation_determiner.confirmation_context;
    // @trace INT-18
    connection int_18_confirmation : PortConnection connect confirmation_determiner.shipping_confirmation to shipping_confirmation;
    // @trace INT-19
    connection int_19_arbiter_status : PortConnection connect release_arbiter.decision_reason to status_determiner.decision_reason;
    // @trace INT-20
    connection int_20_tracker_status : PortConnection connect commitment_tracker.lifecycle_snapshot to status_determiner.lifecycle_snapshot;
    // @trace INT-21
    connection int_21_status : PortConnection connect status_determiner.dispatch_status to dispatch_status;
  }

  // @trace BOUND-01
  part def Finished_Product_Dispatch_Coordinator_System :> System {
    // @generated-support SUPPORT-01
    part dispatch_coordinator_process : Dispatch_Coordinator_Process;

    // @trace MON-01
    port request : DataPort { in :>> type : Raw_Dispatch_Request; }
    // @trace MON-02
    port inventory_snapshot : DataPort { in :>> type : Dispatch_Inventory_Snapshot; }
    // @trace MON-03
    port dock_snapshot : DataPort { in :>> type : Dock_Snapshot; }
    // @trace MON-04
    port execution_outcome : DataPort { in :>> type : Execution_Outcome; }
    // @trace CTRL-01
    port shipment_instruction : DataPort { out :>> type : Shipment_Instruction; }
    // @trace CTRL-02
    port shipping_confirmation : DataPort { out :>> type : Shipping_Confirmation; }
    // @trace CTRL-03
    port dispatch_status : DataPort { out :>> type : Dispatch_Status; }

    // @generated-support SUPPORT-02
    connection support_request : PortConnection connect request to dispatch_coordinator_process.request;
    // @generated-support SUPPORT-02
    connection support_inventory : PortConnection connect inventory_snapshot to dispatch_coordinator_process.inventory_snapshot;
    // @generated-support SUPPORT-02
    connection support_dock : PortConnection connect dock_snapshot to dispatch_coordinator_process.dock_snapshot;
    // @generated-support SUPPORT-02
    connection support_outcome : PortConnection connect execution_outcome to dispatch_coordinator_process.execution_outcome;
    // @generated-support SUPPORT-02
    connection support_instruction : PortConnection connect dispatch_coordinator_process.shipment_instruction to shipment_instruction;
    // @generated-support SUPPORT-02
    connection support_confirmation : PortConnection connect dispatch_coordinator_process.shipping_confirmation to shipping_confirmation;
    // @generated-support SUPPORT-02
    connection support_status : PortConnection connect dispatch_coordinator_process.dispatch_status to dispatch_status;
  }

  // @trace BOUND-01
  part finished_product_dispatch_coordinator : Finished_Product_Dispatch_Coordinator_System;
}

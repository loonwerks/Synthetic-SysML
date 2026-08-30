package EIT_Image_Availability_Coordinator {

  private import HAMR::*;

  // @trace MON-01
  enum def Acquisition_Token {
    enum NoAcquisition;
    enum AcquisitionA;
    enum AcquisitionB;
  }

  // @trace MON-02
  enum def Review_Intent {
    enum NoIntent;
    enum RequestImage;
    enum ReleaseImage;
  }

  // @trace MON-03
  enum def Generation_Result {
    enum NoResult;
    enum GenerationFailed;
    enum ImageA;
    enum ImageB;
  }

  // @trace MON-01
  enum def Input_Status {
    enum Valid;
    enum Invalid;
  }

  // @trace CTRL-01
  enum def Generation_Directive {
    enum HoldGeneration;
    enum GenerateFromA;
    enum GenerateFromB;
  }

  // @trace CTRL-02
  enum def Image_Delivery {
    enum Withheld;
    enum DeliverImageA;
    enum DeliverImageB;
  }

  // @trace CTRL-03
  enum def Availability_Status {
    enum NoImageAvailable;
    enum GenerationPending;
    enum ImageAvailable;
    enum UpstreamAcquisitionRequired;
    enum GenerationFailedStatus;
    enum InputFault;
    enum RecoveryPending;
  }

  // @trace TYPE-01
  enum def Qualified_Acquisition {
    enum InvalidAcquisition;
    enum NoAdmittedAcquisition;
    enum AdmittedA;
    enum AdmittedB;
  }

  // @trace TYPE-01
  enum def Qualified_Intent {
    enum InvalidIntent;
    enum NeutralIntent;
    enum FreshImageRequest;
    enum ReleaseIntent;
  }

  // @trace TYPE-01
  enum def Qualified_Generation_Result {
    enum InvalidGenerationResult;
    enum PendingResult;
    enum FailedResult;
    enum ReadyResultA;
    enum ReadyResultB;
  }

  // @trace STATE-01
  enum def Image_State {
    enum Empty;
    enum RequestedA;
    enum RequestedB;
    enum ReadyA;
    enum ReadyB;
  }

  // @trace STATE-01
  enum def Recovery_Phase {
    enum Normal;
    enum AwaitNeutral;
    enum AwaitFreshIntent;
  }

  // @trace TYPE-02
  enum def Resolution_Disposition {
    enum InputFaultDisposition;
    enum RecoveryDisposition;
    enum ReleasedDisposition;
    enum GenerationStarted;
    enum GenerationWaiting;
    enum GenerationCompleted;
    enum AcquisitionRequired;
    enum GenerationFailure;
    enum ExistingImageRetained;
    enum AvailableRetained;
    enum IdleDisposition;
  }

  // Every record field later inspected by GUMBO is an attribute member.
  // @trace MON-01
  part def Acquisition_Sample :> Data {
    // @trace MON-01
    attribute token : Acquisition_Token;
    // @trace MON-01
    attribute status : Input_Status;
  }

  // @trace MON-02
  part def Review_Intent_Sample :> Data {
    // @trace MON-02
    attribute intent : Review_Intent;
    // @trace MON-02
    attribute status : Input_Status;
  }

  // @trace MON-03
  part def Generation_Result_Sample :> Data {
    // @trace MON-03
    attribute result : Generation_Result;
    // @trace MON-03
    attribute status : Input_Status;
  }

  // @trace TYPE-02
  part def Image_Resolution :> Data {
    // @trace TYPE-02
    attribute next_image_state : Image_State;
    // @trace TYPE-02
    attribute next_recovery_phase : Recovery_Phase;
    // @trace TYPE-02
    attribute disposition : Resolution_Disposition;
  }

  // @trace PART-01
  part def Upstream_Acquisition_Qualification :> Thread {
    // @trace INT-01
    port acquisition_sample : DataPort { in :>> type : Acquisition_Sample; }
    // @trace INT-04
    port qualified_acquisition : DataPort { out :>> type : Qualified_Acquisition; }

    language "GUMBO" /*{
      functions
        // @trace QUAL-ACQ-01
        def qualify_acquisition(value: Acquisition_Sample): Qualified_Acquisition :=
          if (value.status == Input_Status.Invalid)? Qualified_Acquisition.InvalidAcquisition
          else if (value.token == Acquisition_Token.NoAcquisition)? Qualified_Acquisition.NoAdmittedAcquisition
          else if (value.token == Acquisition_Token.AcquisitionA)? Qualified_Acquisition.AdmittedA
          else Qualified_Acquisition.AdmittedB;

      initialize
        // @trace INIT-01
        guarantee INITIAL_ACQUISITION_QUALIFICATION_SAFE "Acquisition qualification initializes invalid until a sample is evaluated":
          qualified_acquisition == Qualified_Acquisition.InvalidAcquisition;

      compute
        // @trace QUAL-ACQ-01
        guarantee ACQUISITION_QUALIFICATION_TOTAL "Both sample fields determine the total status-sensitive acquisition classification":
          qualified_acquisition == qualify_acquisition(acquisition_sample);
    }*/
  }

  // @trace PART-02
  part def Doctor_Intent_Qualification :> Thread {
    // @trace INT-02
    port review_intent_sample : DataPort { in :>> type : Review_Intent_Sample; }
    // @trace INT-05
    port qualified_intent : DataPort { out :>> type : Qualified_Intent; }

    language "GUMBO" /*{
      functions
        // @trace QUAL-INTENT-01
        def qualify_intent(value: Review_Intent_Sample): Qualified_Intent :=
          if (value.status == Input_Status.Invalid)? Qualified_Intent.InvalidIntent
          else if (value.intent == Review_Intent.NoIntent)? Qualified_Intent.NeutralIntent
          else if (value.intent == Review_Intent.RequestImage)? Qualified_Intent.FreshImageRequest
          else Qualified_Intent.ReleaseIntent;

      initialize
        // @trace INIT-01
        guarantee INITIAL_INTENT_QUALIFICATION_SAFE "Intent qualification initializes invalid until a sample is evaluated":
          qualified_intent == Qualified_Intent.InvalidIntent;

      compute
        // @trace QUAL-INTENT-01
        guarantee INTENT_QUALIFICATION_TOTAL "Both sample fields determine the total status-sensitive intent classification":
          qualified_intent == qualify_intent(review_intent_sample);
    }*/
  }

  // @trace PART-03
  part def Generation_Result_Qualification :> Thread {
    // @trace INT-03
    port generation_result_sample : DataPort { in :>> type : Generation_Result_Sample; }
    // @trace INT-06
    port qualified_generation_result : DataPort { out :>> type : Qualified_Generation_Result; }

    language "GUMBO" /*{
      functions
        // @trace QUAL-RESULT-01
        def qualify_result(value: Generation_Result_Sample): Qualified_Generation_Result :=
          if (value.status == Input_Status.Invalid)? Qualified_Generation_Result.InvalidGenerationResult
          else if (value.result == Generation_Result.NoResult)? Qualified_Generation_Result.PendingResult
          else if (value.result == Generation_Result.GenerationFailed)? Qualified_Generation_Result.FailedResult
          else if (value.result == Generation_Result.ImageA)? Qualified_Generation_Result.ReadyResultA
          else Qualified_Generation_Result.ReadyResultB;

      initialize
        // @trace INIT-01
        guarantee INITIAL_RESULT_QUALIFICATION_SAFE "Generation-result qualification initializes invalid until a sample is evaluated":
          qualified_generation_result == Qualified_Generation_Result.InvalidGenerationResult;

      compute
        // @trace QUAL-RESULT-01
        guarantee RESULT_QUALIFICATION_TOTAL "Both sample fields determine the total status-sensitive generation-result classification":
          qualified_generation_result == qualify_result(generation_result_sample);
    }*/
  }

  // @trace PART-04
  part def Image_Availability_Governor :> Thread {
    // @trace INT-04
    port qualified_acquisition : DataPort { in :>> type : Qualified_Acquisition; }
    // @trace INT-05
    port qualified_intent : DataPort { in :>> type : Qualified_Intent; }
    // @trace INT-06
    port qualified_generation_result : DataPort { in :>> type : Qualified_Generation_Result; }
    // @trace INT-07
    port generation_resolution : DataPort { out :>> type : Image_Resolution; }
    // @trace INT-10
    port publication_resolution : DataPort { out :>> type : Image_Resolution; }

    language "GUMBO" /*{
      // @trace OWNER-01
      state
        // @trace STATE-01
        image_state: Image_State;
        // @trace STATE-01
        recovery_phase: Recovery_Phase;

      functions
        // @trace MATCH-01
        def is_requested(value: Image_State): Base_Types::Boolean :=
          value == Image_State.RequestedA | value == Image_State.RequestedB;

        // @trace MATCH-01
        def matching_ready(state_pre: Image_State, result: Qualified_Generation_Result): Base_Types::Boolean :=
          (state_pre == Image_State.RequestedA & result == Qualified_Generation_Result.ReadyResultA) |
          (state_pre == Image_State.RequestedB & result == Qualified_Generation_Result.ReadyResultB);

        // @trace MATCH-01
        def expected_nonpending(state_pre: Image_State, result: Qualified_Generation_Result): Base_Types::Boolean :=
          (is_requested(state_pre) & result == Qualified_Generation_Result.FailedResult) |
          matching_ready(state_pre, result);

        // @trace MATCH-01
        def unexpected_valid_result(state_pre: Image_State, result: Qualified_Generation_Result): Base_Types::Boolean :=
          (result == Qualified_Generation_Result.FailedResult |
           result == Qualified_Generation_Result.ReadyResultA |
           result == Qualified_Generation_Result.ReadyResultB) &
          not expected_nonpending(state_pre, result);

        // @trace CASE-01
        def case_01_guard(acquisition: Qualified_Acquisition,
                          intent: Qualified_Intent,
                          result: Qualified_Generation_Result,
                          state_pre: Image_State): Base_Types::Boolean :=
          acquisition == Qualified_Acquisition.InvalidAcquisition |
          intent == Qualified_Intent.InvalidIntent |
          result == Qualified_Generation_Result.InvalidGenerationResult |
          unexpected_valid_result(state_pre, result);

        // @trace CASE-02
        def case_02_guard(acquisition: Qualified_Acquisition, intent: Qualified_Intent,
                          result: Qualified_Generation_Result, state_pre: Image_State,
                          phase_pre: Recovery_Phase): Base_Types::Boolean :=
          not case_01_guard(acquisition, intent, result, state_pre) &
          phase_pre == Recovery_Phase.AwaitNeutral & intent != Qualified_Intent.NeutralIntent;

        // @trace CASE-03
        def case_03_guard(acquisition: Qualified_Acquisition, intent: Qualified_Intent,
                          result: Qualified_Generation_Result, state_pre: Image_State,
                          phase_pre: Recovery_Phase): Base_Types::Boolean :=
          not case_01_guard(acquisition, intent, result, state_pre) &
          phase_pre == Recovery_Phase.AwaitNeutral & intent == Qualified_Intent.NeutralIntent;

        // @trace CASE-04
        def case_04_guard(acquisition: Qualified_Acquisition, intent: Qualified_Intent,
                          result: Qualified_Generation_Result, state_pre: Image_State,
                          phase_pre: Recovery_Phase): Base_Types::Boolean :=
          not case_01_guard(acquisition, intent, result, state_pre) &
          phase_pre == Recovery_Phase.AwaitFreshIntent & intent == Qualified_Intent.NeutralIntent;

        // @trace CASE-05
        def case_05_guard(acquisition: Qualified_Acquisition, intent: Qualified_Intent,
                          result: Qualified_Generation_Result, state_pre: Image_State,
                          phase_pre: Recovery_Phase): Base_Types::Boolean :=
          not case_01_guard(acquisition, intent, result, state_pre) &
          phase_pre == Recovery_Phase.AwaitFreshIntent & intent == Qualified_Intent.ReleaseIntent;

        // @trace CASE-06
        def case_06_guard(acquisition: Qualified_Acquisition, intent: Qualified_Intent,
                          result: Qualified_Generation_Result, state_pre: Image_State,
                          phase_pre: Recovery_Phase): Base_Types::Boolean :=
          not case_01_guard(acquisition, intent, result, state_pre) &
          phase_pre == Recovery_Phase.AwaitFreshIntent & intent == Qualified_Intent.FreshImageRequest;

        // @trace CASE-07
        def case_07_guard(acquisition: Qualified_Acquisition, intent: Qualified_Intent,
                          result: Qualified_Generation_Result, state_pre: Image_State,
                          phase_pre: Recovery_Phase): Base_Types::Boolean :=
          not case_01_guard(acquisition, intent, result, state_pre) &
          phase_pre == Recovery_Phase.Normal & intent == Qualified_Intent.ReleaseIntent;

        // @trace CASE-08
        def case_08_guard(acquisition: Qualified_Acquisition, intent: Qualified_Intent,
                          result: Qualified_Generation_Result, state_pre: Image_State,
                          phase_pre: Recovery_Phase): Base_Types::Boolean :=
          not case_01_guard(acquisition, intent, result, state_pre) &
          phase_pre == Recovery_Phase.Normal & intent != Qualified_Intent.ReleaseIntent &
          is_requested(state_pre) & result == Qualified_Generation_Result.FailedResult;

        // @trace CASE-09
        def case_09_guard(acquisition: Qualified_Acquisition, intent: Qualified_Intent,
                          result: Qualified_Generation_Result, state_pre: Image_State,
                          phase_pre: Recovery_Phase): Base_Types::Boolean :=
          not case_01_guard(acquisition, intent, result, state_pre) &
          phase_pre == Recovery_Phase.Normal & intent != Qualified_Intent.ReleaseIntent &
          matching_ready(state_pre, result);

        // @trace CASE-10
        def case_10_guard(acquisition: Qualified_Acquisition, intent: Qualified_Intent,
                          result: Qualified_Generation_Result, state_pre: Image_State,
                          phase_pre: Recovery_Phase): Base_Types::Boolean :=
          not case_01_guard(acquisition, intent, result, state_pre) &
          phase_pre == Recovery_Phase.Normal & intent != Qualified_Intent.ReleaseIntent &
          is_requested(state_pre) & result == Qualified_Generation_Result.PendingResult;

        // @trace CASE-11
        def case_11_guard(acquisition: Qualified_Acquisition, intent: Qualified_Intent,
                          result: Qualified_Generation_Result, state_pre: Image_State,
                          phase_pre: Recovery_Phase): Base_Types::Boolean :=
          not case_01_guard(acquisition, intent, result, state_pre) &
          phase_pre == Recovery_Phase.Normal & intent == Qualified_Intent.FreshImageRequest &
          not is_requested(state_pre) & result == Qualified_Generation_Result.PendingResult;

        // @trace CASE-12
        def case_12_guard(acquisition: Qualified_Acquisition, intent: Qualified_Intent,
                          result: Qualified_Generation_Result, state_pre: Image_State,
                          phase_pre: Recovery_Phase): Base_Types::Boolean :=
          not case_01_guard(acquisition, intent, result, state_pre) &
          phase_pre == Recovery_Phase.Normal & intent == Qualified_Intent.NeutralIntent &
          not is_requested(state_pre) & result == Qualified_Generation_Result.PendingResult;

        // @trace REQUEST-MAP-01
        def requested_state(acquisition: Qualified_Acquisition): Image_State :=
          if (acquisition == Qualified_Acquisition.AdmittedA)? Image_State.RequestedA
          else if (acquisition == Qualified_Acquisition.AdmittedB)? Image_State.RequestedB
          else Image_State.Empty;

        // @trace PRIORITY-01
        def selected_image(acquisition: Qualified_Acquisition, intent: Qualified_Intent,
                           result: Qualified_Generation_Result, state_pre: Image_State,
                           phase_pre: Recovery_Phase): Image_State :=
          if (case_01_guard(acquisition, intent, result, state_pre))? Image_State.Empty
          else if (phase_pre == Recovery_Phase.AwaitNeutral)? Image_State.Empty
          else if (phase_pre == Recovery_Phase.AwaitFreshIntent & intent == Qualified_Intent.NeutralIntent)? Image_State.Empty
          else if (phase_pre == Recovery_Phase.AwaitFreshIntent & intent == Qualified_Intent.ReleaseIntent)? Image_State.Empty
          else if (phase_pre == Recovery_Phase.AwaitFreshIntent)? requested_state(acquisition)
          else if (intent == Qualified_Intent.ReleaseIntent)? Image_State.Empty
          else if (is_requested(state_pre) & result == Qualified_Generation_Result.FailedResult)? Image_State.Empty
          else if (state_pre == Image_State.RequestedA & result == Qualified_Generation_Result.ReadyResultA)? Image_State.ReadyA
          else if (state_pre == Image_State.RequestedB & result == Qualified_Generation_Result.ReadyResultB)? Image_State.ReadyB
          else if (is_requested(state_pre))? state_pre
          else if (intent == Qualified_Intent.FreshImageRequest & acquisition == Qualified_Acquisition.AdmittedA)? Image_State.RequestedA
          else if (intent == Qualified_Intent.FreshImageRequest & acquisition == Qualified_Acquisition.AdmittedB)? Image_State.RequestedB
          else state_pre;

        // @trace PRIORITY-01
        def selected_phase(acquisition: Qualified_Acquisition, intent: Qualified_Intent,
                           result: Qualified_Generation_Result, state_pre: Image_State,
                           phase_pre: Recovery_Phase): Recovery_Phase :=
          if (case_01_guard(acquisition, intent, result, state_pre))? Recovery_Phase.AwaitNeutral
          else if (phase_pre == Recovery_Phase.AwaitNeutral & intent == Qualified_Intent.NeutralIntent)? Recovery_Phase.AwaitFreshIntent
          else if (phase_pre == Recovery_Phase.AwaitNeutral)? Recovery_Phase.AwaitNeutral
          else if (phase_pre == Recovery_Phase.AwaitFreshIntent & intent == Qualified_Intent.NeutralIntent)? Recovery_Phase.AwaitFreshIntent
          else Recovery_Phase.Normal;

        // @trace PRIORITY-01
        def selected_disposition(acquisition: Qualified_Acquisition, intent: Qualified_Intent,
                                 result: Qualified_Generation_Result, state_pre: Image_State,
                                 phase_pre: Recovery_Phase): Resolution_Disposition :=
          if (case_01_guard(acquisition, intent, result, state_pre))? Resolution_Disposition.InputFaultDisposition
          else if (phase_pre == Recovery_Phase.AwaitNeutral)? Resolution_Disposition.RecoveryDisposition
          else if (phase_pre == Recovery_Phase.AwaitFreshIntent & intent == Qualified_Intent.NeutralIntent)? Resolution_Disposition.RecoveryDisposition
          else if (phase_pre == Recovery_Phase.AwaitFreshIntent & intent == Qualified_Intent.ReleaseIntent)? Resolution_Disposition.ReleasedDisposition
          else if (phase_pre == Recovery_Phase.AwaitFreshIntent & acquisition == Qualified_Acquisition.NoAdmittedAcquisition)? Resolution_Disposition.AcquisitionRequired
          else if (phase_pre == Recovery_Phase.AwaitFreshIntent)? Resolution_Disposition.GenerationStarted
          else if (intent == Qualified_Intent.ReleaseIntent)? Resolution_Disposition.ReleasedDisposition
          else if (is_requested(state_pre) & result == Qualified_Generation_Result.FailedResult)? Resolution_Disposition.GenerationFailure
          else if (matching_ready(state_pre, result))? Resolution_Disposition.GenerationCompleted
          else if (is_requested(state_pre))? Resolution_Disposition.GenerationWaiting
          else if (intent == Qualified_Intent.FreshImageRequest & acquisition != Qualified_Acquisition.NoAdmittedAcquisition)? Resolution_Disposition.GenerationStarted
          else if (intent == Qualified_Intent.FreshImageRequest & state_pre != Image_State.Empty)? Resolution_Disposition.ExistingImageRetained
          else if (intent == Qualified_Intent.FreshImageRequest)? Resolution_Disposition.AcquisitionRequired
          else if (state_pre != Image_State.Empty)? Resolution_Disposition.AvailableRetained
          else Resolution_Disposition.IdleDisposition;

      initialize
        // @trace INIT-01
        guarantee INITIAL_GOVERNOR_SAFE "The sole owner starts empty and normal and publishes one coherent neutral resolution":
          image_state == Image_State.Empty &
          recovery_phase == Recovery_Phase.Normal &
          generation_resolution.next_image_state == Image_State.Empty &
          generation_resolution.next_recovery_phase == Recovery_Phase.Normal &
          generation_resolution.disposition == Resolution_Disposition.IdleDisposition &
          publication_resolution.next_image_state == Image_State.Empty &
          publication_resolution.next_recovery_phase == Recovery_Phase.Normal &
          publication_resolution.disposition == Resolution_Disposition.IdleDisposition;

      compute
        // @trace OUTPUT-01
        guarantee COMMITTED_RESOLUTION_COHERENCE "Both consumers receive the same complete committed resolution and post-state":
          image_state == selected_image(qualified_acquisition, qualified_intent, qualified_generation_result, In(image_state), In(recovery_phase)) &
          recovery_phase == selected_phase(qualified_acquisition, qualified_intent, qualified_generation_result, In(image_state), In(recovery_phase)) &
          generation_resolution.next_image_state == image_state &
          generation_resolution.next_recovery_phase == recovery_phase &
          generation_resolution.disposition == selected_disposition(qualified_acquisition, qualified_intent, qualified_generation_result, In(image_state), In(recovery_phase)) &
          publication_resolution.next_image_state == image_state &
          publication_resolution.next_recovery_phase == recovery_phase &
          publication_resolution.disposition == generation_resolution.disposition;

        // @trace INVAR-01
        guarantee RECOVERY_STATE_INVARIANT "Every nonnormal post-state has no retained image":
          recovery_phase == Recovery_Phase.Normal | image_state == Image_State.Empty;

        compute_cases
          // @trace CASE-01
          case CASE_01_INVALID_OR_UNEXPECTED "Invalid qualification or unexpected valid result clears availability and enters neutral recovery":
            assume case_01_guard(qualified_acquisition, qualified_intent, qualified_generation_result, In(image_state));
            guarantee image_state == Image_State.Empty & recovery_phase == Recovery_Phase.AwaitNeutral &
                      generation_resolution.disposition == Resolution_Disposition.InputFaultDisposition;

          // @trace CASE-02
          case CASE_02_RETAINED_NONNEUTRAL_RECOVERY "A retained nonneutral intent remains blocked while neutral recovery is awaited":
            assume case_02_guard(qualified_acquisition, qualified_intent, qualified_generation_result, In(image_state), In(recovery_phase));
            guarantee image_state == Image_State.Empty & recovery_phase == Recovery_Phase.AwaitNeutral &
                      generation_resolution.disposition == Resolution_Disposition.RecoveryDisposition;

          // @trace CASE-03
          case CASE_03_FIRST_NEUTRAL_RECOVERY "The first neutral observation advances recovery to require a fresh intent":
            assume case_03_guard(qualified_acquisition, qualified_intent, qualified_generation_result, In(image_state), In(recovery_phase));
            guarantee image_state == Image_State.Empty & recovery_phase == Recovery_Phase.AwaitFreshIntent &
                      generation_resolution.disposition == Resolution_Disposition.RecoveryDisposition;

          // @trace CASE-04
          case CASE_04_WAIT_FOR_FRESH_INTENT "Repeated neutral evidence preserves the fresh-intent recovery gate":
            assume case_04_guard(qualified_acquisition, qualified_intent, qualified_generation_result, In(image_state), In(recovery_phase));
            guarantee image_state == Image_State.Empty & recovery_phase == Recovery_Phase.AwaitFreshIntent &
                      generation_resolution.disposition == Resolution_Disposition.RecoveryDisposition;

          // @trace CASE-05
          case CASE_05_FRESH_RELEASE "A fresh release completes recovery without generation":
            assume case_05_guard(qualified_acquisition, qualified_intent, qualified_generation_result, In(image_state), In(recovery_phase));
            guarantee image_state == Image_State.Empty & recovery_phase == Recovery_Phase.Normal &
                      generation_resolution.disposition == Resolution_Disposition.ReleasedDisposition;

          // @trace CASE-06
          case CASE_06_FRESH_RECOVERY_REQUEST "A fresh post-neutral request either starts its admitted target or reports acquisition required":
            assume case_06_guard(qualified_acquisition, qualified_intent, qualified_generation_result, In(image_state), In(recovery_phase));
            guarantee image_state == requested_state(qualified_acquisition) & recovery_phase == Recovery_Phase.Normal &
                      generation_resolution.disposition ==
                        (if (qualified_acquisition == Qualified_Acquisition.NoAdmittedAcquisition)? Resolution_Disposition.AcquisitionRequired
                         else Resolution_Disposition.GenerationStarted);

          // @trace CASE-07
          case CASE_07_NORMAL_RELEASE "A valid release clears normal availability before lower-priority valid evidence is applied":
            assume case_07_guard(qualified_acquisition, qualified_intent, qualified_generation_result, In(image_state), In(recovery_phase));
            guarantee image_state == Image_State.Empty & recovery_phase == Recovery_Phase.Normal &
                      generation_resolution.disposition == Resolution_Disposition.ReleasedDisposition;

          // @trace CASE-08
          case CASE_08_EXPECTED_GENERATION_FAILURE "A valid expected generation failure clears the request without fault recovery":
            assume case_08_guard(qualified_acquisition, qualified_intent, qualified_generation_result, In(image_state), In(recovery_phase));
            guarantee image_state == Image_State.Empty & recovery_phase == Recovery_Phase.Normal &
                      generation_resolution.disposition == Resolution_Disposition.GenerationFailure;

          // @trace CASE-09
          case CASE_09_MATCHING_COMPLETION "A matching result commits only the corresponding ready image token":
            assume case_09_guard(qualified_acquisition, qualified_intent, qualified_generation_result, In(image_state), In(recovery_phase));
            guarantee image_state ==
                        (if (In(image_state) == Image_State.RequestedA)? Image_State.ReadyA else Image_State.ReadyB) &
                      recovery_phase == Recovery_Phase.Normal &
                      generation_resolution.disposition == Resolution_Disposition.GenerationCompleted;

          // @trace CASE-10
          case CASE_10_GENERATION_WAITING "Pending evidence retains the outstanding target despite another request":
            assume case_10_guard(qualified_acquisition, qualified_intent, qualified_generation_result, In(image_state), In(recovery_phase));
            guarantee image_state == In(image_state) & recovery_phase == Recovery_Phase.Normal &
                      generation_resolution.disposition == Resolution_Disposition.GenerationWaiting;

          // @trace CASE-11
          case CASE_11_NORMAL_FRESH_REQUEST "A normal fresh request starts an admitted target or retains the exact no-acquisition boundary result":
            assume case_11_guard(qualified_acquisition, qualified_intent, qualified_generation_result, In(image_state), In(recovery_phase));
            guarantee image_state ==
                        (if (qualified_acquisition == Qualified_Acquisition.AdmittedA)? Image_State.RequestedA
                         else if (qualified_acquisition == Qualified_Acquisition.AdmittedB)? Image_State.RequestedB
                         else In(image_state)) &
                      recovery_phase == Recovery_Phase.Normal &
                      generation_resolution.disposition ==
                        (if (qualified_acquisition == Qualified_Acquisition.AdmittedA |
                             qualified_acquisition == Qualified_Acquisition.AdmittedB)? Resolution_Disposition.GenerationStarted
                         else if (In(image_state) == Image_State.Empty)? Resolution_Disposition.AcquisitionRequired
                         else Resolution_Disposition.ExistingImageRetained);

          // @trace CASE-12
          case CASE_12_NEUTRAL_RETENTION "The remaining neutral normal partition retains empty or ready availability":
            assume case_12_guard(qualified_acquisition, qualified_intent, qualified_generation_result, In(image_state), In(recovery_phase));
            guarantee image_state == In(image_state) & recovery_phase == Recovery_Phase.Normal &
                      generation_resolution.disposition ==
                        (if (In(image_state) == Image_State.Empty)? Resolution_Disposition.IdleDisposition
                         else Resolution_Disposition.AvailableRetained);
    }*/
  }

  // @trace PART-05
  part def Generation_Directive_Derivation :> Thread {
    // @trace INT-07
    port image_resolution : DataPort { in :>> type : Image_Resolution; }
    // @trace INT-08
    port qualified_acquisition : DataPort { in :>> type : Qualified_Acquisition; }
    // @trace INT-09
    port generation_directive : DataPort { out :>> type : Generation_Directive; }

    language "GUMBO" /*{
      functions
        // @trace DIRECTIVE-01
        def directive_for(resolution: Image_Resolution,
                          acquisition: Qualified_Acquisition): Generation_Directive :=
          if (resolution.disposition == Resolution_Disposition.GenerationStarted &
              acquisition == Qualified_Acquisition.AdmittedA)? Generation_Directive.GenerateFromA
          else if (resolution.disposition == Resolution_Disposition.GenerationStarted &
                   acquisition == Qualified_Acquisition.AdmittedB)? Generation_Directive.GenerateFromB
          else Generation_Directive.HoldGeneration;

      initialize
        // @trace INIT-01
        guarantee INITIAL_DIRECTIVE_SAFE "Generation is held before the first committed resolution":
          generation_directive == Generation_Directive.HoldGeneration;

      compute
        // @trace DIRECTIVE-01
        guarantee DIRECTIVE_TWO_INPUT_GATE "The directive owner combines committed disposition and independently qualified target":
          generation_directive == directive_for(image_resolution, qualified_acquisition);
    }*/
  }

  // @trace PART-06
  part def Doctor_Publication :> Thread {
    // @trace INT-10
    port image_resolution : DataPort { in :>> type : Image_Resolution; }
    // @trace INT-11
    port image_delivery : DataPort { out :>> type : Image_Delivery; }
    // @trace INT-12
    port availability_status : DataPort { out :>> type : Availability_Status; }

    language "GUMBO" /*{
      functions
        // @trace PUBLICATION-01
        def delivery_for(resolution: Image_Resolution): Image_Delivery :=
          if (resolution.next_image_state == Image_State.ReadyA)? Image_Delivery.DeliverImageA
          else if (resolution.next_image_state == Image_State.ReadyB)? Image_Delivery.DeliverImageB
          else Image_Delivery.Withheld;

        // @trace PUBLICATION-01
        def status_for(resolution: Image_Resolution): Availability_Status :=
          if (resolution.disposition == Resolution_Disposition.InputFaultDisposition)? Availability_Status.InputFault
          else if (resolution.disposition == Resolution_Disposition.RecoveryDisposition)? Availability_Status.RecoveryPending
          else if (resolution.disposition == Resolution_Disposition.GenerationStarted |
                   resolution.disposition == Resolution_Disposition.GenerationWaiting)? Availability_Status.GenerationPending
          else if (resolution.disposition == Resolution_Disposition.GenerationCompleted |
                   resolution.disposition == Resolution_Disposition.ExistingImageRetained |
                   resolution.disposition == Resolution_Disposition.AvailableRetained)? Availability_Status.ImageAvailable
          else if (resolution.disposition == Resolution_Disposition.AcquisitionRequired)? Availability_Status.UpstreamAcquisitionRequired
          else if (resolution.disposition == Resolution_Disposition.GenerationFailure)? Availability_Status.GenerationFailedStatus
          else Availability_Status.NoImageAvailable;

      initialize
        // @trace INIT-01
        guarantee INITIAL_PUBLICATION_SAFE "Doctor publication initializes withheld with no image available":
          image_delivery == Image_Delivery.Withheld &
          availability_status == Availability_Status.NoImageAvailable;

      compute
        // @trace PUBLICATION-01
        guarantee PUBLICATION_JOINT_CLASSIFICATION "The publication owner jointly gates delivery and prioritizes status from the committed resolution":
          image_delivery == delivery_for(image_resolution) &
          availability_status == status_for(image_resolution);
    }*/
  }

  // @generated-support SUPPORT-01 behavior-free containment and delegation only
  part def Image_Availability_Process :> Process {
    // @trace PART-01
    part upstream_acquisition_qualification : Upstream_Acquisition_Qualification;
    // @trace PART-02
    part doctor_intent_qualification : Doctor_Intent_Qualification;
    // @trace PART-03
    part generation_result_qualification : Generation_Result_Qualification;
    // @trace PART-04
    part image_availability_governor : Image_Availability_Governor;
    // @trace PART-05
    part generation_directive_derivation : Generation_Directive_Derivation;
    // @trace PART-06
    part doctor_publication : Doctor_Publication;

    // @generated-support INT-01 inbound Process boundary port
    port acquisition_sample : DataPort { in :>> type : Acquisition_Sample; }
    // @generated-support INT-02 inbound Process boundary port
    port review_intent_sample : DataPort { in :>> type : Review_Intent_Sample; }
    // @generated-support INT-03 inbound Process boundary port
    port generation_result_sample : DataPort { in :>> type : Generation_Result_Sample; }
    // @generated-support INT-09 outbound Process boundary port
    port generation_directive : DataPort { out :>> type : Generation_Directive; }
    // @generated-support INT-11 outbound Process boundary port
    port image_delivery : DataPort { out :>> type : Image_Delivery; }
    // @generated-support INT-12 outbound Process boundary port
    port availability_status : DataPort { out :>> type : Availability_Status; }

    // @generated-support INT-01 Process-to-Thread delegation
    connection support_acquisition_to_qualification : PortConnection
      connect acquisition_sample to upstream_acquisition_qualification.acquisition_sample;
    // @generated-support INT-02 Process-to-Thread delegation
    connection support_intent_to_qualification : PortConnection
      connect review_intent_sample to doctor_intent_qualification.review_intent_sample;
    // @generated-support INT-03 Process-to-Thread delegation
    connection support_result_to_qualification : PortConnection
      connect generation_result_sample to generation_result_qualification.generation_result_sample;
    // @trace INT-04
    connection qualified_acquisition_to_governor : PortConnection
      connect upstream_acquisition_qualification.qualified_acquisition to image_availability_governor.qualified_acquisition;
    // @trace INT-05
    connection qualified_intent_to_governor : PortConnection
      connect doctor_intent_qualification.qualified_intent to image_availability_governor.qualified_intent;
    // @trace INT-06
    connection qualified_result_to_governor : PortConnection
      connect generation_result_qualification.qualified_generation_result to image_availability_governor.qualified_generation_result;
    // @trace INT-07
    connection governor_resolution_to_directive : PortConnection
      connect image_availability_governor.generation_resolution to generation_directive_derivation.image_resolution;
    // @trace INT-08
    connection acquisition_target_to_directive : PortConnection
      connect upstream_acquisition_qualification.qualified_acquisition to generation_directive_derivation.qualified_acquisition;
    // @generated-support INT-09 Thread-to-Process delegation
    connection support_directive_to_process : PortConnection
      connect generation_directive_derivation.generation_directive to generation_directive;
    // @trace INT-10
    connection governor_resolution_to_publication : PortConnection
      connect image_availability_governor.publication_resolution to doctor_publication.image_resolution;
    // @generated-support INT-11 Thread-to-Process delegation
    connection support_delivery_to_process : PortConnection
      connect doctor_publication.image_delivery to image_delivery;
    // @generated-support INT-12 Thread-to-Process delegation
    connection support_status_to_process : PortConnection
      connect doctor_publication.availability_status to availability_status;
  }

  // @trace BOUND-01
  part def EIT_Image_Availability_System :> System {
    // @generated-support SUPPORT-01 sole behavior-free Process usage
    part image_availability_process : Image_Availability_Process;

    // @trace MON-01
    port acquisition_sample : DataPort { in :>> type : Acquisition_Sample; }
    // @trace MON-02
    port review_intent_sample : DataPort { in :>> type : Review_Intent_Sample; }
    // @trace MON-03
    port generation_result_sample : DataPort { in :>> type : Generation_Result_Sample; }
    // @trace CTRL-01
    port generation_directive : DataPort { out :>> type : Generation_Directive; }
    // @trace CTRL-02
    port image_delivery : DataPort { out :>> type : Image_Delivery; }
    // @trace CTRL-03
    port availability_status : DataPort { out :>> type : Availability_Status; }

    // @generated-support INT-01 System-to-Process delegation
    connection support_boundary_acquisition : PortConnection
      connect acquisition_sample to image_availability_process.acquisition_sample;
    // @generated-support INT-02 System-to-Process delegation
    connection support_boundary_intent : PortConnection
      connect review_intent_sample to image_availability_process.review_intent_sample;
    // @generated-support INT-03 System-to-Process delegation
    connection support_boundary_result : PortConnection
      connect generation_result_sample to image_availability_process.generation_result_sample;
    // @generated-support INT-09 Process-to-System delegation
    connection support_boundary_directive : PortConnection
      connect image_availability_process.generation_directive to generation_directive;
    // @generated-support INT-11 Process-to-System delegation
    connection support_boundary_delivery : PortConnection
      connect image_availability_process.image_delivery to image_delivery;
    // @generated-support INT-12 Process-to-System delegation
    connection support_boundary_status : PortConnection
      connect image_availability_process.availability_status to availability_status;
  }

  // @trace CONSTR-02
  part eit_image_availability_coordinator : EIT_Image_Availability_System;
}

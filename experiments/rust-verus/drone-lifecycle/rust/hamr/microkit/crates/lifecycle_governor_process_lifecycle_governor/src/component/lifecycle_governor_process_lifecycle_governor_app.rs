// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::lifecycle_governor_process_lifecycle_governor_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct lifecycle_governor_process_lifecycle_governor {
  // BEGIN MARKER STATE VARS
  pub current_phase: Drone_Lifecycle_Governor::Lifecycle_Phase,
  pub recovery_required: bool,
  // END MARKER STATE VARS
}

#[verus_verify]
impl lifecycle_governor_process_lifecycle_governor {
  pub fn new() -> Self
  {
    Self {
      // BEGIN MARKER STATE VAR INIT
      current_phase: Drone_Lifecycle_Governor::Lifecycle_Phase::default(),
      recovery_required: false,
      // END MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee INITIAL_GOVERNOR_SAFE
      //   The sole state and decision owner initializes safe state and outputs explicitly
      ((((((self.current_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Off) &&
        (self.recovery_required == false)) &&
        (api.selected_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Off)) &&
        (api.commanded_phase_report == Drone_Lifecycle_Governor::Lifecycle_Phase::Off)) &&
        (api.decision_disposition.input_fault_detected == false)) &&
        (api.decision_disposition.recovery_pending == false)) &&
        (api.decision_disposition.rejection_reason == Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: lifecycle_governor_process_lifecycle_governor_Put_Api> (
    &mut self,
    api: &mut lifecycle_governor_process_lifecycle_governor_Application_Api<API>)
  {
    log_info("initialize entrypoint invoked");

    self.current_phase = Drone_Lifecycle_Governor::Lifecycle_Phase::Off;
    self.recovery_required = false;
    api.put_selected_phase(Drone_Lifecycle_Governor::Lifecycle_Phase::Off);
    api.put_commanded_phase_report(Drone_Lifecycle_Governor::Lifecycle_Phase::Off);
    api.put_decision_disposition(Drone_Lifecycle_Governor::Decision_Disposition {
      input_fault_detected: false,
      recovery_pending: false,
      rejection_reason: Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection,
    });
  }

  #[verus_spec(
    requires
      // PLACEHOLDER MARKER TIME TRIGGERED REQUIRES
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee RECOVERY_IMPLIES_OFF
      //   Every committed recovery state has commanded phase Off
      !self.recovery_required ||
        (self.current_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Off),
      // case CASE_01_INVALID_INPUT
      //   Any invalid qualified input commands Off and enters recovery
      (invalid_input(old(api).qualified_request, old(api).battery_evidence, qualify_charge(old(api).charge_sample))) ==>
        (((((((self.current_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Off) &&
           (self.recovery_required == true)) &&
           (api.selected_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Off)) &&
           (api.commanded_phase_report == Drone_Lifecycle_Governor::Lifecycle_Phase::Off)) &&
           (api.decision_disposition.input_fault_detected == true)) &&
           (api.decision_disposition.recovery_pending == true)) &&
           (api.decision_disposition.rejection_reason == Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection)),
      // case CASE_02_BLOCK_PRESENT_REQUEST
      //   A nonneutral request remains blocked while recovery is set
      ((!(invalid_input(old(api).qualified_request, old(api).battery_evidence, qualify_charge(old(api).charge_sample))) && old(self).recovery_required) &&
        (old(api).qualified_request != Drone_Lifecycle_Governor::Qualified_Request::No_Request)) ==>
        (((((((self.current_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Off) &&
           (self.recovery_required == true)) &&
           (api.selected_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Off)) &&
           (api.commanded_phase_report == Drone_Lifecycle_Governor::Lifecycle_Phase::Off)) &&
           (api.decision_disposition.input_fault_detected == false)) &&
           (api.decision_disposition.recovery_pending == true)) &&
           (api.decision_disposition.rejection_reason == Drone_Lifecycle_Governor::Rejection_Reason::Inapplicable)),
      // case CASE_03_CLEAR_ON_NEUTRAL
      //   One valid neutral request clears recovery while holding Off
      ((!(invalid_input(old(api).qualified_request, old(api).battery_evidence, qualify_charge(old(api).charge_sample))) && old(self).recovery_required) &&
        (old(api).qualified_request == Drone_Lifecycle_Governor::Qualified_Request::No_Request)) ==>
        (((((((self.current_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Off) &&
           (self.recovery_required == false)) &&
           (api.selected_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Off)) &&
           (api.commanded_phase_report == Drone_Lifecycle_Governor::Lifecycle_Phase::Off)) &&
           (api.decision_disposition.input_fault_detected == false)) &&
           (api.decision_disposition.recovery_pending == false)) &&
           (api.decision_disposition.rejection_reason == Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection)),
      // case CASE_04_GLOBAL_SWITCH_OFF
      //   Valid SwitchOff has priority over all normal transition eligibility
      ((!(invalid_input(old(api).qualified_request, old(api).battery_evidence, qualify_charge(old(api).charge_sample))) && !(old(self).recovery_required)) &&
        (old(api).qualified_request == Drone_Lifecycle_Governor::Qualified_Request::Switch_Off)) ==>
        (((((((self.current_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Off) &&
           (self.recovery_required == false)) &&
           (api.selected_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Off)) &&
           (api.commanded_phase_report == Drone_Lifecycle_Governor::Lifecycle_Phase::Off)) &&
           (api.decision_disposition.input_fault_detected == false)) &&
           (api.decision_disposition.recovery_pending == false)) &&
           (api.decision_disposition.rejection_reason == Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection)),
      // case CASE_05_SWITCH_ON
      //   SwitchOn from Off commands Standby
      ((!(invalid_input(old(api).qualified_request, old(api).battery_evidence, qualify_charge(old(api).charge_sample))) && !(old(self).recovery_required)) &&
        switch_on_enabled(old(self).current_phase, old(api).qualified_request)) ==>
        (((((((self.current_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Standby) &&
           (self.recovery_required == false)) &&
           (api.selected_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Standby)) &&
           (api.commanded_phase_report == Drone_Lifecycle_Governor::Lifecycle_Phase::Standby)) &&
           (api.decision_disposition.input_fault_detected == false)) &&
           (api.decision_disposition.recovery_pending == false)) &&
           (api.decision_disposition.rejection_reason == Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection)),
      // case CASE_06_BEGIN_CHARGE
      //   Low battery and available charger evidence enable charging from Standby
      ((!(invalid_input(old(api).qualified_request, old(api).battery_evidence, qualify_charge(old(api).charge_sample))) && !(old(self).recovery_required)) &&
        begin_charge_enabled(old(self).current_phase, old(api).qualified_request, old(api).battery_evidence, qualify_charge(old(api).charge_sample))) ==>
        (((((((self.current_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Charging) &&
           (self.recovery_required == false)) &&
           (api.selected_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Charging)) &&
           (api.commanded_phase_report == Drone_Lifecycle_Governor::Lifecycle_Phase::Charging)) &&
           (api.decision_disposition.input_fault_detected == false)) &&
           (api.decision_disposition.recovery_pending == false)) &&
           (api.decision_disposition.rejection_reason == Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection)),
      // case CASE_07_END_CHARGE
      //   EndCharge from Charging commands Standby without asserting physical completion
      ((!(invalid_input(old(api).qualified_request, old(api).battery_evidence, qualify_charge(old(api).charge_sample))) && !(old(self).recovery_required)) &&
        end_charge_enabled(old(self).current_phase, old(api).qualified_request)) ==>
        (((((((self.current_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Standby) &&
           (self.recovery_required == false)) &&
           (api.selected_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Standby)) &&
           (api.commanded_phase_report == Drone_Lifecycle_Governor::Lifecycle_Phase::Standby)) &&
           (api.decision_disposition.input_fault_detected == false)) &&
           (api.decision_disposition.recovery_pending == false)) &&
           (api.decision_disposition.rejection_reason == Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection)),
      // case CASE_08_ACTIVATE
      //   Adequate battery evidence enables Ready from Standby
      ((!(invalid_input(old(api).qualified_request, old(api).battery_evidence, qualify_charge(old(api).charge_sample))) && !(old(self).recovery_required)) &&
        activate_enabled(old(self).current_phase, old(api).qualified_request, old(api).battery_evidence)) ==>
        (((((((self.current_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Ready) &&
           (self.recovery_required == false)) &&
           (api.selected_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Ready)) &&
           (api.commanded_phase_report == Drone_Lifecycle_Governor::Lifecycle_Phase::Ready)) &&
           (api.decision_disposition.input_fault_detected == false)) &&
           (api.decision_disposition.recovery_pending == false)) &&
           (api.decision_disposition.rejection_reason == Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection)),
      // case CASE_09_BEGIN_FLIGHT
      //   Adequate battery evidence enables commanded Flying from Ready
      ((!(invalid_input(old(api).qualified_request, old(api).battery_evidence, qualify_charge(old(api).charge_sample))) && !(old(self).recovery_required)) &&
        begin_flight_enabled(old(self).current_phase, old(api).qualified_request, old(api).battery_evidence)) ==>
        (((((((self.current_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Flying) &&
           (self.recovery_required == false)) &&
           (api.selected_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Flying)) &&
           (api.commanded_phase_report == Drone_Lifecycle_Governor::Lifecycle_Phase::Flying)) &&
           (api.decision_disposition.input_fault_detected == false)) &&
           (api.decision_disposition.recovery_pending == false)) &&
           (api.decision_disposition.rejection_reason == Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection)),
      // case CASE_10_END_FLIGHT
      //   EndFlight from Flying commands Ready without asserting landing
      ((!(invalid_input(old(api).qualified_request, old(api).battery_evidence, qualify_charge(old(api).charge_sample))) && !(old(self).recovery_required)) &&
        end_flight_enabled(old(self).current_phase, old(api).qualified_request)) ==>
        (((((((self.current_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Ready) &&
           (self.recovery_required == false)) &&
           (api.selected_phase == Drone_Lifecycle_Governor::Lifecycle_Phase::Ready)) &&
           (api.commanded_phase_report == Drone_Lifecycle_Governor::Lifecycle_Phase::Ready)) &&
           (api.decision_disposition.input_fault_detected == false)) &&
           (api.decision_disposition.recovery_pending == false)) &&
           (api.decision_disposition.rejection_reason == Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection)),
      // case CASE_11_HOLD_OR_REJECT
      //   Every remaining valid nonrecovery request holds phase with its exact reason
      ((((((((!(invalid_input(old(api).qualified_request, old(api).battery_evidence, qualify_charge(old(api).charge_sample))) && !(old(self).recovery_required)) &&
        (old(api).qualified_request != Drone_Lifecycle_Governor::Qualified_Request::Switch_Off)) &&
        !(switch_on_enabled(old(self).current_phase, old(api).qualified_request))) &&
        !(begin_charge_enabled(old(self).current_phase, old(api).qualified_request, old(api).battery_evidence, qualify_charge(old(api).charge_sample)))) &&
        !(end_charge_enabled(old(self).current_phase, old(api).qualified_request))) &&
        !(activate_enabled(old(self).current_phase, old(api).qualified_request, old(api).battery_evidence))) &&
        !(begin_flight_enabled(old(self).current_phase, old(api).qualified_request, old(api).battery_evidence))) &&
        !(end_flight_enabled(old(self).current_phase, old(api).qualified_request))) ==>
        (((((((self.current_phase == old(self).current_phase) &&
           (self.recovery_required == false)) &&
           (api.selected_phase == old(self).current_phase)) &&
           (api.commanded_phase_report == old(self).current_phase)) &&
           (api.decision_disposition.input_fault_detected == false)) &&
           (api.decision_disposition.recovery_pending == false)) &&
           (api.decision_disposition.rejection_reason == hold_reason(api.qualified_request, api.battery_evidence, qualify_charge(api.charge_sample)))),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: lifecycle_governor_process_lifecycle_governor_Full_Api> (
    &mut self,
    api: &mut lifecycle_governor_process_lifecycle_governor_Application_Api<API>)
  {
    log_info("compute entrypoint invoked");

    let qualified_request = api.get_qualified_request();
    let battery_evidence = api.get_battery_evidence();
    let charge_sample = api.get_charge_sample();
    let previous_phase = self.current_phase;
    let was_recovery_required = self.recovery_required;

    let charge_context = match (charge_sample.status, charge_sample.connection_state) {
      (Drone_Lifecycle_Governor::Input_Status::Invalid, _) =>
        Drone_Lifecycle_Governor::Charge_Context::Invalid_Charge_Context,
      (Drone_Lifecycle_Governor::Input_Status::Valid,
       Drone_Lifecycle_Governor::Charge_Connection::Connected) =>
        Drone_Lifecycle_Governor::Charge_Context::Charge_Available,
      (Drone_Lifecycle_Governor::Input_Status::Valid,
       Drone_Lifecycle_Governor::Charge_Connection::Disconnected) =>
        Drone_Lifecycle_Governor::Charge_Context::Charge_Unavailable,
    };

    let (next_phase, next_recovery_required, disposition) =
      match (qualified_request, battery_evidence, charge_context) {
        (Drone_Lifecycle_Governor::Qualified_Request::Invalid_Request, _, _) |
        (_, Drone_Lifecycle_Governor::Battery_Evidence::Invalid_Battery, _) |
        (_, _, Drone_Lifecycle_Governor::Charge_Context::Invalid_Charge_Context) => (
          Drone_Lifecycle_Governor::Lifecycle_Phase::Off,
          true,
          Drone_Lifecycle_Governor::Decision_Disposition {
            input_fault_detected: true,
            recovery_pending: true,
            rejection_reason: Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection,
          },
        ),
        _ => if was_recovery_required {
          match qualified_request {
            Drone_Lifecycle_Governor::Qualified_Request::No_Request => (
              Drone_Lifecycle_Governor::Lifecycle_Phase::Off,
              false,
              Drone_Lifecycle_Governor::Decision_Disposition {
                input_fault_detected: false,
                recovery_pending: false,
                rejection_reason: Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection,
              },
            ),
            _ => (
              Drone_Lifecycle_Governor::Lifecycle_Phase::Off,
              true,
              Drone_Lifecycle_Governor::Decision_Disposition {
                input_fault_detected: false,
                recovery_pending: true,
                rejection_reason: Drone_Lifecycle_Governor::Rejection_Reason::Inapplicable,
              },
            ),
          }
        } else {
          match qualified_request {
            Drone_Lifecycle_Governor::Qualified_Request::Switch_Off => (
              Drone_Lifecycle_Governor::Lifecycle_Phase::Off,
              false,
              Drone_Lifecycle_Governor::Decision_Disposition {
                input_fault_detected: false,
                recovery_pending: false,
                rejection_reason: Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection,
              },
            ),
            _ => match (previous_phase, qualified_request, battery_evidence, charge_context) {
              (Drone_Lifecycle_Governor::Lifecycle_Phase::Off,
               Drone_Lifecycle_Governor::Qualified_Request::Switch_On, _, _) => (
                Drone_Lifecycle_Governor::Lifecycle_Phase::Standby,
                false,
                Drone_Lifecycle_Governor::Decision_Disposition {
                  input_fault_detected: false,
                  recovery_pending: false,
                  rejection_reason: Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection,
                },
              ),
              (Drone_Lifecycle_Governor::Lifecycle_Phase::Standby,
               Drone_Lifecycle_Governor::Qualified_Request::Begin_Charge,
               Drone_Lifecycle_Governor::Battery_Evidence::Low_Battery,
               Drone_Lifecycle_Governor::Charge_Context::Charge_Available) => (
                Drone_Lifecycle_Governor::Lifecycle_Phase::Charging,
                false,
                Drone_Lifecycle_Governor::Decision_Disposition {
                  input_fault_detected: false,
                  recovery_pending: false,
                  rejection_reason: Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection,
                },
              ),
              (Drone_Lifecycle_Governor::Lifecycle_Phase::Charging,
               Drone_Lifecycle_Governor::Qualified_Request::End_Charge, _, _) => (
                Drone_Lifecycle_Governor::Lifecycle_Phase::Standby,
                false,
                Drone_Lifecycle_Governor::Decision_Disposition {
                  input_fault_detected: false,
                  recovery_pending: false,
                  rejection_reason: Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection,
                },
              ),
              (Drone_Lifecycle_Governor::Lifecycle_Phase::Standby,
               Drone_Lifecycle_Governor::Qualified_Request::Activate,
               Drone_Lifecycle_Governor::Battery_Evidence::Adequate_Battery, _) => (
                Drone_Lifecycle_Governor::Lifecycle_Phase::Ready,
                false,
                Drone_Lifecycle_Governor::Decision_Disposition {
                  input_fault_detected: false,
                  recovery_pending: false,
                  rejection_reason: Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection,
                },
              ),
              (Drone_Lifecycle_Governor::Lifecycle_Phase::Ready,
               Drone_Lifecycle_Governor::Qualified_Request::Begin_Flight,
               Drone_Lifecycle_Governor::Battery_Evidence::Adequate_Battery, _) => (
                Drone_Lifecycle_Governor::Lifecycle_Phase::Flying,
                false,
                Drone_Lifecycle_Governor::Decision_Disposition {
                  input_fault_detected: false,
                  recovery_pending: false,
                  rejection_reason: Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection,
                },
              ),
              (Drone_Lifecycle_Governor::Lifecycle_Phase::Flying,
               Drone_Lifecycle_Governor::Qualified_Request::End_Flight, _, _) => (
                Drone_Lifecycle_Governor::Lifecycle_Phase::Ready,
                false,
                Drone_Lifecycle_Governor::Decision_Disposition {
                  input_fault_detected: false,
                  recovery_pending: false,
                  rejection_reason: Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection,
                },
              ),
              _ => {
                let rejection_reason = match qualified_request {
                  Drone_Lifecycle_Governor::Qualified_Request::No_Request =>
                    Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection,
                  Drone_Lifecycle_Governor::Qualified_Request::Begin_Charge => match charge_context {
                    Drone_Lifecycle_Governor::Charge_Context::Charge_Unavailable =>
                      Drone_Lifecycle_Governor::Rejection_Reason::Charger_Unavailable,
                    _ => Drone_Lifecycle_Governor::Rejection_Reason::Inapplicable,
                  },
                  Drone_Lifecycle_Governor::Qualified_Request::Activate |
                  Drone_Lifecycle_Governor::Qualified_Request::Begin_Flight => match battery_evidence {
                    Drone_Lifecycle_Governor::Battery_Evidence::Low_Battery =>
                      Drone_Lifecycle_Governor::Rejection_Reason::Battery_Insufficient,
                    _ => Drone_Lifecycle_Governor::Rejection_Reason::Inapplicable,
                  },
                  _ => Drone_Lifecycle_Governor::Rejection_Reason::Inapplicable,
                };
                (
                  previous_phase,
                  false,
                  Drone_Lifecycle_Governor::Decision_Disposition {
                    input_fault_detected: false,
                    recovery_pending: false,
                    rejection_reason,
                  },
                )
              },
            },
          }
        },
      };

    self.current_phase = next_phase;
    self.recovery_required = next_recovery_required;
    api.put_selected_phase(next_phase);
    api.put_commanded_phase_report(next_phase);
    api.put_decision_disposition(disposition);
  }

  pub fn notify(
    &mut self,
    channel: microkit_channel)
  {
    // this method is called when the monitor does not handle the passed in channel
    match channel {
      _ => {
        log_warn_channel(channel)
      }
    }
  }
}

#[verus_verify(external_body)]
pub fn log_info(msg: &str)
{
  log::info!("{0}", msg);
}

#[verus_verify(external_body)]
pub fn log_warn_channel(channel: u32)
{
  log::warn!("Unexpected channel: {0}", channel);
}

verus! {

  // BEGIN MARKER GUMBO METHODS
  pub open spec fn qualify_charge(value: Drone_Lifecycle_Governor::Charge_Connection_Sample) -> Drone_Lifecycle_Governor::Charge_Context
  {
    if (value.status == Drone_Lifecycle_Governor::Input_Status::Invalid) {
      Drone_Lifecycle_Governor::Charge_Context::Invalid_Charge_Context
    } else {
      if (value.connection_state == Drone_Lifecycle_Governor::Charge_Connection::Connected) {
        Drone_Lifecycle_Governor::Charge_Context::Charge_Available
      } else {
        Drone_Lifecycle_Governor::Charge_Context::Charge_Unavailable
      }
    }
  }

  pub open spec fn invalid_input(
    q: Drone_Lifecycle_Governor::Qualified_Request,
    b: Drone_Lifecycle_Governor::Battery_Evidence,
    c: Drone_Lifecycle_Governor::Charge_Context) -> bool
  {
    ((q == Drone_Lifecycle_Governor::Qualified_Request::Invalid_Request) ||
      (b == Drone_Lifecycle_Governor::Battery_Evidence::Invalid_Battery)) ||
      (c == Drone_Lifecycle_Governor::Charge_Context::Invalid_Charge_Context)
  }

  pub open spec fn switch_on_enabled(
    p: Drone_Lifecycle_Governor::Lifecycle_Phase,
    q: Drone_Lifecycle_Governor::Qualified_Request) -> bool
  {
    (p == Drone_Lifecycle_Governor::Lifecycle_Phase::Off) &&
      (q == Drone_Lifecycle_Governor::Qualified_Request::Switch_On)
  }

  pub open spec fn begin_charge_enabled(
    p: Drone_Lifecycle_Governor::Lifecycle_Phase,
    q: Drone_Lifecycle_Governor::Qualified_Request,
    b: Drone_Lifecycle_Governor::Battery_Evidence,
    c: Drone_Lifecycle_Governor::Charge_Context) -> bool
  {
    (((p == Drone_Lifecycle_Governor::Lifecycle_Phase::Standby) &&
      (q == Drone_Lifecycle_Governor::Qualified_Request::Begin_Charge)) &&
      (b == Drone_Lifecycle_Governor::Battery_Evidence::Low_Battery)) &&
      (c == Drone_Lifecycle_Governor::Charge_Context::Charge_Available)
  }

  pub open spec fn end_charge_enabled(
    p: Drone_Lifecycle_Governor::Lifecycle_Phase,
    q: Drone_Lifecycle_Governor::Qualified_Request) -> bool
  {
    (p == Drone_Lifecycle_Governor::Lifecycle_Phase::Charging) &&
      (q == Drone_Lifecycle_Governor::Qualified_Request::End_Charge)
  }

  pub open spec fn activate_enabled(
    p: Drone_Lifecycle_Governor::Lifecycle_Phase,
    q: Drone_Lifecycle_Governor::Qualified_Request,
    b: Drone_Lifecycle_Governor::Battery_Evidence) -> bool
  {
    ((p == Drone_Lifecycle_Governor::Lifecycle_Phase::Standby) &&
      (q == Drone_Lifecycle_Governor::Qualified_Request::Activate)) &&
      (b == Drone_Lifecycle_Governor::Battery_Evidence::Adequate_Battery)
  }

  pub open spec fn begin_flight_enabled(
    p: Drone_Lifecycle_Governor::Lifecycle_Phase,
    q: Drone_Lifecycle_Governor::Qualified_Request,
    b: Drone_Lifecycle_Governor::Battery_Evidence) -> bool
  {
    ((p == Drone_Lifecycle_Governor::Lifecycle_Phase::Ready) &&
      (q == Drone_Lifecycle_Governor::Qualified_Request::Begin_Flight)) &&
      (b == Drone_Lifecycle_Governor::Battery_Evidence::Adequate_Battery)
  }

  pub open spec fn end_flight_enabled(
    p: Drone_Lifecycle_Governor::Lifecycle_Phase,
    q: Drone_Lifecycle_Governor::Qualified_Request) -> bool
  {
    (p == Drone_Lifecycle_Governor::Lifecycle_Phase::Flying) &&
      (q == Drone_Lifecycle_Governor::Qualified_Request::End_Flight)
  }

  pub open spec fn hold_reason(
    q: Drone_Lifecycle_Governor::Qualified_Request,
    b: Drone_Lifecycle_Governor::Battery_Evidence,
    c: Drone_Lifecycle_Governor::Charge_Context) -> Drone_Lifecycle_Governor::Rejection_Reason
  {
    if (q == Drone_Lifecycle_Governor::Qualified_Request::No_Request) {
      Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection
    } else {
      if ((q == Drone_Lifecycle_Governor::Qualified_Request::Begin_Charge) &&
        (c == Drone_Lifecycle_Governor::Charge_Context::Charge_Unavailable)) {
        Drone_Lifecycle_Governor::Rejection_Reason::Charger_Unavailable
      } else {
        if (((q == Drone_Lifecycle_Governor::Qualified_Request::Activate) ||
          (q == Drone_Lifecycle_Governor::Qualified_Request::Begin_Flight)) &&
          (b == Drone_Lifecycle_Governor::Battery_Evidence::Low_Battery)) {
          Drone_Lifecycle_Governor::Rejection_Reason::Battery_Insufficient
        } else {
          Drone_Lifecycle_Governor::Rejection_Reason::Inapplicable
        }
      }
    }
  }
  // END MARKER GUMBO METHODS

}

#include "battery_evidence_assessment_process_battery_evidence_assessment.h"

// This file will not be overwritten if HAMR codegen is rerun

void battery_evidence_assessment_process_battery_evidence_assessment_initialize(void) {
  printf("%s: battery_evidence_assessment_process_battery_evidence_assessment_initialize invoked\n", microkit_name);
}

void battery_evidence_assessment_process_battery_evidence_assessment_timeTriggered(void) {
  printf("%s: battery_evidence_assessment_process_battery_evidence_assessment_timeTriggered invoked\n", microkit_name);
}

void battery_evidence_assessment_process_battery_evidence_assessment_notify(microkit_channel channel) {
  // this method is called when the monitor does not handle the passed in channel
  switch (channel) {
    default:
      printf("%s: Unexpected channel %d\n", microkit_name, channel);
  }
}

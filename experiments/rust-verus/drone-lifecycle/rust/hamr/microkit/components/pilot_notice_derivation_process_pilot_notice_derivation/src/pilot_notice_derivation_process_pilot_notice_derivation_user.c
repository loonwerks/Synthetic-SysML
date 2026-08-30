#include "pilot_notice_derivation_process_pilot_notice_derivation.h"

// This file will not be overwritten if HAMR codegen is rerun

void pilot_notice_derivation_process_pilot_notice_derivation_initialize(void) {
  printf("%s: pilot_notice_derivation_process_pilot_notice_derivation_initialize invoked\n", microkit_name);
}

void pilot_notice_derivation_process_pilot_notice_derivation_timeTriggered(void) {
  printf("%s: pilot_notice_derivation_process_pilot_notice_derivation_timeTriggered invoked\n", microkit_name);
}

void pilot_notice_derivation_process_pilot_notice_derivation_notify(microkit_channel channel) {
  // this method is called when the monitor does not handle the passed in channel
  switch (channel) {
    default:
      printf("%s: Unexpected channel %d\n", microkit_name, channel);
  }
}

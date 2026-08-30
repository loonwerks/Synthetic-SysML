#include "enablement_derivation_process_enablement_derivation.h"

// This file will not be overwritten if HAMR codegen is rerun

void enablement_derivation_process_enablement_derivation_initialize(void) {
  printf("%s: enablement_derivation_process_enablement_derivation_initialize invoked\n", microkit_name);
}

void enablement_derivation_process_enablement_derivation_timeTriggered(void) {
  printf("%s: enablement_derivation_process_enablement_derivation_timeTriggered invoked\n", microkit_name);
}

void enablement_derivation_process_enablement_derivation_notify(microkit_channel channel) {
  // this method is called when the monitor does not handle the passed in channel
  switch (channel) {
    default:
      printf("%s: Unexpected channel %d\n", microkit_name, channel);
  }
}

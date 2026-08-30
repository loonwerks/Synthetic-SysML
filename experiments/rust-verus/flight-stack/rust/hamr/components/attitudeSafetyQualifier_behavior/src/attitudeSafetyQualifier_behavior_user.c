#include "attitudeSafetyQualifier_behavior.h"

// This file will not be overwritten if HAMR codegen is rerun

void attitudeSafetyQualifier_behavior_initialize(void) {
  printf("%s: attitudeSafetyQualifier_behavior_initialize invoked\n", microkit_name);
}

void attitudeSafetyQualifier_behavior_timeTriggered(void) {
  printf("%s: attitudeSafetyQualifier_behavior_timeTriggered invoked\n", microkit_name);
}

void attitudeSafetyQualifier_behavior_notify(microkit_channel channel) {
  // this method is called when the monitor does not handle the passed in channel
  switch (channel) {
    default:
      printf("%s: Unexpected channel %d\n", microkit_name, channel);
  }
}

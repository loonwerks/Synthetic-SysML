#include "coordinated_outcome_behavior.h"

// This file will not be overwritten if HAMR codegen is rerun

void coordinated_outcome_behavior_initialize(void) {
  printf("%s: coordinated_outcome_behavior_initialize invoked\n", microkit_name);
}

void coordinated_outcome_behavior_timeTriggered(void) {
  printf("%s: coordinated_outcome_behavior_timeTriggered invoked\n", microkit_name);
}

void coordinated_outcome_behavior_notify(microkit_channel channel) {
  // this method is called when the monitor does not handle the passed in channel
  switch (channel) {
    default:
      printf("%s: Unexpected channel %d\n", microkit_name, channel);
  }
}

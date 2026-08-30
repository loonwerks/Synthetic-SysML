#include "referenceManager_behavior.h"

// This file will not be overwritten if HAMR codegen is rerun

void referenceManager_behavior_initialize(void) {
  printf("%s: referenceManager_behavior_initialize invoked\n", microkit_name);
}

void referenceManager_behavior_timeTriggered(void) {
  printf("%s: referenceManager_behavior_timeTriggered invoked\n", microkit_name);
}

void referenceManager_behavior_notify(microkit_channel channel) {
  // this method is called when the monitor does not handle the passed in channel
  switch (channel) {
    default:
      printf("%s: Unexpected channel %d\n", microkit_name, channel);
  }
}

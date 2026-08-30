#include "lifecycle_governor_process_lifecycle_governor.h"

// This file will not be overwritten if HAMR codegen is rerun

void lifecycle_governor_process_lifecycle_governor_initialize(void) {
  printf("%s: lifecycle_governor_process_lifecycle_governor_initialize invoked\n", microkit_name);
}

void lifecycle_governor_process_lifecycle_governor_timeTriggered(void) {
  printf("%s: lifecycle_governor_process_lifecycle_governor_timeTriggered invoked\n", microkit_name);
}

void lifecycle_governor_process_lifecycle_governor_notify(microkit_channel channel) {
  // this method is called when the monitor does not handle the passed in channel
  switch (channel) {
    default:
      printf("%s: Unexpected channel %d\n", microkit_name, channel);
  }
}

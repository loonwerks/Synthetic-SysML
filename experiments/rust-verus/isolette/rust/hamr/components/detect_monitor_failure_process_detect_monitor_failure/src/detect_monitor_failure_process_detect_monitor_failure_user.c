#include "detect_monitor_failure_process_detect_monitor_failure.h"

// This file will not be overwritten if HAMR codegen is rerun

void detect_monitor_failure_process_detect_monitor_failure_initialize(void) {
  printf("%s: detect_monitor_failure_process_detect_monitor_failure_initialize invoked\n", microkit_name);
}

void detect_monitor_failure_process_detect_monitor_failure_timeTriggered(void) {
  printf("%s: detect_monitor_failure_process_detect_monitor_failure_timeTriggered invoked\n", microkit_name);
}

void detect_monitor_failure_process_detect_monitor_failure_notify(microkit_channel channel) {
  // this method is called when the monitor does not handle the passed in channel
  switch (channel) {
    default:
      printf("%s: Unexpected channel %d\n", microkit_name, channel);
  }
}

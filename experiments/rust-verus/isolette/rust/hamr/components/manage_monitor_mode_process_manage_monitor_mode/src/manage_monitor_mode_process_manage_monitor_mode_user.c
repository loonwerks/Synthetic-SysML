#include "manage_monitor_mode_process_manage_monitor_mode.h"

// This file will not be overwritten if HAMR codegen is rerun

void manage_monitor_mode_process_manage_monitor_mode_initialize(void) {
  printf("%s: manage_monitor_mode_process_manage_monitor_mode_initialize invoked\n", microkit_name);
}

void manage_monitor_mode_process_manage_monitor_mode_timeTriggered(void) {
  printf("%s: manage_monitor_mode_process_manage_monitor_mode_timeTriggered invoked\n", microkit_name);
}

void manage_monitor_mode_process_manage_monitor_mode_notify(microkit_channel channel) {
  // this method is called when the monitor does not handle the passed in channel
  switch (channel) {
    default:
      printf("%s: Unexpected channel %d\n", microkit_name, channel);
  }
}

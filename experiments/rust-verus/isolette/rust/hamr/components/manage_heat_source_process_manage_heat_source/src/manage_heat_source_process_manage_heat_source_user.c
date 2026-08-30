#include "manage_heat_source_process_manage_heat_source.h"

// This file will not be overwritten if HAMR codegen is rerun

void manage_heat_source_process_manage_heat_source_initialize(void) {
  printf("%s: manage_heat_source_process_manage_heat_source_initialize invoked\n", microkit_name);
}

void manage_heat_source_process_manage_heat_source_timeTriggered(void) {
  printf("%s: manage_heat_source_process_manage_heat_source_timeTriggered invoked\n", microkit_name);
}

void manage_heat_source_process_manage_heat_source_notify(microkit_channel channel) {
  // this method is called when the monitor does not handle the passed in channel
  switch (channel) {
    default:
      printf("%s: Unexpected channel %d\n", microkit_name, channel);
  }
}

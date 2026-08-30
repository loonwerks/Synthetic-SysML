#include "manage_regulator_interface_process_manage_regulator_interface.h"

// This file will not be overwritten if HAMR codegen is rerun

void manage_regulator_interface_process_manage_regulator_interface_initialize(void) {
  printf("%s: manage_regulator_interface_process_manage_regulator_interface_initialize invoked\n", microkit_name);
}

void manage_regulator_interface_process_manage_regulator_interface_timeTriggered(void) {
  printf("%s: manage_regulator_interface_process_manage_regulator_interface_timeTriggered invoked\n", microkit_name);
}

void manage_regulator_interface_process_manage_regulator_interface_notify(microkit_channel channel) {
  // this method is called when the monitor does not handle the passed in channel
  switch (channel) {
    default:
      printf("%s: Unexpected channel %d\n", microkit_name, channel);
  }
}

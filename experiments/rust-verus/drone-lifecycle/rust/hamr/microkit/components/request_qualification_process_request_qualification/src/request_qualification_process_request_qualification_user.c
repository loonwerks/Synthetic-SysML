#include "request_qualification_process_request_qualification.h"

// This file will not be overwritten if HAMR codegen is rerun

void request_qualification_process_request_qualification_initialize(void) {
  printf("%s: request_qualification_process_request_qualification_initialize invoked\n", microkit_name);
}

void request_qualification_process_request_qualification_timeTriggered(void) {
  printf("%s: request_qualification_process_request_qualification_timeTriggered invoked\n", microkit_name);
}

void request_qualification_process_request_qualification_notify(microkit_channel channel) {
  // this method is called when the monitor does not handle the passed in channel
  switch (channel) {
    default:
      printf("%s: Unexpected channel %d\n", microkit_name, channel);
  }
}

import { AgentApiError } from "./http.js";

export function errorEnvelope(error: unknown): Record<string, unknown> {
  if (error instanceof AgentApiError) {
    return {
      ok: false,
      error: {
        code: error.code,
        message: error.message,
        ...(error.status === undefined ? {} : { status: error.status }),
        ...(error.suggestion === undefined ? {} : { suggestion: error.suggestion }),
        ...(error.details === undefined ? {} : { details: error.details }),
      },
    };
  }
  return {
    ok: false,
    error: {
      code: "CLI_ERROR",
      message: error instanceof Error ? error.message : String(error),
    },
  };
}

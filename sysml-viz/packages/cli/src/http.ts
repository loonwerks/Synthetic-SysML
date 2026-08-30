export interface ClientOptions {
  server: string;
}

export class AgentApiError extends Error {
  constructor(
    message: string,
    readonly code: string,
    readonly status?: number,
    readonly suggestion?: string,
    readonly details?: unknown,
  ) {
    super(message);
    this.name = "AgentApiError";
  }
}

export class ApiClient {
  readonly baseUrl: string;

  constructor(options: ClientOptions) {
    this.baseUrl = options.server.replace(/\/$/, "");
  }

  async json(path: string, init?: RequestInit): Promise<unknown> {
    let response: Response;
    try {
      response = await fetch(`${this.baseUrl}${path}`, {
        ...init,
        headers: {
          "content-type": "application/json",
          ...(init?.headers ?? {}),
        },
      });
    } catch (error) {
      throw new AgentApiError(
        `Cannot reach SysML Viz at ${this.baseUrl}: ${(error as Error).message}. Start a session with 'sysml-viz serve'.`,
        "CONNECTION_FAILED",
        undefined,
        "Start a rooted session and confirm --server points to its localhost URL.",
      );
    }
    const text = await response.text();
    let body: unknown;
    try {
      body = text ? (JSON.parse(text) as unknown) : null;
    } catch {
      throw new AgentApiError(
        `SysML Viz returned non-JSON data (${response.status}): ${text.slice(0, 300)}`,
        "INVALID_SERVER_RESPONSE",
        response.status,
      );
    }
    if (!response.ok) {
      const failure = extractError(body);
      throw new AgentApiError(
        failure?.message ?? `${response.status} ${response.statusText}`,
        failure?.code ?? "HTTP_ERROR",
        response.status,
        failure?.suggestion,
        failure?.details,
      );
    }
    return body;
  }

  async binary(path: string, init?: RequestInit): Promise<{ bytes: Uint8Array; type: string }> {
    const response = await fetch(`${this.baseUrl}${path}`, init);
    if (!response.ok) {
      const text = await response.text();
      let failure: ReturnType<typeof extractError>;
      try {
        failure = extractError(JSON.parse(text) as unknown);
      } catch {
        failure = undefined;
      }
      throw new AgentApiError(
        (failure?.message ?? text) || `${response.status} ${response.statusText}`,
        failure?.code ?? "EXPORT_FAILED",
        response.status,
        failure?.suggestion,
        failure?.details,
      );
    }
    return {
      bytes: new Uint8Array(await response.arrayBuffer()),
      type: response.headers.get("content-type") ?? "application/octet-stream",
    };
  }
}

function extractError(value: unknown):
  | { code?: string; message?: string; suggestion?: string; details?: unknown }
  | undefined {
  if (typeof value !== "object" || value === null) {
    return undefined;
  }
  const record = value as Record<string, unknown>;
  const error = record.error;
  if (typeof error === "object" && error !== null) {
    const structured = error as Record<string, unknown>;
    return {
      ...(typeof structured.code === "string" ? { code: structured.code } : {}),
      ...(typeof structured.message === "string" ? { message: structured.message } : {}),
      ...(typeof structured.suggestion === "string" ? { suggestion: structured.suggestion } : {}),
      ...(structured.details === undefined ? {} : { details: structured.details }),
    };
  }
  return typeof record.message === "string" ? { message: record.message } : undefined;
}

import { createServer, type Server } from "node:http";

import { attachWebSocket, createApi } from "./api.js";
import { SessionManager } from "./manager.js";
import { SysmlVizSession } from "./session.js";
import type { SessionOptions } from "./types.js";

export * from "./types.js";
export * from "./capabilities.js";
export { SysmlVizSession } from "./session.js";
export { SessionManager } from "./manager.js";

export interface RunningSysmlVizServer {
  root: string | null;
  workspaceRoot: string;
  libraryRoots: string[];
  host: string;
  port: number;
  url: string;
  session: SysmlVizSession;
  manager: SessionManager;
  http: Server;
  close(): Promise<void>;
  closed: Promise<void>;
}

export async function startSysmlVizServer(options: SessionOptions): Promise<RunningSysmlVizServer> {
  const manager = await SessionManager.create(options);
  const app = createApi(manager.session, manager);
  const http = createServer(app);
  const sockets = attachWebSocket(http, manager.session);
  const host = options.host ?? "127.0.0.1";
  const requestedPort = options.port ?? 4782;
  try {
    await new Promise<void>((resolve, reject) => {
      http.once("error", reject);
      http.listen(requestedPort, host, () => {
        http.off("error", reject);
        resolve();
      });
    });
  } catch (error) {
    await manager.close();
    throw error;
  }
  const address = http.address();
  const port = typeof address === "object" && address ? address.port : requestedPort;
  let closeStarted = false;
  const close = async (): Promise<void> => {
    if (closeStarted) return;
    closeStarted = true;
    await manager.close();
    for (const client of sockets.clients) {
      client.terminate();
    }
    await new Promise<void>((resolve) => sockets.close(() => resolve()));
    await new Promise<void>((resolve, reject) =>
      http.close((error) => (error ? reject(error) : resolve())),
    );
  };
  const closed = new Promise<void>((resolve) => http.once("close", resolve));
  return {
    get root() { return manager.active?.root ?? null; },
    workspaceRoot: manager.workspaceRoot,
    get libraryRoots() { return manager.active?.libraryRoots ?? []; },
    host,
    port,
    url: `http://${host}:${port}`,
    session: manager.session,
    manager,
    http,
    close,
    closed,
  };
}

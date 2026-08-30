import { spawn } from "node:child_process";
import path from "node:path";

import type { SireumDiagnostic, ValidationState } from "./types.js";

export interface SireumValidationOptions {
  executable: string;
  projectRoot: string;
  libraryRoots: readonly string[];
  files: readonly string[];
  revision: number;
  timeoutMs?: number;
  extraArgs?: string[];
}

const POSITIONED_MESSAGE = /^(.*):(\d+):(\d+):(\d+):(\d+): (info|warning|error): (.*)$/;
const UNPOSITIONED_MESSAGE = /^(info|warning|error): (.*)$/;

export function parseSireumDiagnostics(output: string): SireumDiagnostic[] {
  const diagnostics: SireumDiagnostic[] = [];
  for (const line of output.split(/\r?\n/)) {
    const positioned = POSITIONED_MESSAGE.exec(line);
    if (positioned) {
      const [, file, startLine, startColumn, endLine, endColumn, severity, message] = positioned;
      if (file && startLine && startColumn && endLine && endColumn && severity && message) {
        diagnostics.push({
          severity: severity as SireumDiagnostic["severity"],
          message,
          source: {
            file,
            line: Number(startLine),
            column: Number(startColumn),
            endLine: Number(endLine),
            endColumn: Number(endColumn),
          },
        });
      }
      continue;
    }
    const unpositioned = UNPOSITIONED_MESSAGE.exec(line);
    if (unpositioned?.[1] && unpositioned[2]) {
      diagnostics.push({
        severity: unpositioned[1] as SireumDiagnostic["severity"],
        message: unpositioned[2],
      });
    }
  }
  return diagnostics;
}

let validationQueue: Promise<void> = Promise.resolve();

export async function validateWithSireum(options: SireumValidationOptions): Promise<ValidationState> {
  const previous = validationQueue;
  let releaseQueue: (() => void) | undefined;
  validationQueue = new Promise<void>((resolve) => {
    releaseQueue = resolve;
  });
  await previous;
  try {
    return await runSireum(options);
  } finally {
    releaseQueue?.();
  }
}

async function runSireum(options: SireumValidationOptions): Promise<ValidationState> {
  if (options.files.length === 0) {
    return {
      status: "tool-error",
      revision: options.revision,
      message: "Sireum validation was not started because the explicit project manifest is empty",
    };
  }
  const args = ["hamr", "sysml", "tipe", "--parseable-messages", ...(options.extraArgs ?? [])];
  if (options.libraryRoots.length > 0) {
    args.push("--sourcepath", options.libraryRoots.join(path.delimiter));
  }
  // Project files are passed explicitly. This prevents Sireum's sourcepath
  // walker from pulling excluded files or sibling library copies into a run.
  args.push(...options.files);
  const startedAt = new Date();
  const timeoutMs = options.timeoutMs ?? 120_000;

  return await new Promise<ValidationState>((resolve) => {
    const child = spawn(options.executable, args, {
      cwd: options.projectRoot,
      shell: false,
      stdio: ["ignore", "pipe", "pipe"],
    });
    const stdout: Buffer[] = [];
    const stderr: Buffer[] = [];
    let timedOut = false;
    const timer = setTimeout(() => {
      timedOut = true;
      child.kill("SIGTERM");
    }, timeoutMs);

    child.stdout.on("data", (chunk: Buffer) => stdout.push(chunk));
    child.stderr.on("data", (chunk: Buffer) => stderr.push(chunk));
    child.on("error", (error) => {
      clearTimeout(timer);
      const completedAt = new Date();
      resolve({
        status: "tool-error",
        startedAt: startedAt.toISOString(),
        completedAt: completedAt.toISOString(),
        durationMs: completedAt.getTime() - startedAt.getTime(),
        command: [options.executable, ...args],
        exitCode: null,
        revision: options.revision,
        message: error.message,
      });
    });
    child.on("close", (exitCode) => {
      clearTimeout(timer);
      const completedAt = new Date();
      const stdoutText = Buffer.concat(stdout).toString("utf8");
      const stderrText = Buffer.concat(stderr).toString("utf8");
      const diagnostics = parseSireumDiagnostics(`${stdoutText}\n${stderrText}`);
      const hasErrors = diagnostics.some((diagnostic) => diagnostic.severity === "error");
      const hasSuccessMarker = stdoutText.split(/\r?\n/).some((line) => line.trim() === "Well-formed!");
      const status = timedOut
        ? "tool-error"
        : hasErrors
          ? "invalid"
          : hasSuccessMarker && exitCode === 0
            ? "valid"
            : "tool-error";
      resolve({
        status,
        startedAt: startedAt.toISOString(),
        completedAt: completedAt.toISOString(),
        durationMs: completedAt.getTime() - startedAt.getTime(),
        command: [options.executable, ...args],
        exitCode,
        stdout: stdoutText,
        stderr: stderrText,
        revision: options.revision,
        diagnostics,
        message: timedOut
          ? `Sireum validation exceeded ${timeoutMs} ms`
          : status === "valid"
            ? `Sireum accepted ${path.basename(options.projectRoot)}`
            : status === "invalid"
              ? `Sireum reported ${diagnostics.filter((item) => item.severity === "error").length} error(s)`
              : `Sireum did not report 'Well-formed!' (exit ${String(exitCode)})`,
      });
    });
  });
}

export function defaultSireumExecutable(explicit?: string): string {
  if (explicit) {
    return explicit;
  }
  const sireumHome = process.env.SIREUM_HOME;
  return sireumHome ? path.join(sireumHome, "bin", "sireum") : "sireum";
}

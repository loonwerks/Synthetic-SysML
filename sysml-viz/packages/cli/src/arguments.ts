export interface ParsedArguments {
  command: string[];
  options: Record<string, string | boolean | string[]>;
  positional: string[];
}

const COMMAND_WORDS = new Set([
  "serve",
  "session",
  "model",
  "element",
  "requirement",
  "view",
  "layout",
  "diagram",
  "checkpoint",
  "render",
]);

export function parseArguments(argv: readonly string[]): ParsedArguments {
  const command: string[] = [];
  const positional: string[] = [];
  const options: Record<string, string | boolean | string[]> = {};
  let index = 0;

  while (index < argv.length && !argv[index]?.startsWith("-")) {
    const word = argv[index];
    if (!word) {
      break;
    }
    // Agent commands are nested namespaces of arbitrary depth. `serve` alone
    // retains positional arguments for compatibility; all other leading words
    // form the command until the first option.
    if (command[0] !== "serve") {
      command.push(word);
    } else {
      positional.push(word);
    }
    index += 1;
  }

  for (; index < argv.length; index += 1) {
    const argument = argv[index];
    if (!argument) {
      continue;
    }
    if (argument === "--") {
      positional.push(...argv.slice(index + 1));
      break;
    }
    if (!argument.startsWith("--")) {
      positional.push(argument);
      continue;
    }
    const equals = argument.indexOf("=");
    const key = argument.slice(2, equals >= 0 ? equals : undefined);
    const inlineValue = equals >= 0 ? argument.slice(equals + 1) : undefined;
    const next = argv[index + 1];
    const value = inlineValue ?? (next && !next.startsWith("--") ? next : true);
    if (inlineValue === undefined && value !== true) {
      index += 1;
    }
    const current = options[key];
    if (current === undefined) {
      options[key] = value;
    } else if (Array.isArray(current)) {
      current.push(String(value));
    } else {
      options[key] = [String(current), String(value)];
    }
  }

  if (command.length === 0 && positional[0] && COMMAND_WORDS.has(positional[0])) {
    command.push(positional.shift() as string);
  }
  return { command, options, positional };
}

export function stringOption(
  args: ParsedArguments,
  name: string,
  fallback?: string,
): string | undefined {
  const value = args.options[name];
  if (Array.isArray(value)) {
    return value.at(-1);
  }
  return typeof value === "string" ? value : fallback;
}

export function stringOptions(args: ParsedArguments, name: string): string[] {
  const value = args.options[name];
  if (Array.isArray(value)) {
    return value;
  }
  return typeof value === "string" ? [value] : [];
}

export function positiveIntegerOption(
  args: ParsedArguments,
  name: string,
): number | undefined {
  const raw = stringOption(args, name);
  if (raw === undefined) return undefined;
  const value = Number(raw);
  if (!Number.isSafeInteger(value) || value <= 0) {
    throw new Error(`--${name} must be a positive integer, received '${raw}'`);
  }
  return value;
}

export function nonNegativeIntegerOption(
  args: ParsedArguments,
  name: string,
): number | undefined {
  const raw = stringOption(args, name);
  if (raw === undefined) return undefined;
  const value = Number(raw);
  if (!Number.isSafeInteger(value) || value < 0) {
    throw new Error(`--${name} must be a non-negative integer, received '${raw}'`);
  }
  return value;
}

export function booleanOption(args: ParsedArguments, name: string): boolean {
  const value = args.options[name];
  return value === true || value === "true" || value === "1";
}

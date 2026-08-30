import { startSysmlVizServer } from "./index.js";

function values(argv: readonly string[], name: string): string[] {
  const result: string[] = [];
  for (let index = 0; index < argv.length; index += 1) {
    if (argv[index] === `--${name}` && argv[index + 1]) {
      result.push(argv[index + 1] as string);
      index += 1;
    }
  }
  return result;
}

function value(argv: readonly string[], name: string): string | undefined {
  return values(argv, name).at(-1);
}

const argv = process.argv.slice(2);
const root = value(argv, "root");
if (!root) {
  process.stderr.write("Usage: npm run dev --workspace @sysml-viz/server -- --root PATH [--library PATH]\n");
  process.exit(1);
}

const running = await startSysmlVizServer({
  root,
  libraryRoots: values(argv, "library"),
  include: values(argv, "include"),
  exclude: values(argv, "exclude"),
  host: value(argv, "host") ?? "127.0.0.1",
  port: Number(value(argv, "port") ?? 4782),
  ...(value(argv, "sireum") === undefined ? {} : { sireum: value(argv, "sireum") as string }),
});
process.stdout.write(`SysML Viz API: ${running.url}\nRoot: ${running.root}\n`);

const stop = (): void => {
  void running.close().then(() => process.exit(0));
};
process.once("SIGINT", stop);
process.once("SIGTERM", stop);

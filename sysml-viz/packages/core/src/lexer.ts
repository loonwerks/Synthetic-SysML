import { SourceMap } from "./source.js";
import type { Diagnostic } from "./types.js";

export type TokenKind =
  | "identifier"
  | "string"
  | "symbol"
  | "line-comment"
  | "block-comment"
  | "eof";

export interface Token {
  readonly kind: TokenKind;
  readonly text: string;
  readonly value: string;
  readonly start: number;
  readonly end: number;
}

export interface LexResult {
  readonly tokens: readonly Token[];
  readonly diagnostics: readonly Diagnostic[];
}

const MULTI_SYMBOLS = [":>>", "::", ":>", ":=", "->", "<=", ">=", "==", "!="];

function isIdentifierStart(character: string): boolean {
  return /[\p{L}_$]/u.test(character);
}

function isIdentifierPart(character: string): boolean {
  return /[\p{L}\p{N}_$-]/u.test(character);
}

export function lex(source: string, file: string): LexResult {
  const map = new SourceMap(file, source);
  const tokens: Token[] = [];
  const diagnostics: Diagnostic[] = [];
  let index = 0;

  const push = (kind: TokenKind, start: number, end: number, value?: string): void => {
    const text = source.slice(start, end);
    tokens.push({ kind, text, value: value ?? text, start, end });
  };

  while (index < source.length) {
    const character = source[index] ?? "";
    if (/\s/u.test(character)) {
      index += 1;
      continue;
    }

    if (character === "/" && source[index + 1] === "/") {
      const start = index;
      index += 2;
      while (index < source.length && source[index] !== "\n") index += 1;
      push("line-comment", start, index, source.slice(start + 2, index));
      continue;
    }

    if (character === "/" && source[index + 1] === "*") {
      const start = index;
      const close = source.indexOf("*/", index + 2);
      if (close < 0) {
        push("block-comment", start, source.length, source.slice(start + 2));
        diagnostics.push({
          code: "SYSML_UNTERMINATED_BLOCK_COMMENT",
          severity: "error",
          fatal: true,
          message: "Block comment is not terminated; the current source cannot be rendered safely.",
          span: map.span(start, source.length),
          hint: "Add the missing */ delimiter.",
        });
        index = source.length;
      } else {
        index = close + 2;
        push("block-comment", start, index, source.slice(start + 2, close));
      }
      continue;
    }

    if (character === '"' || character === "'") {
      const quote = character;
      const start = index;
      index += 1;
      let value = "";
      let terminated = false;
      while (index < source.length) {
        const current = source[index] ?? "";
        if (current === "\\") {
          const next = source[index + 1];
          if (next !== undefined) {
            value += current + next;
            index += 2;
            continue;
          }
        }
        if (current === quote) {
          index += 1;
          terminated = true;
          break;
        }
        value += current;
        index += 1;
      }
      push("string", start, index, value);
      if (!terminated) {
        diagnostics.push({
          code: "SYSML_UNTERMINATED_STRING",
          severity: "error",
          fatal: true,
          message: "String literal is not terminated; the current source cannot be rendered safely.",
          span: map.span(start, index),
          hint: `Add the missing ${quote} delimiter.`,
        });
      }
      continue;
    }

    if (isIdentifierStart(character)) {
      const start = index;
      index += 1;
      while (index < source.length && isIdentifierPart(source[index] ?? "")) index += 1;
      push("identifier", start, index);
      continue;
    }

    const symbol = MULTI_SYMBOLS.find((candidate) => source.startsWith(candidate, index));
    if (symbol !== undefined) {
      push("symbol", index, index + symbol.length);
      index += symbol.length;
      continue;
    }

    push("symbol", index, index + 1);
    index += 1;
  }

  tokens.push({
    kind: "eof",
    text: "",
    value: "",
    start: source.length,
    end: source.length,
  });
  return { tokens, diagnostics };
}

export function isTrivia(token: Token): boolean {
  return token.kind === "line-comment" || token.kind === "block-comment";
}

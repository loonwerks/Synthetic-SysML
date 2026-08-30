import type { SourcePosition, SourceSpan } from "./types.js";

export class SourceMap {
  readonly #lineStarts: readonly number[];

  public constructor(
    public readonly file: string,
    public readonly text: string,
  ) {
    const starts: number[] = [0];
    for (let index = 0; index < text.length; index += 1) {
      if (text.charCodeAt(index) === 10) starts.push(index + 1);
    }
    this.#lineStarts = starts;
  }

  public position(offset: number): SourcePosition {
    const bounded = Math.max(0, Math.min(offset, this.text.length));
    let low = 0;
    let high = this.#lineStarts.length;
    while (low + 1 < high) {
      const middle = Math.floor((low + high) / 2);
      const lineStart = this.#lineStarts[middle];
      if (lineStart !== undefined && lineStart <= bounded) low = middle;
      else high = middle;
    }
    const start = this.#lineStarts[low] ?? 0;
    return { offset: bounded, line: low + 1, column: bounded - start + 1 };
  }

  public span(start: number, end: number): SourceSpan {
    return {
      file: this.file,
      start: this.position(start),
      end: this.position(end),
    };
  }
}

export function offsetSpan(
  map: SourceMap,
  containingStart: number,
  localStart: number,
  localEnd: number,
): SourceSpan {
  return map.span(containingStart + localStart, containingStart + localEnd);
}

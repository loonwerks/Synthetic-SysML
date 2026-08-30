export type CanvasInteractionMode = 'pan' | 'edit';

export const MIN_SYSTEM_ABSTRACT_WIDTH = 320;
export const DEFAULT_SYSTEM_ABSTRACT_WIDTH = 400;
export const MAX_SYSTEM_ABSTRACT_WIDTH = 720;
export const MIN_CANVAS_WIDTH = 600;
export const SYSTEM_ABSTRACT_WIDTH_KEY = 'sysml-viz.system-abstract-width.v1';
export const MINIMAP_VISIBLE_KEY = 'sysml-viz.minimap-visible.v1';

export interface StorageReader {
  getItem(key: string): string | null;
}

export function readBooleanPreference(
  storage: StorageReader | undefined,
  key: string,
  fallback: boolean,
): boolean {
  try {
    const value = storage?.getItem(key);
    if (value === 'true') return true;
    if (value === 'false') return false;
  } catch {
    // Browser storage can be disabled independently of the application.
  }
  return fallback;
}

export function readSystemAbstractWidth(storage?: StorageReader): number {
  try {
    const value = Number(storage?.getItem(SYSTEM_ABSTRACT_WIDTH_KEY));
    if (Number.isFinite(value) && value >= MIN_SYSTEM_ABSTRACT_WIDTH && value <= MAX_SYSTEM_ABSTRACT_WIDTH) {
      return value;
    }
  } catch {
    // Use the stable default when browser storage is unavailable.
  }
  return DEFAULT_SYSTEM_ABSTRACT_WIDTH;
}

export function maximumSystemAbstractWidth(workspaceWidth: number, sidebarWidth = 0): number {
  return Math.max(
    MIN_SYSTEM_ABSTRACT_WIDTH,
    Math.min(MAX_SYSTEM_ABSTRACT_WIDTH, workspaceWidth - sidebarWidth - MIN_CANVAS_WIDTH),
  );
}

export function clampSystemAbstractWidth(
  preferredWidth: number,
  workspaceWidth: number,
  sidebarWidth = 0,
): number {
  return Math.max(
    MIN_SYSTEM_ABSTRACT_WIDTH,
    Math.min(preferredWidth, maximumSystemAbstractWidth(workspaceWidth, sidebarWidth)),
  );
}

export function interactionProps(mode: CanvasInteractionMode) {
  const editing = mode === 'edit';
  return {
    editing,
    nodesDraggable: editing,
    // Empty-canvas dragging should always navigate. Edit mode changes what a
    // drag on a diagram object does; it should not take pane panning away.
    selectionOnDrag: false,
    panOnDrag: [0, 1] as number[],
  } as const;
}

export function isCanvasModeShortcut(event: Pick<KeyboardEvent, 'altKey' | 'ctrlKey' | 'key' | 'metaKey' | 'shiftKey' | 'target'>): boolean {
  if (event.altKey || event.ctrlKey || event.metaKey || event.shiftKey) return false;
  if (!['h', 'v'].includes(event.key.toLowerCase())) return false;
  return !(typeof HTMLElement !== 'undefined' && event.target instanceof HTMLElement && (
    event.target.isContentEditable ||
    event.target.matches('input, textarea, select, [role="textbox"]')
  ));
}

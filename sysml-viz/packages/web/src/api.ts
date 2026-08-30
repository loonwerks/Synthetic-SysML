import type {
  DiagramData,
  ElementDetails,
  EventMessage,
  LayoutAlignment,
  LayoutDistribution,
  ModelData,
  ModelSearchResult,
  NamedView,
  RequirementRecord,
  SessionState,
  ViewPatch,
  ViewsData,
  ProjectConfiguration,
  ProjectPreview,
  WorkspaceDirectory,
  CapabilityInventory,
  Checkpoint,
  DiagramHealth,
  LayoutTemplate,
  SystemAbstractDocument,
} from './types';

const JSON_HEADERS = { 'content-type': 'application/json' };
const CLIENT_ID_KEY = 'sysml-viz.browser-client-id.v1';

function createBrowserClientId(): string {
  if (typeof window === 'undefined') {
    return `web-node-${Date.now().toString(36)}-${Math.random().toString(36).slice(2)}`;
  }
  try {
    const existing = window.sessionStorage.getItem(CLIENT_ID_KEY);
    if (existing) return existing;
    const randomId = typeof crypto !== 'undefined' && typeof crypto.randomUUID === 'function'
      ? crypto.randomUUID()
      : `${Date.now().toString(36)}-${Math.random().toString(36).slice(2)}`;
    const created = `web-${randomId}`;
    window.sessionStorage.setItem(CLIENT_ID_KEY, created);
    return created;
  } catch {
    return `web-${Date.now().toString(36)}-${Math.random().toString(36).slice(2)}`;
  }
}

/** Stable for one browser tab; echoed by view.updated events. */
export const browserClientId = createBrowserClientId();
let mutationSequence = 0;

function browserMutationContext(): Record<string, string> {
  mutationSequence += 1;
  return {
    actor: 'browser',
    client: 'web',
    clientId: browserClientId,
    mutationId: `${browserClientId}:${mutationSequence}`,
  };
}

export function isOwnViewMutationEvent(
  message: { type: string; data?: unknown },
  clientId = browserClientId,
): boolean {
  if (message.type !== 'view.updated' || !message.data || typeof message.data !== 'object') return false;
  return (message.data as Record<string, unknown>).clientId === clientId;
}

/** Layout endpoints historically return the persisted document rather than the
 * serialized GET /api/views shape. Normalize its per-position pin flags while
 * preserving that public response contract. */
export function normalizeViewsDocument(document: ViewsData): ViewsData {
  return {
    ...document,
    views: document.views.map((view) => {
      const wireView = view as NamedView & { pinned?: string[] };
      return {
        ...view,
        pinned: Array.isArray(wireView.pinned)
          ? wireView.pinned
          : Object.entries(view.positions).flatMap(([id, position]) =>
              (position as typeof position & { pinned?: boolean }).pinned ? [id] : []
            ),
      };
    }),
  };
}

export class ApiError extends Error {
  readonly status: number;
  readonly detail?: string;

  constructor(message: string, status = 0, detail?: string) {
    super(message);
    this.name = 'ApiError';
    this.status = status;
    this.detail = detail;
  }
}

function unwrap<T>(payload: unknown): T {
  if (payload && typeof payload === 'object') {
    const object = payload as Record<string, unknown>;
    if (object.ok === false) {
      const error = object.error;
      if (error && typeof error === 'object') {
        const structured = error as Record<string, unknown>;
        throw new ApiError(
          String(structured.message ?? 'The server could not complete the request.'),
          0,
          typeof structured.suggestion === 'string' ? structured.suggestion : undefined,
        );
      }
      throw new ApiError(String(error ?? 'The server could not complete the request.'));
    }
    if ('data' in object) return object.data as T;
    if ('result' in object) return object.result as T;
  }
  return payload as T;
}

async function request<T>(path: string, init?: RequestInit): Promise<T> {
  let response: Response;
  try {
    response = await fetch(path, init);
  } catch (error) {
    throw new ApiError(
      'Cannot reach the local SysML visualization service.',
      0,
      error instanceof Error ? error.message : undefined,
    );
  }

  const text = await response.text();
  let payload: unknown;
  try {
    payload = text ? JSON.parse(text) : undefined;
  } catch {
    payload = text;
  }

  if (!response.ok) {
    const object = payload && typeof payload === 'object' ? (payload as Record<string, unknown>) : undefined;
    const nested = object?.error;
    const message =
      typeof nested === 'object' && nested
        ? String((nested as Record<string, unknown>).message ?? response.statusText)
        : typeof nested === 'string'
          ? nested
          : typeof object?.message === 'string'
            ? object.message
            : response.statusText || `Request failed (${response.status})`;
    throw new ApiError(message, response.status);
  }

  return unwrap<T>(payload);
}

function queryString(values: Record<string, string | undefined>): string {
  const params = new URLSearchParams();
  for (const [key, value] of Object.entries(values)) {
    if (value) params.set(key, value);
  }
  const rendered = params.toString();
  return rendered ? `?${rendered}` : '';
}

export const api = {
  capabilities: () => request<CapabilityInventory>('/api/capabilities'),
  session: () => request<SessionState>('/api/session'),
  workspaceDirectories: (path?: string) =>
    request<WorkspaceDirectory>(`/api/workspace/directories${queryString({ path })}`),
  previewProject: (configuration: ProjectConfiguration) =>
    request<ProjectPreview>('/api/session/preview', {
      method: 'POST',
      headers: JSON_HEADERS,
      body: JSON.stringify(configuration),
    }),
  switchProject: (configuration: ProjectConfiguration) =>
    request<SessionState>('/api/session/switch', {
      method: 'POST',
      headers: JSON_HEADERS,
      body: JSON.stringify(configuration),
    }),
  model: () => request<ModelData>('/api/model'),
  systemAbstract: () => request<SystemAbstractDocument | null>('/api/traceability/system-abstract'),
  search: (query: string, limit = 60) =>
    request<ModelSearchResult[]>(`/api/search${queryString({ query, limit: String(limit) })}`),
  diagram: (rootId?: string, viewId?: string) =>
    request<DiagramData>(`/api/diagram${queryString({ root: rootId, view: viewId })}`),
  views: () => request<ViewsData>('/api/views'),
  view: (id: string) => request<NamedView>(`/api/views/${encodeURIComponent(id)}`),
  requirements: async (): Promise<RequirementRecord[]> => {
    try {
      return await request<RequirementRecord[]>('/api/requirements');
    } catch (error) {
      if (error instanceof ApiError && error.status === 404) return [];
      throw error;
    }
  },
  element: (id: string) => request<ElementDetails>(`/api/elements/${encodeURIComponent(id)}`),
  updateView: (id: string, patch: ViewPatch) =>
    request<NamedView>(`/api/views/${encodeURIComponent(id)}`, {
      method: 'PATCH',
      headers: JSON_HEADERS,
      body: JSON.stringify({ ...patch, ...browserMutationContext() }),
    }),
  alignLayout: (id: string, ids: string[], alignment: LayoutAlignment) =>
    request<unknown>(`/api/views/${encodeURIComponent(id)}/layout/align`, {
      method: 'POST',
      headers: JSON_HEADERS,
      body: JSON.stringify({ ids, alignment, pinned: true, ...browserMutationContext() }),
    }),
  distributeLayout: (id: string, ids: string[], axis: LayoutDistribution) =>
    request<unknown>(`/api/views/${encodeURIComponent(id)}/layout/distribute`, {
      method: 'POST',
      headers: JSON_HEADERS,
      body: JSON.stringify({ ids, axis, pinned: true, ...browserMutationContext() }),
    }),
  resetLayout: (id: string) =>
    request<unknown>(`/api/views/${encodeURIComponent(id)}/layout/reset`, {
      method: 'POST',
      headers: JSON_HEADERS,
      body: JSON.stringify(browserMutationContext()),
    }),
  moveLayout: (
    viewId: string,
    input: { id: string; x?: number; y?: number; relativeTo?: string; dx?: number; dy?: number; pinned?: boolean },
  ) => request<ViewsData>(`/api/views/${encodeURIComponent(viewId)}/layout/move`, {
    method: 'POST',
    headers: JSON_HEADERS,
    body: JSON.stringify({ ...input, ...browserMutationContext() }),
  }).then(normalizeViewsDocument),
  resizeLayout: (
    viewId: string,
    input: { id: string; width: number; height: number; x?: number; y?: number } | { id: string; fit: true },
  ) => request<ViewsData>(`/api/views/${encodeURIComponent(viewId)}/layout/resize`, {
    method: 'POST',
    headers: JSON_HEADERS,
    body: JSON.stringify({ ...input, ...browserMutationContext() }),
  }).then(normalizeViewsDocument),
  pinLayout: (viewId: string, id: string, pinned: boolean) =>
    request<unknown>(`/api/views/${encodeURIComponent(viewId)}/layout/pin`, {
      method: 'POST',
      headers: JSON_HEADERS,
      body: JSON.stringify({ id, pinned, ...browserMutationContext() }),
    }),
  applyLayout: (viewId: string) =>
    request<unknown>(`/api/views/${encodeURIComponent(viewId)}/layout/apply`, {
      method: 'POST',
      headers: JSON_HEADERS,
      body: JSON.stringify(browserMutationContext()),
    }),
  addConstraint: (
    viewId: string,
    input: { subjectId: string; relation: 'above' | 'below' | 'left-of' | 'right-of'; objectId: string; gap?: number },
  ) => request<unknown>(`/api/views/${encodeURIComponent(viewId)}/layout/constraint`, {
    method: 'POST',
    headers: JSON_HEADERS,
    body: JSON.stringify({ ...input, ...browserMutationContext() }),
  }),
  layoutTemplate: (viewId: string) =>
    request<LayoutTemplate>(`/api/views/${encodeURIComponent(viewId)}/layout/template`),
  applyLayoutTemplate: (viewId: string, template: LayoutTemplate, mapping: Record<string, string>) =>
    request<unknown>(`/api/views/${encodeURIComponent(viewId)}/layout/template`, {
      method: 'POST',
      headers: JSON_HEADERS,
      body: JSON.stringify({ template, mapping, ...browserMutationContext() }),
    }),
  health: (rootId?: string, viewId?: string, signal?: AbortSignal) =>
    request<DiagramHealth>(`/api/diagram/health${queryString({ root: rootId, view: viewId })}`, { signal }),
  checkpoints: () => request<Checkpoint[]>('/api/checkpoints'),
  createView: (view: Partial<NamedView>) =>
    request<NamedView>('/api/views', {
      method: 'POST',
      headers: JSON_HEADERS,
      body: JSON.stringify({ ...view, ...browserMutationContext() }),
    }),
  activateView: async (id: string): Promise<void> => {
    try {
      await request(`/api/views/${encodeURIComponent(id)}/activate`, {
        method: 'POST',
        headers: JSON_HEADERS,
        body: JSON.stringify(browserMutationContext()),
      });
    } catch (error) {
      if (!(error instanceof ApiError) || error.status !== 404) throw error;
    }
  },
  validate: () => request<unknown>('/api/validate', { method: 'POST' }),
  checkpoint: (name: string, message?: string) =>
    request<unknown>('/api/checkpoints', {
      method: 'POST',
      headers: JSON_HEADERS,
      body: JSON.stringify({ name, message, author: 'browser' }),
    }),
  exportDiagram: async (format: 'png' | 'svg', rootId?: string, viewId?: string): Promise<void> => {
    const path = `/api/export${queryString({ format, root: rootId, view: viewId })}`;
    let response: Response;
    try {
      response = await fetch(path, { method: 'POST' });
      if (response.status === 404 || response.status === 405) response = await fetch(path);
    } catch {
      throw new ApiError('Could not reach the export service.');
    }
    if (!response.ok) throw new ApiError(`Export failed (${response.status}).`, response.status);
    const blob = await response.blob();
    const disposition = response.headers.get('content-disposition');
    const match = disposition?.match(/filename="?([^";]+)"?/i);
    const filename = match?.[1] ?? `sysml-diagram.${format}`;
    const url = URL.createObjectURL(blob);
    const anchor = document.createElement('a');
    anchor.href = url;
    anchor.download = filename;
    anchor.click();
    URL.revokeObjectURL(url);
  },
};

export type ConnectionStatus = 'connecting' | 'connected' | 'reconnecting' | 'offline';

export function subscribeToEvents(
  onEvent: (message: EventMessage) => void,
  onStatus: (status: ConnectionStatus) => void,
): () => void {
  let active = true;
  let socket: WebSocket | undefined;
  let retry = 0;
  let timer: number | undefined;

  const connect = () => {
    if (!active) return;
    onStatus(retry ? 'reconnecting' : 'connecting');
    const protocol = window.location.protocol === 'https:' ? 'wss:' : 'ws:';
    socket = new WebSocket(`${protocol}//${window.location.host}/api/events`);
    socket.addEventListener('open', () => {
      retry = 0;
      onStatus('connected');
    });
    socket.addEventListener('message', (event) => {
      try {
        onEvent(JSON.parse(String(event.data)) as EventMessage);
      } catch {
        onEvent({ type: 'refresh' });
      }
    });
    socket.addEventListener('close', () => {
      if (!active) return;
      onStatus('reconnecting');
      const delay = Math.min(8000, 500 * 2 ** retry);
      retry += 1;
      timer = window.setTimeout(connect, delay);
    });
    socket.addEventListener('error', () => socket?.close());
  };

  connect();

  return () => {
    active = false;
    if (timer) window.clearTimeout(timer);
    socket?.close();
    onStatus('offline');
  };
}

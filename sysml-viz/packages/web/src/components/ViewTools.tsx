import { useEffect, useRef, useState } from 'react';
import { api } from '../api';
import type {
  CapabilityInventory,
  Checkpoint,
  DiagramData,
  DiagramHealth,
  LayoutTemplate,
  ModelData,
  NamedView,
  SessionState,
  ViewPatch,
  ViewsData,
} from '../types';
import { Icon } from './Icon';

type Tab = 'overview' | 'view' | 'overlays' | 'arrange' | 'export';

interface Props {
  open: boolean;
  onClose: () => void;
  session?: SessionState;
  model: ModelData;
  diagram?: DiagramData;
  views: ViewsData;
  view?: NamedView;
  selectedId?: string;
  selectedEdgeId?: string;
  onPatch: (patch: ViewPatch) => Promise<boolean>;
  onLayoutMutation: (title: string, action: (viewId: string) => Promise<unknown>) => Promise<void>;
  onRefresh: () => Promise<boolean>;
  onValidate: () => void;
  onCheckpoint: () => void;
  onExport: (format: 'png' | 'svg') => void;
}

const json = (value: unknown) => JSON.stringify(value, null, 2);
const idFrom = (prefix: string) => `${prefix}-${Date.now().toString(36)}`;

function downloadJson(filename: string, value: unknown): void {
  const url = URL.createObjectURL(new Blob([`${json(value)}\n`], { type: 'application/json' }));
  const anchor = document.createElement('a');
  anchor.href = url;
  anchor.download = filename;
  anchor.click();
  URL.revokeObjectURL(url);
}

export function ViewTools({
  open, onClose, session, model, diagram, views, view, selectedId, selectedEdgeId,
  onPatch, onRefresh, onValidate, onCheckpoint, onExport,
  onLayoutMutation,
}: Props) {
  const [tab, setTab] = useState<Tab>('overview');
  const [capabilities, setCapabilities] = useState<CapabilityInventory>();
  const [health, setHealth] = useState<DiagramHealth>();
  const [checkpoints, setCheckpoints] = useState<Checkpoint[]>([]);
  const [error, setError] = useState<string>();
  const [busy, setBusy] = useState(false);
  const [aliasId, setAliasId] = useState('');
  const [aliasLabel, setAliasLabel] = useState('');
  const [overlayKind, setOverlayKind] = useState<'annotation' | 'actor' | 'reference' | 'edge'>('annotation');
  const [overlayId, setOverlayId] = useState('');
  const [overlayLabel, setOverlayLabel] = useState('');
  const [overlayTarget, setOverlayTarget] = useState('');
  const [overlayTargetKind, setOverlayTargetKind] = useState<'node' | 'port'>('node');
  const [overlaySource, setOverlaySource] = useState('');
  const [moveId, setMoveId] = useState('');
  const [moveMode, setMoveMode] = useState<'absolute' | 'relative'>('absolute');
  const [moveReference, setMoveReference] = useState('');
  const [moveX, setMoveX] = useState('0');
  const [moveY, setMoveY] = useState('0');
  const [resizeWidth, setResizeWidth] = useState('640');
  const [resizeHeight, setResizeHeight] = useState('380');
  const [constraintSubject, setConstraintSubject] = useState('');
  const [constraintObject, setConstraintObject] = useState('');
  const [constraintRelation, setConstraintRelation] = useState<'above' | 'below' | 'left-of' | 'right-of'>('right-of');
  const [templateText, setTemplateText] = useState('');
  const [mappingText, setMappingText] = useState('{}');
  const templateInput = useRef<HTMLInputElement>(null);

  useEffect(() => {
    if (!open) return;
    void Promise.all([
      api.capabilities().then(setCapabilities),
      api.health(diagram?.rootId, view?.id).then(setHealth).catch(() => undefined),
      api.checkpoints().then(setCheckpoints).catch(() => undefined),
    ]);
  }, [diagram?.revision, diagram?.rootId, open, view?.id, views.viewRevision]);

  useEffect(() => {
    if (!selectedId) return;
    setAliasId(selectedId);
    setMoveId(selectedId);
    setConstraintSubject(selectedId);
    setOverlayTarget(selectedId);
  }, [selectedId]);

  useEffect(() => {
    if (selectedEdgeId) setOverlayId(selectedEdgeId);
  }, [selectedEdgeId]);

  if (!open) return null;

  const perform = async (action: () => Promise<unknown>, refresh = true) => {
    setBusy(true);
    setError(undefined);
    try {
      await action();
      if (refresh) await onRefresh();
    } catch (caught) {
      setError(caught instanceof Error ? caught.message : String(caught));
    } finally {
      setBusy(false);
    }
  };
  const commit = async (patch: ViewPatch) => {
    setBusy(true);
    setError(undefined);
    try {
      if (await onPatch(patch)) await onRefresh();
    } catch (caught) {
      setError(caught instanceof Error ? caught.message : String(caught));
    } finally {
      setBusy(false);
    }
  };
  const number = (value: string, label: string) => {
    const result = Number(value);
    if (!Number.isFinite(result)) throw new Error(`${label} must be a number.`);
    return result;
  };

  const saveOverlay = async () => {
    if (!view) return;
    const id = overlayId.trim() || idFrom(overlayKind);
    if (!overlayLabel.trim()) {
      setError(overlayKind === 'annotation' ? 'Annotation text is required.' : 'A card or edge label is required.');
      return;
    }
    if (overlayKind === 'annotation') {
      const current = view.annotations.filter((item) => item.id !== id);
      const existing = view.annotations.find((item) => item.id === id);
      await commit({ annotations: [...current, {
        id,
        text: overlayLabel.trim(),
        position: existing?.position ?? { x: 80, y: 80 },
        style: existing?.style ?? 'info',
        ...(overlayTarget.trim() ? { arrow: { targetId: overlayTarget.trim(), targetKind: overlayTargetKind } } : {}),
      }] });
    } else if (overlayKind === 'edge') {
      if (!overlaySource.trim() || !overlayTarget.trim()) {
        setError('Presentation edges require both source and target IDs.');
        return;
      }
      const current = (view.presentationEdges ?? []).filter((item) => item.id !== id);
      await commit({ presentationEdges: [...current, {
        id, label: overlayLabel.trim(), sourceId: overlaySource.trim(), targetId: overlayTarget.trim(), kind: 'informational',
      }] });
    } else {
      const current = (view.presentationNodes ?? []).filter((item) => item.id !== id);
      const existing = view.presentationNodes?.find((item) => item.id === id);
      await commit({ presentationNodes: [...current, {
        id, label: overlayLabel.trim(), kind: overlayKind,
        x: existing?.x ?? 80, y: existing?.y ?? 80,
        width: Math.max(248, existing?.width ?? 248), height: Math.max(142, existing?.height ?? 142),
      }] });
    }
    setOverlayId(id);
  };

  const removeOverlay = async () => {
    if (!view || !overlayId.trim()) return;
    const id = overlayId.trim();
    if (overlayKind === 'annotation') await commit({ annotations: view.annotations.filter((item) => item.id !== id) });
    else if (overlayKind === 'edge') await commit({ presentationEdges: (view.presentationEdges ?? []).filter((item) => item.id !== id) });
    else {
      await commit({
        presentationNodes: (view.presentationNodes ?? []).filter((item) => item.id !== id),
        presentationEdges: (view.presentationEdges ?? []).filter((item) => item.sourceId !== id && item.targetId !== id),
      });
    }
  };

  const categoryTab = (category: string): Tab =>
    category === 'view' ? 'view' :
    category === 'overlay' ? 'overlays' :
    category === 'arrange' ? 'arrange' :
    category === 'artifact' ? 'export' : 'overview';

  return (
    <aside className="view-tools" aria-label="View Tools" data-testid="view-tools">
      <header>
        <div><small>ADVANCED</small><h2>View Tools</h2></div>
        <button aria-label="Close View Tools" onClick={onClose}><Icon name="x" /></button>
      </header>
      <nav aria-label="View Tools sections">
        {(['overview', 'view', 'overlays', 'arrange', 'export'] as const).map((item) => (
          <button className={tab === item ? 'active' : ''} key={item} onClick={() => setTab(item)}>{item}</button>
        ))}
      </nav>
      {error && <div className="tools-error" role="alert">{error}</div>}

      <div className="view-tools-content">
        {tab === 'overview' && <>
          <section>
            <h3>Loaded project</h3>
            <dl className="tools-facts" data-capability="session.inspect">
              <dt>Workspace</dt><dd>{session?.workspaceRoot ?? '—'}</dd>
              <dt>Project root</dt><dd>{session?.root ?? '—'}</dd>
              <dt>Libraries</dt><dd>{session?.libraryRoots.join(', ') || 'None'}</dd>
              <dt>Patterns</dt><dd>include: {session?.include?.join(', ') || 'all'} · exclude: {session?.exclude?.join(', ') || 'none'}</dd>
              <dt>Files</dt><dd>{session?.files.length ?? 0}</dd>
              <dt>Revision</dt><dd>{String(session?.revision ?? '—')}</dd>
            </dl>
            <details><summary>Exact loaded files</summary><pre>{session?.files.join('\n') || 'No files loaded'}</pre></details>
          </section>
          <section data-capability="model.inspect">
            <h3>Model and parse</h3>
            <p>{model.definitions.length} definitions · {model.rootCandidates.length} roots · {model.requirements.length} requirements</p>
            <pre>{json({ parseStatus: session?.parseStatus, diagnostics: diagram?.diagnostics ?? [] })}</pre>
          </section>
          <section data-capability="validation.inspect">
            <h3>Validation</h3>
            <div className="tools-inline">
              <button data-capability="validation.run" disabled={busy} onClick={onValidate}>Run validation</button>
              <button data-capability="checkpoint.create" onClick={onCheckpoint}>Create checkpoint</button>
            </div>
            <pre>{json(session?.validation)}</pre>
          </section>
          <section data-capability="health.inspect">
            <h3>Diagram health</h3>
            <button disabled={busy} onClick={() => void perform(async () => setHealth(await api.health(diagram?.rootId, view?.id)), false)}>Refresh health</button>
            <pre>{json(health ?? { status: 'Not loaded' })}</pre>
          </section>
          <section data-capability="checkpoint.list">
            <h3>Checkpoint history</h3>
            {checkpoints.length ? checkpoints.map((item) => <article className="checkpoint-row" key={item.id}><strong>{item.name}</strong><span>{item.validationStatus} · rev {item.modelRevision}</span></article>) : <p>No checkpoints.</p>}
          </section>
          <section>
            <h3>View mutation history</h3>
            <pre>{json(views.mutations ?? [])}</pre>
          </section>
          <section className="capability-index">
            <h3>Workflow capability inventory</h3>
            {capabilities?.capabilities.map((item) => (
              <button data-capability={item.id} key={item.id} onClick={() => setTab(categoryTab(item.category))} title={item.agentEntryPoint}>
                <span>{item.label}</span><small>{item.manualSurface}</small>
              </button>
            ))}
            <details><summary>Transport-only exceptions</summary><pre>{json(capabilities?.transportOnlyExceptions ?? [])}</pre></details>
          </section>
        </>}

        {tab === 'view' && <section>
          <h3>Named view</h3>
          <label data-capability="view.rename">Name<input defaultValue={view?.name} key={`name-${view?.id}`} onBlur={(event) => event.target.value.trim() && void commit({ name: event.target.value.trim() })} /></label>
          <label data-capability="view.root">Root<select value={view?.rootId ?? ''} onChange={(event) => void commit({ rootId: event.target.value })}>
            {model.rootCandidates.map((root) => <option key={root.id} value={root.id}>{root.qualifiedName ?? root.name}</option>)}
          </select></label>
          <form data-capability="view.alias" onSubmit={(event) => {
            event.preventDefault();
            if (!view || !aliasId.trim()) return;
            const aliases = { ...view.aliases };
            if (aliasLabel.trim()) aliases[aliasId.trim()] = aliasLabel.trim();
            else delete aliases[aliasId.trim()];
            void commit({ aliases });
          }}>
            <h3>Alias</h3>
            <label>Element ID<input value={aliasId} onChange={(event) => setAliasId(event.target.value)} /></label>
            <label>Display label<input value={aliasLabel} onChange={(event) => setAliasLabel(event.target.value)} /></label>
            <button type="submit">Save alias</button>
          </form>
          <div data-capability="view.unhide"><h3>Hidden elements</h3>{view?.hidden.map((id) => <button className="tools-list-button" key={id} onClick={() => void commit({ hidden: view.hidden.filter((item) => item !== id) })}>Restore {id}</button>) || <p>None hidden.</p>}</div>
          <label data-capability="view.expand">Expanded elements<select value="" onChange={(event) => {
            if (!view || !event.target.value) return;
            const id = event.target.value;
            void commit({ expanded: view.expanded.includes(id) ? view.expanded.filter((item) => item !== id) : [...view.expanded, id] });
          }}><option value="">Choose element…</option>{diagram?.nodes.map((node) => <option key={node.id} value={node.id}>{view?.expanded.includes(node.id) ? 'Collapse' : 'Expand'} {node.label}</option>)}</select></label>
          <fieldset data-capability="view.style"><legend>Style</legend>{(['showPorts', 'showTypes', 'showEdgeLabels'] as const).map((key) => <label className="tools-check" key={key}><input checked={view?.[key] ?? true} type="checkbox" onChange={(event) => void commit({ [key]: event.target.checked })} />{key}</label>)}</fieldset>
          <fieldset data-capability="view.camera"><legend>Camera</legend><div className="tools-grid">{(['x', 'y', 'zoom'] as const).map((key) => <label key={key}>{key}<input type="number" step={key === 'zoom' ? '.1' : '10'} defaultValue={view?.camera?.[key] ?? (key === 'zoom' ? 1 : 0)} onBlur={(event) => void commit({ camera: { ...(view?.camera ?? { x: 0, y: 0, zoom: 1 }), [key]: Number(event.target.value) } })} /></label>)}</div></fieldset>
        </section>}

        {tab === 'overlays' && <section>
          <h3>Overlay editor</h3>
          <form data-capability={overlayKind === 'annotation' ? 'annotation.crud' : overlayKind === 'edge' ? 'presentation.edge.crud' : 'presentation.node.crud'} onSubmit={(event) => { event.preventDefault(); void saveOverlay(); }}>
            <label>Kind<select value={overlayKind} onChange={(event) => setOverlayKind(event.target.value as typeof overlayKind)}><option value="annotation">Annotation</option><option value="actor">Actor card</option><option value="reference">Reference card</option><option value="edge">Presentation edge</option></select></label>
            <label>ID<input value={overlayId} onChange={(event) => setOverlayId(event.target.value)} placeholder="Generated when blank" /></label>
            <label>{overlayKind === 'annotation' ? 'Text' : 'Label'}<textarea value={overlayLabel} onChange={(event) => setOverlayLabel(event.target.value)} /></label>
            {overlayKind === 'edge' && <label>Source ID<input value={overlaySource} onChange={(event) => setOverlaySource(event.target.value)} placeholder="Canvas selection or semantic ID" /></label>}
            {(overlayKind === 'edge' || overlayKind === 'annotation') && <label>Target ID<input value={overlayTarget} onChange={(event) => setOverlayTarget(event.target.value)} placeholder="Node or exact port ID" /></label>}
            {(overlayKind === 'edge' || overlayKind === 'annotation') && selectedId && <div className="tools-inline">
              {overlayKind === 'edge' && <button type="button" onClick={() => setOverlaySource(selectedId)}>Use selection as source</button>}
              <button type="button" onClick={() => setOverlayTarget(selectedId)}>Use selection as target</button>
            </div>}
            {overlayKind === 'annotation' && <label>Arrow target<select value={overlayTargetKind} onChange={(event) => setOverlayTargetKind(event.target.value as 'node' | 'port')}><option value="node">Node perimeter</option><option value="port">Exact port</option></select></label>}
            <div className="tools-inline"><button disabled={busy} type="button" onClick={() => void saveOverlay()}>Save overlay</button><button disabled={busy || !overlayId} type="button" onClick={() => void removeOverlay()}>Remove</button></div>
          </form>
          <details open><summary>Existing overlays</summary><pre>{json({ annotations: view?.annotations ?? [], cards: view?.presentationNodes ?? [], edges: view?.presentationEdges ?? [] })}</pre></details>
        </section>}

        {tab === 'arrange' && <section>
          <form data-capability="layout.move" onSubmit={(event) => {
            event.preventDefault();
            if (!view || !moveId.trim()) return;
            void perform(() => onLayoutMutation('Element moved', (viewId) => api.moveLayout(viewId, moveMode === 'absolute'
              ? { id: moveId.trim(), x: number(moveX, 'X'), y: number(moveY, 'Y'), pinned: true }
              : { id: moveId.trim(), relativeTo: moveReference.trim(), dx: number(moveX, 'DX'), dy: number(moveY, 'DY'), pinned: true })), false);
          }}>
            <h3>Exact or relative movement</h3>
            <label>Element ID<input value={moveId} onChange={(event) => setMoveId(event.target.value)} /></label>
            <label>Mode<select value={moveMode} onChange={(event) => setMoveMode(event.target.value as 'absolute' | 'relative')}><option value="absolute">Absolute x/y</option><option value="relative">Relative dx/dy</option></select></label>
            {moveMode === 'relative' && <label>Relative to<input value={moveReference} onChange={(event) => setMoveReference(event.target.value)} /></label>}
            <div className="tools-grid"><label>{moveMode === 'absolute' ? 'X' : 'DX'}<input value={moveX} onChange={(event) => setMoveX(event.target.value)} /></label><label>{moveMode === 'absolute' ? 'Y' : 'DY'}<input value={moveY} onChange={(event) => setMoveY(event.target.value)} /></label></div>
            <button disabled={busy} type="submit">Move and pin</button>
          </form>
          <form data-capability="layout.resize" onSubmit={(event) => {
            event.preventDefault();
            if (!view || !moveId.trim()) return;
            void perform(() => onLayoutMutation('Expanded system resized', (viewId) => api.resizeLayout(viewId, {
              id: moveId.trim(), width: number(resizeWidth, 'Width'), height: number(resizeHeight, 'Height'),
            })), false);
          }}>
            <h3>Expanded system size</h3>
            <label>Container ID<input value={moveId} onChange={(event) => setMoveId(event.target.value)} /></label>
            <div className="tools-grid"><label>Width<input min="640" value={resizeWidth} onChange={(event) => setResizeWidth(event.target.value)} type="number" /></label><label>Height<input min="380" value={resizeHeight} onChange={(event) => setResizeHeight(event.target.value)} type="number" /></label></div>
            <div className="tools-inline"><button disabled={busy || !view || !moveId} type="submit">Resize</button><button disabled={busy || !view || !moveId} onClick={() => void perform(() => onLayoutMutation('Expanded system fitted to contents', (viewId) => api.resizeLayout(viewId, { id: moveId.trim(), fit: true })), false)} type="button">Fit contents</button></div>
          </form>
          <div className="tools-inline" data-capability="layout.pin"><button disabled={!view || !moveId} onClick={() => void perform(() => onLayoutMutation('Element pinned', (viewId) => api.pinLayout(viewId, moveId, true)), false)}>Pin</button><button disabled={!view || !moveId} onClick={() => void perform(() => onLayoutMutation('Element unpinned', (viewId) => api.pinLayout(viewId, moveId, false)), false)}>Unpin</button></div>
          <form data-capability="constraint.crud" onSubmit={(event) => {
            event.preventDefault();
            if (view) void perform(() => onLayoutMutation('Layout constraint added', (viewId) => api.addConstraint(viewId, { subjectId: constraintSubject, relation: constraintRelation, objectId: constraintObject, gap: 40 })), false);
          }}>
            <h3>Layout constraints</h3>
            <label>Subject<input value={constraintSubject} onChange={(event) => setConstraintSubject(event.target.value)} /></label>
            <label>Relation<select value={constraintRelation} onChange={(event) => setConstraintRelation(event.target.value as typeof constraintRelation)}><option value="above">above</option><option value="below">below</option><option value="left-of">left of</option><option value="right-of">right of</option></select></label>
            <label>Object<input value={constraintObject} onChange={(event) => setConstraintObject(event.target.value)} /></label>
            <button disabled={busy || !constraintSubject || !constraintObject} type="submit">Add constraint</button>
            {view?.constraints?.map((constraint) => <button className="tools-list-button" key={constraint.id} type="button" onClick={() => void commit({ constraints: view.constraints?.filter((item) => item.id !== constraint.id) })}>Remove {constraint.subjectId} {constraint.relation} {constraint.objectId}</button>)}
          </form>
          <div data-capability="template.download"><h3>Layout template</h3><button disabled={!view} onClick={() => view && void perform(async () => { const template = await api.layoutTemplate(view.id); setTemplateText(json(template)); downloadJson(`${view.id}-layout.json`, template); }, false)}>Download JSON</button></div>
          <div data-capability="template.upload">
            <input accept="application/json,.json" hidden ref={templateInput} type="file" onChange={(event) => { const file = event.target.files?.[0]; if (file) void file.text().then(setTemplateText); }} />
            <button onClick={() => templateInput.current?.click()}>Choose template</button>
            <label>Template JSON<textarea rows={8} value={templateText} onChange={(event) => setTemplateText(event.target.value)} /></label>
            <label>Explicit ID mapping JSON<textarea rows={4} value={mappingText} onChange={(event) => setMappingText(event.target.value)} /></label>
            <button disabled={!view || !templateText} onClick={() => void perform(() => onLayoutMutation('Layout template applied', (viewId) => api.applyLayoutTemplate(viewId, JSON.parse(templateText) as LayoutTemplate, JSON.parse(mappingText) as Record<string, string>)), false)}>Apply template</button>
          </div>
        </section>}

        {tab === 'export' && <section>
          <h3>Diagram artifacts</h3>
          <div className="tools-inline"><button data-capability="render.svg" onClick={() => onExport('svg')}>Download SVG</button><button data-capability="render.png" onClick={() => onExport('png')}>Download PNG</button></div>
          <div data-capability="session.reproduce"><h3>Reproduction data</h3><button onClick={() => downloadJson('sysml-viz-session.json', { session, view, health, diagram: { rootId: diagram?.rootId, revision: diagram?.revision } })}>Download session + health JSON</button><pre>{json({ session, viewId: view?.id, rootId: diagram?.rootId, health })}</pre></div>
        </section>}
      </div>
    </aside>
  );
}

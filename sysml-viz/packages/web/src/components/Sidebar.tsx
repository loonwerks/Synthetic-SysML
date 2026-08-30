import { useEffect, useMemo, useState } from 'react';
import { api } from '../api';
import type {
  ModelData,
  ModelDefinition,
  ModelHierarchyItem,
  ModelSearchResult,
  NamedView,
  RequirementRecord,
  SessionState,
} from '../types';
import { Icon, type IconName } from './Icon';
import type { UiMode } from './Header';
import { useRovingTabs } from './useRovingTabs';

const EXPLORER_TABS = ['model', 'requirements'] as const;

interface SidebarProps {
  mode: UiMode;
  session?: SessionState;
  model: ModelData;
  views: NamedView[];
  activeViewId?: string;
  activeRootId?: string;
  requirements: RequirementRecord[];
  hiddenCount: number;
  showPorts: boolean;
  showEdgeLabels: boolean;
  showTypes: boolean;
  onSelectView: (view: NamedView) => void;
  onCreateView: () => void;
  onSelectRoot: (id: string) => void;
  onSelectElement: (id: string, ownerDefinitionId?: string) => void;
  onSelectSearchResult: (result: ModelSearchResult) => void;
  onSelectRequirement: (requirement: RequirementRecord) => void;
  onShowHidden: () => void;
  onTogglePorts: () => void;
  onToggleEdgeLabels: () => void;
  onToggleTypes: () => void;
  onOpenProject: () => void;
  onClose: () => void;
}

function flattenDefinitions(definitions: ModelDefinition[]): ModelDefinition[] {
  const result: ModelDefinition[] = [];
  const seen = new Set<string>();
  const visit = (definition: ModelDefinition) => {
    if (seen.has(definition.id)) return;
    seen.add(definition.id);
    result.push(definition);
    definition.children?.forEach(visit);
  };
  definitions.forEach(visit);
  return result;
}

interface TreeItemProps {
  item: ModelHierarchyItem;
  activeRootId?: string;
  depth?: number;
  onSelect: (item: ModelHierarchyItem) => void;
}

function shortTypeName(value?: string): string | undefined {
  return value?.split('::').at(-1);
}

function treeItemDetail(item: ModelHierarchyItem): string | undefined {
  if (item.unresolved) return 'unresolved';
  if (item.kind === 'port') {
    const direction = item.direction && item.direction !== 'unknown' ? item.direction : undefined;
    return [direction, shortTypeName(item.typeName)].filter(Boolean).join(' · ') || 'port';
  }
  const typeName = shortTypeName(item.typeName);
  if (!item.root && typeName && typeName !== item.name) return item.recursive ? `${typeName} · recursive` : typeName;
  return item.recursive ? `${item.category ?? 'component'} · recursive` : item.category;
}

function legacyHierarchy(
  definition: ModelDefinition,
  byId: Map<string, ModelDefinition>,
  ancestors: ReadonlySet<string> = new Set(),
): ModelHierarchyItem {
  const recursive = ancestors.has(definition.id);
  const nextAncestors = new Set(ancestors).add(definition.id);
  const children = recursive
    ? []
    : (definition.children
      ?? definition.childIds?.map((id) => byId.get(id)).filter((entry): entry is ModelDefinition => Boolean(entry))
      ?? []).map((child) => legacyHierarchy(child, byId, nextAncestors));
  return {
    ...definition,
    elementId: definition.id,
    definitionId: definition.id,
    kind: 'component',
    root: ancestors.size === 0,
    recursive,
    children,
  };
}

function TreeItem({ item, activeRootId, depth = 0, onSelect }: TreeItemProps) {
  const [open, setOpen] = useState(depth < 1);
  const children = item.children ?? [];
  const active = Boolean(item.root && (item.definitionId ?? item.elementId) === activeRootId);
  const detail = treeItemDetail(item);
  return (
    <li>
      <div className={`tree-row ${active ? 'active' : ''} tree-${item.kind}`} style={{ paddingLeft: 8 + depth * 14 }}>
        {children.length ? (
          <button className="tree-toggle" onClick={() => setOpen((value) => !value)} aria-label={open ? 'Collapse' : 'Expand'}>
            <Icon name={open ? 'chevron-down' : 'chevron-right'} size={13} />
          </button>
        ) : <span className="tree-spacer" />}
        <button className="tree-label" onClick={() => onSelect(item)} title={item.qualifiedName ?? item.name}>
          <span className={`tree-kind kind-${(item.category ?? item.kind ?? 'component').toLowerCase()}`} />
          <span>{item.name}</span>
          {detail && <small>{detail}</small>}
        </button>
      </div>
      {open && children.length > 0 && (
        <ul>{children.map((child) => <TreeItem activeRootId={activeRootId} depth={depth + 1} item={child} key={child.id} onSelect={onSelect} />)}</ul>
      )}
    </li>
  );
}

function ViewRow({ view, active, onSelect }: { view: NamedView; active: boolean; onSelect: () => void }) {
  return (
    <button className={`view-row ${active ? 'active' : ''}`} onClick={onSelect}>
      <span className="view-icon"><Icon name="layers" size={14} /></span>
      <span className="view-copy"><strong>{view.name}</strong><small>{view.pinned.length} pinned · {view.hidden.length} hidden</small></span>
      {active && <Icon name="check" size={14} />}
    </button>
  );
}

function ViewDetailToggle({
  checked,
  icon,
  label,
  detail,
  onToggle,
}: {
  checked: boolean;
  icon: 'port' | 'more' | 'component';
  label: string;
  detail: string;
  onToggle: () => void;
}) {
  return (
    <button
      aria-checked={checked}
      aria-label={`${checked ? 'Hide' : 'Show'} ${label.toLowerCase()} in this view`}
      className="view-detail-toggle"
      onClick={onToggle}
      role="switch"
      type="button"
    >
      <span className="detail-toggle-icon"><Icon name={icon} size={14} /></span>
      <span><strong>{label}</strong><small>{detail}</small></span>
      <i className={`switch-track ${checked ? 'on' : ''}`} aria-hidden="true"><b /></i>
    </button>
  );
}

function searchResultIcon(kind: string): IconName {
  if (kind === 'file') return 'file';
  if (kind === 'port') return 'port';
  if (kind === 'requirement') return 'requirement';
  if (kind.startsWith('gumbo-')) return 'contract';
  if (kind === 'connection' || kind === 'allocation') return 'more';
  return 'component';
}

function searchResultKind(kind: string): string {
  return kind.replace(/-/g, ' ');
}

export function Sidebar({
  mode,
  session,
  model,
  views,
  activeViewId,
  activeRootId,
  requirements,
  hiddenCount,
  showPorts,
  showEdgeLabels,
  showTypes,
  onSelectView,
  onCreateView,
  onSelectRoot,
  onSelectElement,
  onSelectSearchResult,
  onSelectRequirement,
  onShowHidden,
  onTogglePorts,
  onToggleEdgeLabels,
  onToggleTypes,
  onOpenProject,
  onClose,
}: SidebarProps) {
  const [query, setQuery] = useState('');
  const [tab, setTab] = useState<'model' | 'requirements'>('model');
  const { getPanelProps, getTabProps } = useRovingTabs(EXPLORER_TABS, tab, setTab);
  const [scopeOpen, setScopeOpen] = useState(false);
  const [searchResults, setSearchResults] = useState<ModelSearchResult[]>([]);
  const [searchLoading, setSearchLoading] = useState(false);
  const [searchError, setSearchError] = useState(false);
  const flatDefinitions = useMemo(() => flattenDefinitions(model.definitions), [model.definitions]);
  const byId = useMemo(() => new Map(flatDefinitions.map((entry) => [entry.id, entry])), [flatDefinitions]);
  const roots = model.rootCandidates.length ? model.rootCandidates : flatDefinitions.filter((entry) => !entry.parentId);
  const hierarchyRoots = useMemo(
    () => model.hierarchy?.length ? model.hierarchy : roots.map((root) => legacyHierarchy(root, byId)),
    [byId, model.hierarchy, roots],
  );
  const selectHierarchyItem = (item: ModelHierarchyItem) => {
    if (item.root) {
      onSelectRoot(item.definitionId ?? item.elementId);
      return;
    }
    onSelectElement(item.elementId, item.ownerDefinitionId);
  };
  const normalizedQuery = query.trim().toLowerCase();
  const requirementMatches = (normalizedQuery
    ? requirements.filter((entry) => [entry.name, entry.requirementId, entry.contractId, entry.description, entry.text, entry.ownerName, ...(entry.references ?? []), ...(entry.urls ?? [])].some((value) => value?.toLowerCase().includes(normalizedQuery)))
    : requirements).slice(0, 60);

  useEffect(() => {
    const trimmed = query.trim();
    if (tab !== 'model' || !trimmed) {
      setSearchResults([]);
      setSearchLoading(false);
      setSearchError(false);
      return;
    }

    let active = true;
    setSearchResults([]);
    setSearchLoading(true);
    setSearchError(false);
    const timer = window.setTimeout(() => {
      api.search(trimmed)
        .then((results) => {
          if (active) setSearchResults(results);
        })
        .catch(() => {
          if (active) {
            setSearchResults([]);
            setSearchError(true);
          }
        })
        .finally(() => {
          if (active) setSearchLoading(false);
        });
    }, 160);

    return () => {
      active = false;
      window.clearTimeout(timer);
    };
  }, [query, session?.revision, tab]);

  return (
    <aside className="left-sidebar">
      {mode === 'advanced' && <section className="project-scope">
        <button className="scope-summary" onClick={() => setScopeOpen((value) => !value)}>
          <span className="scope-icon"><Icon name="folder" /></span>
          <span><small>SESSION ROOT</small><strong title={session?.root ?? undefined}>{session?.root?.split('/').filter(Boolean).at(-1) ?? 'No project'}</strong></span>
          <Icon name={scopeOpen ? 'chevron-down' : 'chevron-right'} size={14} />
        </button>
        <button className="sidebar-collapse-button" aria-label="Hide model sidebar" onClick={onClose} title="Hide model sidebar">
          <Icon name="arrow-left" size={14} />
        </button>
        {scopeOpen && (
          <div className="scope-details">
            <dl>
              <dt>Exact root</dt><dd>{session?.root ?? 'Unavailable'}</dd>
              <dt>Model files</dt><dd>{session?.files.length ?? 0}</dd>
              <dt>Library roots</dt><dd>{session?.libraryRoots.length ?? 0}</dd>
            </dl>
            {session?.libraryRoots.map((root) => <code key={root}>{root}</code>)}
            <p>Only this explicit root is watched. Sibling folders are never crawled.</p>
            <button className="switch-project-button" onClick={onOpenProject}><Icon name="folder" size={14} /> Open or switch project</button>
          </div>
        )}
      </section>}

      <div className="sidebar-scroll">
        <section className="sidebar-section views-section">
          <div className="section-heading"><span>Saved diagrams</span><button onClick={onCreateView} title="Save current diagram"><Icon name="plus" size={15} /></button></div>
          <div className="view-list">
            {views.map((view) => <ViewRow active={view.id === activeViewId} key={view.id} onSelect={() => onSelectView(view)} view={view} />)}
            {!views.length && <p className="compact-empty">No saved diagrams yet.</p>}
          </div>
          {hiddenCount > 0 && <button className="show-hidden" onClick={onShowHidden}><Icon name="eye" size={14} /> Show {hiddenCount} hidden elements</button>}
          {mode === 'advanced' && <div className="view-detail-options">
            <div className="view-detail-heading"><span>View detail</span><small>Saved with this view</small></div>
            <ViewDetailToggle checked={showPorts} detail="Names and directions" icon="port" label="Ports" onToggle={onTogglePorts} />
            <ViewDetailToggle checked={showEdgeLabels} detail="Connection names" icon="more" label="Edge labels" onToggle={onToggleEdgeLabels} />
            <ViewDetailToggle checked={showTypes} detail="Types and categories" icon="component" label="Type details" onToggle={onToggleTypes} />
          </div>}
        </section>

        <section className="sidebar-section explorer-section">
          <div className="explorer-tabs" role="tablist">
            <button className={tab === 'model' ? 'active' : ''} {...getTabProps('model')}>Model</button>
            <button className={tab === 'requirements' ? 'active' : ''} {...getTabProps('requirements')}>Requirements <span>{requirements.length}</span></button>
          </div>
          <div {...getPanelProps(tab)}>
          <label className="search-box">
            <Icon name="search" size={15} />
            <input data-model-search onChange={(event) => setQuery(event.target.value)} placeholder={tab === 'model' ? 'Find components, ports…' : 'Find REQ_MMI_1…'} value={query} />
            {query && <button onClick={() => setQuery('')} aria-label="Clear search"><Icon name="x" size={13} /></button>}
          </label>

          {tab === 'model' && (
            <div className="model-tree">
              {normalizedQuery ? (
                <ul className="search-results">
                  {searchResults.map((item) => (
                    <li key={`${item.kind}:${item.id}`}>
                      <button onClick={() => onSelectSearchResult(item)} title={item.qualifiedName ?? item.source.file}>
                        <Icon name={searchResultIcon(item.kind)} size={14} />
                        <span>
                          <strong>{item.label}</strong>
                          <small>{item.qualifiedName ?? item.source.file}</small>
                          {item.snippet && <small className="search-snippet">{item.snippet}</small>}
                        </span>
                        <em>{searchResultKind(item.kind)}</em>
                      </button>
                    </li>
                  ))}
                  {searchLoading && <li className="compact-empty" aria-live="polite">Searching the semantic model…</li>}
                  {!searchLoading && searchError && <li className="compact-empty">Semantic search is unavailable.</li>}
                  {!searchLoading && !searchError && !searchResults.length && <li className="compact-empty">No semantic matches.</li>}
                </ul>
              ) : (
                <ul>{hierarchyRoots.map((root) => <TreeItem activeRootId={activeRootId} item={root} key={root.id} onSelect={selectHierarchyItem} />)}</ul>
              )}
            </div>
          )}

          {tab === 'requirements' && (
            <ul className="requirement-list">
              {requirementMatches.map((requirement) => (
                <li key={requirement.id}>
                  <button onClick={() => onSelectRequirement(requirement)}>
                    <span className="requirement-glyph"><Icon name="requirement" size={14} /></span>
                    <span><strong>{requirement.requirementId ?? requirement.name}</strong><small>{requirement.ownerName ?? requirement.kind ?? 'GUMBO contract'}</small></span>
                    {requirement.inferred && <em title="Inferred trace">inferred</em>}
                  </button>
                </li>
              ))}
              {!requirementMatches.length && <li className="compact-empty">No matching requirements.</li>}
            </ul>
          )}
          </div>
        </section>
      </div>
    </aside>
  );
}

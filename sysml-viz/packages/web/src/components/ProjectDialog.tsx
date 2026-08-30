import { useEffect, useId, useRef, useState } from 'react';

import { api } from '../api';
import type { ProjectConfiguration, ProjectPreview, WorkspaceDirectory } from '../types';
import { Icon } from './Icon';
import { ModalDialog } from './ModalDialog';

const RECENTS_KEY = 'sysml-viz.recent-projects.v1';

function emptyConfiguration(root = ''): ProjectConfiguration {
  return { root, libraryRoots: [], include: [], exclude: [] };
}

function lines(value: string): string[] {
  return value.split('\n').map((entry) => entry.trim()).filter(Boolean);
}

function loadRecents(): ProjectConfiguration[] {
  try {
    const value = JSON.parse(localStorage.getItem(RECENTS_KEY) ?? '[]') as unknown;
    return Array.isArray(value)
      ? value.filter((entry): entry is ProjectConfiguration =>
          Boolean(entry) && typeof entry === 'object' && typeof (entry as ProjectConfiguration).root === 'string')
      : [];
  } catch {
    return [];
  }
}

export function ProjectDialog({
  open,
  canCancel,
  onCancel,
  onOpened,
}: {
  open: boolean;
  canCancel: boolean;
  onCancel: () => void;
  onOpened: () => Promise<void>;
}) {
  const [configuration, setConfiguration] = useState<ProjectConfiguration>(emptyConfiguration());
  const [directory, setDirectory] = useState<WorkspaceDirectory>();
  const [recents, setRecents] = useState<ProjectConfiguration[]>(loadRecents);
  const [advanced, setAdvanced] = useState(false);
  const [preview, setPreview] = useState<ProjectPreview>();
  const [error, setError] = useState<string>();
  const [busy, setBusy] = useState(false);
  const [libraryText, setLibraryText] = useState('');
  const [includeText, setIncludeText] = useState('');
  const [excludeText, setExcludeText] = useState('');
  const titleId = useId();
  const descriptionId = useId();
  const projectRootRef = useRef<HTMLInputElement>(null);

  const selectConfiguration = (next: ProjectConfiguration) => {
    setConfiguration(next);
    setLibraryText(next.libraryRoots.join('\n'));
    setIncludeText(next.include.join('\n'));
    setExcludeText(next.exclude.join('\n'));
    setPreview(undefined);
  };

  useEffect(() => {
    if (!open) return;
    api.workspaceDirectories()
      .then((result) => {
        setDirectory(result);
        setConfiguration((current) => current.root ? current : emptyConfiguration(result.path));
      })
      .catch((reason) => setError(reason instanceof Error ? reason.message : String(reason)));
  }, [open]);

  const browse = async (path?: string) => {
    setError(undefined);
    try {
      const result = await api.workspaceDirectories(path);
      setDirectory(result);
      setConfiguration((current) => ({ ...current, root: result.path }));
      setPreview(undefined);
    } catch (reason) {
      setError(reason instanceof Error ? reason.message : String(reason));
    }
  };

  const inspect = async () => {
    setBusy(true);
    setError(undefined);
    try {
      setPreview(await api.previewProject(configuration));
    } catch (reason) {
      setPreview(undefined);
      setError(reason instanceof Error ? reason.message : String(reason));
    } finally {
      setBusy(false);
    }
  };

  const openProject = async () => {
    setBusy(true);
    setError(undefined);
    try {
      const next = await api.switchProject(configuration);
      const canonical: ProjectConfiguration = {
        root: next.root ?? configuration.root,
        libraryRoots: next.libraryRoots,
        include: next.include ?? configuration.include,
        exclude: next.exclude ?? configuration.exclude,
      };
      const updated = [canonical, ...recents.filter((entry) => entry.root !== canonical.root)].slice(0, 8);
      localStorage.setItem(RECENTS_KEY, JSON.stringify(updated));
      setRecents(updated);
      await onOpened();
    } catch (reason) {
      setError(reason instanceof Error ? reason.message : String(reason));
    } finally {
      setBusy(false);
    }
  };

  return (
    <ModalDialog
      canDismiss={canCancel && !busy}
      descriptionId={descriptionId}
      initialFocusRef={projectRootRef}
      onClose={onCancel}
      open={open}
      titleId={titleId}
    >
      <section className="project-dialog">
        <header>
          <div><small>WORKSPACE PROJECT</small><h2 id={titleId}>Open a SysML project</h2></div>
          {canCancel && <button aria-label="Close project dialog" disabled={busy} onClick={onCancel}><Icon name="x" /></button>}
        </header>
        <p className="project-dialog-intro" id={descriptionId}>
          Choose a directory inside <code>{directory?.workspaceRoot ?? 'the configured workspace'}</code>.
          Source files are read only; diagram state remains in that project’s <code>.sysmlviz</code> folder.
        </p>

        {recents.length > 0 && (
          <div className="recent-projects">
            <strong>Recent projects</strong>
            {recents.map((entry) => (
              <button key={`${entry.root}:${entry.libraryRoots.join(',')}`} onClick={() => {
                selectConfiguration(entry);
              }}>
                <Icon name="folder" size={14} /><span>{entry.root}</span>
              </button>
            ))}
          </div>
        )}

        <label className="project-path">
          <span>Project root</span>
          <input ref={projectRootRef} onChange={(event) => {
            setConfiguration((current) => ({ ...current, root: event.target.value }));
            setPreview(undefined);
          }} value={configuration.root} />
        </label>

        {directory && (
          <div className="directory-browser">
            <div>
              <button disabled={!directory.parent} onClick={() => void browse(directory.parent ?? undefined)}><Icon name="chevron-right" size={13} /> Up</button>
              <code>{directory.path}</code>
            </div>
            <ul>
              {directory.directories.map((entry) => (
                <li key={entry.path}><button onClick={() => void browse(entry.path)}><Icon name="folder" size={15} /> {entry.name}</button></li>
              ))}
              {!directory.directories.length && <li className="empty-directory">No child directories</li>}
            </ul>
          </div>
        )}

        <button className="advanced-toggle" onClick={() => setAdvanced((value) => !value)}>
          <Icon name={advanced ? 'chevron-down' : 'chevron-right'} size={14} /> Advanced discovery settings
        </button>
        {advanced && (
          <div className="advanced-project-settings">
            <label><span>Library roots <small>One path per line; explicitly opted in</small></span><textarea onChange={(event) => {
              setLibraryText(event.target.value);
              setConfiguration((current) => ({ ...current, libraryRoots: lines(event.target.value) }));
            }} value={libraryText} /></label>
            <label><span>Include patterns <small>Project files only</small></span><textarea placeholder="**/*.sysml" onChange={(event) => {
              setIncludeText(event.target.value);
              setConfiguration((current) => ({ ...current, include: lines(event.target.value) }));
            }} value={includeText} /></label>
            <label><span>Exclude patterns <small>Project and libraries</small></span><textarea placeholder="experiments/**" onChange={(event) => {
              setExcludeText(event.target.value);
              setConfiguration((current) => ({ ...current, exclude: lines(event.target.value) }));
            }} value={excludeText} /></label>
          </div>
        )}

        <p className="discovery-note">
          Recursively loads <code>*.sysml</code>. Hidden, repository, cache, dependency/build output, and nested <code>sysml-aadl-libraries</code> paths are excluded.
          “Loaded” means included in the semantic model; the diagram still shows only its selected semantic root and view filters.
        </p>
        {preview && <div className="project-counts"><strong>{preview.projectFileCount} project files</strong><span>{preview.libraryFileCount} library files</span><span>{preview.totalFileCount} loaded total</span></div>}
        {error && <div className="project-error">{error}<small>The currently open project has not been changed.</small></div>}
        <footer>
          {canCancel && <button disabled={busy} onClick={onCancel}>Cancel</button>}
          <button disabled={busy || !configuration.root.trim()} onClick={() => void inspect()}>Count files</button>
          <button className="primary" disabled={busy || !configuration.root.trim()} onClick={() => void openProject()}>{busy ? 'Checking…' : 'Open project'}</button>
        </footer>
      </section>
    </ModalDialog>
  );
}

import { useEffect, useId, useRef, useState } from 'react';

import { Icon } from './Icon';
import { ModalDialog } from './ModalDialog';

export interface CreateSavedDiagramDialogProps {
  open: boolean;
  defaultName: string;
  onClose: () => void;
  onSave: (name: string) => void;
  busy?: boolean;
}

export function CreateSavedDiagramDialog({
  open,
  defaultName,
  onClose,
  onSave,
  busy = false,
}: CreateSavedDiagramDialogProps) {
  const [name, setName] = useState(defaultName);
  const inputRef = useRef<HTMLInputElement>(null);
  const titleId = useId();
  const descriptionId = useId();

  useEffect(() => {
    if (open) setName(defaultName);
  }, [defaultName, open]);

  return (
    <ModalDialog
      canDismiss={!busy}
      descriptionId={descriptionId}
      initialFocusRef={inputRef}
      onClose={onClose}
      open={open}
      titleId={titleId}
    >
      <form className="dialog" onSubmit={(event) => {
        event.preventDefault();
        const trimmedName = name.trim();
        if (trimmedName) onSave(trimmedName);
      }}>
        <header>
          <span><Icon name="bookmark" /></span>
          <div>
            <h2 id={titleId}>Save this diagram</h2>
            <p id={descriptionId}>Save the current root, visibility, layout, and camera as a reusable diagram.</p>
          </div>
          <button aria-label="Close saved diagram dialog" disabled={busy} onClick={onClose} type="button"><Icon name="x" /></button>
        </header>
        <label>
          <span>Name</span>
          <input
            disabled={busy}
            name="name"
            onChange={(event) => setName(event.target.value)}
            ref={inputRef}
            required
            value={name}
          />
        </label>
        <footer>
          <button className="button subtle" disabled={busy} onClick={onClose} type="button">Cancel</button>
          <button className="button primary" disabled={busy || !name.trim()} type="submit">{busy ? 'Saving…' : 'Save diagram'}</button>
        </footer>
      </form>
    </ModalDialog>
  );
}

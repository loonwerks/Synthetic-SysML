import {
  type MouseEvent as ReactMouseEvent,
  type ReactNode,
  type RefObject,
  useEffect,
  useRef,
} from 'react';

export interface ModalDialogProps {
  open: boolean;
  onClose: () => void;
  children: ReactNode;
  canDismiss?: boolean;
  ariaLabel?: string;
  titleId?: string;
  descriptionId?: string;
  initialFocusRef?: RefObject<HTMLElement | null>;
  className?: string;
}

const FOCUSABLE_SELECTOR = [
  '[data-dialog-initial-focus]',
  '[autofocus]',
  'button:not([disabled])',
  'input:not([disabled])',
  'textarea:not([disabled])',
  'select:not([disabled])',
  '[tabindex]:not([tabindex="-1"])',
].join(',');

export function ModalDialog({
  open,
  onClose,
  children,
  canDismiss = true,
  ariaLabel,
  titleId,
  descriptionId,
  initialFocusRef,
  className = '',
}: ModalDialogProps) {
  const dialogRef = useRef<HTMLDialogElement>(null);
  const openerRef = useRef<HTMLElement | null>(null);
  const pointerStartedOnBackdrop = useRef(false);

  useEffect(() => {
    const dialog = dialogRef.current;
    if (!dialog) return;

    if (open && !dialog.open) {
      openerRef.current = document.activeElement instanceof HTMLElement ? document.activeElement : null;
      dialog.showModal();
      window.requestAnimationFrame(() => {
        const requested = initialFocusRef?.current;
        const fallback = dialog.querySelector<HTMLElement>(FOCUSABLE_SELECTOR);
        (requested ?? fallback ?? dialog).focus();
      });
      return;
    }

    if (!open && dialog.open) {
      dialog.close();
      const opener = openerRef.current;
      openerRef.current = null;
      window.requestAnimationFrame(() => opener?.isConnected && opener.focus());
    }
  }, [initialFocusRef, open]);

  useEffect(() => () => {
    const dialog = dialogRef.current;
    if (dialog?.open) dialog.close();
    const opener = openerRef.current;
    if (opener?.isConnected) opener.focus();
  }, []);

  const onBackdropMouseDown = (event: ReactMouseEvent<HTMLDialogElement>) => {
    pointerStartedOnBackdrop.current = event.target === event.currentTarget;
  };

  const onBackdropClick = (event: ReactMouseEvent<HTMLDialogElement>) => {
    const shouldDismiss = canDismiss
      && pointerStartedOnBackdrop.current
      && event.target === event.currentTarget;
    pointerStartedOnBackdrop.current = false;
    if (shouldDismiss) onClose();
  };

  return (
    <dialog
      aria-describedby={descriptionId}
      aria-label={ariaLabel ?? (titleId ? undefined : 'Dialog')}
      aria-labelledby={titleId}
      className={`modal-dialog ${className}`.trim()}
      onCancel={(event) => {
        event.preventDefault();
        if (canDismiss) onClose();
      }}
      onClick={onBackdropClick}
      onMouseDown={onBackdropMouseDown}
      ref={dialogRef}
      style={{
        maxWidth: 'none',
        maxHeight: 'none',
        margin: 'auto',
        padding: 0,
        overflow: 'visible',
        border: 0,
        color: 'inherit',
        background: 'transparent',
      }}
      tabIndex={-1}
    >
      {open ? children : null}
    </dialog>
  );
}

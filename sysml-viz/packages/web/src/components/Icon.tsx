import type { SVGProps } from 'react';

export type IconName =
  | 'architecture'
  | 'search'
  | 'folder'
  | 'layers'
  | 'chevron-right'
  | 'chevron-down'
  | 'layout'
  | 'pin'
  | 'pin-off'
  | 'download'
  | 'check'
  | 'bookmark'
  | 'refresh'
  | 'undo'
  | 'redo'
  | 'external'
  | 'file'
  | 'port'
  | 'contract'
  | 'requirement'
  | 'warning'
  | 'error'
  | 'info'
  | 'more'
  | 'eye'
  | 'eye-off'
  | 'plus'
  | 'x'
  | 'copy'
  | 'focus'
  | 'component'
  | 'arrow-left'
  | 'command'
  | 'hand';

interface IconProps extends SVGProps<SVGSVGElement> {
  name: IconName;
  size?: number;
}

export function Icon({ name, size = 16, ...props }: IconProps) {
  const paths: Record<IconName, React.ReactNode> = {
    architecture: (
      <>
        <rect x="3" y="3" width="7" height="7" rx="1.5" />
        <rect x="14" y="14" width="7" height="7" rx="1.5" />
        <path d="M10 6.5h4.5a3 3 0 0 1 3 3V14M6.5 10v4.5a3 3 0 0 0 3 3H14" />
      </>
    ),
    search: <><circle cx="11" cy="11" r="7" /><path d="m20 20-4-4" /></>,
    folder: <path d="M3 6.5A2.5 2.5 0 0 1 5.5 4H9l2 2h7.5A2.5 2.5 0 0 1 21 8.5v9A2.5 2.5 0 0 1 18.5 20h-13A2.5 2.5 0 0 1 3 17.5z" />,
    layers: <><path d="m12 3-9 5 9 5 9-5z" /><path d="m3 12 9 5 9-5M3 16l9 5 9-5" /></>,
    'chevron-right': <path d="m9 18 6-6-6-6" />,
    'chevron-down': <path d="m6 9 6 6 6-6" />,
    layout: <><rect x="3" y="3" width="7" height="7" rx="1" /><rect x="14" y="3" width="7" height="7" rx="1" /><rect x="3" y="14" width="7" height="7" rx="1" /><rect x="14" y="14" width="7" height="7" rx="1" /></>,
    pin: <><path d="m15 4 5 5-4 2-3 5-5-5 5-3z" /><path d="m10 14-6 6" /></>,
    'pin-off': <><path d="m3 3 18 18" /><path d="m15 4 5 5-3.5 1.7M13.5 13.5 13 16l-5-5 1.2-2.1M10 14l-6 6" /></>,
    download: <><path d="M12 3v12m0 0 4-4m-4 4-4-4" /><path d="M4 19v2h16v-2" /></>,
    check: <path d="m5 12 4 4L19 6" />,
    bookmark: <path d="M6 4.5A1.5 1.5 0 0 1 7.5 3h9A1.5 1.5 0 0 1 18 4.5V21l-6-4-6 4z" />,
    refresh: <><path d="M20 7v5h-5" /><path d="M18.2 16a8 8 0 1 1 .8-9l1 5" /></>,
    undo: <><path d="M9 8 4 12l5 4" /><path d="M5 12h8a6 6 0 0 1 6 6" /></>,
    redo: <><path d="m15 8 5 4-5 4" /><path d="M19 12h-8a6 6 0 0 0-6 6" /></>,
    external: <><path d="M14 4h6v6M20 4l-9 9" /><path d="M18 13v6a1 1 0 0 1-1 1H5a1 1 0 0 1-1-1V7a1 1 0 0 1 1-1h6" /></>,
    file: <><path d="M6 2h8l5 5v15H6z" /><path d="M14 2v6h5M9 13h6M9 17h6" /></>,
    port: <><circle cx="6" cy="12" r="3" /><circle cx="18" cy="12" r="3" /><path d="M9 12h6" /></>,
    contract: <><path d="M7 3h10v18H7z" /><path d="m10 8 1.5 1.5L15 6M10 14h4M10 17h4" /></>,
    requirement: <><circle cx="12" cy="12" r="9" /><path d="M9.5 9a2.5 2.5 0 1 1 4.2 1.8c-1 .8-1.7 1.2-1.7 2.7M12 17h.01" /></>,
    warning: <><path d="M12 3 2.5 20h19z" /><path d="M12 9v5M12 17h.01" /></>,
    error: <><circle cx="12" cy="12" r="9" /><path d="m9 9 6 6m0-6-6 6" /></>,
    info: <><circle cx="12" cy="12" r="9" /><path d="M12 11v6M12 7h.01" /></>,
    more: <><circle cx="5" cy="12" r="1" fill="currentColor" stroke="none" /><circle cx="12" cy="12" r="1" fill="currentColor" stroke="none" /><circle cx="19" cy="12" r="1" fill="currentColor" stroke="none" /></>,
    eye: <><path d="M2 12s3.5-6 10-6 10 6 10 6-3.5 6-10 6S2 12 2 12" /><circle cx="12" cy="12" r="2.5" /></>,
    'eye-off': <><path d="m3 3 18 18" /><path d="M10.5 6.2A10.8 10.8 0 0 1 12 6c6.5 0 10 6 10 6a17 17 0 0 1-2.1 2.8M6.1 6.1C3.4 8 2 12 2 12s3.5 6 10 6a10 10 0 0 0 4-.8" /></>,
    plus: <path d="M12 5v14M5 12h14" />,
    x: <path d="m6 6 12 12M18 6 6 18" />,
    copy: <><rect x="8" y="8" width="12" height="12" rx="2" /><path d="M16 8V6a2 2 0 0 0-2-2H6a2 2 0 0 0-2 2v8a2 2 0 0 0 2 2h2" /></>,
    focus: <><path d="M8 3H3v5M16 3h5v5M8 21H3v-5M16 21h5v-5" /><circle cx="12" cy="12" r="3" /></>,
    component: <><rect x="5" y="4" width="14" height="16" rx="2" /><path d="M2 8h3M2 12h3M2 16h3M19 8h3M19 12h3M19 16h3" /></>,
    'arrow-left': <path d="m15 18-6-6 6-6" />,
    command: <><path d="M9 6v12M15 6v12M6 9h12M6 15h12" /><circle cx="6" cy="6" r="3" /><circle cx="18" cy="6" r="3" /><circle cx="6" cy="18" r="3" /><circle cx="18" cy="18" r="3" /></>,
    hand: <><path d="M7.5 12V6.5a1.5 1.5 0 0 1 3 0V11M10.5 10V5a1.5 1.5 0 0 1 3 0v6M13.5 10V6a1.5 1.5 0 0 1 3 0v6M16.5 10V8a1.5 1.5 0 0 1 3 0v6.5c0 4-2.5 6.5-6.5 6.5h-1c-2.4 0-4.1-1-5.5-3L3 13.5a1.6 1.6 0 0 1 2.4-2.1z" /></>,
  };

  return (
    <svg
      aria-hidden="true"
      fill="none"
      height={size}
      viewBox="0 0 24 24"
      width={size}
      stroke="currentColor"
      strokeLinecap="round"
      strokeLinejoin="round"
      strokeWidth="1.8"
      {...props}
    >
      {paths[name]}
    </svg>
  );
}

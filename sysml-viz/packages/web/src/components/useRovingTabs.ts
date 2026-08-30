import { useId, useRef, type KeyboardEvent } from 'react';

export type RovingTabKey = 'ArrowLeft' | 'ArrowRight' | 'Home' | 'End';

export function nextRovingTabIndex(currentIndex: number, tabCount: number, key: string): number | undefined {
  if (tabCount <= 0 || currentIndex < 0 || currentIndex >= tabCount) return undefined;
  if (key === 'Home') return 0;
  if (key === 'End') return tabCount - 1;
  if (key === 'ArrowLeft') return (currentIndex - 1 + tabCount) % tabCount;
  if (key === 'ArrowRight') return (currentIndex + 1) % tabCount;
  return undefined;
}

/**
 * Implements the ARIA tabs keyboard pattern while leaving tab and panel markup
 * to the consuming component. Selecting with an arrow key also moves focus.
 */
export function useRovingTabs<Tab extends string>(
  tabs: readonly Tab[],
  selectedTab: Tab,
  onSelect: (tab: Tab) => void,
) {
  const instanceId = useId();
  const tabRefs = useRef(new Map<Tab, HTMLButtonElement>());

  const tabId = (tab: Tab) => `${instanceId}-${tab}-tab`;
  const panelId = (tab: Tab) => `${instanceId}-${tab}-panel`;

  return {
    getTabProps(tab: Tab) {
      return {
        'aria-controls': panelId(tab),
        'aria-selected': selectedTab === tab,
        id: tabId(tab),
        onClick: () => onSelect(tab),
        onKeyDown: (event: KeyboardEvent<HTMLButtonElement>) => {
          const currentIndex = tabs.indexOf(tab);
          const nextIndex = nextRovingTabIndex(currentIndex, tabs.length, event.key);
          if (nextIndex === undefined) return;
          event.preventDefault();
          const nextTab = tabs[nextIndex]!;
          onSelect(nextTab);
          tabRefs.current.get(nextTab)?.focus();
        },
        ref: (element: HTMLButtonElement | null) => {
          if (element) tabRefs.current.set(tab, element);
          else tabRefs.current.delete(tab);
        },
        role: 'tab' as const,
        tabIndex: selectedTab === tab ? 0 : -1,
        type: 'button' as const,
      };
    },
    getPanelProps(tab: Tab) {
      return {
        'aria-labelledby': tabId(tab),
        hidden: selectedTab !== tab,
        id: panelId(tab),
        role: 'tabpanel' as const,
        tabIndex: 0,
      };
    },
  };
}

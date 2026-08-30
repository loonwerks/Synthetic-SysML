export interface GeometryBox {
  id?: string;
  x: number;
  y: number;
  width: number;
  height: number;
}

export interface ContainerInsets {
  left: number;
  top: number;
  right: number;
  bottom: number;
}

export interface ContainerResizeConstraints {
  minimumWidth: number;
  minimumHeight: number;
  insets: ContainerInsets;
  children: readonly GeometryBox[];
  parentInterior?: GeometryBox;
}

export interface ContainerResizeAssessment {
  valid: boolean;
  minimumWidth: number;
  minimumHeight: number;
  required: GeometryBox;
  escapingChildId?: string;
  outsideParent: boolean;
}

export const EXPANDED_CONTAINER_MINIMUM = Object.freeze({ width: 640, height: 380 });
export const EXPANDED_CONTAINER_INSETS: Readonly<ContainerInsets> = Object.freeze({
  left: 28,
  top: 72,
  right: 28,
  bottom: 28,
});

function finiteBox(box: GeometryBox): boolean {
  return [box.x, box.y, box.width, box.height].every(Number.isFinite) && box.width > 0 && box.height > 0;
}

/**
 * Computes the exact server/browser contract for an expanded container.
 * Child coordinates are canvas-absolute; resizing the boundary never moves
 * them. `required` is the smallest box at the proposed left/top that contains
 * them while respecting the configured insets and global minimum dimensions.
 */
export function assessContainerResize(
  proposed: GeometryBox,
  constraints: ContainerResizeConstraints,
): ContainerResizeAssessment {
  const { insets, children } = constraints;
  const right = Math.max(
    proposed.x + constraints.minimumWidth,
    ...children.map((child) => child.x + child.width + insets.right),
  );
  const bottom = Math.max(
    proposed.y + constraints.minimumHeight,
    ...children.map((child) => child.y + child.height + insets.bottom),
  );
  const required: GeometryBox = {
    x: proposed.x,
    y: proposed.y,
    width: right - proposed.x,
    height: bottom - proposed.y,
  };
  const interior = {
    x: proposed.x + insets.left,
    y: proposed.y + insets.top,
    width: proposed.width - insets.left - insets.right,
    height: proposed.height - insets.top - insets.bottom,
  };
  const escaping = children.find((child) =>
    child.x < interior.x ||
    child.y < interior.y ||
    child.x + child.width > interior.x + interior.width ||
    child.y + child.height > interior.y + interior.height
  );
  const parent = constraints.parentInterior;
  const outsideParent = Boolean(parent && (
    proposed.x < parent.x ||
    proposed.y < parent.y ||
    proposed.x + proposed.width > parent.x + parent.width ||
    proposed.y + proposed.height > parent.y + parent.height
  ));
  return {
    valid: finiteBox(proposed) &&
      proposed.width >= constraints.minimumWidth &&
      proposed.height >= constraints.minimumHeight &&
      !escaping &&
      !outsideParent,
    minimumWidth: constraints.minimumWidth,
    minimumHeight: constraints.minimumHeight,
    required,
    ...(escaping?.id ? { escapingChildId: escaping.id } : {}),
    outsideParent,
  };
}

export function defaultContainerResizeConstraints(
  children: readonly GeometryBox[],
  parentInterior?: GeometryBox,
): ContainerResizeConstraints {
  return {
    minimumWidth: EXPANDED_CONTAINER_MINIMUM.width,
    minimumHeight: EXPANDED_CONTAINER_MINIMUM.height,
    insets: EXPANDED_CONTAINER_INSETS,
    children,
    ...(parentInterior ? { parentInterior } : {}),
  };
}

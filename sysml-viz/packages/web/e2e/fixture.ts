import { expect, type APIRequestContext, type Locator, type Page } from '@playwright/test';

interface DiagramNode {
  id: string;
  label: string;
  ports: Array<{ id: string; name: string }>;
}

export async function resetBrowserFixture(request: APIRequestContext, collide = false): Promise<void> {
  const diagramResponse = await request.get('/api/diagram?view=architecture');
  expect(diagramResponse.ok(), await diagramResponse.text()).toBe(true);
  const diagram = (await diagramResponse.json()).data as { nodes: DiagramNode[] };
  const sensor = diagram.nodes.find((node) => node.label === 'sensor');
  const controller = diagram.nodes.find((node) => node.label === 'controller');
  const actuator = diagram.nodes.find((node) => node.label === 'actuator');
  const reading = controller?.ports.find((port) => port.name === 'reading');
  if (!sensor || !controller || !actuator || !reading) throw new Error('Browser fixture is incomplete');

  const patch = await request.patch('/api/views/architecture', { data: {
    actor: 'playwright-reset',
    client: 'system',
    positions: {
      [sensor.id]: { x: 80, y: 120, width: 248, height: 170, pinned: true },
      [controller.id]: { x: 440, y: 120, width: 248, height: 195, pinned: true },
      [actuator.id]: { x: 800, y: 120, width: 248, height: 170, pinned: true },
    },
    pinned: [sensor.id, controller.id, actuator.id],
    expanded: [],
    hidden: [],
    edgeRoutes: {},
    showPorts: true,
    showEdgeLabels: true,
    showTypes: true,
    camera: { x: 0, y: 0, zoom: 1 },
    presentationNodes: [
      { id: 'operator', kind: 'actor', label: 'Flight operator', x: 80, y: 430, width: 248, height: 142 },
      { id: 'handbook', kind: 'reference', label: 'Operations handbook', x: 800, y: 430, width: 248, height: 142 },
    ],
    presentationEdges: [
      { id: 'operator-command', kind: 'informational', sourceId: 'operator', targetId: reading.id, label: 'observes' },
      { id: 'handbook-controller', kind: 'reference', sourceId: 'handbook', targetId: controller.id, label: 'governs' },
    ],
    annotations: [{
      id: 'port-note',
      text: 'Exact-port annotation arrow',
      position: collide ? { x: 100, y: 450 } : { x: 440, y: 430 },
      style: 'warning',
      arrow: { targetId: reading.id, targetKind: 'port' },
    }],
    constraints: [{
      id: `constraint:right-of:${controller.id}:${sensor.id}`,
      relation: 'right-of', subjectId: controller.id, objectId: sensor.id, gap: 80,
    }],
  } });
  expect(patch.ok(), await patch.text()).toBe(true);
  const activation = await request.post('/api/views/architecture/activate', {
    data: { actor: 'playwright-reset', client: 'system' },
  });
  expect(activation.ok(), await activation.text()).toBe(true);
}

export async function openFixture(page: Page): Promise<void> {
  await page.goto('/');
  await expect(page.locator('.react-flow__node')).toHaveCount(6);
  await expect(page.getByRole('button', { name: 'Explore' })).toHaveAttribute('aria-pressed', 'true');
}

export async function overlayOverlapArea(page: Page): Promise<number> {
  return page.evaluate(() => {
    const elements = [...document.querySelectorAll<HTMLElement>('.presentation-card-node, .annotation-node')];
    let area = 0;
    elements.forEach((left, index) => {
      const a = left.getBoundingClientRect();
      elements.slice(index + 1).forEach((right) => {
        const b = right.getBoundingClientRect();
        area += Math.max(0, Math.min(a.right, b.right) - Math.max(a.left, b.left))
          * Math.max(0, Math.min(a.bottom, b.bottom) - Math.max(a.top, b.top));
      });
    });
    return area;
  });
}

export async function expectNamedControls(locator: Locator): Promise<void> {
  const unnamed = await locator.evaluateAll((elements) => elements.flatMap((element) => {
    const html = element as HTMLElement;
    const name = html.getAttribute('aria-label')?.trim()
      || html.getAttribute('title')?.trim()
      || html.innerText.trim();
    return name ? [] : [html.outerHTML.slice(0, 180)];
  }));
  expect(unnamed, `Unnamed interactive controls: ${unnamed.join('\n')}`).toEqual([]);
}

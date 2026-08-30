import { expect, test } from '@playwright/test';
import { openFixture, resetBrowserFixture } from './fixture';

test.beforeEach(async ({ request }) => resetBrowserFixture(request));

test('saved-diagram dialog traps focus, closes on Escape, and restores focus', async ({ page }) => {
  await openFixture(page);
  const opener = page.getByTitle('Save current diagram');
  await opener.click();
  const dialog = page.getByRole('dialog', { name: 'Save this diagram' });
  await expect(dialog).toBeVisible();
  await expect(dialog.getByRole('textbox', { name: 'Name' })).toBeFocused();
  await page.keyboard.press('Shift+Tab');
  await expect(dialog.getByRole('button', { name: 'Close saved diagram dialog' })).toBeFocused();
  await page.keyboard.press('Escape');
  await expect(dialog).toBeHidden();
  await expect(opener).toBeFocused();
});

test('roving tabs expose complete semantics and keyboard navigation', async ({ page }) => {
  await openFixture(page);
  const model = page.getByRole('tab', { name: 'Model' });
  const requirements = page.getByRole('tab', { name: /Requirements/ });
  await expect(model).toHaveAttribute('aria-selected', 'true');
  await model.focus();
  await page.keyboard.press('ArrowRight');
  await expect(requirements).toBeFocused();
  await expect(requirements).toHaveAttribute('aria-selected', 'true');
  await expect(page.getByRole('tabpanel')).toBeVisible();
  await page.keyboard.press('Home');
  await expect(model).toBeFocused();
});

test('component inspector tabs show exactly one panel and reset its scroll position', async ({ page }) => {
  await openFixture(page);
  await page.locator('.react-flow__node').filter({ hasText: 'controller' }).click();

  const inspector = page.locator('.inspector');
  const scrollRegion = inspector.locator('.inspector-scroll');
  const detailsPanel = inspector.getByRole('tabpanel', { name: 'Details', includeHidden: true });
  const stylePanel = inspector.getByRole('tabpanel', { name: 'Style', includeHidden: true });
  const contractsPanel = inspector.getByRole('tabpanel', { name: /GUMBO/, includeHidden: true });

  await expect(detailsPanel).toBeVisible();
  await expect(stylePanel).toBeHidden();
  await expect(contractsPanel).toBeHidden();

  await inspector.getByRole('tab', { name: 'Style' }).click();
  await expect(detailsPanel).toBeHidden();
  await expect(stylePanel).toBeVisible();
  await expect(contractsPanel).toBeHidden();

  await scrollRegion.evaluate((element) => { element.scrollTop = element.scrollHeight; });
  await inspector.getByRole('tab', { name: /GUMBO/ }).click();
  await expect(detailsPanel).toBeHidden();
  await expect(stylePanel).toBeHidden();
  await expect(contractsPanel).toBeVisible();
  await expect.poll(() => scrollRegion.evaluate((element) => element.scrollTop)).toBe(0);
});

test('selection converges on one target and Escape respects drawer priority', async ({ page }) => {
  await openFixture(page);
  const controller = page.locator('.react-flow__node').filter({ hasText: 'controller' });
  await controller.click();
  await expect(page.locator('.inspector')).toBeVisible();
  await expect(page.locator('.inspector')).toContainText('controller');

  await page.getByRole('button', { name: 'Advanced' }).click();
  await page.getByRole('button', { name: 'Open View Tools' }).click();
  await expect(page.getByTestId('view-tools')).toBeVisible();
  await page.keyboard.press('Escape');
  await expect(page.getByTestId('view-tools')).toBeHidden();
  await expect(page.locator('.inspector')).toBeVisible();
  await page.keyboard.press('Escape');
  await expect(page.locator('.inspector')).toBeHidden();

  await controller.click();
  await page.keyboard.press('v');
  await expect(page.getByRole('button', { name: 'Edit layout' })).toHaveAttribute('aria-pressed', 'true');
  await page.locator('.diagram-edge:not(.presentation-only):not(.annotation-arrow) .react-flow__edge-path').first().click({ force: true });
  await expect(page.locator('.inspector')).toBeHidden();
  await expect(page.getByText('Adjust edge endpoints', { exact: false })).toBeVisible();
  await page.locator('.react-flow__pane').click({ position: { x: 20, y: 350 } });
  await expect(page.getByText('Adjust edge endpoints', { exact: false })).toBeHidden();
});

test('global search shortcut focuses the model search', async ({ page }) => {
  await openFixture(page);
  await page.keyboard.press(process.platform === 'darwin' ? 'Meta+K' : 'Control+K');
  await expect(page.locator('[data-model-search]')).toBeFocused();
});

test('expanded container resize controls reject child-escaping shrink without a bounce', async ({ page, request }) => {
  const diagramResponse = await request.get('/api/diagram?view=architecture');
  const diagram = (await diagramResponse.json()).data as {
    nodes: Array<{ id: string; elementId?: string; label: string }>;
  };
  const sensor = diagram.nodes.find((node) => node.label === 'sensor');
  expect(sensor?.elementId).toBeTruthy();
  const expanded = await request.patch('/api/views/architecture', { data: {
    expanded: [sensor!.elementId], actor: 'playwright-resize', client: 'system',
  } });
  expect(expanded.ok(), await expanded.text()).toBe(true);
  await request.get('/api/diagram?view=architecture');

  await page.goto('/');
  await page.getByRole('button', { name: 'Edit layout' }).click();
  const container = page.locator('.react-flow__node.flow-container-node').filter({ hasText: 'sensor' });
  await expect(container).toBeVisible();
  await container.locator('.diagram-container').click({ position: { x: 20, y: 20 }, force: true });
  await page.getByRole('button', { name: 'Details', exact: true }).click();
  await expect(page.locator('.inspector')).toBeVisible();
  const topRight = container.locator('.container-resize-handle.top.right');
  await expect(topRight).toBeVisible();
  await expect(container.locator('.container-resize-handle.bottom.right')).toBeHidden();

  const before = await container.boundingBox();
  const handle = await topRight.boundingBox();
  let resizeRequests = 0;
  page.on('request', (request) => {
    if (request.method() === 'POST' && request.url().includes('/layout/resize')) resizeRequests += 1;
  });
  expect(before).toBeTruthy();
  expect(handle).toBeTruthy();
  await page.mouse.move(handle!.x + 5, handle!.y + 5);
  await page.mouse.down();
  await page.mouse.move(handle!.x - 500, handle!.y + 5, { steps: 12 });
  await page.mouse.up();
  await page.waitForTimeout(300);
  const after = await container.boundingBox();
  expect(after).toBeTruthy();
  expect(after!.width).toBeGreaterThanOrEqual(before!.width - 1);
  expect(resizeRequests).toBe(0);
  await expect(page.getByText('Resize was not saved', { exact: false })).toHaveCount(0);

  await container.locator('.diagram-container').click({ position: { x: 20, y: 20 }, force: true });
  const child = page.locator('.react-flow__node:not(.flow-container-node)').filter({ hasText: 'sample' });
  const childBefore = await child.boundingBox();
  const topLeft = container.locator('.container-resize-handle.top.left');
  await expect(topLeft).toBeVisible();
  const topLeftBox = await topLeft.boundingBox();
  expect(childBefore).toBeTruthy();
  expect(topLeftBox).toBeTruthy();
  await page.mouse.move(topLeftBox!.x + 5, topLeftBox!.y + 5);
  await page.mouse.down();
  await page.mouse.move(topLeftBox!.x - 60, topLeftBox!.y - 45, { steps: 8 });
  const childDuring = await child.boundingBox();
  await page.mouse.up();
  await page.waitForTimeout(250);
  const childAfter = await child.boundingBox();
  expect(Math.abs(childDuring!.x - childBefore!.x)).toBeLessThan(1.5);
  expect(Math.abs(childDuring!.y - childBefore!.y)).toBeLessThan(1.5);
  expect(Math.abs(childAfter!.x - childBefore!.x)).toBeLessThan(1.5);
  expect(Math.abs(childAfter!.y - childBefore!.y)).toBeLessThan(1.5);
});

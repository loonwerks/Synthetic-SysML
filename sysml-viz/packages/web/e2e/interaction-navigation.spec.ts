import { expect, test } from '@playwright/test';
import { openFixture, resetBrowserFixture } from './fixture';

test.beforeEach(async ({ request }) => resetBrowserFixture(request));

test('Pan is the safe default and Edit exposes layout selection before Details', async ({ page }) => {
  await openFixture(page);
  const pan = page.getByRole('button', { name: 'Pan canvas' });
  const edit = page.getByRole('button', { name: 'Edit layout' });
  await expect(pan).toHaveAttribute('aria-pressed', 'true');

  await page.getByRole('button', { name: 'Show contents of sensor here' }).click();
  const expandedSensor = page.locator('.react-flow__node').filter({ has: page.locator('.diagram-container'), hasText: 'sensor' });
  await expect(expandedSensor).toBeVisible();
  await page.waitForTimeout(250);

  const readSavedPosition = async (id: string) => {
    const response = await page.request.get('/api/views');
    const payload = await response.json() as { data: { views: Array<{ id: string; positions: Record<string, { x: number; y: number }> }> } };
    return payload.data.views.find((view) => view.id === 'architecture')!.positions[id];
  };
  const expandedId = await expandedSensor.getAttribute('data-id');
  expect(expandedId).toBeTruthy();
  const savedBeforePan = await readSavedPosition(expandedId!);
  const viewport = page.locator('.react-flow__viewport');
  const viewportBeforePan = await viewport.evaluate((element) => getComputedStyle(element).transform);
  const box = await expandedSensor.boundingBox();
  expect(box).not.toBeNull();
  await page.mouse.move(box!.x + box!.width / 2, box!.y + box!.height / 2);
  await page.mouse.down();
  await page.mouse.move(box!.x + box!.width / 2 + 90, box!.y + box!.height / 2 + 35, { steps: 4 });
  await page.mouse.up();
  await expect.poll(() => viewport.evaluate((element) => getComputedStyle(element).transform)).not.toBe(viewportBeforePan);
  await page.waitForTimeout(600);
  expect(await readSavedPosition(expandedId!)).toEqual(savedBeforePan);

  await page.keyboard.press('v');
  await expect(edit).toHaveAttribute('aria-pressed', 'true');
  const controller = page.locator('.react-flow__node').filter({ hasText: 'controller' });
  await controller.focus();
  const controllerId = await controller.getAttribute('data-id');
  expect(controllerId).toBeTruthy();
  const savedBeforeSpacePan = await readSavedPosition(controllerId!);
  const viewportBeforePanePan = await viewport.evaluate((element) => getComputedStyle(element).transform);
  const pane = page.locator('.react-flow__pane');
  const paneBox = await pane.boundingBox();
  expect(paneBox).not.toBeNull();
  await page.mouse.move(paneBox!.x + 18, paneBox!.y + 180);
  await page.mouse.down();
  await page.mouse.move(paneBox!.x + 88, paneBox!.y + 225, { steps: 4 });
  await page.mouse.up();
  await expect.poll(() => viewport.evaluate((element) => getComputedStyle(element).transform)).not.toBe(viewportBeforePanePan);
  await page.waitForTimeout(600);
  expect(await readSavedPosition(controllerId!)).toEqual(savedBeforeSpacePan);

  const viewportBeforeSpacePan = await viewport.evaluate((element) => getComputedStyle(element).transform);
  await page.keyboard.down('Space');
  await expect(page.locator('.canvas-region')).toHaveClass(/interaction-pan/);
  const spacePanBox = await controller.boundingBox();
  expect(spacePanBox).not.toBeNull();
  await page.mouse.move(spacePanBox!.x + spacePanBox!.width / 2, spacePanBox!.y + 24);
  await page.mouse.down();
  await page.mouse.move(spacePanBox!.x + spacePanBox!.width / 2 + 50, spacePanBox!.y + 54, { steps: 4 });
  await page.mouse.up();
  await page.keyboard.up('Space');
  await expect(page.locator('.canvas-region')).toHaveClass(/interaction-edit/);
  await expect.poll(() => viewport.evaluate((element) => getComputedStyle(element).transform)).not.toBe(viewportBeforeSpacePan);
  await page.waitForTimeout(600);
  expect(await readSavedPosition(controllerId!)).toEqual(savedBeforeSpacePan);

  const movedBox = await controller.boundingBox();
  expect(movedBox).not.toBeNull();
  const moveResponse = page.waitForResponse((response) => response.url().includes('/layout/move') && response.request().method() === 'POST');
  await page.mouse.move(movedBox!.x + movedBox!.width / 2, movedBox!.y + 24);
  await page.mouse.down();
  await page.mouse.move(movedBox!.x + movedBox!.width / 2 + 60, movedBox!.y + 64, { steps: 4 });
  await page.mouse.up();
  await moveResponse;
  await expect(page.locator('.inspector')).toBeHidden();
  await controller.click();
  const details = page.getByRole('button', { name: 'Details', exact: true });
  await expect(details).toBeEnabled();
  await details.click();
  await expect(page.locator('.inspector')).toContainText('controller');

  await page.keyboard.press('h');
  await expect(pan).toHaveAttribute('aria-pressed', 'true');
});

test('Display can persistently unmount the minimap', async ({ page }) => {
  await openFixture(page);
  await expect(page.locator('.diagram-minimap')).toBeVisible();
  await page.getByTitle('Display settings').click();
  const minimap = page.getByRole('button', { name: 'Minimap' });
  await expect(minimap).toHaveAttribute('aria-pressed', 'true');
  await minimap.click();
  await expect(page.locator('.diagram-minimap')).toHaveCount(0);
  await page.reload();
  await expect(page.locator('.diagram-minimap')).toHaveCount(0);
  await page.getByTitle('Display settings').click();
  await page.getByRole('button', { name: 'Minimap' }).click();
  await expect(page.locator('.diagram-minimap')).toBeVisible();
});

test('System Abstract supports bounded pointer and keyboard resizing', async ({ page }, testInfo) => {
  await page.route('**/api/traceability/system-abstract', async (route) => route.fulfill({
    json: {
      ok: true,
      data: {
        schemaVersion: 1,
        path: '/tmp/system-abstract.md',
        relativePath: 'system-abstract.md',
        markdown: '# Browser fixture\n\nCTRL-01: Controller responsibility.\n',
        anchors: [{
          id: 'CTRL-01',
          heading: 'Browser fixture',
          startLine: 3,
          endLine: 3,
          startOffset: 19,
          endOffset: 54,
          text: 'CTRL-01: Controller responsibility.',
        }],
        taggedElementCount: 0,
        traceAssociationCount: 0,
        referencedTraceIds: [],
        unresolvedTraceIds: [],
        duplicateAnchorIds: [],
      },
    },
  }));
  await openFixture(page);
  const panel = page.getByRole('complementary', { name: 'System Abstract traceability' });
  const separator = page.getByRole('separator', { name: 'Resize System Abstract' });
  await expect(panel).toBeVisible();
  await expect(separator).toHaveAttribute('aria-valuenow', '400');

  const separatorBox = await separator.boundingBox();
  expect(separatorBox).not.toBeNull();
  await page.mouse.move(separatorBox!.x + 6, separatorBox!.y + 100);
  await page.mouse.down();
  await page.mouse.move(separatorBox!.x - 134, separatorBox!.y + 100, { steps: 4 });
  await page.mouse.up();
  const expectedDragWidth = testInfo.project.name === 'compact-1280' ? 440 : 540;
  await expect(separator).toHaveAttribute('aria-valuenow', String(expectedDragWidth));

  await separator.focus();
  const beforeKey = Number(await separator.getAttribute('aria-valuenow'));
  await page.keyboard.press('ArrowRight');
  await expect(separator).toHaveAttribute('aria-valuenow', String(beforeKey - 8));
  await separator.dblclick();
  await expect(separator).toHaveAttribute('aria-valuenow', '400');
  await page.reload();
  await expect(page.getByRole('separator', { name: 'Resize System Abstract' })).toHaveAttribute('aria-valuenow', '400');

  const dimensions = await page.evaluate(() => ({
    canvas: document.querySelector<HTMLElement>('.canvas-region')!.getBoundingClientRect().width,
    document: document.documentElement.scrollWidth,
    viewport: window.innerWidth,
  }));
  expect(dimensions.canvas).toBeGreaterThanOrEqual(600);
  expect(dimensions.document).toBeLessThanOrEqual(dimensions.viewport);
});

import { expect, test } from '@playwright/test';
import { openFixture, overlayOverlapArea, resetBrowserFixture } from './fixture';

test.beforeEach(async ({ request }) => resetBrowserFixture(request));

test('reports and repairs presentation collisions before visual comparison', async ({ page, request }) => {
  await resetBrowserFixture(request, true);
  await openFixture(page);
  expect(await overlayOverlapArea(page)).toBeGreaterThan(500);

  await expect.poll(async () => {
    const response = await request.get('/api/diagram/health?view=architecture');
    const health = (await response.json()).data as { overlaps: Array<{ actionable?: boolean }>; findings: Array<{ repairable: boolean; count: number }> };
    return health.overlaps.filter((item) => item.actionable !== false).length;
  }).toBeGreaterThan(0);

  const status = page.locator('.diagram-status > summary');
  await status.click();
  await expect(page.getByRole('button', { name: 'Repair layout' })).toBeVisible();
  const saved = page.waitForResponse((response) => response.request().method() === 'PATCH' && response.url().includes('/api/views/architecture'));
  await page.getByRole('button', { name: 'Repair layout' }).click();
  expect((await saved).ok()).toBe(true);
  await expect.poll(() => overlayOverlapArea(page)).toBe(0);
  await expect.poll(async () => {
    const response = await request.get('/api/diagram/health?view=architecture');
    const health = (await response.json()).data as { overlaps: Array<{ actionable?: boolean }> };
    return health.overlaps.filter((item) => item.actionable !== false).length;
  }).toBe(0);

  // Geometry is asserted before accepting this as a visual baseline.
  await status.click();
  await page.getByRole('button', { name: 'Fit', exact: true }).click();
  await expect(page.getByText('Layout repaired', { exact: true })).toBeHidden({ timeout: 7_000 });
  await expect(page).toHaveScreenshot('repaired-diagram.png', { animations: 'disabled' });
});

test('semantic connections terminate on exact visible ports', async ({ page }) => {
  await openFixture(page);
  const endpointDistances = await page.evaluate(() => {
    const handles = [...document.querySelectorAll<HTMLElement>('.react-flow__handle.port-handle')].map((handle) => {
      const box = handle.getBoundingClientRect();
      return { x: box.x + box.width / 2, y: box.y + box.height / 2 };
    });
    return [...document.querySelectorAll<SVGPathElement>('.diagram-edge:not(.presentation-only):not(.annotation-arrow) .react-flow__edge-path')].map((path) => {
      const matrix = path.getScreenCTM();
      if (!matrix) throw new Error('Edge has no screen transform');
      const source = path.getPointAtLength(0).matrixTransform(matrix);
      const target = path.getPointAtLength(path.getTotalLength()).matrixTransform(matrix);
      const nearest = (point: DOMPoint) => Math.min(...handles.map((handle) => Math.hypot(point.x - handle.x, point.y - handle.y)));
      return { source: nearest(source), target: nearest(target) };
    });
  });
  expect(endpointDistances.length).toBeGreaterThan(0);
  for (const distance of endpointDistances) {
    expect(distance.source).toBeLessThan(12);
    expect(distance.target).toBeLessThan(12);
  }
});

test('fresh overlay geometry is collision free and health status is plain language', async ({ page }) => {
  await openFixture(page);
  await expect(page.locator('.presentation-card-node')).toHaveCount(2);
  await expect(page.locator('.annotation-arrow')).toHaveCount(1);
  expect(await overlayOverlapArea(page)).toBe(0);
  const status = page.locator('.diagram-status > summary');
  await expect(status).toHaveAttribute('aria-label', /Diagram status: (Locally rendered|Partial diagram|Validated by Sireum)/);
  await status.click();
  await expect(page.getByText('Supported AADL-oriented SysML subset', { exact: true })).toBeVisible();
  await expect(page.locator('.header-statuses .status-pill')).toHaveCount(1);
});

test('representative acceptance corpus is parsed into selectable systems', async ({ request }) => {
  const response = await request.get('/api/model');
  expect(response.ok(), await response.text()).toBe(true);
  const model = (await response.json()).data as { rootCandidates: Array<{ name: string }> };
  const names = model.rootCandidates.map((candidate) => candidate.name);
  expect(names).toEqual(expect.arrayContaining([
    'BrowserSystem', 'IsoletteSystem', 'FlightControlSystem', 'GreenhouseHvacSystem',
  ]));
});

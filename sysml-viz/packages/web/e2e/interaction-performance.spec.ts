import { expect, test } from '@playwright/test';
import { openFixture, resetBrowserFixture } from './fixture';

test.beforeEach(async ({ request }) => resetBrowserFixture(request));

test('one drag commits once without reloading static application data', async ({ page }) => {
  const requests: Array<{ method: string; path: string; body: string | null }> = [];
  page.on('request', (request) => {
    const url = new URL(request.url());
    if (url.pathname.startsWith('/api/')) {
      requests.push({ method: request.method(), path: url.pathname, body: request.postData() });
    }
  });
  await openFixture(page);
  await page.getByRole('button', { name: 'Edit layout' }).click();
  await page.waitForTimeout(1_000);
  requests.length = 0;

  const sensor = page.locator('.react-flow__node').filter({ hasText: 'sensor' }).first();
  const box = await sensor.boundingBox();
  if (!box) throw new Error('Sensor node has no rendered bounds');
  await page.mouse.move(box.x + box.width / 2, box.y + 45);
  await page.mouse.down();
  await page.mouse.move(box.x + box.width / 2 + 80, box.y + 65, { steps: 24 });
  await page.mouse.up();
  await expect.poll(() => requests.filter((request) =>
    request.method === 'POST' && request.path.endsWith('/layout/move')
  ).length).toBe(1);
  await page.waitForTimeout(1_000);

  const forbiddenRefreshes = new Set([
    '/api/model',
    '/api/requirements',
    '/api/traceability/system-abstract',
    '/api/views',
    '/api/diagram',
  ]);
  expect(requests.filter((request) => forbiddenRefreshes.has(request.path))).toEqual([]);
});

test('programmatic Fit does not persist a camera mutation', async ({ page }) => {
  const cameraPatches: string[] = [];
  page.on('request', (request) => {
    if (request.method() === 'PATCH' && request.url().includes('/api/views/')) {
      const body = request.postData() ?? '';
      if (body.includes('"camera"')) cameraPatches.push(body);
    }
  });
  await openFixture(page);
  await page.waitForTimeout(500);
  cameraPatches.length = 0;
  await page.getByRole('button', { name: 'Fit', exact: true }).click();
  await page.waitForTimeout(750);
  expect(cameraPatches).toEqual([]);
});

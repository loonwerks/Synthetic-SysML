import { expect, test } from '@playwright/test';
import { openFixture, resetBrowserFixture } from './fixture';

test.beforeEach(async ({ request }) => resetBrowserFixture(request));

test('Advanced retains the complete server capability inventory', async ({ page, request }) => {
  await openFixture(page);
  const response = await request.get('/api/capabilities');
  const inventory = (await response.json()).data as { capabilities: Array<{ id: string; testSelector: string }> };
  await page.getByRole('button', { name: 'Advanced' }).click();
  await page.getByRole('button', { name: 'Open View Tools' }).click();
  await expect(page.getByTestId('view-tools')).toBeVisible();
  const parity = await page.locator('.capability-index').evaluate((index, expected) => expected.map((capability) => {
    const control = index.querySelector(capability.testSelector);
    return {
      id: capability.id,
      present: control instanceof HTMLButtonElement,
      enabled: control instanceof HTMLButtonElement && !control.disabled,
      visible: control instanceof HTMLElement && getComputedStyle(control).display !== 'none',
    };
  }), inventory.capabilities);
  expect(parity).toEqual(inventory.capabilities.map(({ id }) => ({ id, present: true, enabled: true, visible: true })));
});

test('advanced overlays remain editable and exported through native controls', async ({ page, request }) => {
  await openFixture(page);
  await page.getByRole('button', { name: 'Advanced' }).click();
  await page.getByRole('button', { name: 'Open View Tools' }).click();
  await page.locator('.view-tools > nav button').nth(2).click();
  await page.getByLabel('Kind').selectOption('annotation');
  await page.getByRole('textbox', { name: 'ID', exact: true }).fill('browser-created-note');
  await page.getByRole('textbox', { name: 'Text', exact: true }).fill('Created through native browser controls');
  const saved = page.waitForResponse((response) => response.request().method() === 'PATCH'
    && response.url().includes('/api/views/') && response.request().postData()?.includes('browser-created-note') === true);
  await page.getByRole('button', { name: 'Save overlay' }).click();
  expect((await saved).ok()).toBe(true);
  await page.getByRole('button', { name: 'Remove', exact: true }).click();
  await expect.poll(async () => {
    const document = (await (await request.get('/api/views')).json()).data as { views: Array<{ annotations: Array<{ id: string }> }> };
    return document.views.find((view) => view.annotations)?.annotations.some((item) => item.id === 'browser-created-note');
  }).toBe(false);

  const svg = await (await request.get('/api/render?format=svg')).text();
  expect(svg).toContain('NON-SEMANTIC · ACTOR');
  expect(svg).toContain('NON-SEMANTIC · REFERENCE');
});

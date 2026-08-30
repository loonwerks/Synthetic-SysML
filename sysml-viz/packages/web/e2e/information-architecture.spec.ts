import { expect, test } from '@playwright/test';
import { expectNamedControls, openFixture, resetBrowserFixture } from './fixture';

test.beforeEach(async ({ request }) => resetBrowserFixture(request));

test('Explore is the persisted default and Advanced gates expert controls', async ({ page }) => {
  await openFixture(page);
  await expect(page.getByText('Saved diagrams', { exact: true })).toBeVisible();
  await expect(page.getByRole('button', { name: 'Open View Tools' })).toHaveCount(0);
  await expect(page.getByRole('button', { name: 'Checkpoint' })).toHaveCount(0);
  await expect(page.getByText('SESSION ROOT', { exact: true })).toHaveCount(0);

  await page.getByRole('button', { name: 'Advanced' }).click();
  await expect(page.getByRole('button', { name: 'Advanced' })).toHaveAttribute('aria-pressed', 'true');
  await expect(page.getByRole('button', { name: 'Open View Tools' })).toBeVisible();
  await expect(page.getByRole('button', { name: 'Checkpoint' })).toBeVisible();
  await page.reload();
  await expect(page.getByRole('button', { name: 'Advanced' })).toHaveAttribute('aria-pressed', 'true');

  await page.evaluate(() => localStorage.setItem('sysml-viz.ui-mode.v1', 'invalid'));
  await page.reload();
  await expect(page.getByRole('button', { name: 'Explore' })).toHaveAttribute('aria-pressed', 'true');
});

test('1280 workspace has no document overflow and preserves usable canvas', async ({ page }, testInfo) => {
  test.skip(testInfo.project.name !== 'compact-1280', 'Compact viewport acceptance');
  await openFixture(page);
  const dimensions = await page.evaluate(() => {
    const canvas = document.querySelector<HTMLElement>('.canvas-region')!.getBoundingClientRect();
    return { documentWidth: document.documentElement.scrollWidth, viewportWidth: window.innerWidth, canvasWidth: canvas.width };
  });
  expect(dimensions.documentWidth).toBeLessThanOrEqual(dimensions.viewportWidth);
  expect(dimensions.canvasWidth).toBeGreaterThanOrEqual(600);

  await page.getByRole('button', { name: 'Advanced' }).click();
  await page.getByRole('button', { name: 'Open View Tools' }).click();
  const available = await page.evaluate(() => {
    const canvas = document.querySelector<HTMLElement>('.canvas-region')!.getBoundingClientRect();
    const tools = document.querySelector<HTMLElement>('.view-tools')!.getBoundingClientRect();
    return { width: tools.left - canvas.left, overflow: document.documentElement.scrollWidth - window.innerWidth };
  });
  expect(available.overflow).toBeLessThanOrEqual(0);
  expect(available.width).toBeGreaterThanOrEqual(520);
});

test('primary chrome meets text, target, and accessible-name floors', async ({ page }) => {
  await openFixture(page);
  const controls = page.locator('.app-header button:visible, .section-heading > button:visible, .explorer-tabs button:visible, .canvas-topbar button:visible, .canvas-panel-toggles button:visible');
  await expectNamedControls(controls);
  const violations = await controls.evaluateAll((elements) => elements.flatMap((element) => {
    const box = element.getBoundingClientRect();
    const fontSize = Number.parseFloat(getComputedStyle(element).fontSize);
    return box.width < 32 || box.height < 32 || fontSize < 14
      ? [{ label: element.getAttribute('aria-label') || element.getAttribute('title') || (element as HTMLElement).innerText.trim(), width: box.width, height: box.height, fontSize }]
      : [];
  }));
  expect(violations).toEqual([]);
});

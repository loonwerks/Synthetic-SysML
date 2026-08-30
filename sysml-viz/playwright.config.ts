import { defineConfig } from '@playwright/test';

export default defineConfig({
  testDir: './packages/web/e2e',
  timeout: 30_000,
  expect: {
    timeout: 8_000,
    toHaveScreenshot: { maxDiffPixelRatio: 0.001 },
  },
  fullyParallel: false,
  workers: 1,
  use: {
    baseURL: 'http://127.0.0.1:4794',
    browserName: 'chromium',
    headless: true,
    launchOptions: { executablePath: '/usr/bin/google-chrome', args: ['--no-sandbox'] },
    screenshot: 'only-on-failure',
  },
  webServer: {
    command: 'npm run build && node packages/web/test/e2e-server.mjs',
    url: 'http://127.0.0.1:4794/api/capabilities',
    reuseExistingServer: false,
    timeout: 60_000,
  },
  projects: [
    { name: 'desktop-1600', use: { viewport: { width: 1600, height: 1000 } } },
    { name: 'compact-1280', use: { viewport: { width: 1280, height: 800 } } },
  ],
  snapshotPathTemplate: '{testDir}/__screenshots__/{projectName}/{arg}{ext}',
});

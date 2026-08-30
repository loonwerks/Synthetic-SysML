import { mkdtemp, mkdir, readFile, writeFile } from 'node:fs/promises';
import os from 'node:os';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import { startSysmlVizServer } from '../../server/dist/index.js';

const MODEL = `package BrowserFixture {
  part def Reading :> Data;
  part def Sensor :> Device {
    port reading : DataPort { out :>> type : Reading; }
    part sample : Reading;
  }
  part def Controller :> Thread {
    port reading : DataPort { in :>> type : Reading; }
    port command : DataPort { out :>> type : Reading; }
  }
  part def Actuator :> Device {
    port command : DataPort { in :>> type : Reading; }
  }
  part def BrowserSystem :> System {
    part sensor : Sensor;
    part controller : Controller;
    part actuator : Actuator;
    connection reading_flow : PortConnection connect sensor.reading to controller.reading;
    connection command_flow : PortConnection connect controller.command to actuator.command;
  }
}`;

const workspace = await mkdtemp(path.join(os.tmpdir(), 'sysml-viz-browser-'));
const root = path.join(workspace, 'model');
await mkdir(root);
await writeFile(path.join(root, 'BrowserFixture.sysml'), MODEL, 'utf8');
const corpusDirectory = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '../e2e/fixtures');
for (const file of ['Isolette.sysml', 'FlightControl.sysml', 'Greenhouse.sysml']) {
  await writeFile(path.join(root, file), await readFile(path.join(corpusDirectory, file), 'utf8'), 'utf8');
}

const server = await startSysmlVizServer({
  workspaceRoot: workspace,
  root,
  host: '127.0.0.1',
  port: 4794,
});
const summary = server.session.modelSummary();
const candidate = summary.rootCandidates.find((item) => item.qualifiedName.endsWith('BrowserSystem'));
if (!candidate) throw new Error('Browser fixture root was not parsed');
await server.session.updateView('architecture', { rootId: candidate.id }, { actor: 'browser-fixture', client: 'system' });
const diagram = await server.session.diagram('architecture', candidate.id);
const sensor = diagram.nodes.find((node) => node.name === 'sensor');
const controller = diagram.nodes.find((node) => node.name === 'controller');
const actuator = diagram.nodes.find((node) => node.name === 'actuator');
const reading = controller?.ports.find((port) => port.name === 'reading');
if (!sensor || !controller || !actuator || !reading) throw new Error('Browser fixture nodes were not parsed');
await server.session.updateView('architecture', {
  positions: {
    [sensor.id]: { x: 80, y: 120, width: 248, height: 170, pinned: true },
    [controller.id]: { x: 440, y: 120, width: 248, height: 195, pinned: true },
    [actuator.id]: { x: 800, y: 120, width: 248, height: 170, pinned: true },
  },
  pinned: [sensor.id, controller.id, actuator.id],
  presentationNodes: [
    { id: 'operator', kind: 'actor', label: 'Flight operator', x: 80, y: 430, width: 92, height: 112 },
    { id: 'handbook', kind: 'reference', label: 'Operations handbook', x: 800, y: 430, width: 190, height: 90 },
  ],
  presentationEdges: [
    { id: 'operator-command', kind: 'informational', sourceId: 'operator', targetId: reading.id, label: 'observes' },
    { id: 'handbook-controller', kind: 'reference', sourceId: 'handbook', targetId: controller.id, label: 'governs' },
  ],
  annotations: [{
    id: 'port-note',
    text: 'Exact-port annotation arrow',
    position: { x: 440, y: 430 },
    style: 'warning',
    arrow: { targetId: reading.id, targetKind: 'port' },
  }],
  constraints: [{
    id: `constraint:right-of:${controller.id}:${sensor.id}`,
    relation: 'right-of',
    subjectId: controller.id,
    objectId: sensor.id,
    gap: 80,
  }],
}, { actor: 'browser-fixture', client: 'system' });

const stop = async () => {
  await server.close();
  process.exit(0);
};
process.on('SIGINT', () => void stop());
process.on('SIGTERM', () => void stop());
console.log(server.url);

import json
from pathlib import Path
import tempfile
import unittest

from equiv_checker.timing import TimingRecorder


class TimingTest(unittest.TestCase):
    def test_progress_survives_without_final_document(self):
        with tempfile.TemporaryDirectory() as temporary:
            path = Path(temporary) / "progress.jsonl"
            recorder = TimingRecorder(progress_path=path)
            recorder.record("logika-resident-request", 0.5, outcome="VERIFIED", request_id="proof-0001")
            events = [json.loads(line) for line in path.read_text().splitlines()]
            self.assertEqual(events[0]["detail"]["request_id"], "proof-0001")
            self.assertEqual(events, recorder.document()["events"])
            with self.assertRaises(FileExistsError):
                TimingRecorder(progress_path=path)
            self.assertEqual(len(path.read_text().splitlines()), 1)

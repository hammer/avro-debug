import avro.ipc as ipc
import avro.protocol as protocol

PROTO_FILE = os.path.join(os.path.dirname(__file__), 'fake.avpr')
PROTOCOL = protocol.parse(open(PROTO_FILE).read())

if __name__ == "__main__":
  host = 'localhost'
  port = 9090

  client = ipc.HTTPTransceiver(host, port)
  requestor = ipc.Requestor(PROTOCOL, client)

  requestor.request("fakeMethod", {})
